package gstock.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
//import gstock.Application;
import gstock.Table;
import gstock.AccesVariable;
import gstock.Colonne;
import gstock.Colonne_derivee;
import gstock.Colonne_referencee;
import gstock.Expression;
import gstock.ExpressionBinaire;
import gstock.util.GstockSwitch;

/**
 * Réalise la validation d'un modèle GStock.
 */
public class GStockValidator extends GstockSwitch<Boolean> {
    private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_ ]*$";
    private ValidationResult result = null;

    public GStockValidator() {}

    /**
     * Lancer la validation sur une ressource.
     */
    
    public ValidationResult validate(Resource resource) {
        this.result = new ValidationResult();

        for (EObject rootObject : resource.getContents()) {
            traverseAndValidate(rootObject);  // Parcours récursif des objets contenus
        }

        return this.result;
    }

    /**
     * Parcours récursivement tous les objets contenus dans un EObject.
     * @param object L'objet courant à valider
     */
    private void traverseAndValidate(EObject object) {
        // Appelle la méthode doSwitch pour valider l'objet courant
        this.doSwitch(object);

        // Parcours récursif des sous-objets contenus
        for (EObject containedObject : object.eContents()) {
            traverseAndValidate(containedObject);  // Rappel récursif pour les sous-objets
        }
    }

    
    /*public ValidationResult validate(Resource resource) {
        this.result = new ValidationResult();
        for (EObject object : resource.getContents()) {
        	System.out.println("Validation de l'objet racine : " + object.eClass().getName());
            this.doSwitch(object);
        }
        return this.result;
    }*/

    /** //@Override
    public Boolean caseApplication(Application object) {
        // Validation du nom
        this.result.recordIfFailed(
            object.getNom() != null && object.getNom().matches(IDENT_REGEX),
            object,
            "Le nom de l'application est invalide ou vide. Il doit respecter le format " + IDENT_REGEX
        );
        return null;
    }*/

    @Override
    public Boolean caseTable(Table object) {
        // Validation du nom
        this.result.recordIfFailed(
            object.getNom() != null && object.getNom().matches(IDENT_REGEX),
            object,
            "Le nom de la table est invalide ou vide. Il doit respecter le format " + IDENT_REGEX
        );
        // Utilisation d'un Set pour vérifier l'unicité des noms
        Set<String> columnNames = new HashSet<>();
        for (Colonne colonne : object.getColonnes()) {
            boolean isUnique = columnNames.add(colonne.getNom());

            // Si le nom est déjà présent, enregistrer une erreur
            if (!isUnique) {
                this.result.recordError(
                    colonne,
                    "La colonne '" + colonne.getNom() + "' n'est pas unique dans la table '" + object.getNom() + "'."
                );
            }
        }  	
        return null;
    }

    @Override
    public Boolean caseColonne(Colonne object) {
        // Validation du nom
        this.result.recordIfFailed(
            object.getNom() != null && object.getNom().matches(IDENT_REGEX),
            object,
            "Le nom de la colonne est invalide ou vide. Il doit respecter le format " + IDENT_REGEX
        );
        
        if (object.getType() == null || object.getType().isEmpty()) {
            this.result.recordError(
                object,
                "La colonne '" + object.getNom() + "' doit avoir un type non nul."
            );
        }else {
        	String type = object.getType(); // Type de la colonne
            boolean isValid = true;

            // Vérification en fonction du type
            switch (type.toLowerCase()) {
            		case "int":
                        // Valider si la colonne ou ses calculs contiennent uniquement des entiers
                        isValid = validateIntColumn(object);
                        break;
                    case "string":
                        // Valider si la colonne contient des chaînes valides
                        isValid = validateStringColumn(object);
                        break;
                    default:
                        // Si le type est inconnu, on génère une erreur
                        this.result.recordError(object, "Type de colonne inconnu : " + type);
                        return null;
                }

                // Si la validation échoue
                if (!isValid) {
                    this.result.recordError(
                        object,
                        "La colonne '" + object.getNom() + "' contient des données incohérentes avec son type : " + type
                    );
                }
        }

            return null;
        }
    
    private boolean validateIntColumn(Colonne colonne) {
        if (colonne instanceof Colonne_derivee) {
            // Vérifier si l'expression calculée produit un entier
            Colonne_derivee derivee = (Colonne_derivee) colonne;
            return validateExpressionType(derivee.getExpression(), "int");
        }
        // Si ce n'est pas une colonne dérivée, on suppose que les valeurs sont vérifiées ailleurs
        return true;
    }

    private boolean validateStringColumn(Colonne colonne) {
        if (colonne instanceof Colonne_derivee) {
            // Vérifier si l'expression calculée produit une chaîne
            Colonne_derivee derivee = (Colonne_derivee) colonne;
            return validateExpressionType(derivee.getExpression(), "string");
        }
        return true;
    }

    private boolean validateExpressionType(Expression expression, String expectedType) {
        if (expression instanceof ExpressionBinaire) {
            ExpressionBinaire binaire = (ExpressionBinaire) expression;

            // Valider les opérandes gauche et droit
            boolean gaucheValide = validateExpressionType(binaire.getOperandeG(), expectedType);
            boolean droiteValide = validateExpressionType(binaire.getOperandeD(), expectedType);

            // Valider l'opérateur pour s'assurer qu'il est compatible avec le type attendu
            return gaucheValide && droiteValide;
        } else if (expression instanceof AccesVariable) {
            AccesVariable acces = (AccesVariable) expression;

            // Vérifier si la colonne référencée a le type attendu
            return acces.getColonne().getType().equalsIgnoreCase(expectedType);
        }

        // Par défaut, si l'expression ne correspond pas, on retourne faux
        return false;
    }

    
    @Override
    public Boolean caseColonne_referencee(Colonne_referencee object) {
        // Vérifier l'absence de cycle dans les références
        Set<Colonne> visited = new HashSet<>();
        Colonne current = object;

        while (current instanceof Colonne_referencee) {
            Colonne_referencee ref = (Colonne_referencee) current;

            // Si on visite une colonne déjà vue, il y a un cycle
            if (!visited.add(current)) {
                this.result.recordError(
                    object,
                    "Une boucle a été détectée dans les références de colonnes, commençant à la colonne '" + Utils.guessName(object) + "'."
                );
                return null; // Fin de la validation pour cet objet
            }

            // Passer à la colonne suivante dans la chaîne
            current = ref.getColonne();
        }

        return null; // Pas de cycle détecté
    }


    @Override
    public Boolean defaultCase(EObject object) {
        return null;
    }
}

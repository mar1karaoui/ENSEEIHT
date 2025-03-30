package loader;

import gstock.Application;
import gstock.Table;
import gstock.Colonne;
import gstock.Colonne_derivee;
import gstock.AccesVariable;
import gstock.ExpressionBinaire;
import gstock.Operations;
import gstock.Expression;
import com.google.gson.Gson;
import com.opencsv.CSVReader;
import loader.ModelLoader;  // Classe pour charger le modèle XMI
import ui.CSVHandler;   // Gestionnaire pour charger les fichiers CSV
import Evaluator.DerivedColumnEvaluator; // Évaluateur des colonnes dérivées

import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        // 1. Charger le modèle depuis un fichier XMI
        String filePath = "C:\\Users\\pc\\eclipse-workspace7\\fr.n7.GStock\\model\\model.xmi";
        Application app = ModelLoader.loadModel(filePath);

        if (app != null) {
            System.out.println("Modèle chargé avec succès !");

            // 2. Afficher les tables et les colonnes dérivées du modèle
            displayTablesAndDerivedColumns(app);

            try {
                // 3. Charger les données CSV
                String csvPath = "C:\\Users\\pc\\eclipse-workspace7\\fr.n7.GStock\\src\\ui\\test.csv";
                CSVHandler handler = new CSVHandler();
                Map<String, List<Map<String, String>>> tables = handler.loadTablesFromCSV(csvPath);

                // Afficher les données chargées pour chaque table
                for (String tableName : tables.keySet()) {
                    System.out.println("Données de la table " + tableName + ":");
                    for (Map<String, String> row : tables.get(tableName)) {
                        System.out.println(row);  // Afficher chaque ligne de données
                    }
                }

                // 4. Calculer les colonnes dérivées
                if (tables != null) {
                    System.out.println("Calcul des colonnes dérivées...");
                    DerivedColumnEvaluator.evaluateDerivedColumns(tables, app); // Calcul des valeurs des colonnes dérivées

                    // 5. Ajouter les colonnes dérivées dans les tables avant de convertir en JSON
                    addDerivedColumnsToTables(tables, app);

                    // 6. Convertir les données finales en JSON et les afficher
                    String json = handler.convertToJson(tables);
                    System.out.println("Données finales en JSON :");
                    System.out.println(json);
                } else {
                    System.out.println("Erreur lors du chargement des données CSV.");
                }
            } catch (Exception e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        } else {
            System.out.println("Échec du chargement du modèle.");
        }
    }

    // Méthode pour afficher les tables et leurs colonnes dérivées
    private static void displayTablesAndDerivedColumns(Application app) {
        System.out.println("Tables dans l'application :");

        for (Table table : app.getTables()) {
            System.out.println("Table : " + table.getNom());

            for (Colonne colonne : table.getColonnes()) {
                if (colonne instanceof Colonne_derivee) {
                    Colonne_derivee derivedColonne = (Colonne_derivee) colonne;

                    // Récupérer l'expression associée
                    Expression expression = derivedColonne.getExpression();

                    if (expression instanceof AccesVariable) {
                        AccesVariable accesVariable = (AccesVariable) expression;
                        System.out.println("  Colonne dérivée (Accès Variable) : " + accesVariable.getColonne().getNom());
                    } else if (expression instanceof ExpressionBinaire) {
                        ExpressionBinaire exprBinaire = (ExpressionBinaire) expression;
                        System.out.println("  Colonne dérivée (Expression Binaire) : " 
                            + exprBinaire.getOperandeG().getNom() + " "
                            + exprBinaire.getOperateur().getType() + " "
                            + exprBinaire.getOperandeD().getNom());

                        // Afficher les opérandes pour vérifier les noms
                        System.out.println("Opérandes : " + exprBinaire.getOperandeG().getNom() + " et " + exprBinaire.getOperandeD().getNom());
                    } else {
                        System.out.println("  Colonne dérivée (Autre) : " + expression.getNom());
                    }
                }
            }
        }
    }

    // Méthode pour ajouter les colonnes dérivées dans les tables
    private static void addDerivedColumnsToTables(Map<String, List<Map<String, String>>> tables, Application app) {
        // Parcours des tables dans l'application
        for (Table table : app.getTables()) {
            List<Map<String, String>> tableData = tables.get(table.getNom());

            if (tableData == null) {
                // Si les données de la table sont absentes, ignorer cette table
                System.out.println("Aucune donnée trouvée pour la table : " + table.getNom());
                continue;
            }

            // Parcours des colonnes de la table dans le modèle
            for (Colonne colonne : table.getColonnes()) {
                if (colonne instanceof Colonne_derivee) {
                    Colonne_derivee derivedColonne = (Colonne_derivee) colonne;

                    // Récupérer l'expression de la colonne dérivée (par exemple multiplication ou addition)
                    Expression expression = derivedColonne.getExpression();
                    
                    // Calculer la valeur de la colonne dérivée pour chaque ligne
                    for (Map<String, String> row : tableData) {
                        String derivedColumnName = derivedColonne.getNom();
                        System.out.println("Calcul de la colonne dérivée : " + derivedColumnName);

                        if (expression instanceof ExpressionBinaire) {
                            // Extraire les opérandes de l'expression binaire
                            ExpressionBinaire exprBinaire = (ExpressionBinaire) expression;
                            String operandeGName = exprBinaire.getOperandeG().getNom(); // Nom de la première colonne (ex: "Prix_du_produit_commande")
                            String operandeDName = exprBinaire.getOperandeD().getNom(); // Nom de la deuxième colonne (ex: "Quantite_du_produit_commande")
                            
                            // Vérifier que les colonnes opérandes existent dans la ligne actuelle
                            String operandeGValueStr = row.get(operandeGName);
                            String operandeDValueStr = row.get(operandeDName);
                            System.out.println("Opérandes extraits : " + operandeGName + " = " + operandeGValueStr + ", " + operandeDName + " = " + operandeDValueStr);
                            
                            if (operandeGValueStr != null && operandeDValueStr != null) {
                                // Convertir les valeurs des opérandes en entiers
                                try {
                                    int operandeGValue = Integer.parseInt(operandeGValueStr);
                                    int operandeDValue = Integer.parseInt(operandeDValueStr);
                                    System.out.println("Valeurs après conversion : " + operandeGValue + " et " + operandeDValue);

                                    // Calculer la valeur de la colonne dérivée (par exemple multiplication)
                                    int result = 0;
                                    Operations operationType = exprBinaire.getOperateur().getType();
                                    if (operationType == Operations.MULTIPLICATION) {
                                        result = operandeGValue * operandeDValue;
                                    } else if (operationType == Operations.ADDITION) {
                                        result = operandeGValue + operandeDValue;
                                    } else {
                                        System.out.println("Opération non reconnue : " + operationType);
                                    }
                                    // Mettre à jour la valeur de la colonne dérivée dans la ligne de la table
                                    row.put(derivedColumnName, String.valueOf(result));  // Mettez à jour le nom correct de la colonne
                                    System.out.println("Valeur calculée : " + result);
                                } catch (NumberFormatException e) {
                                    System.out.println("Erreur de conversion des opérandes en entier : " + operandeGValueStr + " ou " + operandeDValueStr);
                                }
                            } else {
                                System.out.println("Opérandes manquants dans la ligne : " + row);
                            }
                        }
                    }
                }
            }
        }
    }
}
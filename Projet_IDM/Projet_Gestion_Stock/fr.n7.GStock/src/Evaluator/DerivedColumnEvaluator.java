package Evaluator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gstock.AccesVariable;
import gstock.Application;
import gstock.Colonne;
import gstock.Colonne_derivee;
import gstock.Expression;
import gstock.ExpressionBinaire;
import gstock.Operations;
import gstock.Table;

public class DerivedColumnEvaluator {

    // Méthode pour évaluer les colonnes dérivées
    public static void evaluateDerivedColumns(Map<String, List<Map<String, String>>> tables, Application app) {
        for (Table table : app.getTables()) {
            List<Map<String, String>> dataRows = tables.get(table.getNom());
            if (dataRows == null) continue;

            for (Colonne colonne : table.getColonnes()) {
                if (colonne instanceof Colonne_derivee) {
                    Colonne_derivee derivedColumn = (Colonne_derivee) colonne;
                    Expression expression = derivedColumn.getExpression();

                    if (expression instanceof ExpressionBinaire) {
                        ExpressionBinaire binaryExpression = (ExpressionBinaire) expression;
                        
                        // Récupérer les opérandes et l'opérateur
                        Expression leftOperand = binaryExpression.getOperandeG();
                        Expression rightOperand = binaryExpression.getOperandeD();
                        String operator = binaryExpression.getOperateur().getType().toString();  // Conversion de Operations en String

                        // Traiter chaque ligne de la table
                        for (Map<String, String> row : dataRows) {
                            int result = calculateBinaryExpression(row, leftOperand, rightOperand, operator);
                            row.put(derivedColumn.getNom(), String.valueOf(result));
                        }
                    }
                }
            }
        }
    }

    private static int calculateBinaryExpression(
    	    Map<String, String> row, 
    	    Expression leftOperand, 
    	    Expression rightOperand, 
    	    String operator
    	) {
    	    // Vérifier que les opérandes sont des AccesVariable
    	    if (leftOperand instanceof AccesVariable && rightOperand instanceof AccesVariable) {
    	        AccesVariable leftVar = (AccesVariable) leftOperand;
    	        AccesVariable rightVar = (AccesVariable) rightOperand;

    	        String leftColumnName = leftVar.getColonne().getNom();
    	        String rightColumnName = rightVar.getColonne().getNom();

    	        String leftValueStr = row.get(leftColumnName);
    	        String rightValueStr = row.get(rightColumnName);

    	        // Afficher les valeurs des opérandes pour le débogage
    	        System.out.println("Opérandes : " + leftColumnName + " = " + leftValueStr + ", " + rightColumnName + " = " + rightValueStr);

    	        // Vérifier que les valeurs ne sont pas nulles
    	        if (leftValueStr == null || rightValueStr == null) return 0;

    	        int leftValue = Integer.parseInt(leftValueStr);
    	        int rightValue = Integer.parseInt(rightValueStr);

    	        // Afficher les valeurs après conversion
    	        System.out.println("Valeurs après conversion : " + leftValue + " et " + rightValue);

    	        // Effectuer le calcul selon l'opérateur
    	        switch (operator) {
    	            case "multiplication": 
    	                System.out.println("Calcul de multiplication : " + leftValue + " * " + rightValue);
    	                return leftValue * rightValue;
    	            case "addition": 
    	                System.out.println("Calcul d'addition : " + leftValue + " + " + rightValue);
    	                return leftValue + rightValue;
    	            case "soustraction": 
    	                System.out.println("Calcul de soustraction : " + leftValue + " - " + rightValue);
    	                return leftValue - rightValue;
    	            case "division": 
    	                if (rightValue != 0) {
    	                    System.out.println("Calcul de division : " + leftValue + " / " + rightValue);
    	                    return leftValue / rightValue;
    	                }
    	                System.out.println("Erreur : division par zéro");
    	                return 0;
    	            default: 
    	                return 0;
    	        }
    	    }
    	    return 0;
    	}
}
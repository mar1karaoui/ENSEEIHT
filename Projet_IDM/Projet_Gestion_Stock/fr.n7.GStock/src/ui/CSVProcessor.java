package ui;

import loader.*;
import gstock.Application;
import gstock.Table;
import gstock.Colonne;
import gstock.Colonne_derivee;
import gstock.AccesVariable;
import gstock.ExpressionBinaire;
import gstock.Operations;
import gstock.Expression;
import com.opencsv.CSVReader;
import loader.ModelLoader;  
import ui.CSVHandler;   
import Evaluator.DerivedColumnEvaluator; 

import java.util.List;
import java.util.Map;

public class CSVProcessor {

	public String processCSV(String modelFilePath, String csvFilePath, String outputCsvPath, 
            String column1, String column2, String operation) {
Application app = ModelLoader.loadModel(modelFilePath);
if (app == null) {
return "Ã‰chec du chargement du modÃ¨le.";
}

CSVHandler handler = new CSVHandler();
Map<String, List<Map<String, String>>> tables;
try {
tables = handler.loadTablesFromCSV(csvFilePath);
} catch (Exception e) {
return "Erreur lors du chargement des donnÃ©es CSV : " + e.getMessage();
}

DerivedColumnEvaluator.evaluateDerivedColumns(tables, app);
addDerivedColumnsToTables(tables, app);
addDynamicColumn(tables, column1, column2, operation);

try {
handler.saveToCSV(outputCsvPath, tables);
} catch (Exception e) {
return "Erreur lors de la sauvegarde du fichier CSV : " + e.getMessage();
}

return "Traitement terminÃ© avec succÃ¨s. RÃ©sultats enregistrÃ©s dans : " + outputCsvPath;
}

    // Ajout de colonnes dÃ©rivÃ©es basÃ©es sur le modÃ¨le
    private void addDerivedColumnsToTables(Map<String, List<Map<String, String>>> tables, Application app) {
        for (Table table : app.getTables()) {
            List<Map<String, String>> tableData = tables.get(table.getNom());

            if (tableData == null) {
                continue;
            }

            for (Colonne colonne : table.getColonnes()) {
                if (colonne instanceof Colonne_derivee) {
                    Colonne_derivee derivedColonne = (Colonne_derivee) colonne;

                    // Ã‰valuation des expressions binaires pour chaque ligne
                    Expression expression = derivedColonne.getExpression();

                    for (Map<String, String> row : tableData) {
                        String derivedColumnName = derivedColonne.getNom();

                        if (expression instanceof ExpressionBinaire) {
                            ExpressionBinaire exprBinaire = (ExpressionBinaire) expression;
                            String operandeGName = exprBinaire.getOperandeG().getNom(); 
                            String operandeDName = exprBinaire.getOperandeD().getNom(); 
                            
                            String operandeGValueStr = row.get(operandeGName);
                            String operandeDValueStr = row.get(operandeDName);
                            
                            if (operandeGValueStr != null && operandeDValueStr != null) {
                                try {
                                    int operandeGValue = Integer.parseInt(operandeGValueStr);
                                    int operandeDValue = Integer.parseInt(operandeDValueStr);

                                    int result = 0;
                                    Operations operationType = exprBinaire.getOperateur().getType();
                                    if (operationType == Operations.MULTIPLICATION) {
                                        result = operandeGValue * operandeDValue;
                                    } else if (operationType == Operations.ADDITION) {
                                        result = operandeGValue + operandeDValue;
                                    }

                                    row.put(derivedColumnName, String.valueOf(result));
                                } catch (NumberFormatException e) {
                                    // Gestion des erreurs de conversion
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Ajout d'une colonne dynamique calculÃ©e Ã  partir des colonnes sÃ©lectionnÃ©es
    private void addDynamicColumn(Map<String, List<Map<String, String>>> tables,
            String column1, String column2, String operation) {
        for (String tableName : tables.keySet()) {
            List<Map<String, String>> rows = tables.get(tableName);
            for (Map<String, String> row : rows) {
                try {
                    String value1Str = row.get(column1);
                    String value2Str = row.get(column2);

                    // VÃ©rifier si l'une des valeurs est null ou vide
                    if (value1Str == null || value1Str.trim().isEmpty() || value2Str == null || value2Str.trim().isEmpty()) {
                        // Ne pas effectuer de calcul si l'une des valeurs est manquante ou vide
                        continue; // Passer Ã  la ligne suivante
                    }

                    System.out.println("voila la valeur des lignes de la colonne numero 1 : " + value1Str);
                    System.out.println("voila la valeur des lignes de la colonne numero 2 : " + value2Str);

                    double value1 = Double.parseDouble(value1Str.trim());
                    double value2 = Double.parseDouble(value2Str.trim());
                    double result;

                    // Calculer le rÃ©sultat de l'opÃ©ration
                    switch (operation) {
                        case "+":
                            result = value1 + value2;
                            break;
                        case "-":
                            result = value1 - value2;
                            break;
                        case "*":
                            result = value1 * value2;
                            break;
                        case "/":
                            if (value2 == 0) throw new ArithmeticException("Division par zÃ©ro");
                            result = value1 / value2;
                            break;
                        default:
                            throw new IllegalArgumentException("OpÃ©ration non supportÃ©e : " + operation);
                    }

                    // Mettre Ã  jour la ligne avec le rÃ©sultat calculÃ©
                    System.out.println("mon resultat est" + result);
                    row.put(column1 + operation + column2, String.valueOf(result));
                } catch (NumberFormatException e) {
                    row.put(column1 + operation + column2, "Erreur : Format incorrect");
                } catch (ArithmeticException e) {
                    row.put(column1 + operation + column2, "Erreur : " + e.getMessage());
                }
            }
        }
    }


}

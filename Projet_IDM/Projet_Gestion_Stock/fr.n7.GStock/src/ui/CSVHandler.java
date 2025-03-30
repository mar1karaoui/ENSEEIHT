package ui;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class CSVHandler {

    
    public Map<String, List<Map<String, String>>> loadTablesFromCSV(String filePath) throws Exception {
        Map<String, List<Map<String, String>>> tables = new HashMap<>();
        List<Map<String, String>> currentTable = new ArrayList<>();
        String[] headers = null;
        String currentTableName = null;
        boolean isFirstRow = true;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] row;

            while ((row = reader.readNext()) != null) {
               
                if (row.length == 0 || isBlankRow(row)) {
                 
                    if (!currentTable.isEmpty() && currentTableName != null) {
                        tables.put(currentTableName, currentTable);
                    }
                    currentTable = new ArrayList<>(); 
                    currentTableName = null;
                    headers = null;
                    isFirstRow = true;
                    continue;
                }

           
                if (isFirstRow) {
                    currentTableName = row[0].trim(); 
                    isFirstRow = false;
                    continue;
                }

               
                if (headers == null) {
                    headers = row;
                    continue;
                }

           
                if (row.length == headers.length) {
                    Map<String, String> rowMap = new HashMap<>();
                    for (int i = 0; i < row.length; i++) {
                        rowMap.put(headers[i].trim(), row[i].trim());
                    }
                    currentTable.add(rowMap);
                } else {
                    System.out.println("Ligne ignorée : " + String.join(",", row));
                }
            }

      
            if (!currentTable.isEmpty() && currentTableName != null) {
                tables.put(currentTableName, currentTable);
            }
        }
        return tables;
    }

   
    private boolean isBlankRow(String[] row) {
        for (String cell : row) {
            if (cell != null && !cell.trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public String convertToJson(Map<String, List<Map<String, String>>> tables) {
        Gson gson = new Gson().newBuilder().setPrettyPrinting().create(); 
        return gson.toJson(tables);
    }

  
    public void saveToCSV(String outputCsvPath, Map<String, List<Map<String, String>>> tables) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(outputCsvPath))) {
            
            for (Map.Entry<String, List<Map<String, String>>> entry : tables.entrySet()) {
                String tableName = entry.getKey();
                List<Map<String, String>> tableData = entry.getValue();
                
                if (tableData != null && !tableData.isEmpty()) {
                 
                    writer.writeNext(new String[] { "Table: " + tableName });
                    
                    List<String> headers = List.copyOf(tableData.get(0).keySet());
                    writer.writeNext(headers.toArray(new String[0]));

                 
                    for (Map<String, String> row : tableData) {
                        List<String> rowData = new ArrayList<>();
                        for (String header : headers) {
                            rowData.add(row.get(header));
                        }
                        writer.writeNext(rowData.toArray(new String[0]));
                    }

               
                    writer.writeNext(new String[] { "" });
                }
            }
        }
    }
}

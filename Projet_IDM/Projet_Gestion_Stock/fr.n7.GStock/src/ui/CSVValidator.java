package ui;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVValidator {

    /**
     * VÃ©rifie si toutes les valeurs de type int dans le fichier CSV sont positives.
     *
     * @param filePath Le chemin du fichier CSV Ã  vÃ©rifier.
     * @return Une liste de messages d'erreur, vide si aucune erreur n'est trouvÃ©e.
     * @throws Exception Si une erreur de lecture du fichier survient.
     */
    public List<String> validate(String filePath) throws Exception {
        List<String> errorMessages = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            int rowNumber = 1; // Pour indiquer la ligne dans les messages d'erreur

            while ((line = reader.readNext()) != null) {
                for (int columnIndex = 0; columnIndex < line.length; columnIndex++) {
                    String value = line[columnIndex].trim();

                    // VÃ©rifier si la valeur est un entier
                    if (isInteger(value)) {
                        int intValue = Integer.parseInt(value);

                        if (intValue < 0) {
                            errorMessages.add("Valeur nÃ©gative trouvÃ©e Ã  la ligne " 
                                    + rowNumber + ", colonne " + (columnIndex + 1) + ": " + intValue);
                        }
                    }
                }
                rowNumber++;
            }
        }

        return errorMessages;
    }

    /**
     * VÃ©rifie si une chaÃ®ne reprÃ©sente un entier valide.
     *
     * @param str La chaÃ®ne Ã  vÃ©rifier.
     * @return true si la chaÃ®ne est un entier valide, false sinon.
     */
    private boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

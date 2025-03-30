package ui;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(Image image) {
        this.backgroundImage = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}

public class StockManagementApp {
    public static void main(String[] args) {
        
        ImageIcon backgroundIcon = new ImageIcon("/home/mki5633/Annee_2/IDM_Projet_Copy/Projet_IDM/fr.n7.GStock/src/ui/stock1.jpeg"); // Chemin de l'image
        Image backgroundImage = backgroundIcon.getImage();
        BackgroundPanel backgroundPanel = new BackgroundPanel(backgroundImage);

       
        JFrame frame = new JFrame("Gestion de Stock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 800);

      
        backgroundPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20); 
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        formPanel.setBackground(Color.WHITE); 
        formPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.WHITE, 2),
                BorderFactory.createEmptyBorder(20, 20, 20, 0))); 

        GridBagConstraints formGbc = new GridBagConstraints();
        formGbc.insets = new Insets(10, 10, 10, 10); 
        formGbc.gridx = 0;
        formGbc.gridy = GridBagConstraints.RELATIVE;
     // Listes dÃ©roulantes pour les colonnes
        JLabel column1Label = new JLabel("Operande 1 :");
        JLabel column2Label = new JLabel("Operande 2 :");
        JLabel operationLabel = new JLabel("Operation :");

        JComboBox<String> column1ComboBox = new JComboBox<>();
        JComboBox<String> column2ComboBox = new JComboBox<>();
        JComboBox<String> operationComboBox = new JComboBox<>(new String[]{"+", "-", "*", "/"});


     
        JLabel titleLabel = new JLabel("Gestion de Stock");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE); 

        JLabel label = new JLabel("Importez un fichier CSV :");
        label.setForeground(Color.BLACK); 

        JButton importButton = new JButton("Importer");
        JButton calculateButton = new JButton("Calculer");
        JLabel resultLabel = new JLabel("Resultat :");
        resultLabel.setForeground(Color.BLACK);

        JButton downloadButton = new JButton("Telecharger");

      
        formPanel.add(label, formGbc);
        formPanel.add(importButton, formGbc);
        formPanel.add(column1Label, formGbc);
        formPanel.add(column1ComboBox, formGbc);
        formPanel.add(column2Label, formGbc);
        formPanel.add(column2ComboBox, formGbc);
        formPanel.add(operationLabel, formGbc);
        formPanel.add(operationComboBox, formGbc);
        formPanel.add(calculateButton, formGbc);
        formPanel.add(resultLabel, formGbc);
        formPanel.add(downloadButton, formGbc);

       
        backgroundPanel.add(titleLabel, gbc);
        backgroundPanel.add(formPanel, gbc);

        frame.add(backgroundPanel);

        
        final File[] importedFile = {null};
        final File[] resultFile = {null};
     // Ajouter des colonnes et des opÃ©rations dans les comboBox aprÃ¨s l'importation
        importButton.addActionListener(e -> {
        	
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                importedFile[0] = fileChooser.getSelectedFile();
                try {
                    // Validation du fichier CSV avant de charger les donnÃ©es
                    CSVValidator validator = new CSVValidator();
                    List<String> errors = validator.validate(importedFile[0].getAbsolutePath());

                    if (!errors.isEmpty()) {
                        // Affiche les erreurs de validation et arrÃªte le processus
                        JOptionPane.showMessageDialog(null, 
                                "Le fichier contient des erreurs :\n" + String.join("\n", errors));
                        importedFile[0] = null; // RÃ©initialise le fichier importÃ© pour Ã©viter toute utilisation ultÃ©rieure
                    } else {
                        // Si le fichier est valide, charge les donnÃ©es
                        CSVHandler csvHandler = new CSVHandler();
                        Map<String, List<Map<String, String>>> data = csvHandler.loadTablesFromCSV(importedFile[0].getAbsolutePath());

                        if (data != null && !data.isEmpty()) {
                            String firstTable = data.keySet().iterator().next();
                            List<Map<String, String>> rows = data.get(firstTable);

                            if (!rows.isEmpty()) {
                                // RÃ©cupÃ©ration des colonnes et mise Ã  jour des combo boxes
                                String[] columns = rows.get(0).keySet().toArray(new String[0]);
                                column1ComboBox.removeAllItems();
                                column2ComboBox.removeAllItems();
                                for (String column : columns) {
                                    column1ComboBox.addItem(column);
                                    column2ComboBox.addItem(column);
                                }
                            }
                            JOptionPane.showMessageDialog(null, "Fichier charge : " + importedFile[0].getName());
                        } else {
                            JOptionPane.showMessageDialog(null, "Le fichier CSV est vide ou invalide.");
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erreur lors de la lecture du fichier CSV ou de sa validation : " + ex.getMessage());
                }
            }
        });


        // Action du bouton "Calculer"
     // Action du bouton "Calculer"
        calculateButton.addActionListener(e -> {
            if (importedFile[0] == null) {
                JOptionPane.showMessageDialog(null, "Veuillez importer un fichier CSV.");
                return;
            }

            String column1 = (String) column1ComboBox.getSelectedItem();
            System.out.println("voila la colonne selectionee numero 1"+column1);
            String column2 = (String) column2ComboBox.getSelectedItem();
            System.out.println("voila la colonne selectionee numero 2"+column2);
            String operation = (String) operationComboBox.getSelectedItem();
            System.out.println("voila l operation selectionne"+ operation);

            // VÃ©rification des colonnes et de l'opÃ©ration uniquement si elles sont sÃ©lectionnÃ©es
            if (column1 == null || column2 == null || operation == null) {
                // Si aucune colonne ou opÃ©ration n'est sÃ©lectionnÃ©e, on passe null dans les paramÃ¨tres
                column1 = null;
                column2 = null;
                operation = null;
                System.out.println("tous les champs sont null"); 
            }

            try {
                // Appeler CSVProcessor avec les colonnes et l'opÃ©ration, ou null si non sÃ©lectionnÃ©
                String outputCsvPath = "/home/mki5633/Annee_2/IDM_Projet_Copy/Projet_IDM/fr.n7.GStock/Testresultat.csv";
                CSVProcessor processor = new CSVProcessor();
                String resultMessage = processor.processCSV(
                        "/home/mki5633/Annee_2/IDM_Projet_Copy/Projet_IDM/fr.n7.GStock/model/model.xmi",
                        importedFile[0].getAbsolutePath(),
                        outputCsvPath,
                        column1,
                        column2,
                        operation
                );

                JOptionPane.showMessageDialog(null, resultMessage);

                // Mise Ã  jour de l'Ã©tat du fichier rÃ©sultant
                resultFile[0] = new File(outputCsvPath);
                resultLabel.setText("Calcul termine. Resultats generes.");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erreur : " + ex.getMessage());
            }
        });


        downloadButton.addActionListener(e -> {
            if (resultFile[0] == null) {
                JOptionPane.showMessageDialog(null, "Aucun fichier genere a telecharger.");
                return;
            }
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setSelectedFile(resultFile[0]);
            int result = fileChooser.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                try {
                    Files.copy(resultFile[0].toPath(), fileChooser.getSelectedFile().toPath());
                    JOptionPane.showMessageDialog(null, "Fichier telecharge avec succes.");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erreur lors du telechargement : " + ex.getMessage());
                }
            }
        });

      
        frame.setVisible(true);
    }
}

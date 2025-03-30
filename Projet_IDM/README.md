# Projet IDM – Gestion de Stocks

Ce projet a été réalisé dans le cadre du module d'**Ingénierie Dirigée par les Modèles (IDM)** à l'ENSEEIHT, parcours **Systèmes Logiciels**. Il vise à fournir une plateforme de gestion de données orientée modèle, à travers une modélisation EMF, une interface graphique intuitive, et un traitement automatisé des données d’inventaire.

## 👥 Membres du projet

- Imane EL AYBOUDI  
- Salwa ALIMOUSSA  
- Marwane KARAOUI  
- Mohamed Amine BENKIA  
- Kossila CHABANE  

Encadré par : Pr. Marc Pantel & Pr. Guillaume Dupont  
Année universitaire : 2024-2025

---

## 🧠 Objectif du projet

Permettre à des utilisateurs non-experts de créer des outils personnalisés pour structurer, analyser et exploiter des données de stock. Le projet s'appuie sur :
- La modélisation avec **EMF**
- L’édition graphique avec **Sirius**
- Une interface utilisateur simple basée sur **Swing**
- La définition d’un **DSL** avec **Xtext**

---

## ⚙️ Fonctionnalités principales

- 📦 **Modélisation de données** : métamodèle pour des tables, colonnes simples, dérivées ou référencées.
- 📥 **Importation de fichiers CSV** pour instancier les modèles.
- 📊 **Calculs dynamiques** de colonnes dérivées via expressions.
- 🧾 **Validation de données** : types, valeurs, noms, identifiants, absence de boucles de dépendance.
- 🖼️ **Éditeur graphique** (via Sirius) pour manipuler les modèles visuellement.
- 📜 **DSL textuel** (via Xtext) pour écrire des modèles de façon déclarative.
- 🖥️ **Interface utilisateur graphique** :
  - Importer une table
  - Calculer des colonnes
  - Ajouter des colonnes dynamiques
  - Sauvegarder les résultats

---

## 🧱 Architecture du projet

- `model/` : définition du métamodèle EMF
- `xtext/` : syntaxe textuelle du DSL (GS1.xtext)
- `sirius/` : fichier `.odesign` pour la modélisation graphique
- `src/` :
  - `ModelLoader.java` : chargement du modèle XMI
  - `DerivedColumnEvaluator.java` : évaluation des colonnes dérivées
  - `CSVHandler.java` : conversion CSV → HashMap
  - `CSVValidator.java` : vérification des données
  - `CSVProcessor.java` : traitements dynamiques
  - `MainUI.java` : interface graphique Swing

---

## 🚀 Lancement du projet

### Prérequis
- Java 17+
- Eclipse avec les plugins EMF, Sirius, Xtext installés
- Gson pour la manipulation JSON

### Étapes
1. Importer le projet dans Eclipse
2. Exécuter l’environnement Eclipse pour le DSL avec Xtext (Run as Eclipse Application)
3. Lancer la classe `MainUI.java` pour démarrer l’application

---

## 📸 Aperçu

- 📂 Import de fichiers `.csv`
- ➕ Calcul dynamique de colonnes
- 💾 Sauvegarde des résultats au format `.csv`
- 🔧 Vue graphique des modèles (Sirius)
- ✍️ Édition DSL (Xtext)

---

## 🔒 Contraintes vérifiées

- Noms obligatoires et bien formatés
- Unicité des identifiants
- Types valides (int ou string)
- Aucune boucle de dépendances dans les colonnes
- Cohérence des expressions et opérateurs

---

## 📌 Améliorations futures

- Support d'expressions unaires (sin, cos, exp, etc.)
- Génération de scripts à partir du DSL
- Édition directe des valeurs de colonnes dans l’IHM
- Support d'autres formats (XML, JSON)

---

## 📄 Licence

Projet académique - ENSEEIHT 2024-2025  
Usage libre dans un cadre pédagogique uniquement.


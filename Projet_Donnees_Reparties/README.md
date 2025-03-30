# 📦 HagiMule - Téléchargement Distribué de Fichiers

HagiMule est une infrastructure distribuée conçue pour faciliter le **téléchargement parallèle de fichiers volumineux** en exploitant plusieurs sources simultanément. Le projet met l'accent sur la performance, la tolérance aux pannes et l'efficacité réseau.

## 🎯 Objectifs du Projet

- **Optimisation du téléchargement** grâce au parallélisme CPU et réseau.
- **Gestion des pannes** avec relance automatique de fragments échoués.
- **Amélioration des performances** via la compression des fragments.

## 🏗️ Architecture

Le système repose sur **trois composants principaux** :

- **Annuaire** (`RMI`) : gère dynamiquement les fichiers partagés entre clients enregistrés.
- **Daemon** (`TCP`) : serveur qui transmet les fragments de fichiers.
- **Downloader** : client qui télécharge et assemble les fragments.

## ⚙️ Fonctionnalités Principales

- 📡 **Connexion/Communication** : sockets TCP + RMI pour des échanges fiables.
- 📂 **Fragmentation** des fichiers : division équitable + gestion du dernier fragment.
- 🔄 **Relance des fragments perdus** : jusqu’à 3 tentatives automatiques.
- 📦 **Compression/Décompression** des fragments pour optimiser la bande passante.
- ⏱️ **Suivi des performances** avec mesure du temps de téléchargement.

## 🧪 Exemple de fonctionnement

1. Lancement de l'annuaire (AnnuaireImpl)
2. Connexion des clients (Daemons)
3. Téléchargement d’un fichier fragmenté via plusieurs sources
4. Relance des fragments échoués
5. Assemblage du fichier final

## 🚫 Limitations actuelles

- ❌ Reprise partielle des fragments non implémentée
- ❌ Compression appliquée même aux fichiers déjà compressés
- ❌ Pas de limitation d'accès simultané à une même source
- ❌ Absence de chiffrement (données non sécurisées)
- ❌ Relance avec nouvelle fragmentation non disponible

## 🚀 Perspectives d'Amélioration

- 📁 Reprise partielle des fragments échoués
- 🎯 Compression dynamique selon le type de fichier
- 🔐 Ajout de la sécurité avec chiffrement
- 📊 Gestion des connexions concurrentes par file d’attente ou priorité

## 👥 Équipe du projet

- Mohammed Amine BENKIA  
- Marwane KARAOUI

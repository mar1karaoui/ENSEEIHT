Je ne suis pas tout à fait d'accord avec votre analyse des interfaces graphiques 
de studio. Oui, il y a des fenêtres/éléments plus importants que d'autre, mais
le coeur de ce genre de logiciel c'est une fenêtre principale et des sous
fenêtres. Votre modélisation devrait s'articuler autour de la fenêtre principal, 
et permettre facilement la définition de nouvelles fenêtres.

Quand on conçoit un machin on pense _long terme_.

Vous avez pris comme exemple la fenêtre de FL Studio, j'aurais préféré que vous
fassiez des dessins de votre propre interface (quitte à s'inspirer de FL
Studio). Comme vous avez déjà les dessins des composants ça n'aurait pas été si
difficile.

<br>

Vous auriez peut-être dû mettre les schémas à côté de la description des
fonctionnalités (vu que la plupart sont assez graphiques finalement).

Autre chose : c'est dommage d'utiliser les mêmes labels pour les fonctionnalités
(vous avez F1 à plusieurs endroits). Trouvez des labels différenciés, de sorte
que quand je dise "Fonctionnalité Fxxx" vous voyez précisément à quoi je fais
référence. (Idée comme ça : la barre d'outil étant dans la section 2.1, les
fonctionnalités pourraient s'appeler 2.1.1, 2.1.2, 2.1.3, etc.).

<br>

Je ne dirais pas que "créer un nouveau projet" soit une fonctionnalité de la
barre d'outils ; c'est une fonctionnalité de l'application en général, avec un
raccourci dans la barre d'outil. C'est différent pour le fait de définir le BPM
du morceau, qui est effectivement une fonctionnalité de la barre d'outils.

<br>

Pourquoi 10 pistes ? Dans tous les cas ça ne doit pas être un nombre en dur dans
votre programme. Faites la conception en imaginant _n_ pistes, _n_ quelconque
(je veux pas voir de variables "piste0", "piste1", "piste2", etc.).

<br>

De manière générale vous utilisez pas mal de jargon. C'est pas grave en soit
mais quand on fait ça on donne des définitions préalables (par ex : définir un
pattern, définir une piste, définir un instrument...).

Dites-vous que vous avez de la chance que je connaisse le milieu, sinon je
serais pas mal perdu je pense.

<br>

La fonctionnalité F5 du 2.2.3 parle de plug-in, ça vaut peut être le coup de
détailler ça ? Vous parlez de plug-ins VST ? Ou des plug-ins custom ?

En cherchant un peu j'ai vu que quelqu'un avait fait un truc pour charger des
VST avec Java (je ne sais pas ce que ça vaut). À voir si c'est utilisable parce
que sinon programmer des algos de son c'est assez technique (genre un mixer ça
va, un equalizer c'est déjà difficile, une reverb n'y pensez même pas).

<br>

Des fois vous donnez des détails trop bas niveau. Par ex. dans 2.2.5, F5 :
"copier coller une note en faisant un clic gauche [...]". La feature c'est juste
le fait de copier coller. Que ça soit fait avec Ctrl-C ou avec un coup de tête
dans l'écran c'est pas très pertinent, si ?

<br>

La barre d'outils n'est pas une fenêtre (c'est une barre d'outils). Vous devriez
envisager de faire des [fenêtres dockables](http://www.java2s.com/Code/Java/Swing-Components/Simpledemofordockablewindows.htm) 
plutôt que d'avoir des vues (et alors une vue devient juste une configuration 
particulière de fenêtres).

Pour le browser le mot que vous cherché est "tab" (ou "onglet" en français). Il 
y a le premier tab et le deuxième tab (pas "gauche" et "droite", d'autant que
l'ordre importe peu par rapport à la présentation).

<br>

Dans les points que vous n'avez pas abordé (mais probablement juste parce que
vous n'y avez pas pensé) : comment sauvegarde-t-on un projet ? Il faudrait 
sauvegarder la structure du projet (on peut faire ça dans un format de fichier 
structuré genre XML ou Json) et sauvegarder potentiellement les samples et les
notes ? En tous cas il faut peut-être y réfléchir.

<br>

Autres petits détails plus généraux :
- Ne mettez pas "l'objectif" (qui est en fait une présentation du contenu) sur
  la page de garde. Ça a plutôt sa place à la fin de l'introduction.
- On ne dit pas "Partie" mais "Section".
- En français il y a un retrait (alinéa) à chaque paragraphe. Les paragraphes ne
  sont pas séparés par une ligne entière sauf pour former des découpages 
  internes aux sections.
  Si vous utilisez LaTeX : \usepackage[french]{babel} pour les normes
  typographiques françaises. En LaTeX laisser des lignes vides entre deux
  paquets de lignes forme un paragraphe (pas besoin de commande additionnelle).
- Les légendes de figure (les _caption_) doivent être centrées en dessous de la
  figure. C'est normalement le cas avec \caption.
- Dès que vous insérez une image ça doit être une figure (dans l'environnement
  _figure_ si vous utilisez LaTeX). On essaye d'éviter d'avoir des images au
  milieu du texte.


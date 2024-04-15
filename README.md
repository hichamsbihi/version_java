Documentation de l'application de calcul d'aires de formes géométriques
Cette application calcule l'aire de formes géométriques comme le triangle et le cercle. Il y a deux versions de cette application, écrites en Java 16 et Java 11.

Fonctionnalités de l'application
L'application permet à l'utilisateur d'entrer les dimensions des formes, calcule leur aire, puis affiche le résultat. Les deux figures géométriques pouvant être calculées sont le triangle et le cercle.

Versions de Java prises en charge
Il y a deux versions de l'application - la version Java 11 et la version Java 16.

Différences entre les versions Java 11 et Java 16
Les versions de l'application doivent fonctionner de manière similaire et réaliser les mêmes fonctionnalités. Cependant, il y a quelques différences notables entre les deux versions.

Utilisation d'un record au lieu d'une classe abstraite
Dans la version Java 16, l'application utilise la nouvelle fonctionnalité de Java 16, à savoir les records, pour définir les formes géométriques. Les records sont une nouvelle fonctionnalité de Java 16 qui permettent de définir de manière concise des classes immutables avec des méthodes getter par défaut. Dans notre cas, cela nous permet de définir la classe Triangle et la classe Cercle de manière simple et facile à lire.

En revanche, dans la version Java 11, la définition des formes géométriques utilise l'héritage et les classes abstraites. Les deux formes héritent de la même classe abstraite Forme, qui définit la méthode aire() que les classes filles doivent implémenter.

Nomenclature
La nomenclature des classes change légèrement entre les deux versions de l'application. Dans la version Java 16, les noms de classes restent simples et sont appelés Triangle et Cercle. Dans la version Java 11, les noms des classes sont modifiés légèrement pour inclure le mot "Geometrie" à la fin des noms de classes, devenant ainsi TriangleGeometrie et CercleGeometrie.

Utilisation du pattern matching dans la version Java 16
La version Java 16 utilise le pattern matching pour vérifier le type de la forme géométrique et calculer ensuite son aire. Le pattern matching peut être utilisé avec le mot-clé instanceof ou le mot-clé switch. Dans cette application, nous avons choisi d'utiliser le switch pour afficher l'aire de la forme géométrique.

La version Java 11 utilise instanceof et casting pour vérifier le type de la forme géométrique et calculer son aire.

Conclusion
Les différences entre les versions Java 11 et Java 16 sont liées à l'utilisation de la fonctionnalité de record et de l'héritage, ainsi que de la syntaxe des nouveautés introduites par les versions respectives.

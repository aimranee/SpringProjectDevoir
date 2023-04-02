# SpringProjectDevoir

Devoir : Spring Boot
Soit le diagramme de classe suivant : 

![image](https://user-images.githubusercontent.com/66027300/229385462-d3531355-66e9-47b8-9b47-d6198ca64982.png)

1. Créez un projet Spring Boot.

2. Créez les classes Personne, Auteur et Livre avec leurs attributs et méthodes appropriés. 
Assurez-vous que la classe Auteur hérite de la classe Personne.

3. Créez une interface repository pour chaque classe en étendant l'interface JpaRepository de Spring Data. Ajoutez les méthodes personnalisées pour trouver un auteur par son cin  et trouver un livre par son ISBN.

4. Créez une interface service pour chaque classe qui contient les méthodes nécessaires pour manipuler les données. Ajoutez les méthodes personnalisées pour trouver tous les livres d'un auteur, trouver les auteurs nés à une date donnée et trouver les livres parus entre deux dates. Ajoutez également une méthode pour affecter un livre à un auteur.

5. Implémentez les classes service en utilisant les interfaces repository pour effectuer les opérations CRUD et les méthodes personnalisées pour les besoins spécifiques.

6. Créez une classe Rest Controller pour chaque classe qui expose les méthodes du service sous forme d'API REST. Ajoutez des méthodes pour trouver un auteur par son cin, trouver un livre par son ISBN, trouver tous les livres d'un auteur, trouver les auteurs nés à une date donnée et trouver les livres parus entre deux dates. Ajoutez également une méthode pour  affecter un livre à un auteur.

7. Configurez le projet pour utiliser une base de données, par exemple MySQL ou PostgreSQL.

8. Dans une classe de test, créez des instances d'auteur et de livre, utilisez la méthode pour affecter un livre à un auteur, puis enregistrez-les dans la base de données en appelant la méthode de sauvegarde du service correspondant.

9. Testez l'application en utilisant un outil tel que Postman pour appeler les API REST.

10. Déployez l'application sur un serveur, par exemple Tomcat ou Jetty.

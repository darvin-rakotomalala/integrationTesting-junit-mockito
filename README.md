## Spring Boot Integration Testing CRUD REST API | JUnit & Mockito

Dans ce repo, nous allons apprendre à effectuer des tests d'integration de Spring Boot à l'aide de l'annotation
`@SpringBootTest` de JUnit 5.

### Qu'est-ce qu'un test d'intégration ?
---
Les tests d'intégration se concentrent sur l'intégration de différentes couches de l'application. Cela signifie
également qu'aucune moquerie n'est impliquée.

Fondamentalement, nous écrivons des tests d'intégration pour tester une fonctionnalité qui peut impliquer une
interaction avec plusieurs composants.

Exemples : tests d'intégration de la fonctionnalité complète de gestion des employés **(EmployeeRepository,
EmployeeService, EmployeeController)**.

Test d'intégration de la fonctionnalité complète  **de gestion des utilisateurs (UserController, UserService et
UserRepository)**.

Test d'intégration de la fonctionnalité de connexion complète  **(LoginRespository, LoginController, Login Service)**,
etc.

### Technologies
---

- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Lombok
- JUnit 5
- Maven

### Quelques des points à noter
---

- Spring boot fournit une dépendance `spring-boot-starter-test`  pour les tests unitaires et les tests d'intégration de
  l'application Spring boot
- Annotation `@SpringBootTest` pour les tests d'intégration. Cette annotation crée un contexte d'application et charge
  le
  contexte d'application complet. `@SpringBootTest` démarrera le contexte complet de l'application, ce qui signifie que
  nous pouvons `@Autowire` n'importe quel bean récupéré par l'analyse des composants dans notre test.

### Exécutez les tests unitaires
---

- Exécuter le test : `mvn test`

### Ressources utiles
---

- [JUnit Framework Best Practices](https://www.javaguides.net/2018/08/junit-framework-best-practices.html)
- [Best Practices for Unit Testing in Java](https://www.developer.com/java/best-practices-unit-testing-java/)
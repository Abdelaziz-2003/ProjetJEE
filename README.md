# ProjetJEE : Microservices avec Spring Cloud

## Description
Ce projet implémente un microservice de gestion des commandes (`microservice-commandes`) avec Spring Cloud. Le projet comprend deux études de cas :

1. **Étude de cas 1** : Mise en place d'un microservice pour réaliser des opérations CRUD sur des commandes. La configuration de ce microservice est gérée via Spring Cloud Config et un dépôt GitHub.
   - **Objectifs** :
     - Gestion des commandes dans la table `COMMANDE` (colonnes : `id`, `description`, `quantité`, `date`, `montant`).
     - Configuration des derniers jours de commandes à afficher via une propriété Spring Cloud (`mes-config-ms.commandes-last`).
     - Mise en place de la supervision de la santé du microservice avec Spring Actuator.

2. **Étude de cas 2** : Extension du microservice pour ajouter un champ `id_produit` et intégration avec Eureka pour le service de découverte. Implémentation d'une API Gateway et gestion des délais d'attente (Timeout) via Hystrix.



## Fonctionnalités
- **Gestion des commandes** : CRUD sur les commandes avec possibilité d'afficher les commandes des derniers X jours, configurables via Spring Cloud.
- **Supervision** : Utilisation de Spring Actuator pour surveiller la santé du microservice, avec un statut personnalisé (`UP` ou `DOWN` selon la présence de commandes dans la base de données).
- **Spring Cloud Config** : Externalisation de la configuration des microservices via un dépôt GitHub.
- **Hystrix** : Gestion des pannes avec mécanismes de contournement via Hystrix, en cas de Timeout d'un des microservices.
- **API Gateway** : Implémentation d'un point d'entrée unique pour l'application.



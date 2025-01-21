Projet Microservices avec Spring Boot
Binôme : Merzouk Abdelaziz & Boudou Ibrahim

Description du Projet
Ce projet met en œuvre une architecture de microservices utilisant les technologies suivantes :

Spring Boot : Framework principal pour le développement des microservices.
Eureka Netflix : Pour l'enregistrement et la découverte des microservices.
Spring Cloud : Gestion centralisée de la configuration.
Hystrix : Gestion de la résilience avec des mécanismes de tolérance aux pannes.
API Gateway : Point d'accès unique à l'application.
MySQL : Base de données relationnelle utilisée pour le stockage.


Structure du Projet
1. Microservice Produit
Fonctionnalités CRUD pour la gestion des produits (sans SQL).
Utilise MySQL pour stocker les données des produits.
Hystrix est une bibliothèque qui permet de gérer la tolérance aux pannes dans les microservices en implémentant des mécanismes comme le circuit breaker, les fallbacks, et les timeouts pour améliorer la résilience du système.

Simulation des Timeouts
Les timeouts ont été simulés dans le microservice Produit en générant une exception conditionnelle.
Par exemple, si l'ID du produit est égal à 1, une exception RuntimeException est levée pour déclencher le circuit breaker et activer le mécanisme de fallback.- Endpoints REST pour les opérations sur les produits.


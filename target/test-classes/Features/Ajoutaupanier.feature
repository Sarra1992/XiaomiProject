#Author: sarra.baccar.sb@gmail.com
Feature: panier

  Scenario: ajouter au panier
    Given admin accède à la page du produit à ajouter
    When admin clique sur le bouton "Ajouter au panier" et clique sur le panier
    Then le produit "Mi Temperature and Humidity Monitor Pro" est ajouté au panier

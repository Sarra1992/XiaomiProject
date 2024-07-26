#Author: sarra.baccar.sb@gmail.com

Feature: Page d accueil XIAOMI

  Scenario: cliquer sur un produit
    Given admin accède à la page d accueil 
    When admin survule la souris sur le menu "Smart Home" et clique sur le sous-menu "Maison connectée" 
    Then admin est dirigé vers la page qui contient le message "Maison Connectée"

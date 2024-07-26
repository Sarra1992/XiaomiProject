#Author: sarra.baccar.sb@gmail.com
Feature: Smart Home page

  Scenario: cliquer sur un produit
    Given admin accède à la page "Maison connectée"
    When admin clique sur "Mi Camera 2K Magnetic Mount"
    Then admin est dirigé vers la page "Mi Camera 2K Magnetic Mount"

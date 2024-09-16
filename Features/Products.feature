Feature: Prodects Functionality

  Background: 
    Given Launch browser and go to home page
    When user click on Products link

  #Scenario: Verify all Products in Products Page
  #And user capture all products in products page
  #Then navigate back to home page
  #
  #Scenario: Verify search product
  #And search product in search bar
  #Then verify search product
  #Scenario: verify add product in cart
    #And user add two products in cart
    #And user click on cart link
    #Then user verify product in cart

  Scenario: verify product chechout before login
    And user add two products in cart
    And user click on cart link
    And user proceed to checkout
    And user Login Account and click on cart
    And user enter chechout details
    Then user got confirmation message

Feature: Prodects Functionality

  Scenario: Verify all Products in Products Page
    Given Launch browser and go to home page
    When user click on Products link
    And user capture all products in products page
    Then navigate back to home page

Feature: Contact Us Functionality

  Scenario: Verify Contact Us Page
    Given Launch browser and go to Home Page
    When user click on contact us page
    And user enter valid information into mandatory fields
    And click on submit button
    Then user should be get confirmation message

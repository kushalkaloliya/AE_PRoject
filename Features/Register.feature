Feature: Register User

  Scenario: Register user with valid credential
    Given user launch browser and navigate to home page of application
    And click on sign up button
    When user click enter name as a "mn" and email address as a "mn@gmail.com" and click signup button
    And user fill details into mandatory fields
      | password  | mn12345 |
      | firstname | ks      |
      | lastname  | sk      |
      | address   | 5 kk    |
      | state     | guj     |
      | city      | raj     |
      | zip       |   55555 |
      | mobno     |  500000 |
    And user click on create account button
    Then user verify that Account Created

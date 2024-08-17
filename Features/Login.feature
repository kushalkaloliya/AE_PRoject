Feature: Login User

  Scenario: Login user with valid credential
    Given user Launch browser and navigate to home page
    And click on sign up/login button
    When user enter email as "mn@gmail.com" and password as "mn12345" and click on login button
    Then user should be redirected to the my account page
    And user click on logout button and should be logout from the application

Feature: Drop Down Menu

  Scenario: Verify Simple Drop Down Menu
    Given user launch browser and launch url "https://www.globalsqa.com/demo-site/select-dropdown-menu/"
    When user select India from the country drop down menu
    Then user should be select India successfully

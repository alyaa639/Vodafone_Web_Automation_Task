Feature: Register with valid data in unicorn website
  Scenario Outline: Register to unicorn website
    Given unicorn website opened successfully
    When  click on profile icon in landing screen
    And   click on register option in profile icon drop down menu in landing screen
    And   enter username in username field in registration page
    And   enter email in email field in registration page
    And   enter password in password field in registration page
    And   select the gender "<gender>" from gender drop down list in registration page
    And   click on register button in registration page
    Then  home page appeared successfully
    Examples:
      | gender |
      |male    |

Feature: Login to CIB mobile banking app
  Scenario Outline: Login with valid user
    Given unicorn website opened successfully
    When  click on profile icon in landing screen
    And   click on register option in profile icon drop down menu in landing screen
    And   enter username "<username>" in username field in registration page
    And   enter email "<email>" in email field in registration page
    And   enter password "<password>" in password field in registration page
    And   select the gender "<gender>" from gender drop down list in registration page
    And   click on register button in registration page
    Then
    Examples:
      | username | email | password | gender |

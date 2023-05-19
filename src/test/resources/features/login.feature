Feature: Test login functionality

  Scenario: Check login is successful with valid credentials
    Given Rama is on login page
    When he enters email "standard_user"
    And he enters password "secret_sauce"
    And he clicks on the login button
    Then he see "Products" as a title in the home page

  Scenario: Check login is unsuccessful with invalid credentials
    Given Rama is on login page
    When he enters email "standard_user"
    And he enters incorrect password "secret_sauce1"
    And he clicks on the login button
    Then he is shown incorrect message



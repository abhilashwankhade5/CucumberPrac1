Feature: Register Page

  Scenario: Register a user
    When I click on register button to see the register form
    Then I enter first name
    Then I enter last name
    Then I enter user name
    Then I enter password
    Then I enter confirm password
    Then I select gender
    When I click on Register button to save details
    Then I should navigate to login page
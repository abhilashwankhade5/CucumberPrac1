Feature: Login Page

  Scenario: Validate registered user is able login or not
    When I enter userName and Password and click on Login button
    Then I should able to login successfully
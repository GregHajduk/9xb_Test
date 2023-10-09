@regression
@SignInPage
Feature: My Store - Sign In

  Scenario Outline: Unsuccessful sign in check from the Main Menu
    Given the user accesses the myStore main page
    When the user clicks on main menu sign in button
    And enters email <email>
    And enters password <password>
    And clicks on the sign in button
    Then user should be presented with the unsuccessful login message "<validationMessage>"
    Examples:
      | email          | password | validationMessage      |
      | john@gmail.com | john123  | Authentication failed. |

  Scenario Outline: Successful sign in and sign out check from the Main Menu
    Given the user accesses the myStore main page
    When the user clicks on main menu sign in button
    And enters email <email>
    And enters password <password>
    And clicks on the sign in button
    Then user should be presented with page with a title "Your account"
    And clicks on the sign out button
    Then user should be presented with page with a title "Log in to your account"
    Examples:
      | email         | password |
      | bob@gmail.com | bob123   |
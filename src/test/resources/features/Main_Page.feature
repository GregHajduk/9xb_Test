@regression
@MainPage
Feature: My Store - Main Page

  Scenario: Subscription not enabled when "Accept Terms" checkbox not checked
    Given the user accesses the myStore main page
    When the user enters his email for the fist time into the subscribe filed
    And click on the subscribe button
    Then the subscribe button should be disabled


  Scenario: Successful subscription, Subscription reattempted when already subscribed
    Given the user accesses the myStore main page
    When the user enters his email for the fist time into the subscribe filed
    And accepts the T&C by checking the checkbox
    And click on the subscribe button
    Then the user should be presented with a message "You have successfully subscribed to this newsletter."
    When the user enters already registered email into the subscribe filed
    And accepts the T&C by checking the checkbox
    And click on the subscribe button
    Then the user should be presented with a message "This email address is already registered."



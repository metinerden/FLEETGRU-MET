Feature: Functionality widgets

  @FLEET-427
  Scenario: Widgets functionality test

    When the user logged in as "truck driver"
    And the user navigates to Fleet Vehicles page
    And the user clicks on plus sign
    Given the user should be able to click add button for Recent emails
    And the user should be able to click add button for Sticky Note
    And the user should be able to click add button for Task list
    And the user should be able to click on Close Button
    And the user should be able to click on favorite Button
    And the user should be able to click on pin Button
    Then verify Recent emails button enabled
    And verify Added sticky button enabled
    And verify Added task list button enabled
    And verify favorite button note displayed
    And verify pin button note displayed



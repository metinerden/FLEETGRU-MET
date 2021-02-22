Feature: Functionality types

  @FLEET-355
  Scenario Outline: User should see any car's general information
    Given the user logged in as "store manager"
    When the user navigates to Fleet Vehicles page
    Then the user gets any "<car>" information
    And  the hompage contains "<title>"
    Examples:
      | car   | title     |
      | car6  | Cybertek  |
      | car4  | madDriver |
      | car19 | SDET      |



  @FLEET-356
  Scenario: Filtering functionality test
    Given the user logged in as "store manager"
    When the user navigates to Fleet Vehicles page
    When the user gets  car1 information
    And the user filters by using Activity Type
    And the user filters by using Date Range
    And the user refreshies by using Refresh button
    Then the user reach older page bt using Older button
    And the user reach newer page bt using Newer button



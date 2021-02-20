Feature: Functionality types

  @FLEET-355
  Scenario Outline: User should see any car's general information
    Given the user logged in as "store manager"
    When the user navigates to Fleet Vehicles page
    Then the user gets any "<car>" information
    And  the hompage contains "<subtitle>"
    Examples:
      | car    | subtitle                                          |
      | carR1  | 2 FAST Stig 1961 senior                           |
      | carR4  | VA12345 madDriver Virginia 2021 Black convertible |
      | carR6  | Cybertek Sparta Alaska 2019 Black                 |
      | carR19 | SDET 2021                                         |


  @FLEET-356
  Scenario: Filtering functionality test
    Given the user logged in as "Store manager"
    When the user navigates to Fleet Vehicles page
    When user sees all informations about specific car
    And the user filters by using Activity Type
    And the user filters by using Date Range
    And the user refreshies by using Refresh button
    Then the user reach older page bt using Older button
    And the user reach newer page bt using Newer button
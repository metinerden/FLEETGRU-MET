
Feature: Users should be able to login

@FLEET-360
Scenario: login as a Storemanager/Salesmanager
  Given the user logged in as "store manager"
  And  the title contains "Dashboard"
  When the user navigates to "Fleet" "Vehicles" page
  And the title contains "Car"
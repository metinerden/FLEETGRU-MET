Feature: Functionality types

	Background:
	Given the user logged in as "<userType>"
	When the user navigates to Fleet Vehicles page

	@FLEET-355
	Scenario: User should see any car's general information
		Then the user gets any car information

	@FLEET-356
	Scenario: Filtering functionality test
		When user sees all informations about specific car
		And the user filters by using Activity Type
		And the user filters by using Date Range
		And the user refreshies by using Refresh button 
		Then the user reach older page bt using Older button
		And the user reach newer page bt using Newer button
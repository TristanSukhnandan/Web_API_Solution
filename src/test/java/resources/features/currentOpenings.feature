Feature: Open ilabquality.com/careers  website

Scenario: Select first available opening
	Given I access the current openings page
	 When I click on the the first available job hyperlink
	 Then I should see the ilab job details page
	 
	 

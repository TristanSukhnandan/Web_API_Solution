Feature: Open ilabquality.com/careers  website

Scenario Outline: Apply online to the first available opening
	Given I am on the ilab job details page
	 When I click on the apply online button
	  And I enter a "<name>"
	  And I enter a "<email>" address
	  And I enter a "<phone>" number
	  And I enter click send buttton
	 Then I should be presented with the validation alert "<message>"
	 
	 
Examples: 
	 |		name						|		email					|		message							|
	 |	  user1						|		pass1					|		validation failed		|		
	 |		webdriver123		|		webdriver123	|		validation succeded	|
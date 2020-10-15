Feature: Open ilabquality.com/careers  website

Scenario Outline: Select iLab careers hyperlink
	Given I access iLabURL
	 When I click on the Career hyperlink
	 Then I should see the ilab career page
	 When I click on the South Africa hyperlink
	 Then I should see the ilab careers South Africa page
	 When I click on the the first available job hyperlink
	 Then I should see the ilab job details page
	 When I click on the apply online button
	  And I enter a "<name>"
	  And I enter a "<email>" address
	  And I enter a "<phone>" number
	  And I enter click send buttton
	 Then I should be presented with the validation alert message
	 

	 Examples: 
	 |		name						|		email					|
	 |	  user1						|		pass1					|	
	 
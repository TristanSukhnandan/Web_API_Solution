Feature: Open ilabquality.com/careers  website

Scenario Outline: Select iLab careers hyperlink
	Given I access "<iLabURL>"
	 When I click on the "<Career>" hyperlink
	 Then I should see the ilab career page
	 

Examples: 
	 |							iLabURL										|								Career														|
	 |	http://www.webdriveruniversity.com/   |			http://www.webdriveruniversity.com/					|

	 
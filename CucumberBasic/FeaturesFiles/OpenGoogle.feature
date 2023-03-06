@SimpleLogin 
Feature: This is to test google search 

@Positive
Scenario: Google search scenario valid
	Given user is entering google.com 
	When user is typing the search term "Milaasi" 
	And Enter the return key 
	Then user should see the result 

@Negative	
Scenario: Google search scenario invalid
	Given user is entering google.com 
	When user is typing the search term "Milaasi" 
	And Enter the return key 
	Then user should see the result 
	
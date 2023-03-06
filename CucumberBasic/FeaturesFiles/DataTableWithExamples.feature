Feature: Login OrangeHRM using Datatable with Examples 
Scenario Outline: scenario description 

	Given Open New URL Page 
	When Enter the values "<Username>" and "<Password>" given below 
	Then Submit button is clicked 
	
	Examples: 
		|Username | Password|
		|Admin    | admin123|
		|Admin1    | admin23|
		
		
		# for Examples keyword we have to use scenario outline coz it willrun mutliple times given when and then if there is multiple data
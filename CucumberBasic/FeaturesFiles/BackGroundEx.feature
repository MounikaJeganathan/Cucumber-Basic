@Background 
Feature: Usage of BackGround 
# one feature file should contain only one background
Background: Students completed the high school
    Given Students finished the high school
    And Student finidhed the higher secondary
    
    
Scenario: Study medicine scenario 
	Given Student applied for medical course 
	When cleared the entrance exam 
	Then eligible to join medical collage 
	
Scenario: Study Engineering scenario 
	Given Student applied for engineer 
	When should have good cutoff 
	Then eligible to join engineering collage
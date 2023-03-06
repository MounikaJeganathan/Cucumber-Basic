Feature: This is login into orangeHrmlive.com
Scenario: Open and Login 
    Given Enter the Orangehrmlive URL Page
    When Enter the Login Details with user name "Admin" and password "admin123"
    When Click login button
    Then Verify page is loaded successfully
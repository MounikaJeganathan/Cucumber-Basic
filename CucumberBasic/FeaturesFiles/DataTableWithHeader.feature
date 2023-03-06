Feature: Open OrangeHRM live with Datatable with header
Scenario: Login scenario with datatable header
    Given Open Login Page 
    When Enter the below table values in the login page
    |Username | Password|
    |Admin    | admin123|
    Then Click on Login Button

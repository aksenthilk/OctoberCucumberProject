Feature: Free CRM User Login 

Scenario: Login with valid user credentials

Given User is on the Free CRM HP
When User submits valid user name and password
Then User navigates to Dashboard page
And Closes the HP
Feature: Free CRM Login

Background:
Given User is on the Free CRM HP


Scenario: Features page validation

When User clicks on Features link
Then User navigates to Features page
Then User clicks on the Free CRM Logo
Then User lands on the HP
And Closes the HP


Scenario: Sign Up page validations

When User clicks on Pricing link
Then User navigates to Pricing page
Then User clicks HomePage link
Then User lands on the HP
And Closes the HP



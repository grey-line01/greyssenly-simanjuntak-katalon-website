@Login

Feature: User Login

As a registered user

I want to be able to log in to my account

So that I can access Advantage Online Shopping

@Valid 

Scenario: Login with valid username and valid password

Given I am on the login page

When I enter my valid username "langit" and password "Langit123"

And I click the "Log In" button

Then I should be able to login successfully

#Examples:
| username | password  |
| langit   | Langit123 |

@Invalid

Scenario: Login with invalid username and password

Given I am on the login page

When I enter my invalid username "biru" and password "langit1"

And I click the "Log In" button

Then I should see an error message "Incorrect username or password"

And I should remain on the login page

#Examples:
| username | password |
| biru     | langit1  |

@Empty

Scenario: Empty Fields

Given I am on the login page

When I leave the username and password fields empty

And I click the "Log In" button

Then I should see an error message "Username field is required"

And I should an error message "Password field is required"

And I should remain on the login page

#Examples:
| username | password |
|          |          |
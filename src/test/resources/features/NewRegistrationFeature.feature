Feature: Test Feature

Scenario Outline: User login with valid data
Given The user launches the login page.
And The user enters "<userID>" and "<password>".
When user clicks the login button.
Then User gets into the home page.
Examples:
| userID | password |
|    aaa |   pwd123 |

Scenario Outline: User login with in valid data
Given The user launches the login page.
And The user enters "<userID>" and "<password>".
When user clicks the login button.
Then User do not get into the home page.
Examples:
| userID | password |
|    aac |   pws123 |
|    bba |   qwe123 |
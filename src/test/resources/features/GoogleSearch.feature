Feature: Google Search

Scenario Outline: User doing a google search.
Given The user launches google page.
When The user enters "<searchData>".
And user clicks the go button.
Then User gets into the result page.
Examples:
| searchData |
| Selenium java |
| Docker Images |
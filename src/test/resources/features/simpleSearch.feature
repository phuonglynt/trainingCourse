@SearchGG
Feature: Search on Google

  Scenario: Search for a keyword
    Given I am on the Google homepage
    When I search keyword "ABC"
    Then I should see a number of results
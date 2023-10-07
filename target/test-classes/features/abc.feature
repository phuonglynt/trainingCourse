@Searchabc
Feature: Search on Google

  Scenario: Search for a keyword
    Given I am on the Google homepage
    When I search keyword "DEF"
    Then I should see a number of results
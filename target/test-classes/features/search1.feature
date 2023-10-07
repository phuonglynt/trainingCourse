@SearchGG1
Feature: Search on Google 1

  Scenario: Search for a keyword 1
    Given I am on the Google homepage
    When I search keyword "DEF"
    Then I should see a number of results
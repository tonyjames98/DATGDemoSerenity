@news
Feature: News
  As a user
  I want to be able to browse the latest news
  So that I can stay up-to-date on current topics

  Scenario: Read the latest news
    Given I am on the KQED website
    When I go to the News section
    And I select the latest news item
    Then I see an article published this month

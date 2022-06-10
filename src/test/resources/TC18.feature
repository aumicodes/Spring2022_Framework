Feature: TC-18

  Scenario: Verify user can update number of guests on Home page
    Given I am on hotels landing page
    And I click on Travelers
    And I select 6 adults
    And I select 2 children
    And I select first child's age is 4
    And I select second child's age is under 1
    Then I click done and verify total number of guests is sum of adults and children.



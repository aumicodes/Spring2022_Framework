Feature: TC-25

  Scenario: Verify user can submit feedback after completing the feedback form
    Given I launch Hotels website
    And I click on feedback link
    And I click on one star
    And I enter something in comments field
    And I select Highly unlikely as answer in dropdown question
    And I select No as answer in prior booking question
    And I select No as answer in accomplishment question
    And I enter QAengineer@gmail.com in email input field
    And I click on feedback submit button
    Then I verify form is submitted

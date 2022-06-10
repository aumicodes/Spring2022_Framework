Feature: TC-19

  Scenario: Verify Share feedback button is displayed at the end of search results
    Given I am on hotels landing page
    And I Enter 'bora' in destination
    And Select 'Bora Bora, Leeward Islands, French Polynesia' from auto suggestion
    And Select August 1, 2022 as Check-in
    And Select August 10, 2022 as Check-out
    And I click apply
    Then I Click on “Search” button and verify at the end of search results: Text: Tell us how we can improve our site is displayed
    Then I verify Button Share feedback is displayed and enabled

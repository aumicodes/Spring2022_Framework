Feature: TC-21

  Scenario: Verify Verification message for invalid sign in credentials
    Given I am on hotels landing page
    And I click on Sign-in Link
    And I enter invalid email address
    And I enter invalid password
    And I click on Sign-in button
    Then I verify that the verification message is displayed
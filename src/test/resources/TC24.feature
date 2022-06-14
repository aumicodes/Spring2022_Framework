Feature: TC-24

  Scenario: Verify error is displayed when user submits the empty feedback form
    Given I am on hotels landing page
    And I Select “Website feedback” from Help dropdown
    And I Click on Submit button
    Then I verify error message is displayed
    Then I verify star boxes section is in a red dotted box.




Feature: TC-20

  Scenario: Verify TermsAndConditions link and PrivacyStatements link open correct page on new tab
    Given I am on hotels landing page
    And I click Sign-in link
    And I Click Sign up link
    And I Click 'Terms and Conditions' link
    Then I verify 'Terms and Conditions' page opens in new tab
    And I Click 'Privacy Statement' link
    Then I verify 'Privacy Statement' page opens in new tab


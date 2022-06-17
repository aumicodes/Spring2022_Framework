Feature: TC-22

  Scenario: Hotels: Verify error message for invalid data in SignUp form
    Given I launch Hotels website
    When I click Sign in link
    And I click Sign up link
    And I enter my email address
    And I enter my first name
    And I enter my last name
    And I enter invalid password
    Then I verify email error is displayed
    Then I verify first name error is displayed
    Then I verify last name error is displayed
    Then I verify keep me signed in checkbox is displayed
    Then I verify 'keep me signed in' checkbox is enabled
    Then I verify 'continue' button is displayed
    Then I verify 'keep me signed in' checkbox is enabled
    Then I verify 'continue' button is not enabled

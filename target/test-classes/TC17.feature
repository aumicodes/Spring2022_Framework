Feature: TC-17

  Scenario: Verify past date and back button on Current month's calendar is disabled
  Given I am on hotels landing page
  And I click on Check-in Calendar
  And I go to current month
  Then I verify past dates are disabled
  Then I verify Back button on current month is disabled
  And I click on Check-out Calendar
  Then I verify past dates are disabled
  Then I verify Back button on current month is disabled


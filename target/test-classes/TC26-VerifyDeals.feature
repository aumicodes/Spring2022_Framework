Feature: TC-26

Scenario: Verify links on Deals page
Given I launch Hotels/deals page
Then I verify 'manage your booking anytime, anywhere' is displayed and enabled
Then I verify 'stay flexible with free cancellation' is displayed and enabled
Then I verify 'save on your next trip to the great outdoors' is displayed and enabled
And I click on 'manage your booking anytime, anywhere'
Then I verify 'search, book and save on the go!' is displayed
And I click on 'stay flexible with free cancellation'
Then I verify 'amazing deals with free cancellation' OR 'stay flexible with free cancellation' is displayed and enabled
When I go back
And I click on 'save on your next trip to the great outdoors'
Then I verify 'save on your next trip to the great outdoors' is displayed
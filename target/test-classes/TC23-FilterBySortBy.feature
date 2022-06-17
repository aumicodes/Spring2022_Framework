Feature: Sort and Filter

  Scenario: Verify filter-by and sort-by functionality works as expected
    Given I launch Hotels website
    When Enter Man in destination box
    And I select Manhattan NY from auto suggestion
    And I select 10-15 August 2022 in Dates Box
    And I click on 1 star from star-rating filter
    And I select Price from sort-by dropdown
    Then I verify all hotels in search results are *-rated as selected in above step
    Then I verify all hotels are listed in increasing order price
Feature: Check Box Selection

  Scenario: Select the Home checkbox
    Given I am on the Check Box page
    When I expand all checkboxes
    And I select the "Home" checkbox
    Then I should see the result text contains "home"

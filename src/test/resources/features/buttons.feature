Feature: Button Clicks

  Scenario: Double Click action
    Given I am on the Buttons page
    When I double click the button
    Then I should see the double click confirmation

  Scenario: Right Click action
    Given I am on the Buttons page
    When I right click the button
    Then I should see the right click confirmation

  Scenario: Dynamic Click action
    Given I am on the Buttons page
    When I single click the button
    Then I should see the dynamic click confirmation

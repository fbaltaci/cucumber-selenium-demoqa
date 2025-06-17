Feature: Radio Button Selection

  Scenario: Select the Yes radio button
    Given I am on the Radio Button page
    When I select the "Yes" radio button
    Then I should see the message "Yes"

  Scenario: Select the Impressive radio button
    Given I am on the Radio Button page
    When I select the "Impressive" radio button
    Then I should see the message "Impressive"

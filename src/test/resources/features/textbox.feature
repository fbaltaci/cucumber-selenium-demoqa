Feature: Text Box Form

  Scenario: Fill and submit the text box form
    Given I navigate to the Text Box page
    When I fill the form with name "Fehmi Tester", email "fehmi@test.com", address "123 Main St", and permanent address "456 Elm St"
    And I submit the form on text box page
    Then I should see the name "Fehmi Tester" and email "fehmi@test.com" in the output


  Scenario: Fill in the text box form and verify submission
    Given I navigate to the Text Box page
    When I enter "Fehmi Baltaci" as full name
    And I enter "fehmi@example.com" as email
    And I enter "Boston" as current address
    And I enter "USA" as permanent address
    And I submit the form on text box page
    Then the output should show the name "Fehmi Baltaci"
    And the output should show the email "fehmi@example.com"

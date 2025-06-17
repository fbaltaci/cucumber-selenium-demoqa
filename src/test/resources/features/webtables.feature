Feature: Web Tables Interaction

  Scenario: Add a new user to the web table
    Given I am on the Web Tables page
    When I click on the Add button
    And I fill in the registration form with first name "John", last name "Doe", email "john.doe@example.com", age "30", salary "5000", and department "QA"
    And I submit the form on web tables page
    Then I should see "John" in the table

  Scenario: Accept a simple alert
    Given I am on the Alerts page
    When I click the alert button
    Then I should see a browser alert and accept it
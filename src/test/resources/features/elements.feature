Feature: Elements Page

  #  Text Box Feature

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

  #  Check Box Feature

  Scenario: Select the Home checkbox
    Given I am on the Check Box page
    When I expand all checkboxes
    And I select the "Home" checkbox
    Then I should see the result text contains "home"

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

  Scenario: Select the Yes radio button
    Given I am on the Radio Button page
    When I select the "Yes" radio button
    Then I should see the message "Yes"

  Scenario: Select the Impressive radio button
    Given I am on the Radio Button page
    When I select the "Impressive" radio button
    Then I should see the message "Impressive"

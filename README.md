# Cucumber Selenium DemoQA Framework

This project is a UI test automation framework using Selenium WebDriver, Cucumber (BDD), and TestNG, built to test the
DemoQA (https://demoqa.com) website functionality. It follows the Page Object Model design pattern and integrates
WebDriverManager, logging, and HTML reporting.

## Tech Stack

- Java 17
- Selenium WebDriver 4.20.0
- Cucumber 7.14.0
- TestNG 7.10.2
- WebDriverManager 5.7.0
- Maven
- Logback + SLF4J
- Cucumber HTML Reporting

## Project Structure

```
cucumber-selenium-demoqa/
│
├── src/
│   ├── main/java/
│   │   └── utils/                # DriverFactory and utilities
│   │
│   └── test/java/
│       ├── stepdefinitions/      # Step definitions
│       ├── runners/              # Cucumber TestNG runner
│       └── pages/                # Page Object Model classes
│
├── src/test/resources/
│   └── features/                 # Gherkin feature files
│
├── pom.xml                       # Maven dependencies
└── README.md                     # Project info
```

How to Run
----------
Prerequisites:
- Java 17+
- Maven installed (use `mvn -v` to verify)

Run Tests via Maven:

```shell

mvn clean test
```

Or run directly from TestRunner.java in IntelliJ.

Example Feature

```gherkin
Feature: Demo QA Test

Scenario: Open Home Page
Given I open the DemoQA home page
```

Driver Management
-----------------
DriverFactory.java handles WebDriver initialization and supports Chrome by default using WebDriverManager.

Reporting
---------
After test execution, a report is generated at:

target/cucumber-report.html

Open it in a browser to view test results in a clean format.

Future Improvements
-------------------
- Add support for multiple browsers (Chrome, Firefox, Edge)
- Add parallel execution support
- Integrate with CI (GitHub Actions, Jenkins, etc.)
- Generate advanced reports with Allure

Author
------
Fehmi Baltaci

GitHub: https://github.com/fehmibaltaci

Portfolio: https://fehmibaltaci.dev

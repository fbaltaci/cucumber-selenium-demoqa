package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.WebTablesPage;
import utils.DriverFactory;

public class WebTablesSteps {

    WebDriver driver = DriverFactory.getDriver();
    WebTablesPage webTablesPage;

    @Given("I am on the Web Tables page")
    public void i_am_on_web_tables_page() {
        driver.get("https://demoqa.com/webtables");
        webTablesPage = new WebTablesPage(driver);
    }

    @When("I click on the Add button")
    public void i_click_on_add_button() {
        webTablesPage.clickAddButton();
    }

    @When("I fill in the registration form with first name {string}, last name {string}, email {string}, age {string}, salary {string}, and department {string}")
    public void i_fill_in_registration_form(String firstName, String lastName, String email, String age, String salary, String department) {
        webTablesPage.fillForm(firstName, lastName, email, age, salary, department);
    }

    @When("I submit the form on web tables page")
    public void i_submit_the_form() {
        webTablesPage.clickSubmit();
    }

    @Then("I should see {string} in the table")
    public void i_should_see_user_in_table(String firstName) {
        Assert.assertTrue(webTablesPage.isUserInTable(firstName));
    }
}

package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CheckBoxPage;

public class CheckBoxSteps {

    WebDriver driver = utils.DriverFactory.getDriver();
    CheckBoxPage checkBoxPage;

    @Given("I am on the Check Box page")
    public void i_am_on_checkbox_page() {
        driver.get("https://demoqa.com/checkbox");
        checkBoxPage = new CheckBoxPage(driver);
    }

    @When("I expand all checkboxes")
    public void i_expand_all_checkboxes() {
        checkBoxPage.clickExpandAll();
    }

    @And("I select the {string} checkbox")
    public void i_select_checkbox(String label) {
        checkBoxPage.selectCheckbox(label);
    }

    @Then("I should see the result text contains {string}")
    public void i_should_see_result(String expected) {
        Assert.assertTrue(checkBoxPage.getResultText().toLowerCase().contains(expected.toLowerCase()));
    }
}

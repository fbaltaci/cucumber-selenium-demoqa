package stepdefinitions;

import pages.TextBoxPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.DriverFactory;


public class TextBoxSteps {

    WebDriver driver = DriverFactory.getDriver();
    TextBoxPage textBoxPage;

    @Given("I navigate to the Text Box page")
    public void i_navigate_to_text_box_page() {
        driver.get("https://demoqa.com/text-box");
        textBoxPage = new TextBoxPage(driver);
    }

    @When("I enter {string} as full name")
    public void i_enter_full_name(String name) {
        textBoxPage.enterFullName(name);
    }

    @When("I enter {string} as email")
    public void i_enter_email(String email) {
        textBoxPage.enterEmail(email);
    }

    @When("I enter {string} as current address")
    public void i_enter_current_address(String addr) {
        textBoxPage.enterCurrentAddress(addr);
    }

    @When("I enter {string} as permanent address")
    public void i_enter_permanent_address(String addr) {
        textBoxPage.enterPermanentAddress(addr);
    }

    @When("I submit the form on text box page")
    public void i_submit_the_form() {
        textBoxPage.clickSubmit();
    }

    @Then("the output should show the name {string}")
    public void output_should_show_name(String expectedName) {
        Assert.assertTrue(textBoxPage.getOutputName().contains(expectedName));
    }

    @Then("the output should show the email {string}")
    public void output_should_show_email(String expectedEmail) {
        Assert.assertTrue(textBoxPage.getOutputEmail().contains(expectedEmail));
    }

    @When("I fill the form with name {string}, email {string}, address {string}, and permanent address {string}")
    public void i_fill_the_form_with_name_email_address_and_permanent_address(String string, String string2, String string3, String string4) {
        textBoxPage.enterFullName(string);
        textBoxPage.enterEmail(string2);
        textBoxPage.enterCurrentAddress(string3);
        textBoxPage.enterPermanentAddress(string4);
    }
    @Then("I should see the name {string} and email {string} in the output")
    public void i_should_see_the_name_and_email_in_the_output(String string, String string2) {
        Assert.assertTrue(textBoxPage.getOutputName().contains(string));
        Assert.assertTrue(textBoxPage.getOutputEmail().contains(string2));
    }
}

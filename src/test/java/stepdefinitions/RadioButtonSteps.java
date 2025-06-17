package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.RadioButtonPage;
import utils.DriverFactory;

public class RadioButtonSteps {

    WebDriver driver = DriverFactory.getDriver();
    RadioButtonPage radioButtonPage;

    @Given("I am on the Radio Button page")
    public void i_am_on_radio_button_page() {
        driver.get("https://demoqa.com/radio-button");
        radioButtonPage = new RadioButtonPage(driver);
    }

    @When("I select the {string} radio button")
    public void i_select_radio_button(String option) {
        radioButtonPage.selectRadio(option);
    }

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String expected) {
        String actual = radioButtonPage.getResultText();
        Assert.assertEquals(actual.trim(), expected);
    }
}

package stepdefinitions;

import pages.ButtonsPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ButtonsSteps {

    WebDriver driver = utils.DriverFactory.getDriver();
    ButtonsPage buttonsPage;

    @Given("I am on the Buttons page")
    public void i_am_on_the_buttons_page() {
        driver.get("https://demoqa.com/buttons");
        buttonsPage = new ButtonsPage(driver);
    }

    @When("I double click the button")
    public void i_double_click_the_button() {
        buttonsPage.doubleClickButton();
    }

    @When("I right click the button")
    public void i_right_click_the_button() {
        buttonsPage.rightClickButton();
    }

    @When("I single click the button")
    public void i_single_click_the_button() {
        buttonsPage.dynamicClickButton();
    }

    @Then("I should see the double click confirmation")
    public void i_should_see_the_double_click_confirmation() {
        Assert.assertTrue(buttonsPage.getDoubleClickMessage().contains("You have done a double click"));
    }

    @Then("I should see the right click confirmation")
    public void i_should_see_the_right_click_confirmation() {
        Assert.assertTrue(buttonsPage.getRightClickMessage().contains("You have done a right click"));
    }

    @Then("I should see the dynamic click confirmation")
    public void i_should_see_the_dynamic_click_confirmation() {
        Assert.assertTrue(buttonsPage.getDynamicClickMessage().contains("You have done a dynamic click"));
    }
}

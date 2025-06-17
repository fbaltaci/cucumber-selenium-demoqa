package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import pages.AlertsPage;
import utils.DriverFactory;


public class AlertsSteps {

    WebDriver driver = DriverFactory.getDriver();
    AlertsPage alertsPage;

    @Given("I am on the Alerts page")
    public void i_am_on_alerts_page() {
        driver.get("https://demoqa.com/alerts");
        alertsPage = new AlertsPage(driver);
    }

    @When("I click the alert button")
    public void i_click_the_alert_button() {
        alertsPage.clickAlertButton();
    }

    @Then("I should see a browser alert and accept it")
    public void i_should_see_and_accept_alert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}

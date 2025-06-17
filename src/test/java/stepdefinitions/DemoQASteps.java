package stepdefinitions;

import io.cucumber.java.en.Given;
import utils.DriverFactory;

public class DemoQASteps {

    @Given("I open the DemoQA home page")
    public void i_open_the_demoqa_home_page() {
        DriverFactory.getDriver().get("https://demoqa.com");
    }
}

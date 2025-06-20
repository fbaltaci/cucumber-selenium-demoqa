package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.initDriver("chrome");
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}

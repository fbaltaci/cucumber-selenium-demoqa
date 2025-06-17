package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private final WebDriver driver;
    private final By alertButton = By.id("alertButton");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlertButton() {
        driver.findElement(alertButton).click();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage {
    private final WebDriver driver;
    private final Actions actions;

    private final By doubleClickBtn = By.id("doubleClickBtn");
    private final By rightClickBtn = By.id("rightClickBtn");
    private final By dynamicClickBtn = By.xpath("//button[text()='Click Me']");

    private final By doubleClickMessage = By.id("doubleClickMessage");
    private final By rightClickMessage = By.id("rightClickMessage");
    private final By dynamicClickMessage = By.id("dynamicClickMessage");

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void doubleClickButton() {
        WebElement btn = driver.findElement(doubleClickBtn);
        actions.doubleClick(btn).perform();
    }

    public void rightClickButton() {
        WebElement btn = driver.findElement(rightClickBtn);
        actions.contextClick(btn).perform();
    }

    public void dynamicClickButton() {
        driver.findElement(dynamicClickBtn).click();
    }

    public String getDoubleClickMessage() {
        return driver.findElement(doubleClickMessage).getText();
    }

    public String getRightClickMessage() {
        return driver.findElement(rightClickMessage).getText();
    }

    public String getDynamicClickMessage() {
        return driver.findElement(dynamicClickMessage).getText();
    }
}

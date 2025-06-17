package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {

    private final WebDriver driver;

    private final By expandAllBtn = By.cssSelector("button[title='Expand all']");
    private final By resultText = By.id("result");

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickExpandAll() {
        driver.findElement(expandAllBtn).click();
    }

    public void selectCheckbox(String label) {
        WebElement checkbox = driver.findElement(By.xpath("//span[@class='rct-title' and text()='" + label + "']"));
        checkbox.click();
    }

    public String getResultText() {
        return driver.findElement(resultText).getText();
    }
}

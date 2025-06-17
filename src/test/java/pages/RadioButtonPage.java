package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {

    private final WebDriver driver;

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectRadio(String label) {
        WebElement radio = driver.findElement(By.xpath("//label[text()='" + label + "']"));
        radio.click();
    }

    public String getResultText() {
        return driver.findElement(By.className("text-success")).getText();
    }
}

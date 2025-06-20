package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage {
    private final WebDriver driver;

    private final By fullName = By.xpath("//*[@id='userName']");
    private final By email = By.xpath("//*[@id='userEmail']");
    private final By currentAddress = By.xpath("//*[@id='currentAddress']");
    private final By permanentAddress = By.xpath("//*[@id='permanentAddress']");
    private final By submitBtn = By.xpath("//*[@id='submit']");

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFullName(String name) {
        driver.findElement(fullName).sendKeys(name);
    }

    public void enterEmail(String mail) {
        driver.findElement(email).sendKeys(mail);
    }

    public void enterCurrentAddress(String addr) {
        driver.findElement(currentAddress).sendKeys(addr);
    }

    public void enterPermanentAddress(String addr) {
        driver.findElement(permanentAddress).sendKeys(addr);
    }

    public void clickSubmit() {
        driver.findElement(submitBtn).click();
    }

    public String getOutputName() {
        return driver.findElement(By.id("name")).getText();
    }

    public String getOutputEmail() {
        return driver.findElement(By.id("email")).getText();
    }
}

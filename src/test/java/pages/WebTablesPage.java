package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablesPage {

    private final WebDriver driver;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By addButton = By.id("addNewRecordButton");
    private final By firstNameInput = By.id("firstName");
    private final By lastNameInput = By.id("lastName");
    private final By emailInput = By.id("userEmail");
    private final By ageInput = By.id("age");
    private final By salaryInput = By.id("salary");
    private final By departmentInput = By.id("department");
    private final By submitButton = By.id("submit");

    public void clickAddButton() {
        driver.findElement(addButton).click();
    }

    public void fillForm(String firstName, String lastName, String email, String age, String salary, String department) {
        driver.findElement(firstNameInput).sendKeys(firstName);
        driver.findElement(lastNameInput).sendKeys(lastName);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(ageInput).sendKeys(age);
        driver.findElement(salaryInput).sendKeys(salary);
        driver.findElement(departmentInput).sendKeys(department);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public boolean isUserInTable(String firstName) {
        return driver.getPageSource().contains(firstName);
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class New {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        // Initialize the WebDriver and WebDriverWait
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time
    }

    @AfterMethod
    public void teardown() {
        // Close the browser after each test
        if (driver != null) {
            driver.quit();
        }
    }

    @Test (priority = 0)
    public void testValidLogin() {
        // Navigate to the login page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Enter valid credentials
        enterCredentials("student", "Password123");

        // Click submit button
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        submitButton.click();

        // Verify success message
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong")));
        String successText = successMessage.getText();
    //    Assert.assertEquals(successText, "Logged In Successfully", "Success message is incorrect!");

        // Click logout button
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")));
        logoutButton.click();
    }

    @Test
    public void testInvalidUsernameLogin() {
        // Navigate to the login page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Enter invalid username
        enterCredentials("sttudent", "Password123");

        // Click submit button
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        submitButton.click();

        // Verify error message
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));
        String errorText = errorMessage.getText();
        Assert.assertEquals(errorText, "Your username is invalid!", "Error message is incorrect!");
        System.out.println();
    }

    @Test
    public void testInvalidPasswordLogin() {
        // Navigate to the login page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Enter invalid password
        enterCredentials("student", "Password1234");

        // Click submit button
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        submitButton.click();

        // Verify error message
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));
        String errorText = errorMessage.getText();
        Assert.assertEquals(errorText, "Your password is invalid!", "Error message is incorrect!");
        System.out.println(errorText);
    }

    /**
     * Enter username and password in the login form.
     */
    private void enterCredentials(String username, String password) {
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }
}

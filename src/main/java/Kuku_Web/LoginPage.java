package Kuku_Web;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Baseclass {
    @FindBy(xpath = "//button[contains(@class, 'flex items-center') and text()='Login / Signup']")
    private WebElement loginicon;
    @FindBy(css = "input[placeholder='Enter phone number']")
    private WebElement phoneInput;
    @FindBy(css = "input[placeholder*='Enter OTP']")
    private WebElement passwordInput;
    @FindBy(xpath = "//p[normalize-space()='Continue']")
    private WebElement continuebutton;

    public LoginPage(WebDriver driver) {

        super(driver);
    }

    public void login (String phone, String password )  {
        click(loginicon);
        enterText(phoneInput,phone);
        click(continuebutton);
        enterText(passwordInput,password);
        click(continuebutton);


    }

   }
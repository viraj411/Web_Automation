package Kuku_Web;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTests {
        WebDriver driver;
        LoginPage loginPage;
      //  UserDetailsPage userDetailsPage;

        @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            driver.get("https://kukufm.com/");
            loginPage = new LoginPage(driver);
           // userDetailsPage = new UserDetailsPage(driver);
        }

        @Test
        public void verifyLoginAnd() {
            loginPage.login("4444636789", "9999");
         //   Assert.assertEquals(userDetailsPage.getPhoneDetail(), "1234567890", "Phone number does not match.");
         //   Assert.assertTrue(userDetailsPage.getUserType().contains("Premium"), "User is not a premium user.");
        }

 @Test
 public void verify_userdetails(){
            loginPage.login("4444629617","9999");
 }


        @AfterMethod
        public void teardown() {
     //       driver.quit();
        }
    }

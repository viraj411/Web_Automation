import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SearchFeature {

    WebDriver driver;


    SoftAssert sa = new SoftAssert();

    @BeforeClass
    public void setupclass() {
        System.out.println("Inisialise the WebDriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications"); // Disable notifications
        options.addArguments("--disable-popup-blocking"); // Disable popup blocking
        options.addArguments("--disable-extensions"); // Disable extensions (optional
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
    }

    @BeforeMethod
    public void setupmethod() {
        driver.get("https://www.flipkart.com/");

    }

    @Test

    public void valid_search() {
        driver.findElement(By.name("q")).sendKeys("laptop", Keys.ENTER);
        String result = driver.findElement(By.className("tUxRFH")).getText();
        //   System.out.println(result);
        boolean Actual_result = result.contains("Processor");
        sa.assertTrue(Actual_result, "Processor");
        // Assert.assertTrue(Actual_result, "success");
        // boolean iscontain = name.contains("v");


    }


    @Test(priority = 2)
    public void invalid_search() {
        driver.findElement(By.name("q")).sendKeys("qqqqqqqqqqqqqqqqqq", Keys.ENTER);
        String result = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[1]")).getText();
        boolean Actual_result = result.contains("Sorry, no results found!");
        Assert.assertTrue(Actual_result, "success");


    }

    @Test(priority = 3)
    public void empty_search() {
        driver.findElement(By.name("q")).sendKeys(" ", Keys.ENTER);

    }

    @AfterMethod
    public void clear_field() {
        driver.findElement(By.name("q")).clear();
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.close();
        }
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTestNG {
    WebDriver  driver;
    @BeforeSuite
    public void setupsuite(){
        System.out.println("Initialise a WebDriver");
        driver = new ChromeDriver();

    }
    @BeforeClass
    public void setupclass(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @BeforeMethod
    public void setupMethod(){
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("password")).clear();

    }
    @Test (dataProvider = "loginData")
    public void testlogin ( String username,String Password,boolean expectedResult) throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        if ("student".equals(username) && "Password123".equals(Password)) {
            driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
        }
//driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
        //boolean issuccess = driver.getTitle().contains("Practice Test Automation");
       // Assert.assertEquals(expectedResult,issuccess);
        String title = driver.getTitle();
        System.out.println(title);


    }

    @DataProvider
    public Object[][] loginData() {
        return new Object[][]{
                {"student", "Password123", true},
                {"sdsds", "ccccc", false},
                {"dsfdf", "dfdfdf", false}
        };
    }

    @AfterMethod
    public void teardown(){
        System.out.println("Test case Executed");

    }
    @AfterClass
    public void teardownclass (){
        driver.close();
    }



        }



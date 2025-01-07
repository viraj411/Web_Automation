import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
public class SearchFun{

WebDriver driver;


@BeforeClass
public void setupclass() {
    System.out.println("Inisialise the WebDriver");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications"); // Disable notifications
    options.addArguments("--disable-popup-blocking"); // Disable popup blocking
    options.addArguments("--disable-extensions"); // Disable extensions (optional
    options.equals("vvv");
    driver = new ChromeDriver();
    driver.manage().deleteAllCookies();
    driver.get("https://www.flipkart.com/");



}

@BeforeMethod
public void setupmethod() {
    driver.get("https://www.flipkart.com/");

}

@Test(priority = 1)
public void valid_search()  {
    driver.findElement(By.name("q")).sendKeys("Laptop", Keys.ENTER);
    String result = driver.findElement(By.className("tUxRFH")).getText();
    //   System.out.println(result);
    boolean Actual_result = result.contains("Processor");
    Assert.assertTrue(Actual_result, "success");

}

@Test (priority = 2)
public void invalid_search(){
    driver.findElement(By.name("q")).sendKeys("qqqqqqqqqqqqqqqqqq", Keys.ENTER);
    String result = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[1]")).getText();
    boolean Actual_result = result.contains("Sorry, no results found!");
    Assert.assertTrue(Actual_result, "success");


}
@Test
public void empty_search(){
    driver.findElement(By.name("q")).sendKeys(" ", Keys.ENTER);

}

@AfterMethod
public void clear_field(){
    driver.findElement(By.name("q")).clear();
}

@AfterClass
public void teardown(){
    if (driver!=null){
        driver.close();
    }
}
}

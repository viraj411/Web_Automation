import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice1 {
    // static void main(String[] args) {
    //   WebDriver driver = new ChromeDriver();

    @Test
    public void testLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        String current_URL = driver.getCurrentUrl();
        Assert.assertEquals(current_URL, expectedUrl);
        System.out.println("your cuurent URL is " + current_URL);
        driver.quit();
    }

    @Test
    public void test() {
        System.out.println("test passed");
    }
}

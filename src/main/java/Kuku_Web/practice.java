package Kuku_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class practice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://kukufm.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[contains(@class, 'flex items-center') and text()='Login / Signup']")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[placeholder='Enter phone number']")).sendKeys("4444636789");
        Thread.sleep(2000);


        driver.findElement(By.xpath( "//p[normalize-space()='Continue']")).click();
        Thread.sleep(2000);


        driver.findElement(By.cssSelector("input[placeholder*='Enter OTP']")).sendKeys("9999");
        Thread.sleep(2000);


        driver.findElement(By.xpath( "//p[normalize-space()='Continue']")).click();
    }
}

//@FindBy(xpath = "//button[contains(@class, 'flex items-center') and text()='Login / Signup']")
//private WebElement loginicon;
//@FindBy(css = "input[placeholder='Enter phone number']")
//private WebElement phoneInput;
//@FindBy(css = "input[placeholder*='Enter OTP']")
//private WebElement passwordInput;
//@FindBy(xpath = "//p[normalize-space()='Continue']")
//private WebElement continuebutton;

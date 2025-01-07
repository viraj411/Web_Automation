package JavaPrograming;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {


        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();

            driver.get("https://practicetestautomation.com/practice-test-login/");

            driver.manage().window().maximize();
            valid_login(driver);
            invalid_username(driver);
            invalid_password(driver);
            driver.close();

        }

        public static void valid_login(WebDriver driver) {

            driver.findElement(By.id("username")).sendKeys("student");
            driver.findElement(By.id("password")).sendKeys("Password123");
            driver.findElement(By.id("submit")).click();

            String succestext = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong")).getText();
            System.out.println(succestext);
            driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

        }
        public static void invalid_username(WebDriver driver) throws InterruptedException {
            driver.findElement(By.id("username")).sendKeys("sttudent");
            Thread.sleep(2000);
            driver.findElement(By.id("password")).sendKeys("Password123");
            driver.findElement(By.id("submit")).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Scroll down by 500 pixels
            js.executeScript("window.scrollBy(0,200)");

            String invalid_username_text =driver.findElement(By.xpath("//*[@id=\"error\"]")).getText();
            System.out.println(invalid_username_text);


        }
        public static void invalid_password(WebDriver driver) throws InterruptedException {

            driver.findElement(By.id("username")).sendKeys("student");
            Thread.sleep(2000);
            driver.findElement(By.id("password")).sendKeys("Password1234");
            driver.findElement(By.id("submit")).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Scroll down by 500 pixels
            js.executeScript("window.scrollBy(0,200)");

        }}

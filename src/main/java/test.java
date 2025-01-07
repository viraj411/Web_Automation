import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;



public class test {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://kukufm.com/login");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Enter phone number'])[1]")));
        driver.findElement(By.xpath("(//input[@placeholder='Enter phone number'])[1]")).sendKeys("4444624823");

        driver.findElement(By.xpath("(//p[normalize-space()='Continue'])[1]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter OTP']")));
        driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys("9999");

        driver.findElement(By.xpath("(//p[normalize-space()='Continue'])[1]")).click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        while (true) {
            long currentHeight = (long) js.executeScript("return window.pageYOffset + window.innerHeight;");
            long totalHeight = (long) js.executeScript("return document.body.scrollHeight;");

            if (currentHeight >= totalHeight) {
                break;
            }

            // Scroll down by a small amount
            js.executeScript("window.scrollBy(0, 500);");

            try {
                Thread.sleep(1000); //
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(screenshot.toPath(), Paths.get("src/main/Screenshotss.png"), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Screenshot saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Runn");
        }




    }


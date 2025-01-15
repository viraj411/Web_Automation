package SelenuimPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifytheTitle {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https:app.wigzo.com");
      String title= driver.getTitle();
        System.out.println(title);
       Assert.assertEquals(title, "Login at - Wigzo","");


    }
}

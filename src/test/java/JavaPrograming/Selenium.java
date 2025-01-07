package JavaPrograming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Selenium {
//    WebDriver driver; String URL = "https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407";
//
//    @BeforeClass
//    public void setup(){
//
//        driver= new ChromeDriver();
//
//        driver.get(URL);
//    }
//    @BeforeMethod
//    public void clearcookies(){
//        driver.manage().deleteAllCookies();
//
//    }
//    @Test
//    public void submit(){
//
//    }
//}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter browser?GC/FF/IE");
    String browser=sc.next();
    WebDriver driver;

    if(browser.equals("GC"))
    {
       // System.setProperty("webdriver.chrome.driver","D:/NGA/chromedriver.exe");
        driver=new ChromeDriver();
    }

    else if(browser.equals("IE"))
    {
        //System.setProperty("webdriver.ie.driver","D:/NGA/IEDriverServer.exe");
        driver=new InternetExplorerDriver();
    }

    else
    {
        driver=new FirefoxDriver();
    }

    driver.get("https://www.google.co.in");
    System.out.println(driver.getTitle());


        System.out.println("C");



    System.out.println(driver.getCurrentUrl());
   // driver.close();
}
}

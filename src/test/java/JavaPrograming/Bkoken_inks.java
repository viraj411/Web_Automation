package JavaPrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Bkoken_inks{

        public static void main(String[] args) {
            // Set up WebDriver (update the path to your driver)
          //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.flipkart.com/");  // Replace with your URL

            // Get all links (anchor tags) from the webpage
            List<WebElement> links = driver.findElements(By.tagName("a"));

            System.out.println("Total links found: " + links.size());

            for (WebElement link : links) {
                String url = link.getAttribute("href");

                // Check if the URL is valid
                if (url != null && !url.isEmpty()) {
                    checkLink(url);  // Simple check for each link
                } else {
                    System.out.println("Link with no href found: " + link.getText());
                }
            }

            driver.quit();
        }

        private static void checkLink(String linkUrl) {
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(linkUrl).openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();

                int responseCode = connection.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println(linkUrl + " is broken. Response Code: " + responseCode);
                } else {
                    System.out.println(linkUrl + " is valid. Response Code: " + responseCode);
                }
            } catch (Exception e) {
                System.out.println("Error checking link: " + linkUrl);
            }
        }
    }


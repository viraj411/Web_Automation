import JavaPrograming.Main;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;
import java.util.Scanner;

public class TestNg {

    public String URL = "https://practice.expandtesting.com/dropdown";

    @Test
    public void display() {
        String my_name = "viraj";
        Assert.assertEquals(my_name, "viraj");
    }

    @Test
    public void viraj() {

        Assert.assertEquals(5, 5);
        System.out.println("ok");

    }

    @Test
    public void assertt() {

        int a = 11;
        int b = 311;

        Assert.assertTrue(a == b);

    }

    @Test
    void vvvvvvvvvv() {

    }

    @Test
    public void verifyDropdownCount() {
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        WebElement dropdown = driver.findElement(By.id("country"));
        Select select = new Select(dropdown);
        int itemCount = select.getOptions().size();
        System.out.println(itemCount);
        Assert.assertEquals(itemCount, 252, "Dropdown item count mismatch!");
        System.out.println("Assertion passed: Number of items in the dropdown is 252.");
        List<WebElement> options = select.getOptions();
        System.out.println("Dropdown items list");
        for (WebElement option : options) {
            System.out.println(option.getText());

        }

        boolean allItemsClickable = true;
        for (WebElement option : options) {
            // Check if the option is displayed
            boolean isDisplayed = option.isDisplayed();

            // Check if the option is enabled
            boolean isEnabled = option.isEnabled();

            // Print the result for each item
            System.out.println( option.getText() +
                    ", Displayed: " +  isDisplayed +
                    ", Enabled: " + isEnabled);

            // If any item is not clickable, set the flag to false
            if (!isDisplayed || !isEnabled) {
                allItemsClickable = false;
            }
        }


        driver.quit();
    }
}




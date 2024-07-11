package Data_provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class dataaa_providerrr {

    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    }

    @Test(dataProvider = "dp")
    void test(String Username, String Password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Ensure the login page has loaded
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));

            driver.findElement(By.id("input-email")).sendKeys(Username);
            driver.findElement(By.id("input-password")).sendKeys(Password);
            driver.findElement(By.xpath("//input[@type='submit']")).click();

            // Wait for the login confirmation element to be visible
            boolean status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='hidden-xs']"))).isDisplayed();

            if (status) {
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle']")));
                element.click();
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(true);
            } else {
                Assert.fail("Login not successful for user: " + Username);
            }
        } catch (Exception e) {
            // Handle any exceptions
            Assert.fail("Exception occurred for user: " + Username + " - " + e.getMessage());
        } finally {
            // Clear the input fields for the next iteration
            driver.findElement(By.id("input-email")).clear();
            driver.findElement(By.id("input-password")).clear();
        }
    }

    @DataProvider(name = "dp")
    public Object[][] logindata() {
        return new Object[][] {
            {"abc@gmail.com", "test123"},
            {"def@gmail.com", "test45"},
            {"pavanol123@gmail.com", "test@123"}
        };
    }
}

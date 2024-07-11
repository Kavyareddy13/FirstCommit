package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class TestNg_program {
    
    WebDriver driver;
    WebDriverWait wait;
    
    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set implicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize explicit wait
    }
    
    @Test(priority=1)
    void openapp() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Opened URL Successfully");
    }
    
    @Test(priority=2)
    void checklogo() {
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']")));
        boolean status = logo.isDisplayed();
        System.out.println("The status of logo is: " + status);
    }
    
    @Test(priority=3)
    void login() {
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        
        WebElement loginButton = driver.findElement(By.className("oxd-button"));
        loginButton.click();
        
        System.out.println("Entered username & password successfully");
    }
    
    @AfterClass
    void teardown() {
        driver.quit();
    }
}

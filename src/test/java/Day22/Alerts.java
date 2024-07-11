package Day22;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

    public static void main(String[] args) {
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open the desired webpage
        driver.get("https://testautomationpractice.blogspot.com/");

        // Set implicit wait timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Click on the button that triggers the prompt
        WebElement promptButton = driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']"));
        promptButton.click();

        // Switch to the prompt alert
        Alert promptAlert = driver.switchTo().alert();

        // Enter text into the prompt
        promptAlert.sendKeys("Kavya");

        // Accept the prompt (click OK)
        promptAlert.accept();

        // Wait for the result to update (optional)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement demoParagraph = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo")));

        // Get the text of the updated result
        String alertMessage = demoParagraph.getText();
        System.out.println("Result: " + alertMessage);

        // Close the browser
        driver.quit();
    }
}

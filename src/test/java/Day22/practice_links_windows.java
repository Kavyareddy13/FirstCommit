package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class practice_links_windows {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Open the desired webpage
            driver.get("https://testautomationpractice.blogspot.com/");

            // Initialize WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for the search input to be visible and interactable, then enter "selenium"
            WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("Wikipedia1_wikipedia-search-input")));
            searchInput.sendKeys("selenium");

            // Click the search button
            driver.findElement(By.className("wikipedia-search-button")).click();

            // Wait for the search results to be visible
            WebElement resultsDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("wikipedia-search-results")));

            // Wait for the search results to be populated
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector(".wikipedia-search-results a"), 0));

            // Find all the links within the search results
            List<WebElement> links = resultsDiv.findElements(By.tagName("a"));

            // Print the number of links
            System.out.println("Number of links on the page: " + links.size());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

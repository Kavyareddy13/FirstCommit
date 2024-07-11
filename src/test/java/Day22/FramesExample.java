package Day22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open the webpage containing frames
        driver.get("https://ui.vision/demo/webtest/frames/");

        // Find the <frame> element using XPath
        WebElement frameElement = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

        // Switch to the frame using the WebElement
        driver.switchTo().frame(frameElement);

        // Now interact with elements inside the frame
        driver.findElement(By.name("mytext1")).sendKeys("Kavya");

        // Switch back to the default content (main page)
        driver.switchTo().defaultContent();

        // Close the browser
        driver.quit();
    }
}

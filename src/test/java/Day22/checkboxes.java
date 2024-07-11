package Day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        
            // Maximize the browser window
            driver.manage().window().maximize();

            // Open the desired webpage
            driver.get("https://testautomationpractice.blogspot.com/");
            
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
            
            List<WebElement> checkbox = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                    By.xpath("//input[@class='form-check-input' and @type='checkbox']")));
            
            System.out.println(checkbox.size());
            //to click all checkboxes
            
//            for(WebElement checkboxes:checkbox) {
//            	checkboxes.click();
//            }
            
            //to click specific checkboxes
            
            for(int i=4;i<checkbox.size();i++) {
            	checkbox.get(i).click();
            	
            	System.out.println(i);
            	
            }
            
            //unclick checkboxes
            
            for(int i=4;i<checkbox.size();i++) {
            	WebElement checkboxess=checkbox.get(i);
            	if(checkboxess.isSelected()) {
            		checkboxess.click();
            		
            		System.out.println("Checkbox " + i + " unchecked");
            		
            		driver.quit();
            	}
            	
            }
            
            
            
            driver.quit();
	}

}

package Day22;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open the desired webpage
        driver.get("https://testautomationpractice.blogspot.com/");

        // Set implicit wait timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        
        Set<String> windowIds=driver.getWindowHandles();
        
        List<String> windows=new ArrayList<>(windowIds);
        String ParentId=windows.get(0);
        String ChildId=windows.get(1);
        
        driver.switchTo().window(ChildId);
        
        String id=driver.getTitle();
        
        if(id.equals("Just a moment..."))
        	{
        		System.out.println("landed on child window");
        	}
        
        

	}

}

package Day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		

		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.linkText("LinkedIn")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		List<String> allwindows=new ArrayList(windows);
		
		String parent=allwindows.get(0);
		String child=allwindows.get(1);
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}

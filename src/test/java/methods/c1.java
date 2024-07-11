package methods;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class c1 {
	
	@BeforeSuite
	
	void beforesuite() {
		System.out.println("Before Suite Method");
	}
	
	@AfterSuite
	void Aftersuite() {
		System.out.println("After SUite Method");
	}
	
	@BeforeClass
	void BeforeClass() {
		System.out.println("Before Class Method");
	}
	
	@AfterClass
	void AfterClass() {
		System.out.println("After Class Method");
	}
	
	@BeforeTest
	void BeforeTest() {
		System.out.println("Before Test Method");
	}
	@AfterTest
	void AfterTest() {
		System.out.println("After Test Method");
	}
	@BeforeMethod
	void BeforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	void AfterMethod() {
		System.out.println("After Method");
	}
	@Test
	void test1() {
		System.out.println("Test1 Method");
	}
	
	

}

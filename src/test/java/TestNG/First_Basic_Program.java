package TestNG;

import org.testng.annotations.Test;

public class First_Basic_Program {
	
	@Test
	void openapp() {
		System.out.println("opening application");
	}
	@Test(priority=-1)
	void closingapp() {
		System.out.println("closing applicatio");
		
	}
	@Test(priority=2)
	void loggingapp() {
		System.out.println("loging into application");
	}

}

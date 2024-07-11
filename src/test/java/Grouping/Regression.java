package Grouping;

import org.testng.annotations.Test;

public class Regression {
	
	@Test(priority=1, groups="regression")
	void loginsales() {
		System.out.println("login through sales portal");
	}
	
	@Test(priority=2, groups="regression")
	void loginagent() {
		System.out.println("login through agent");
	}
}

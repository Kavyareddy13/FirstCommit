package Grouping;

import org.testng.annotations.Test;

public class login {
	
	@Test(priority=1, groups="sanity")
	void loginemail() {
		System.out.println("User should able to login through email");
	}
	
	@Test(priority=2, groups="sanity")
	void logincred() {
		System.out.println("Login through credential");
	}
	
	@Test(priority=3, groups="sanity")
	void logingoogle() {
		System.out.println("User should able to login through google");
	}
}

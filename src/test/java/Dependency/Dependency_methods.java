package Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_methods {
	
	//openapp
	//login
	//search
	//advsearch
	//logout
	
	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login() {
		Assert.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods= {"login","openapp"})
	void search() {
		Assert.assertTrue(true);
	}
	@Test(priority=4)
	void advsearch() {
		Assert.assertTrue(false);
	}
	@Test(priority=5,dependsOnMethods= {"advsearch"})
	void logout() {
		Assert.assertTrue(true);
	}
}

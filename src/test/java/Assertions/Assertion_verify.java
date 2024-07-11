package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_verify {
	
	@Test
	
	public void assertequality() {
	Assert.assertNotEquals(1234,123);
	
	Assert.assertFalse(false);
	
	System.out.println("It should pass but I tried failed due to your assertion");
	
	
	}
	

}

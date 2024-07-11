package Assertions;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Hardassertion {
	
	@Test
	void hard() {
		
		System.out.println("checking hard assertion");
		Assert.assertEquals(1, 2);
		
		System.out.println("Not coming near this line");
		
	}

}

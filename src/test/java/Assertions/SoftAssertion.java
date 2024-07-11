package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	void softassertion() {
		
		SoftAssert s=new SoftAssert();
		
		System.out.println("checking for soft assertion");
		s.assertEquals(3, 1);
		
		System.out.println("even assertion fails it came here");
		
		s.assertAll();
	}
}

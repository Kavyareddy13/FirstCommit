package methods;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest; 

public class c2 {
	
	@BeforeTest
	
	void BeforeTest2(){
		System.out.println("BeforeTest2 Method");
	}

	@Test
	void test2() {
		System.out.println("Test2 Method");
	}
	
	

}

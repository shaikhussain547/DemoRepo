package baseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {

	
	@BeforeMethod
	public void setUp(){
		System.out.println("Before method");
		System.out.println("Before method 2");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("After method");
	}
	
	
}

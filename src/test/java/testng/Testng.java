package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
	
	@BeforeClass
	private void browserlaunch () {
		
		System.out.println("launch browser");
	}
	
	@AfterClass
	private void quitbrowser () {
		
		System.out.println("quit browser");
	}
	
	@BeforeMethod
	private void startTime() {
		System.out.println("Start time");
		
	}
	
	
	@AfterMethod
	private void AfterTime() {
		System.out.println("After Time");
		
	}
	
	@Test
	
	private void TC1() {
		
		System.out.println("TEST1");
	}
	
   @Test
	
	private void TC2 () {
		
		System.out.println("TEST2");
	}
	

}

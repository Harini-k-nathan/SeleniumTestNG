package TestClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_BeforeClassAnnotations {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nThis runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nThis runs after every method");
	}
	
	@Test
	public void testMethod1() {
		
		System.out.println("\nRunning tests - test method 1");
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning tests - test method 2");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("\nThis runs once before class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("\nThis runs once after class");

	}

}

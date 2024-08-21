package TestClasses;
import org.testng.annotations.Test;

import org.testng.Assert;


public class TestAnnotation {
	
	
  @Test
  public void testMethod1() {
	  System.out.println("Running tests - test sum");
	  AddFunction obj = new AddFunction();
	  int result = obj.sumNumbers(1, 2);
	  Assert.assertEquals(result, 3);
	  
  }  
  
  @Test
  public void testMethod2() {
	  
	  System.out.println("Running tests - strings");
	  String expectedString = "Hello World";
	  AddFunction obj = new AddFunction();
	  String result = obj.addStrings("Hello", "World");
	  Assert.assertEquals(expectedString, result);
	  
	  
	  
  }
  
  @Test
  public void testMethod3() {
	  
	  System.out.println("Running tests - Array");
	  int[] getArray = {1, 2, 3, 4};
	  AddFunction obj = new AddFunction();
	  int[] result = obj.getArray();
	  Assert.assertEquals(getArray, result);
	  
  }
  
  
  
  
  
}

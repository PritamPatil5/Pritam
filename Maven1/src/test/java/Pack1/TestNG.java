package Pack1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	 @BeforeClass
	  public void beforeClass() {
		   System.out.println("Before Class");
		   
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		   System.out.println("Before Mehtod ");

	  }
	  @Test
	  public void test() {
	   System.out.println("Test");
	  }


}

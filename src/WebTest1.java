import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTest1 {
	@Test
	  public void test1() 
	  {
	      System.out.println("Test1 is running...");
	  }
	  @Test
	  public void test2() 
	  {
	      System.out.println("Test2 is running....");
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
	      System.out.println("Before method is working.....");
	  }
	  @AfterMethod
	  public void afterMethod() 
	  {
	      System.out.println("After method is working.....");
	  }
	  @BeforeTest
	  public void beforeTest() 
	  {
	      System.out.println("Before test is working....");
	  }
	  @AfterTest
	  public void afterTest() 
	  {
	      System.out.println("After test is working....");
	  }
	 

}

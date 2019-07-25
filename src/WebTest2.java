import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTest2 {
	@Test
	  public void test1() 
	  {
	      System.out.println("test1  is running.....");
	      
	  }
	  @Test
	  public void test2() 
	  {
	      System.out.println("test2  is running.....");
	      
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
	  System.out.println("Before method is running.....");
	  }
	  @AfterMethod
	  public void afterMethod() 
	  {
	      System.out.println("After method is running.....");
	      
	  }
	  @BeforeClass
	  public void beforeClass() 
	  {
	      System.out.println("Before class is running.....");
	      
	  }
	  @AfterClass
	  public void afterClass() 
	  {
	      System.out.println("After class is running.....");
	      
	  }
	  @BeforeTest
	  public void beforeTest() 
	  {
	      System.out.println("Before test is running.....");
	      
	  }
	  
	  @AfterTest
	  public void afterTest() 
	  {
	      System.out.println("After test is running.....");
	      
	  }
	  @BeforeSuite
	  public void beforeSuite() 
	  {
	      System.out.println("Before suite is running.....");
	      
	  }
	  @AfterSuite
	  public void afterSuite() 
	  {
	      System.out.println("After suite is running.....");
	      
	  }
}

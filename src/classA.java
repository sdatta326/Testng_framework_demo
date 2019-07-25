import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class classA {
  @Test
  public void f() {
	  System.out.println("test is running");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("browser opened");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("browser closed");
  }

}

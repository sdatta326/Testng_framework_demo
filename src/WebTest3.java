import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTest3 {
	WebDriver driver;
    WebElement login, username, password, submit, logout;
  @Test
  public void clickLogin() 
  {
      login = driver.findElement(By.linkText("Log in"));
      login.click();
  }
  
  @Test
  public void performLogin() 
  {
      username = driver.findElement(By.name("Email"));
      username.sendKeys("cvenkata_raman@rediffmail.com");
      password = driver.findElement(By.name("Password"));
      password.sendKeys("satyam123$");
      submit= driver.findElement(By.xpath("//input[@value='Log in']"));
      submit.click();
      
  }
  @Test
  public void performLogout() 
  {
      logout = driver.findElement(By.linkText("Log out"));
      logout.click();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
      System.out.println(driver.getTitle());  
    }
  
  @BeforeClass
  public void beforeClass() 
  {
      driver = new ChromeDriver();
      driver.get("http://demowebshop.tricentis.com");
  }
  @AfterClass
  public void afterClass() 
  {
      System.out.println("Browser is closing.....");
  }
  @BeforeTest
  public void beforeTest() 
  {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
  }
  @AfterTest
  public void afterTest() 
  {
      driver.close();
  }
}

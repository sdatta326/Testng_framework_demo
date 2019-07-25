import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testonline {
	// @Test(dependsOnMethods="E")
	 @Test(priority=1)
	    public void A()
	    {
	        System.out.println("Running A");
	   // Assert.fail("A");
	    }
    @Test(priority=2,dependsOnMethods="E")
    public void B()
    {
       System.out.println("Running B");
    }
    @Test(dependsOnMethods="B")
    public void C()
    {
        System.out.println("Running C");
    }
   @Test(priority=1)
    public void E()
    {
        System.out.println("Running E");
        //assertEquals("hello","hello");
    }
    /*@Test(priority=1,dependsOnMethods="E",alwaysRun=true)
    public void D()
    {
        System.out.println("Running D");
    }*/
   /* @Test(priority=4)
    public void t4()
    {
        System.out.println("Running 4");
    }*/
}
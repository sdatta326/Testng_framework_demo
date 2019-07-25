import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalcTest {

  @Test
  public void sumTest() {
    Calc o1=new Calc();
    int x=10, y=30;
    int expectresult=40;
    int actualresult=o1.sum(x,y);
    assertEquals(actualresult,expectresult);
  }
}

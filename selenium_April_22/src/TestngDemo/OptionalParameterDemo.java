package TestngDemo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameterDemo 
{
  @Test
  @Parameters("message")
  public void opt(@Optional("Saurabh Prakash Giri") String message)
  {
	  System.out.println(message);
  }
  @Test
  @Parameters({"val1","val2"})
  public void opt1(@Optional("19") int v1,@Optional("20") int v2)
  { 
	  int sum = v1 + v2;
	  System.out.println(sum);
  }
}

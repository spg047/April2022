package TestngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo1 
{
  @Test
  @Parameters({"val1","val2"})
  public void add(int v1, int v2) 
  {
	  int sum = v1 + v2;
	  System.out.println("Addition is :"+sum);
  }
  @Test
  @Parameters({"val1","val2"})
  public void sub(int v1,int v2)
  {
	  int diff = v1-v2;
	  System.out.println("Subtraction is :"+diff); 
  }
}

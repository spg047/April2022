package TestngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
  @Test
  @Parameters({"val1","val2"})
  public void add(int v1, int v2) 
  {
	  int sum = v1 + v2;
	  System.out.println("Addition is :"+sum);
  }
  @Test
  @Parameters({"val1","val2"})
  public void multiply(int v1 , int v2)
  {
	  int multi = v1*v2;
	  System.out.println("Multiplication is :"+multi);
  }
  @Test
  @Parameters({"val1","val2"})
  public void Division(int v1, int v2)
  {
	   int division = v1/v2;
	   System.out.println("Division is :"+division);
  }
}

package TestngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo2 
{
  public WebDriver driver;
  @Test
  @Parameters({"val1","val2","browser"})
  public void add(int v1, int v2, String Browser)
  {
	 int sum = v1 + v2;
	 System.out.println("add is :"+sum);
	 
	 if(Browser.equalsIgnoreCase("chrome"))
	 {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
	 }
	 else if(Browser.equalsIgnoreCase("edge"))
	 {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
	 }
	 else if(Browser.equalsIgnoreCase("gecko"))
	 {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\geckodriver.exe");
         driver = new FirefoxDriver();
		 driver.get("https://www.google.com");
	 }
  }
}

package TestngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo3 
{
  public WebDriver driver;
  @Test
  @Parameters({"Username","Password"})
  public void facebook(String user, String pass) 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://facebook.com/");
	  driver.manage().window().maximize();
	  
	  WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement loginb = driver.findElement(By.xpath("//button[@name='login']"));
	  userid.sendKeys(user);
	  password.sendKeys(pass);
	  loginb.click();
  }
}

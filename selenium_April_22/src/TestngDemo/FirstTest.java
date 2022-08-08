package TestngDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest 
{
	public WebDriver driver; 
@Test	
  public void f()
  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
		
  }
@Test
  public void s()
  {
	  WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  username.sendKeys("avengers@123");
	  password.sendKeys("12345667");
	  loginBtn.click();  
  } 
}

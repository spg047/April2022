package TestngDemo;

import static org.testng.Assert.assertEquals;

import javax.swing.GroupLayout.Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestDemo
{
	public WebDriver driver; 
	@Test(groups = {"sanity","regression"}, priority=1)	
	  public void launchBrowser()
	  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	  }
	@Test(groups = "sanity", priority=2)
	  public void checkTitle()
	  {
		String ExpectedTitle = "Facebook – log in or sign up";
		String ActualTitle = driver.getTitle();
	    Assert.assertEquals(ActualTitle, ExpectedTitle);
	  }
	@Test(groups = "regression",priority=3)
	  public void login()
	  {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	    WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("avengers@123");
		password.sendKeys("12345667");
	    loginBtn.click();  
	  }
	@Test(groups = {"sanity","regression"},priority=4,enabled=false)
	  public void tearDown()
	  {
		driver.close();
	  }
}

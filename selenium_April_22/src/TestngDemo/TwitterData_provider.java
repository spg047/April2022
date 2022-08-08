package TestngDemo;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class TwitterData_provider 
{
  public WebDriver driver;	
  @Test(dataProvider = "mail")
  public void TwitterLogin(String userid, String Password) throws InterruptedException 
  {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://twitter.com/i/flow/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
	
	  WebElement username = driver.findElement(By.xpath("//input[@autocomplete='username']"));
	  username.sendKeys(userid);

	  WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
	  next.click();

	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys(Password);

	  WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Log in']"));
	  loginBtn.click();
  }

  @DataProvider
  public Object[][] mail() 
  {
    return new Object[][]
    {
      new Object[] { "oggy_and_co", "Saurabh16" }
    };
  }
}

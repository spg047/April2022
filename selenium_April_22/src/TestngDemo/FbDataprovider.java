package TestngDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class FbDataprovider 
{
  public WebDriver driver;
  @Test(dataProvider="fb")
  public void fblogin(String Userid, String Password)
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://facebook.com/");
	  driver.manage().window().maximize();
	  
	  WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	  username.sendKeys(Userid);
	  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	  password.sendKeys(Password);
	  WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  loginBtn.click();
  }
  @DataProvider
  public Object[][] fb()
  {
    return new Object[][] 
    {
      new Object[] { "prakash.giri30669@gmail.com", "12345678" },
      new Object[] { "9960250704", "12345432" }
    };
  }
}

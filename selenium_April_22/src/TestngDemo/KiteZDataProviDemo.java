package TestngDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class KiteZDataProviDemo 
{
  public WebDriver driver;
  @Test(dataProvider = "kite")
  public void f(String Username, String Password) 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
	  
	  WebElement user = driver.findElement(By.xpath("//input[@id='userid']"));
	  user.sendKeys(Username);
	  WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
      password.sendKeys(Password);
      WebElement loginB = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
      loginB.click();
  }

  @DataProvider
  public Object[][] kite() {
    return new Object[][] {
      new Object[] { "njkxdkkx", "123445" },
      new Object[] { "xmxknn", "345678" },
    };
  }
}

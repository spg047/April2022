package TestngDemo;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

public class Datapro_flipkart 
{
  public WebDriver driver;
  @Test(dataProvider = "flip")
  public void flipkartlogin(String Mob,String Pass) throws InterruptedException    
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.manage().window().maximize();
	  
	  WebElement mobno = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	  mobno.sendKeys(Mob);
	  WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	  password.sendKeys(Pass);
	  WebElement loginb = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	  loginb.click();
	  
	 // WebElement escape = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
     // act.click(escape).perform();
	  
	  Thread.sleep(6000);
  }
  @DataProvider
  public Object[][] flip() 
  {
    return new Object[][] 
    {
      new Object[] { "7083893937", "GIRi@123" },
    };
  }
  @Test()
  public void surfing()  
  {
	  Actions act = new Actions(driver); 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  
	  WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
	  act.moveToElement(home).perform();
	  
	  WebElement living = driver.findElement(By.xpath("//div[@class='_1y9fNR']//a[text()='Living Room Furniture']"));
	  act.moveToElement(living).perform();
	 
	  WebElement tv = driver.findElement(By.xpath("//span[@class='xtXmba']//following-sibling::a[text()='Dining Sets']"));
	  act.click(tv).perform();
  }
}

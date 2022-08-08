package Testng_demo1;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

public class AmazondataP 
{
	public WebDriver driver;
  @Test(dataProvider = "amazon")
  public void f(String search) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.in");
	//  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
	  Actions act = new Actions(driver);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  WebElement find = driver.findElement(By.xpath("//input[@name='field-keywords']"));
	  find.sendKeys(search);
	  
	  WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	  searchBtn.click();
	  
	  WebElement tommorow = driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']//preceding-sibling::div//i"));
	  tommorow.click();
	  
	  Thread.sleep(3000);
	  
	  WebElement move = driver.findElement(By.partialLinkText("//span[text()='Internal Memory']"));
	 // act.moveToElement(move).perform();
	  js.executeScript("arguments[0].scrollIntoView(true)", move);
	  
	  WebElement iphone = driver.findElement(By.xpath("//div[contains(@data-csa-c-swatch-url,'Apple-iPhone-Mini-128GB')]//a[@aria-label='Green']"));
	  iphone.click();
  }
  @DataProvider
  public Object[][] amazon()
  {
    return new Object[][]
    {
      new Object[] { "iphone" },
    };
  }
}

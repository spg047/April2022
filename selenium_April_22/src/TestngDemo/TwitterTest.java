package TestngDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwitterTest 
{
	public WebDriver driver;
  @Test(groups= {"sanity","regression"},priority=1)
  public void launchbrowser()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://twitter.com/i/flow/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
  }
  
  @Test(groups="regression",priority=2)
  public void checkUrl()
  {
	  String expectedUrl = "https://twitter.com/i/flow/login";
	  String ActualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(ActualUrl, expectedUrl);
	  System.out.println(driver.getCurrentUrl());
  }
  
  @Test(groups="sanity",priority=3)
  public void twitterLogin() throws InterruptedException 
  {
	  
	  WebElement username = driver.findElement(By.xpath("//input[@autocomplete='username']"));
	  username.sendKeys("oggy_and_co");

	  WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
	  next.click();

	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("Saurabh16");

	  WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Log in']"));
	  loginBtn.click();
	  Thread.sleep(3000);
  }
  
  @Test(groups="regression",priority=4)
  public void CheckTitle()
  {
	  
	  String ExpectedTitle ="Home / Twitter";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  System.out.println(driver.getTitle());
  }
  
  @Test(groups="sanity",priority=5)
  public void DoAtweet()
  {
	  WebElement tooter = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-xoduu5']//span[text()='Tweet']"));
	  tooter.click();
	  WebElement write = driver.findElement(By.xpath("//div[@data-contents='true']//preceding::div[@aria-label='Tweet text']"));
	  write.sendKeys("Hey");
	  WebElement send = driver.findElement(By.xpath("//div[@data-testid='tweetButton']//span[text()='Tweet']"));
	  send.click();
  }
  
 /* @Test(groups={"sanity","regression"},priority=6)
  public void Teardown() throws InterruptedException
  {
	  Thread.sleep(5000);
	  driver.close();
  }*/
}

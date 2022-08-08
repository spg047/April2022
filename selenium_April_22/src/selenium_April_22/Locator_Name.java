package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator_Name
{
   public static void main(String[] args)
   {
	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\geckodriver.exe");
	   
	   WebDriver driver = new FirefoxDriver();
	   driver.get("https://www.facebook.com/");
	   
	   WebElement userEmail = driver.findElement(By.name("email"));
	   WebElement passWord = driver.findElement(By.name("pass"));
	   WebElement loginBtn = driver.findElement(By.name("login"));
	   
	   userEmail.sendKeys("avengers@gmail.com");
	   passWord.sendKeys("12345678");
	   loginBtn.click();
	}
}

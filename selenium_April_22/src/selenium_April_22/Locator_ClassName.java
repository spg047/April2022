package selenium_April_22;

import org.openqa.selenium.By;                              /*If there is space between the className value then 
                                                              InvalidSelectorException error will occur. */
import org.openqa.selenium.WebDriver;                         
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator_ClassName 
{
    public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	  //WebElement user = driver.findElement(By.className("inputtext _55r1 _6luy")); 
		
		WebElement user = driver.findElement(By.className("inputtext"));
		user.sendKeys("utkarshaa.acedemy@gamil.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345678");
		
		WebElement loginBtn = driver.findElement(By.className("_42ft"));
		loginBtn.click();
	}
}

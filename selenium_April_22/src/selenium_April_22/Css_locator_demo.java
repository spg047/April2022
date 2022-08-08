package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Css_locator_demo
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    
		// css selector with id
	//	WebElement userEmail = driver.findElement(By.cssSelector("input#email"));
		// css selector with id and other attributes
		WebElement userEmail = driver.findElement(By.cssSelector("input#email[class='inputtext _55r1 _6luy']"));
		
		userEmail.sendKeys("thor@gmail.com");
		
		// css selector with class name
	//	WebElement password = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
		// css selector with class and other attributes
		WebElement password = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[type='password']"));
		
		password.sendKeys("12345678");
		
		// css selector with other attributes
	//	WebElement loginBtn = driver.findElement(By.cssSelector("button[value='1']"));
		// css selector with Parent-child relationship
	//	WebElement loginBtn = driver.findElement(By.cssSelector("div>button"));
		// css selector with substring(charAt)
    //	WebElement loginBtn = driver.findElement(By.cssSelector("button[class^='_42ft")); // Starting Value
		// css selector with substring(dollar)
	//	WebElement loginBtn = driver.findElement(By.cssSelector("button[class$='_51sy")); // Ending Value
		// css selector with substring(star)
		WebElement loginBtn = driver.findElement(By.cssSelector("button[class*='_42ft")); // Any Value
	   	
		loginBtn.click();
	}

}

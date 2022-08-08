package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_and_Starts_with
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement username =driver.findElement(By.xpath("//input[contains(@data-testid,'royal_ema')]"));
		WebElement password =driver.findElement(By.xpath("//input[starts-with(@placeholder,'Pass')]"));
		WebElement login =driver.findElement(By.xpath("//button[contains(@value,'1')]"));
		
		username.sendKeys("antman@gmail.com");
		password.sendKeys("123errc");
		login.click();
	}

}

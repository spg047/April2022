package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha 
{
   public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		WebElement userid = driver.findElement(By.xpath("//input[@maxlength='6']"));
		WebElement password = driver.findElement(By.xpath("//input[@maxlength='260']"));
		WebElement loginB = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		
		userid.sendKeys("Ab3245");
		password.sendKeys("123456");
		loginB.click();
	}
}

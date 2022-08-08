package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes_Method 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mob.click();
	
	//	WebElement redmi = driver.findElement(By.xpath("//span[text()='Redmi']//preceding-sibling::div//i"));
		WebElement redmi = driver.findElement(By.xpath("//span[text()='Redmi']//preceding-sibling:: div//input[@type='checkbox']//parent::label//i"));
		
	//	WebElement redmi = driver.findElement(By.xpath("//div[starts-with(@class,'a-checkbox')]//descendant::i[starts-with(@class,'a-icon ')]//following::span[text()='Redmi']"));
	//	WebElement redmi = driver.findElement(By.xpath("//span[text()='Redmi']"));
		
		redmi.click();

	}

}

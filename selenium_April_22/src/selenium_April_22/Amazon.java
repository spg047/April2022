package selenium_April_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mob.click();
		WebElement cash = driver.findElement(By.xpath("//span[text()='Eligible for Pay On Delivery']"));
		cash.click();
		//WebElement redmi = driver.findElement(By.xpath("//span[contains(text(),'Coral Green')]"));
		//redmi.click();
		WebElement dropdown = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
		dropdown.click();
		WebElement opt = driver.findElement(By.xpath("//a[text()='Price: Low to High']"));
		opt.click();
		
		
	}

}

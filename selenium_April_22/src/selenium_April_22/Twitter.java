package selenium_April_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter 
{
   public static void main(String[] args) 
   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@class,'r-30o5oe')]"));
		username.sendKeys("oggy_and_co");
		
		
		WebElement next = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div"));
		next.click();
		
		WebElement password = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		password.sendKeys("Saurabh16");
		
		WebElement loginB = driver.findElement(By.xpath("//span[text()='Log in']"));
		loginB.click();
	}
}

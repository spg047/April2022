package selenium_April_22;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		// Implicit Wait....
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Explicit Wait....
		//WebDriverWait wait = new WebDriverWait(Duration.ofSeconds(20)); 
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		org.openqa.selenium.interactions.Action sendEsc = actions.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();
		
		driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("Dell");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		org.openqa.selenium.interactions.Action pageDown = actions.sendKeys(Keys.PAGE_DOWN).build();
		pageDown.perform();
		
		List<WebElement> totalRows = driver.findElements(By.xpath("//div[@class='_1AtVbE col-12-12']//div[@class='_13oc-S']"));
		System.out.println("Total no. of Rows : "+totalRows.size());
		 
			for(int i=1;i<=totalRows.size();i++)
			{
				WebElement ProductName = driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']["+i+"]//div[@class='_13oc-S']//div[@class='_4rR01T']"));
				System.out.println(ProductName.getText().toString());
				System.out.println("==============================");
			}
	}
}

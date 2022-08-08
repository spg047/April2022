package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Id
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        WebElement userid = driver.findElement(By.id("email")); //We can't pass the id locator for dynamic idValues as it changes everytime.
        WebElement password = driver.findElement(By.id("pass"));
        WebElement loginBtn = driver.findElement(By.name("login"));
        
        userid.sendKeys("girisaurabh160@gmail.com");
        password.sendKeys("123456789");
        loginBtn.click();
     }
}

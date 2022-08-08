package selenium_April_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Launch_FireFox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\geckodriver.exe");
		
		FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("--headless");
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}	

}

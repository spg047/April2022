package selenium_April_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch_Chrome
{
	public static void main(String[] args)
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
	    
	    ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("--headless");
	    opt.addArguments("--disable-notification");
	    
	    WebDriver driver = new ChromeDriver(opt);
	    driver.get("https://www.google.com/");
	    
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	}
}

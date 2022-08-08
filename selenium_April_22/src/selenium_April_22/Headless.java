package selenium_April_22;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class Headless
{
    public static void main(String[] args) 
	{
    	HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
    	driver.get("https://www.google.com");
    	
    	System.out.println(driver.getTitle());
    	System.out.println(driver.getCurrentUrl());
    }
}

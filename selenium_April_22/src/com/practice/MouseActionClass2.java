package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionClass2 {

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement escape = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		//escape.click();
		act.click(escape).perform();
		
		WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		act.moveToElement(electronics).perform();
		
		WebElement bluetoothSpeakers = driver.findElement(By.xpath("//span[text()='more in Audio']//following-sibling::a[text()='Bluetooth Speakers']"));
		act.click(bluetoothSpeakers).perform();
		//bluetoothSpeakers.click();
		
		
	}

}

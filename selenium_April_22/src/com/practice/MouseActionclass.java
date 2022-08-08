package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionclass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement doubleclickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		act.doubleClick(doubleclickBtn).perform();
		
		WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		act.contextClick(rightclick).perform();
		
		WebElement dynamicclick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		act.click(dynamicclick).perform();
		
		WebElement bookStore = driver.findElement(By.xpath("//div[@class='header-right']//preceding-sibling::div[text()='Book Store Application']"));
		
		act.moveToElement(bookStore).perform();
		
		Thread.sleep(3000);
		
		WebElement buttons = driver.findElement(By.xpath("//div[text()='Buttons']"));
		
		act.moveToElement(buttons).perform();
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement dragMe = driver.findElement(By.xpath("//div[text()='Drag me']"));
		
		WebElement dropHere = driver.findElement(By.xpath("//div[text()='Drag me']//following-sibling::div"));
		
		act.dragAndDrop(dragMe, dropHere).perform();
		
		driver.get("https://www.naukri.com/");
		
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		act.moveToElement(jobs).perform();
		
	}

}

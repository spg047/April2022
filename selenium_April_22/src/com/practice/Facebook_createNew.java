package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_createNew {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@role='button' and @rel='async']")).click();
		
		// Static Wait Synchronisation..
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Saurabh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Giri");
	 }
}

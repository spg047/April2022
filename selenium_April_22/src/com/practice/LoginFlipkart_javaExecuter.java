package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFlipkart_javaExecuter 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.flipkart.com/'");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement mobileNo1 = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	    //js.executeScript("arguments[0].value='7083893937'", mobileNo1);
		mobileNo1.sendKeys("7083893937");
		
		WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		//js.executeScript("arguments[0].value='GIRi@123'", password);
		password.sendKeys("GIRi@123");
		
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='_1D1L_j']//button[@type='submit']"));
		js.executeScript("arguments[0].click()", loginBtn);
	}
}

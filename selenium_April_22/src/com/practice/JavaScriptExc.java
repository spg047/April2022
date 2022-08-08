package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExc {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//driver.get("https://demoqa.com/text-box");
		js.executeScript("window.location='https://demoqa.com/text-box'");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		js.executeScript("arguments[0].value='Saurabh Giri'", username);
		//js.executeScript("document.getElementById('userName').value='Saurabh Giri'");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		js.executeScript("arguments[0].value='girisaurabh160@gmail.com'", email);
		
		WebElement currentAddrs = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		js.executeScript("arguments[0].value='Latur'", currentAddrs);
		
		WebElement permanantAddrs = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		js.executeScript("arguments[0].value='Ujani,Ambajogai,Beed'", permanantAddrs);
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].click()", submitBtn);
		//submitBtn.click();
	}
}

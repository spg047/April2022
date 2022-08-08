package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Property {

	public static void main(String[] args) throws IOException,InterruptedException
	{
		Properties prop = new Properties();
		FileInputStream srcfile = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\selenium_April_22\\config.properties");
		
		//Properties prop = new Properties();
		
		prop.load(srcfile);
		
		System.setProperty(prop.getProperty("key"),prop.getProperty("value"));
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
		WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id ='pass']"));
		userid.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
	}

}

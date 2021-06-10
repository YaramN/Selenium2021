package com.test;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot 
{
	
	static WebDriver driver;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Niveditha_Selenium\\\\chromedriver_win32\\\\chromedriver_win32.exe");
		 driver = new ChromeDriver();
		//Launch the URL
		driver.get("https://demoqa.com");
		takeScreenshot("toolsQA","F:\\Niveditha_Selenium\\Workspace\\Niveditha_Project\\src\\com\\test\\Screenshots" );
	}
	
	public static void takeScreenshot(String Filename, String FilewithPath) 
	{
		// convert Webdriver object to TakeScreenshot 
		
		TakesScreenshot scrshot= ((TakesScreenshot)driver);
		
		// Call getScreenshotas method to create image file 
		
		File srcFile = scrshot.getScreenshotAs(OutputType.FILE);
		
		// Move image file to new destination 
		
		File destfile= new File(FilewithPath);
		
		// Copy file at Destination 
		
		FileUtils.copyFile(srcFile,destFile);
		
	}
}

		


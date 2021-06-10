package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/automation-practice-form/");
		driver.findElement(By.id("hobbies-checkbox-2")).click();
	     
		//if(isSe
		driver.close();
		
		

	}

}

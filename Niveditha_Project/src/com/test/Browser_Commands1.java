package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Commands1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		//WebElement Element =driver.findElement(By.id(“New Browser Window”)).click();
		driver.quit();
		
	}

}

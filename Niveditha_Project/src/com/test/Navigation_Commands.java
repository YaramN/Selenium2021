package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://DemoQA.com ");
		driver.findElement(By.className("banner-image")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().to("https://DemoQA.com");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.close();
	}

}
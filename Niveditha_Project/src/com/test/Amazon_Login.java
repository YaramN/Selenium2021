package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login {

	public static void main(String[] args)
	{
		System.setProperty("Webdirver.chrome.driver","F:\\\\Niveditha_Selenium\\\\chromedriver_win32\\\\chromedriver_win32.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.close();

	}

}

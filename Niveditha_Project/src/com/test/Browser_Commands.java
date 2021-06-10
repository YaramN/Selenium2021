package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Commands
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Shop.DemoQA.com");
		String Title =driver.getTitle();
		System.out.println(Title);
		int Length=driver.getTitle().length();
		System.out.println(Length);
		String CurrentUrl =driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		String ExpectedUrl="https://shop.demoqa.com/";
		if(CurrentUrl.equalsIgnoreCase(ExpectedUrl))
		{
			System.out.println("Correct page  is opened");
		}
		else
		{
			System.out.println("incorrect page is opened");
		}
		String PageSource =driver.getPageSource();
		System.out.println(PageSource);
		int Plength=driver.getPageSource().length();
		System.out.println(Plength);
		 //pageLength=driver.get
		
		driver.quit();
		
		
		 
	}

}

package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.demoqa.com/radio-button");
		WebElement element =driver.findElement(By.xpath("//div[@class= 'custom-control custom-radio custom-control-inline']/descendant::input"));
		Boolean isSelected= element.isSelected();
		if(isSelected==false)
		{
			element.click();
		}
		//element.sendKeys("nivvi");
	}
	}
	

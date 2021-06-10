package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Box {

	public static void main(String[] args) throws Throwable 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.demoqa.com/automation-practice-form/");
         WebElement element =driver.findElement(By.className("custom-control-label"));
         Boolean isSelected = element.isEnabled();
         if(isSelected==true)
         {
        	 element.click();
         }
         Thread.sleep(6000);
		//element.click()
		driver.close();

	}

}

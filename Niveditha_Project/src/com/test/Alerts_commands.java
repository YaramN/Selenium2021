package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_commands {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts/");
		//driver.switchTo().fr
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert ConfirmAlert=driver.switchTo().alert();
		ConfirmAlert.dismiss();
			
		
		
		
		
	}   

}

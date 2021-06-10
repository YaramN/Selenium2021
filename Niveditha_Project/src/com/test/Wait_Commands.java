package com.test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Commands {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        //WebDriverWait wait= new WebDriverWait(driver,10);
          FluentWait wait= new FluentWait(driver);
          wait.withTimeout(5, TimeUnit.SECONDS);
          wait.pollingEvery(5, TimeUnit.SECONDS);
          wait.ignoring(NoSuchElementException.class);
          
	   
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://toolsqa.com/automation-practice-switch-windows/");
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
		driver.findElement(By.id("txt1")).sendKeys("Hello");
	}
}

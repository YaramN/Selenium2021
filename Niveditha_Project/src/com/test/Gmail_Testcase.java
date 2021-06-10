package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_Testcase {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("niveditha.yaram@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		//driver.navigate().refresh();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='h-c-header__cta']/following::a[2]"))));
		
		Thread.sleep(5000);
		
	}

}

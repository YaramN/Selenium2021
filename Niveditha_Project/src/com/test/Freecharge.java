package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Freecharge {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecharge.in/desktop/");
		WebElement Element=driver.findElement(By.xpath("//a[@class='_3mvx0']"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(Element));
		Element.click();
		
		WebElement  Element1 =driver.findElement(By.xpath("//input[@name='checkUsername']"));
		
		wait.until(ExpectedConditions.visibilityOf(Element1));
		wait.until(ExpectedConditions.elementToBeClickable(Element1));
		Element1.click();
		Element1.clear();
		//Thread.sleep(5000);
				Element1.sendKeys("9700219291");
		
		
		

	}

}

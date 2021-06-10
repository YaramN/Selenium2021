package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/select-menu/");
		Select Select =new Select(driver.findElement(By.id("//*[@id='oldSelectMenu']")));
		List<WebElement> options = Select.getOptions();
		System.out.println(options);
		driver.close();
	}

}

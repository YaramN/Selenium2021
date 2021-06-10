package com.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.jar.asm.Handle;

public class WindowHandle {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id=\"windowButton\"]")).click();
		String ParentWindow=driver.getWindowHandle();
		System.out.println(ParentWindow);
		Set <String> ChildWindows=driver.getWindowHandles();
		System.out.println(ChildWindows);
		for(String handle :ChildWindows)
		{
		   System.out.println(handle);
		   if(!ParentWindow.equalsIgnoreCase(handle))
		   {
		   driver.switchTo().window(handle);
		   WebElement text =driver.findElement(By.id("sampleHeading"));
		   System.out.println("The text in the child window is" + text.getText());
		
		}
		   driver.switchTo().defaultContent();
		Thread.sleep(2000);
		

	}

}
}

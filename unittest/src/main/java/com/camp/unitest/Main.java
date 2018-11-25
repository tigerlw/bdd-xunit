package com.camp.unitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main 
{
	public static void main(String args[])
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		
		System.out.println("srart selenium");
		WebDriver driver = new ChromeDriver(caps);
		driver.get("http://www.baidu.com/");
		
		driver.findElement(By.id("kw")).sendKeys("selenium java");
		driver.findElement(By.id("su")).click();
		driver.close();
	}

}

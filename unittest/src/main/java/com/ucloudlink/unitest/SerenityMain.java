package com.ucloudlink.unitest;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SerenityMain 
{
	public static void main(String args[])
	{
		 //MutableCapabilities capabilities = new MutableCapabilities();
		
		 DesiredCapabilities capabilities = DesiredCapabilities.chrome();

	     ChromeOptions chromeOptions = new ChromeOptions();
	     
	     //chromeOptions.addArguments("headless");

	     capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	     
	     String chromeSwitches = "headless";
	     
	     capabilities.setCapability("chrome.switches", chromeSwitches);
	     
	     WebDriver driver = new ChromeDriver(capabilities);
	     driver.get("http://www.baidu.com/");
			
	     driver.findElement(By.id("kw")).sendKeys("selenium java");
	     driver.findElement(By.id("su")).click();
	     driver.close();
	}

}

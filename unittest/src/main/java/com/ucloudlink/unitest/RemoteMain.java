package com.ucloudlink.unitest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class RemoteMain 
{
	public static void main(String args[]) throws MalformedURLException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		
		System.out.println("srart selenium");
		//WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), caps);
		WebDriver driver = new ChromeDriver(caps);
		driver.get("http://www.baidu.com/");
		
		driver.findElement(By.id("kw")).sendKeys("selenium java");
		driver.findElement(By.id("su")).click();
		driver.close();
	}

}

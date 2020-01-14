package com.actitime2.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;


public class BrowserFactory 
{
	public static WebDriver launchBrowser(String browserName)
	{
		WebDriver driver =null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
			driver=new ChromeDriver();
			Reporter.log("chrome is launched",true);
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.geco.driver","/exefiles/geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("mozila is launched");
		}
		return driver;

		
	}

}

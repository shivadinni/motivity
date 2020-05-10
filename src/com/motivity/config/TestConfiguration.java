package com.motivity.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestConfiguration {
	public static WebDriver getinstance()
	{
		WebDriver driver=null;
		String browseType=com.motivity.util.DataHandlers.getFromPropertyFile("motivity","browser");
		String url=com.motivity.util.DataHandlers.getFromPropertyFile("motivity","url");
		if(browseType.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webDriver.firefox.marionette","./Browser-servers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browseType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Browser-server/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.err.println("invalid browser type");
		}
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get(url);
	return driver;

	}
}

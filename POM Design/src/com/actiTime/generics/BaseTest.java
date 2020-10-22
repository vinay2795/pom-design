package com.actiTime.generics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

abstract public class BaseTest implements IAutoConstant
{
	static
	{
		System.setProperty(CHROM_KEY,CHROM_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	
	public static WebDriver driver;
	
	public static void openBrowser(String sBrowser)
	{
		if(sBrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(sBrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(sBrowser.equals("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}
}

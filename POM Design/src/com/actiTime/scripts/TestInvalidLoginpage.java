package com.actiTime.scripts;
import java.util.concurrent.TimeUnit;
import com.actiTime.generics.BaseTest;
import com.actiTime.generics.FWUtils;
import com.actiTime.pages.EnterTimeTrackPage;
import com.actiTime.pages.LoginPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actiTime.generics.BaseTest;
import com.actiTime.pages.LoginPage;

public class TestInvalidLoginpage extends BaseTest {
	public static void main(String[] args) throws InterruptedException 
	{
		openBrowser("chrome");		
		LoginPage lp =new LoginPage(driver);
		lp.setUsername("admin");
		lp.clickOnLoginBTN();
		Thread.sleep(1000);
		lp.verifyErrMSg(driver);
		
		
		
		lp.setPassword("manager");
		lp.clickOnLoginBTN();
		Thread.sleep(1000);
		lp.verifyErrMSg(driver);
		
	
		
		lp.setUsername("admin1111");
		lp.setPassword("manager1111");
		lp.clickOnLoginBTN();
		Thread.sleep(1000);
		lp.verifyErrMSg(driver);
		
		
		
		lp.setUsername("13267256256");
		lp.setPassword("8839578370895");
		lp.clickOnLoginBTN();
		Thread.sleep(1000);
		lp.verifyErrMSg(driver);
		
		
		
		lp.setUsername("");
		lp.setPassword("");
		lp.clickOnLoginBTN();
		Thread.sleep(1000);
		lp.verifyErrMSg(driver);
		
		
		lp.clickOnLoginBTN();
		lp.verifyErrMSg(driver);
		
		closeBrowser();
	}

}

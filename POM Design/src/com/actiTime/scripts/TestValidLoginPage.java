package com.actiTime.scripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actiTime.generics.BaseTest;
import com.actiTime.generics.FWUtils;
import com.actiTime.pages.EnterTimeTrackPage;
import com.actiTime.pages.LoginPage;

public class TestValidLoginPage extends BaseTest{
	

	public static void main(String[] args)
	{		
		openBrowser("chrome");
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickOnKeepMeLoggedInCheckBox();
		lp.clickOnLoginBTN();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		FWUtils.verifyPageTitle(driver,"actiTIME - Enter Time-Track");
		etp.clickOnLogOutLink();
		closeBrowser();
		
	

	}
}

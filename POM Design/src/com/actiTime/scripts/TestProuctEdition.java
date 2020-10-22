package com.actiTime.scripts;
import java.util.concurrent.TimeUnit;
import com.actiTime.generics.BaseTest;
import com.actiTime.generics.FWUtils;
import com.actiTime.pages.EnterTimeTrackPage;
import com.actiTime.pages.LoginPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actiTime.generics.BaseTest;
import com.actiTime.generics.FWUtils;
import com.actiTime.pages.EnterTimeTrackPage;
import com.actiTime.pages.LicensePage;
import com.actiTime.pages.LoginPage;

public class TestProuctEdition extends BaseTest{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		openBrowser("firefox");		
		LoginPage lp =new LoginPage(driver);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickOnKeepMeLoggedInCheckBox();
		lp.clickOnLoginBTN();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		Thread.sleep(1000);
		FWUtils.verifyPageTitle(driver,"actiTIME - Enter Time-Track");
		etp.clickOnSettingsMenu();
		etp.clickOnLicensesLink();
		
		LicensePage lcp = new LicensePage(driver);
		Thread.sleep(1000);
		FWUtils.verifyPageTitle(driver,"actiTIME - Licenses");
		lcp.verifyProductEdition();
		etp.clickOnLogOutLink();
	    closeBrowser();

	}

}

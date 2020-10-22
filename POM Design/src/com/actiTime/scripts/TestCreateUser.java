package com.actiTime.scripts;
import java.util.concurrent.TimeUnit;
import com.actiTime.generics.BaseTest;
import com.actiTime.generics.FWUtils;
import com.actiTime.pages.EnterTimeTrackPage;
import com.actiTime.pages.LoginPage;
import com.actiTime.pages.TaskListPage;


public class TestCreateUser extends BaseTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		openBrowser("chrome");		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickOnKeepMeLoggedInCheckBox();
		lp.clickOnLoginBTN();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		Thread.sleep(1000);
		FWUtils.verifyPageTitle(driver,"actiTIME - Enter Time-Track");
		etp.clickOnTaskTab();
		
		TaskListPage tls = new TaskListPage(driver);
		Thread.sleep(1000);
		FWUtils.verifyPageTitle(driver,"actiTIME - Task List");
		tls.clickOnAddNewBTN();
		tls.clickOnPlusNwCustomer();
		Thread.sleep(1000);
		tls.setNewCustomerName("BPS11");
		tls.clickonPlusCreateCusomerBTN();
		tls.listofCustomers();
		etp.clickOnLogOutLink();
		closeBrowser();
		

	}

}

package com.actiTime.generics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FWUtils {

	public static void verifyPageTitle(WebDriver driver,String expectedTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(expectedTitle));
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("The Expected Page is Dispalyed--->"+expectedTitle);
		}
		else
		{
			System.out.println("The Expected Page is not Dispalyed--->"+actualTitle);
		}
		
	}

}

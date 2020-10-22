package com.actiTime.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LicensePage {
	@FindBy(xpath="//nobr[text()='Product Edition:']/../../td[2]")
	private WebElement productEdition;
	
	@FindBy(xpath="//nobr[text()='Issue Date:']/../../td[2]")
	private WebElement issueDate;
	
	public LicensePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
		
	public void verifyProductEdition()
	{
		String expectedProductEdition="actiTIME 2017.4";
		String actualProductEdition =productEdition.getText();
		if(actualProductEdition.equals(expectedProductEdition))
		{
			System.out.println("The Expected productEdition is Dispalyed--->"+expectedProductEdition);
			System.out.println("TestCase Is passed");
		}
		else
		{
			System.out.println("The Expected productEdition is not Dispalyed--->"+actualProductEdition);
			System.out.println("TestCase Is Failed");
		}
	}
	
	public void verifyIssueDate()
	{
		String expectedIssueDate="Jul 14, 2017";
		String actualIssueDate =issueDate.getText();
		if(actualIssueDate.equals(expectedIssueDate))
		{
			System.out.println("The Expected IssueDate is Dispalyed--->"+expectedIssueDate);
			System.out.println("TestCase Is passed");
		}
		else
		{
			System.out.println("The Expected IssueDate is not Dispalyed--->"+actualIssueDate);
			System.out.println("TestCase Is Failed");
		}
	}
	

}

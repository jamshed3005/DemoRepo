package com.crm.qa.pages;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.crm.qa.base.TestBaseClass;
public class ContactPage extends TestBaseClass {

	public static String filepath="C:\\Users\\Jamshed Khan\\eclipse-workspace\\FreeCrmTest\\src\\main\\java\\com\\crm\\qa\\testdata\\Test1.xlsx";
	public ContactPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="New")
	WebElement contactnew;
	
	@FindBy(name="first_name")
	WebElement firstname;
	
	@FindBy(name="last_name")
	WebElement lastname;
	
	@FindBy(name="value")
	WebElement emailid;
	
	@FindBy(xpath="//*[text()='Save']")
	WebElement save;
	
	//
	@DataProvider
	public void getTestData()
	{
		File fs=new File(filepath);
		
		
	}
	
	
	///html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]/div/input
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]/div/input")
	WebElement contactradio;
	
	public boolean newcontactDisplayed()
	{
		return contactnew.isDisplayed();
		
	}
	
	public void newContactClick()
	{
		contactnew.click();
		
	}
	
	public void clickcontactRadioButton()
	{
		contactradio.click();
	}
	
	public void createnewcontact(String fname,String lname,String email)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		emailid.sendKeys(email);
		save.click();
		
		
	}
	
	

}

package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBaseClass;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.loginPage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBaseClass {
	
	loginPage loginpage;
	HomePage homepage;
	ContactPage contactpage;
	
	public ContactPageTest() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		loginpage=new loginPage();
		
		homepage=loginpage.login(pr.getProperty("username"), pr.getProperty("password"));
		
		contactpage=homepage.contactclick();
		
		
		
	}
//	@Test(priority=1)
//	public void newContactDisplayedTest()
//	{
//		Assert.assertTrue(contactpage.newcontactDisplayed(),"Yes New Contact button is visible");
//	}
	
//	@Test(priority=2)
//	public void newContactclickTest()
//	{
//		contactpage.newContactClick();
//	}
//
//	@Test()
//	public void contactradiobuttonTest()
//	{
//		
//		contactpage.clickcontactRadioButton();
//	}
	
	@Test
	public void validateCreateNewContact() throws IOException
	{
		contactpage.newContactClick();
		contactpage.createnewcontact("rahul", "jain", "rahuljain3005@gmail.com");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}

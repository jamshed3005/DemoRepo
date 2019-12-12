package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBaseClass;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.loginPage;

public class HomePageTest extends TestBaseClass {
	loginPage loginpage;
	HomePage homepage;
	ContactPage contactpage;
	DealsPage dealpage;
	
	public HomePageTest() throws IOException
	{
		super();
	}
	
	//Test cases should be separated--independency should be there
	
	@BeforeMethod
	public void Setup() throws IOException
	{
		initialization();
		loginpage=new loginPage();
		homepage=loginpage.login(pr.getProperty("username"), pr.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		String title=homepage.verifyHomePageTitle();
		Assert.assertEquals(title, "Cogmento CRM", "HomePage Title not matched");
	}
	
	@Test(priority=2)
	public void verifyUserLableTest()
	
	{
		Assert.assertTrue(homepage.verifyUserLable(),"User is correctly available");
	}
	@Test(priority=3)
	public void contactlinkClickTest() throws IOException
	{
		contactpage=homepage.contactclick();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

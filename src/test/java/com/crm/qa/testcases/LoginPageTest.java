package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBaseClass;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.loginPage;

public class LoginPageTest extends TestBaseClass{

	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	loginPage loginpage;
	HomePage  hp;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		TestBaseClass.initialization();
		loginpage=new loginPage();
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest()
	{
		String title=loginpage.validateloginPage();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}	
	
	@Test(priority=2)
	public void loginTest() throws IOException
	{
		
		hp=loginpage.login(pr.getProperty("username"),pr.getProperty("password"));
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}

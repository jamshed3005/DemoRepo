package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBaseClass;

public class loginPage extends TestBaseClass {
	
	//Page Factory or object Repositories
	public loginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='https://ui.freecrm.com']")
	
	WebElement login;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//a[@text='Login']")
	WebElement loginbutton;
	
	@FindBy(xpath="//a[@text='Sign Up']")
	WebElement signup;
	
	@FindBy(xpath="//a[@title='Free CRM #1 cloud software for any business large or small']")
	WebElement title;
	
	public String validateloginPage()
	{
		return driver.getTitle();
	}
	
	public boolean validateCRMLogo()
	{
		return title.isDisplayed();
	}
		
	
	public HomePage login(String usm, String pass) throws IOException
	{
		login.click();
		TestBaseClass.timeout();
		username.sendKeys(usm);
		password.sendKeys(pass);
		password.sendKeys(Keys.ENTER);
		
		TestBaseClass.timeout();
		return new HomePage();
	}	

}

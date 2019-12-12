package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBaseClass;

public class HomePage extends TestBaseClass {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement username;
	
	@FindBy(linkText="Contacts")
	WebElement contact;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement deals;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasks;
	
	public boolean verifyUserLable()
	{
		return username.isDisplayed();
	}

	public String verifyHomePageTitle()
	{
		return driver.getTitle();
		
	}
	
	public ContactPage contactclick() throws IOException
	{
		contact.click();
		
		return new ContactPage();
	}
	public DealsPage dealclick() throws IOException
	{
		deals.click();
		return new DealsPage();
	}
	
	public void taskclick()
	{
		tasks.click();
	}
}

package com.crm.qa.util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBaseClass;

public class TestUtil extends TestBaseClass {
	
	public TestUtil() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public static long Page_load_timeout=20;
	public static long implicit_wait=10;
	
	public static void timeout()
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

}

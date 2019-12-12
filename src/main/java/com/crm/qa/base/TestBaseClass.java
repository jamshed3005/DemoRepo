package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.qa.util.TestUtil;

public class TestBaseClass {
	
	public static WebDriver driver;
	public static Properties pr;
	
	public TestBaseClass() throws IOException
	{
		pr=new Properties();
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		pr.load(fs);
		
	}
	public static void username()
	{
		System.out.println("jamshed khan");
	}
	

	
	public static void initialization()
	{
		String browser=pr.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jamshed Khan\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver=new ChromeDriver();
		
		}
		else if(browser=="IE")
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Jamshed Khan\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_timeout, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		
		driver.get(pr.getProperty("url"));
		
	}
	
	public static void timeout()
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
}

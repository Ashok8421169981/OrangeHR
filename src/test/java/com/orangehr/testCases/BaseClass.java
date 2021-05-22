package com.orangehr.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String BaseUrl = "https://orangehrm-demo-6x.orangehrmlive.com/auth/login";
	public String uname ="Admin";
	public String password = "admin123";
	public static WebDriver driver;

	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}

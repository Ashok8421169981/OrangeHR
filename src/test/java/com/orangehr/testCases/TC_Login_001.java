package com.orangehr.testCases;

import org.testng.annotations.Test;

import com.orangehr.pageObject.LoginPage;

public class TC_Login_001 extends BaseClass{
	
	@Test
	public void LoginTC()
	{
		driver.get(BaseUrl);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(uname);
		loginpage.enterPassword(password);
		loginpage.clickLoginButton();
	}

}

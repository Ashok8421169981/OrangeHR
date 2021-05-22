package com.orangehr.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver localdriver;
	
	public LoginPage(WebDriver remotedriver)
	{
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy(id="txtUsername")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	public void enterUserName (String uname)
	{
		txtUserName.clear();
		txtUserName.sendKeys(uname);
	}
	
	public void enterPassword(String password)
	{
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		btnLogin.click();
	}
	

}

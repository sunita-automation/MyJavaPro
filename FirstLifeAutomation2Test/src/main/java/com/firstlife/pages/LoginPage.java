package com.firstlife.pages;

import com.firstlife.utils.FirstLifeDriverHelper;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



import com.firstlife.utils.FirstLifePropertyReader;

public class LoginPage extends FirstLifeDriverHelper
{
	@FindBy(how=How.NAME, using="userLoginVO.user_id")
	private WebElement userName;
	
	@FindBy(how=How.NAME, using="screenpassword")
	private WebElement passWord;
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='userLoginVO.user_password']")
	private WebElement passWOrd;
	
	@FindBy(how=How.XPATH, using="//button[@id='loginButton']")
	private WebElement loginButton;

	public LoginPage(final WebDriver driver) 
	{
		super(driver);
	}
	
	public LoginPage enterUserName(String username)
	{
		waitForWebElementPresent(userName, getTimeOut());
		clear(userName, "We are clearing user name input box");
		enterValueInFieldInput(userName, username);
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public LoginPage enterPassword(String password)
	{
		waitForWebElementPresent(passWord, getTimeOut());
		clear(passWord, "We are clearing password input box");
		enterValueInFieldInput(passWord, password);
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public LoginPage enterPasswordAgent(String password)
	{
		waitForWebElementPresent(passWOrd, getTimeOut());
		clear(passWOrd, "We are clearing password input box");
		enterValueInFieldInput(passWOrd, password);
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public DashboardPage clickOnLoginButton()
	{
		waitForWebElementPresent(loginButton, getTimeOut());
		try
		{
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage login() throws Exception
	{
		String username = propertyReader.readApplicationFile(FirstLifePropertyReader.getDomain() + "_userName");
		String password = propertyReader.readApplicationFile(FirstLifePropertyReader.getDomain() + "_password");
		enterUserName(username);
		enterPassword(password);
		clickOnLoginButton();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage loginAgent() throws Exception
	{
		String username = propertyReader.readApplicationFile(FirstLifePropertyReader.getDomain() + "_userName");
		String password = propertyReader.readApplicationFile(FirstLifePropertyReader.getDomain() + "_password");
		enterUserName(username);
		enterPasswordAgent(password);
		clickOnLoginButton();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage loginWithDifferentUser(String username,String password)
	{
		enterUserName(username);
		enterPassword(password);
		clickOnLoginButton();
		return PageFactory.initElements(driver, DashboardPage.class);
	}

}

package com.firstlife.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;
import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class AddressChangePage extends FirstLifeDriverHelper
{

	@FindBy(how=How.XPATH, using="(//input[@ng-model='policyFilterVO.updatePartyChk'])[2]")
	private WebElement insuranceRadiBTn;
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='policyFilterVO.policyNo']")
	private WebElement policyNo;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='Utils_Search.button']")
	private WebElement searchBtn;
	
	@FindBy(how=How.XPATH, using="//label[text()='جاری ']")
	private WebElement status;
	
	
	
	
	public AddressChangePage(WebDriver webdriver) {
		super(webdriver);
		// TODO Auto-generated constructor stub
	}

	
	public AddressChangePage selectInsuranceradioBtn() throws Exception
	{
		waitForWebElementPresent(insuranceRadiBTn, getTimeOut());
		waitForElementToBeClickable(insuranceRadiBTn, getTimeOut());
		insuranceRadiBTn.click();
		_waitForJStoLoad();
		wait2sec();
		return PageFactory.initElements(driver, AddressChangePage.class);
		
	}
	
	
	public AddressChangePage providepolicyNo(String insuranceNo)
	{
		waitForWebElementPresent(policyNo, getTimeOut());
		waitForElementToBeClickable(policyNo, getTimeOut());
		clear(policyNo, "clear policy no field");
		enterValueInFieldInput(policyNo, insuranceNo);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AddressChangePage.class);
		
	}
	
	public AddressChangePage clickOnSearchBtn() throws Exception
	{
		waitForWebElementPresent(searchBtn, getTimeOut());
		waitForElementToBeClickable(searchBtn, getTimeOut());
		searchBtn.click();
		_waitForJStoLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, AddressChangePage.class);
		
	}
	
	 public AdressChnageTransationPage clickOnSearchTable() throws Exception
	 {
		 String xpath= "//label[text()='جاری ']";
		 waitForWebElementPresent(status, getTimeOut());
		 waitForElementToBeClickable(status, getTimeOut());
		 mouseDoubleClick(xpath, getTimeOut());
		 waitfor5sec();
		 return PageFactory.initElements(driver, AdressChnageTransationPage.class);
		 
	 }
	
	
}

package com.firstlife.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class PsNonFinancialSearchPage extends FirstLifeDriverHelper
{

	@FindBy(how=How.XPATH, using="(//input[@ng-model='policyFilterVO.updatePartyChk'])[2]")
	private WebElement insuranceRadiBTn;
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='policyFilterVO.policyNo']")
	private WebElement policyNo;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='Utils_Search.button']")
	private WebElement searchBtn;
	
	@FindBy(how=How.XPATH, using="//label[text()='جاری ']")
	private WebElement status;
	
	
	
	
	public PsNonFinancialSearchPage(WebDriver webdriver) {
		super(webdriver);
		// TODO Auto-generated constructor stub
	}

	
	public PsNonFinancialSearchPage selectInsuranceradioBtn() throws Exception
	{
		waitForWebElementPresent(insuranceRadiBTn, getTimeOut());
		waitForElementToBeClickable(insuranceRadiBTn, getTimeOut());
		insuranceRadiBTn.click();
		_waitForJStoLoad();
		wait2sec();
		return PageFactory.initElements(driver, PsNonFinancialSearchPage.class);
		
	}
	
	
	public PsNonFinancialSearchPage providepolicyNo(String insuranceNo)
	{
		waitForWebElementPresent(policyNo, getTimeOut());
		waitForElementToBeClickable(policyNo, getTimeOut());
		clear(policyNo, "clear policy no field");
		enterValueInFieldInput(policyNo, insuranceNo);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PsNonFinancialSearchPage.class);
		
	}
	
	public PsNonFinancialSearchPage clickOnSearchBtn() throws Exception
	{
		waitForWebElementPresent(searchBtn, getTimeOut());
		waitForElementToBeClickable(searchBtn, getTimeOut());
		searchBtn.click();
		_waitForJStoLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, PsNonFinancialSearchPage.class);
		
	}
	
	 public PsNonFinancialTransationpage clickOnSearchTable(String insuranceNo) throws Exception
	 {
		 _waitForPageLoad();
			//label[text()='1395010080000628 ']
				String s = "//label[text()='"+insuranceNo+" ']";
				waitForElementPresent(s, getTimeOut());
				waitForElementToBeClickable(driver.findElement(byLocator(s)), getTimeOut());
				Thread.sleep(2000);
				mouseClick(s, getTimeOut());
				_waitForJStoLoad();
				_waitForPageLoad();
		 return PageFactory.initElements(driver, PsNonFinancialTransationpage.class);
		 
	 }
	
	
}

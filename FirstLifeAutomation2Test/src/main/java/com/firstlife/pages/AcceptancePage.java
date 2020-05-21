package com.firstlife.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.firstlife.utils.FirstLifeDriverHelper;

public class AcceptancePage extends FirstLifeDriverHelper{

	@FindBy(how=How.XPATH, using="//label[text()='پذيرش			']")
	private WebElement reception;
	
	@FindBy(how=How.XPATH, using="//select[@name='proposalHeaderVO.proposal_Status_Code']")
	private WebElement offerStatus;
	
	@FindBy(how=How.XPATH, using="(//label[text()='نمايش محاسبات و مستندات'])[1]")
	private WebElement calculationTab;
	
	@FindBy(how=How.XPATH, using="//i[@class='icon-header-rating']")
	private WebElement compensationIcon;
	
	@FindBy(how=How.XPATH, using="//i[@class='icon-header-confirm']")
	private WebElement conformationIcon;
	
	
	
	
	
	
	
	
	
	
	public AcceptancePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public String captureproposalno()
	{
		//waitForWebElementPresent(element, timeout);
		waitForElementPresent("(//input[@name='proposalHeaderVO.proposal_No'])[1]", getTimeOut());
		
		WebElement proposalno=driver.findElement(By.xpath("(//input[@name='proposalHeaderVO.proposal_No'])[1]"));
		String s = driver.findElement(By.xpath("(//input[@name='proposalHeaderVO.proposal_No'])[1]")).getAttribute("value");
		String capturePropasalNo=proposalno.getText();
		System.out.println("Number is"+capturePropasalNo);
		System.out.println("number is "+s);
		return 	s;
		
	}

	public AcceptancePage clickOnReceptionTab()
	{

		waitForWebElementPresent(reception, getTimeOut());
		scrollToWebElement(reception);
		waitForElementToBeClickable(reception, getTimeOut());
		_clickUsingJavaScript(reception);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AcceptancePage.class);
		
	}
	
	public AcceptancePage selectOfferStatus(String status)
	{
		
    	
    	waitForWebElementPresent(offerStatus, getTimeOut());
    	_waitForJStoLoad();
    	selectDropDown(offerStatus, status, getTimeOut());
    	_waitForJStoLoad();
    	return PageFactory.initElements(driver, AcceptancePage.class);
    	
    	
	}
	
	public AcceptancePage clickOnCalculationTab() 
	{
		waitForWebElementPresent(calculationTab, getTimeOut());
		scrollToWebElement(calculationTab);
		waitForElementToBeClickable(calculationTab, getTimeOut());
		_clickUsingJavaScript(calculationTab);
		//_waitForPageLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AcceptancePage.class);
	}
	
	public AcceptancePage clickCompensationBtn() throws InterruptedException
	{
		waitForWebElementPresent(compensationIcon, getTimeOut());
		scrollToWebElement(compensationIcon);
		waitForElementToBeClickable(compensationIcon, getTimeOut());
		_clickUsingJavaScript(compensationIcon);
		_waitForPageLoad();
		waitfor5sec();
		//Thread.sleep(10000);
		return PageFactory.initElements(driver, AcceptancePage.class);
	}
	
	public AcceptancePage clickConformationBtn() throws InterruptedException
	{
		waitForWebElementPresent(conformationIcon, getTimeOut());
		scrollToWebElement(conformationIcon);
		waitForElementToBeClickable(conformationIcon, getTimeOut());
		waitfor5sec();
		_clickUsingJavaScript(conformationIcon);
		waitfor5sec();
		WebDriverWait wait=WebDriverWait(driver,10);
		String closeButton="//div/button[text()='بله']";
		driver.findElement(By.xpath(closeButton)).click();
		_waitForPageLoad();
		
		//Thread.sleep(10000);
		return PageFactory.initElements(driver, AcceptancePage.class);
	}

	private WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	/**
	 * 
	 * calculate the value
	 * @throws Exception 
	 */
	public AcceptancePage calculateTheValue() throws Exception
	{
		clickOnCalculationTab();
		clickCompensationBtn();
		return PageFactory.initElements(driver, AcceptancePage.class);
	}



	
}

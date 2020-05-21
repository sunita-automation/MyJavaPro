package com.firstlife.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class CreatNewProposalPage extends FirstLifeDriverHelper{
	
	@FindBy(how=How.XPATH, using="//input[@name='proposalFilterVO.product_Desc']/../span/button/i[@class='icon-login-down-arrow']")
	private WebElement productIcon;
	
	@FindBy(how=How.XPATH, using="//input[@name='proposalFilterVO.policy_Owner_Name']")
	private WebElement insurer;
	
	@FindBy(how=How.XPATH, using="//input[@name='proposalFilterVO.life_Assured_Name_1']")
	private WebElement maininsured;
	
	@FindBy(how=How.XPATH, using="//input[@name='proposalFilterVO.policy_Term']")
	private WebElement policyterm;
	
	@FindBy(how=How.XPATH, using="//input[@name='proposalFilterVO.premium_Term']")
	private WebElement PremiumTerm;
	
	@FindBy(how=How.XPATH, using="//label[text()='بعدي			']")
	private WebElement nextbtn;
	
	
	
	
	

	public CreatNewProposalPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public CreatNewProposalPage clickProductArrow()
	{
		waitForWebElementPresent(productIcon, getTimeOut());
		scrollToWebElement(productIcon);
		waitForElementToBeClickable(productIcon, getTimeOut());
		productIcon.click();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CreatNewProposalPage.class);
	}
		
	public CreatNewProposalPage enterProduct(String productCode) throws Exception
	{
		//(//label[text()='06'])[1]
		String xpath = "(//td/label[text()='"+productCode+"'])[1]";
		waitForElementPresent(xpath, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(xpath)), getTimeOut());
		Thread.sleep(2000);
		mouseClick(xpath, getTimeOut());
		_waitForJStoLoad();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		return PageFactory.initElements(driver, CreatNewProposalPage.class);
	}
	
	
	
	
	public CreatNewProposalPage enterInsurerName(String Insurer) throws Exception
	{
		/*
		//label[text()='tom jerry']
		//waitfor5sec();
		Thread.sleep(2000);
		String xpath1="//label[text()='"+Insurer+"']";
		waitForWebElementPresent(insurer, getTimeOut());
		clear(insurer, "We are clearing user name input box");
		enterValueInFieldInput(insurer, Insurer);
		_waitForJStoLoad();
		waitForElementPresent(xpath1, getTimeOut());
		Thread.sleep(1000);
		//driver.findElement(byLocator(xpath1)).click();
		
		_clickUsingJavaScript(driver.findElement(byLocator(xpath1)));
		//waitfor5sec();
		_waitForJStoLoad();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		*/
		
		waitForWebElementPresent(insurer, getTimeOut());
		mouseClickByWebElement(insurer);
		waitfor5sec();
		clear(insurer, Insurer);
		enterValueInFieldInput(insurer, Insurer);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		waitfor5sec();
		_waitForJStoLoad();
		
		
		
		
		
		return PageFactory.initElements(driver, CreatNewProposalPage.class);	
	}
	
	
	public CreatNewProposalPage enterMainInsured(String Maininsured) throws Exception
	{
		/*
		//waitfor5sec();
		String xpath1="//label[text()='"+Maininsured+"']";
		waitForWebElementPresent(maininsured, getTimeOut());
		clear(maininsured, "We are clearing user name input box");
		typeString(maininsured, Maininsured);
		_waitForJStoLoad();
		waitForElementPresent(xpath1, getTimeOut());
		//Thread.sleep(1000);
		driver.findElement(byLocator(xpath1)).click();
		//waitfor5sec();
		_waitForJStoLoad();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		*/
		
		
		
		waitForWebElementPresent(maininsured, getTimeOut());
		mouseClickByWebElement(maininsured);
		clear(maininsured, Maininsured);
		enterValueInFieldInput(maininsured, Maininsured);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		
		
		return PageFactory.initElements(driver, CreatNewProposalPage.class);	
	}
	
	
	
	public CreatNewProposalPage enterPolicyTerm(String Policyterm) throws Exception
	{
		waitForWebElementPresent(policyterm, getTimeOut());
		scrollToWebElement(policyterm);
		//waitfor5sec();
		waitfor5sec();
		//Thread.sleep(2000);
		enterValueInFieldInput(policyterm, Policyterm);
		
		//click anywhere to update preminumTerm
		String xpath="//label[text()='شعبه			']";
		waitForElementToBeClickable(driver.findElement(byLocator(xpath)), getTimeOut());
		mouseClick(xpath, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CreatNewProposalPage.class);
	}
	
	
	
	
	
	
	
	public ProposalTransactionPage clicknext() throws Exception
	{
		waitfor5sec();
		waitForWebElementPresent(nextbtn, getTimeOut());
		scrollToWebElement(nextbtn);
		waitForElementToBeClickable(nextbtn, getTimeOut());
		_clickUsingJavaScript(nextbtn);
		_waitForPageLoad();
		Thread.sleep(20000);
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	
	
	
	/**
	 * function for go to Proposal Transation Page
	 * @throws Exception 
	 * 
	 */
	public ProposalTransactionPage openProposalTrasationPage(String productCode,String Insurer,String Maininsured) throws Exception
	{
		clickProductArrow();
		enterProduct(productCode);
		enterInsurerName(Insurer);
		enterMainInsured(Maininsured);
		clicknext();
		//Thread.sleep(20000);
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	

}

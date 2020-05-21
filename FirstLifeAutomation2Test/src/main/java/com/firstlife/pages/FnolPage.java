package com.firstlife.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class FnolPage extends FirstLifeDriverHelper
{
	//XPATHS FOR CLAIMS CREATION
	
	

	@FindBy(how=How.XPATH,using="//div/input[@ng-model='flClaimFilterVO.lifeAssuredDesc']")
	private WebElement lifeAssuredId;
	
	@FindBy(how=How.XPATH,using="//div/input[@ng-model='flClaimFilterVO.claimTypeDesc']")
	private WebElement claimType;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='Utils_Search.button']")
	private WebElement searchBtn;
	
	//@FindBy(how=How.XPATH,using="//tr/td/label[text()='1398010080002260 ']")
	//private WebElement policynumber;
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='claimVo.claimNo'])[1]")
	private WebElement claimnumber;
	
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='claimVo.claimHeaderVO.persianDatenoticeDate']")
	private WebElement noticeDate;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='claimVo.claimHeaderVO.persianDatelossDate']")
	private WebElement lossDate;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='DocumentChecklist.label']")
	private WebElement documentCheckList;
	
	@FindBy(how=How.XPATH,using="(//select[@ng-model='data.recievedFlag'])[1]")
	private WebElement receivedoption1;
	
	@FindBy(how=How.XPATH,using="(//select[@ng-model='data.recievedFlag'])[2]")
	private WebElement receivedoption2;
	
	@FindBy(how=How.XPATH,using="(//select[@ng-model='data.recievedFlag'])[3]")
	private WebElement receivedoption3;
	
	@FindBy(how=How.XPATH,using="(//select[@ng-model='data.recievedFlag'])[4]")
	private WebElement receivedoption4;
	
	@FindBy(how=How.XPATH,using="(//select[@ng-model='data.recievedFlag'])[5]")
	private WebElement receivedoption5;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='claimVo.trust_Flag']")
	private WebElement checkbox;
	
	@FindBy(how=How.XPATH,using="//i[@class='icon-header-confirm']")
	private WebElement confirmBtn;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='PolicyDetails.label']")
	private WebElement policyDetailTab;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='Documents.label']")
	private WebElement documentLabelTab;
	
	
	//METHODS FOR CLAIMS
	public FnolPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public FnolPage provideLAName(String LAname) throws InterruptedException
	{
		
		waitForWebElementPresent(lifeAssuredId, getTimeOut());
		mouseClickByWebElement(lifeAssuredId);
		waitfor5sec();
		lifeAssuredId.sendKeys(LAname);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForPageLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, FnolPage.class);
	}
	
	public FnolPage provideClaimType(String Ctype) throws InterruptedException
	{
		waitfor5sec();
		waitForWebElementPresent(claimType, getTimeOut());
		mouseClickByWebElement(claimType);
		waitfor5sec();
		claimType.sendKeys(Ctype);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait2sec();
		_waitForPageLoad();
		_waitForJStoLoad();
		
		return PageFactory.initElements(driver, FnolPage.class);
	}
	
	public FnolPage clickOnSearch() throws InterruptedException
	{
		wait2sec();
		waitForWebElementPresent(searchBtn, getTimeOut());
		waitForElementToBeClickable(searchBtn, getTimeOut());
		searchBtn.click();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, FnolPage.class);
	}
	
	public FnolPage clickOnPolicyNum(String Pnum) throws InterruptedException
	{
		String s = "//label[text()='"+Pnum+" ']";
		waitForElementPresent(s, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(s)), getTimeOut());
		wait2sec();
		mouseClick(s, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, FnolPage.class);
	}
	
	public String getClaimNumber1() throws InterruptedException
	{
		_waitForPageLoad();
		waitfor5sec();
		waitForElementPresent("(//input[@ng-model='claimVo.claimNo'])[1]", getTimeOut());
		
		
		WebElement claimno=driver.findElement(By.xpath("(//input[@ng-model='claimVo.claimNo'])[1]"));
		String claimnUm=claimno.getText();
		System.out.println("Number is"+claimnUm);
		return claimnUm;
	}
	public String getClaimNumber2() throws InterruptedException
	{
		_waitForPageLoad();
		waitfor5sec();
		waitForElementPresent("(//input[@ng-model='claimVo.claimNo'])[1]", getTimeOut());
		String s = driver.findElement(By.xpath("(//input[@ng-model='claimVo.claimNo'])[1]")).getAttribute("value");
		System.out.println("number is "+s);
		return 	s;
		
	}
	
	public FnolPage provideLossDateAuto() throws InterruptedException
	{
		waitForWebElementPresent(noticeDate, getTimeOut());
		mouseClickByWebElement(noticeDate);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		waitForWebElementPresent(lossDate, getTimeOut());
		lossDate.click();
		robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    Thread.sleep(1000);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(10000);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, FnolPage.class);
	}
	
	public FnolPage provideLossDate(String LDate)
	{
		waitForWebElementPresent(lossDate, getTimeOut());
		mouseClickByWebElement(lossDate);
		clear(lossDate, LDate);
		enterValueInFieldInput(lossDate, LDate);
		return PageFactory.initElements(driver, FnolPage.class);
	}
	

	public FnolPage clickOnPolicyDetailTab() throws InterruptedException
	{
		waitForWebElementPresent(policyDetailTab, getTimeOut());
		waitForElementToBeClickable(policyDetailTab, getTimeOut());
		policyDetailTab.click();
		wait2sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, FnolPage.class);
	}
	
	
	public FnolPage clickOnDoucumentCheckListTab()
	{
		waitForWebElementPresent(documentCheckList, getTimeOut());
		waitForElementToBeClickable(documentCheckList, getTimeOut());
		documentCheckList.click();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, FnolPage.class);
	}
	
	public FnolPage selectReceivedOpt(String Ropt) throws InterruptedException
	{
		wait2sec();
		waitForWebElementPresent(receivedoption1,getTimeOut());
		mouseClickByWebElement(receivedoption1);
		selectDropDown(receivedoption1,Ropt , getTimeOut());
		_waitForPageLoad();
		wait2sec();
		waitForWebElementPresent(receivedoption2,getTimeOut());
		mouseClickByWebElement(receivedoption2);
		selectDropDown(receivedoption2,Ropt , getTimeOut());
		_waitForPageLoad();
		wait2sec();
		waitForWebElementPresent(receivedoption3,getTimeOut());
		mouseClickByWebElement(receivedoption3);
		selectDropDown(receivedoption3,Ropt , getTimeOut());
		_waitForPageLoad();
		wait2sec();
		waitForWebElementPresent(receivedoption4,getTimeOut());
		mouseClickByWebElement(receivedoption4);
		selectDropDown(receivedoption4,Ropt , getTimeOut());
		_waitForPageLoad();
		wait2sec();
		waitForWebElementPresent(receivedoption5,getTimeOut());
		mouseClickByWebElement(receivedoption5);
		selectDropDown(receivedoption5,Ropt , getTimeOut());
		_waitForPageLoad();
		wait2sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, FnolPage.class);
	}
	
	public FnolPage clickOnDoucumentCheckBox() throws InterruptedException
	{
		wait2sec();
		waitForWebElementPresent(checkbox, getTimeOut());
		waitForElementToBeClickable(checkbox, getTimeOut());
		checkbox.click();
		wait2sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, FnolPage.class);
	}
	
	public FnolPage clickOnDocumentLabelTab() throws InterruptedException
	{
		waitForWebElementPresent(documentLabelTab, getTimeOut());
		waitForElementToBeClickable(documentLabelTab, getTimeOut());
		documentLabelTab.click();
		wait2sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, FnolPage.class);
	}
	
	public FnolPage clickOnConfirm() throws InterruptedException
	{
		waitForWebElementPresent(confirmBtn, getTimeOut());
		waitForElementToBeClickable(confirmBtn, getTimeOut());
		confirmBtn.click();
		waitfor5sec();
		_waitForPageLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, FnolPage.class);
	}
	
	
	
}

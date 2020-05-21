package com.firstlife.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class CloseClaimPage extends FirstLifeDriverHelper
{
	//XPATHS FOR CLOSE CLAIM
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FICC_ClaimFeedback.label']")
	private WebElement claimfeedBackTab;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='claimVo.reasonDesc']")
	private WebElement reason;
	
	@FindBy(how=How.XPATH,using="//i[@class='icon-header-confirm']")
	private WebElement confirmBtn;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='FICC_Documents.label'])[1]")
	private WebElement documetTab;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='FICC_DocumentCheckList.label'])[1]")
	private WebElement docCheckListTab;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='claimVo.trust_Flag']")
	private WebElement checkbox;
	
	
	
	public CloseClaimPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//METHODS FOR CLOSE CLAIM
	
	
	public CloseClaimPage clickOnClaimfeedbackTab() throws InterruptedException
	{
		Thread.sleep(10000);
		waitForWebElementPresent(claimfeedBackTab, getTimeOut());
		waitForElementToBeClickable(claimfeedBackTab, getTimeOut());
		claimfeedBackTab.click();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, CloseClaimPage.class);
	}
	
	public CloseClaimPage clickOnDocchecKListTab() throws InterruptedException
	{
	    waitfor5sec();
		waitForWebElementPresent(docCheckListTab, getTimeOut());
		waitForElementToBeClickable(docCheckListTab, getTimeOut());
		docCheckListTab.click();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CloseClaimPage.class);
	}
	
	
	
	public CloseClaimPage clickOndocumetTab() throws InterruptedException
	{
		waitfor5sec();
		waitForWebElementPresent(documetTab, getTimeOut());
		waitForElementToBeClickable(documetTab, getTimeOut());
		documetTab.click();
		wait2sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CloseClaimPage.class);
	}
	

	public CloseClaimPage clickOnDoucumentCheckBox() throws InterruptedException
	{
		wait2sec();
		waitForWebElementPresent(checkbox, getTimeOut());
		waitForElementToBeClickable(checkbox, getTimeOut());
		checkbox.click();
		wait2sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CloseClaimPage.class);
	}
	
	public CloseClaimPage provideReason(String Reason) throws InterruptedException
	{
		waitForWebElementPresent(reason, getTimeOut());
		mouseClickByWebElement(reason);
		clear(reason, Reason);
		enterValueInFieldInput(reason, Reason);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		waitfor5sec();
		_waitForPageLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CloseClaimPage.class);
	}
	
	public CloseClaimPage clickOnConfirm() throws InterruptedException
	{
		waitForWebElementPresent(confirmBtn, getTimeOut());
		waitForElementToBeClickable(confirmBtn, getTimeOut());
		confirmBtn.click();
		waitfor5sec();
		_waitForPageLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CloseClaimPage.class);
	}
	
	
	
}

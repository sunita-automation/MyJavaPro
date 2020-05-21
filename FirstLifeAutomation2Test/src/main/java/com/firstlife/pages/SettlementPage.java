package com.firstlife.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class SettlementPage extends FirstLifeDriverHelper
{
	//XPATHS FOR SETTLEMENT PAGE
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='payee'])[1]")
	private WebElement payee;
	
	@FindBy(how=How.XPATH,using="//i[@class=' icon-transaction-search iconinline icons icon-join-button']")
	private WebElement searchBtn;
	
//	@FindBy(how=How.XPATH,using="//td/label[text()='IN506321 ']")
//	private WebElement clickparty;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='claimantPaymentHdrVO.ibanNumber']")
	private WebElement iBanNo;
	
	@FindBy(how=How.XPATH,using="(//i[@class=' icon-transaction-add iconinline'])[1]")
	private WebElement addIcon;
	
	@FindBy(how=How.XPATH,using="//select[@ng-model='claimVo.claimDecision']")
	private WebElement claimDecission;
	
	@FindBy(how=How.XPATH,using="//i[@class='icon-header-confirm']")
	private WebElement confirmBtn;
	
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='FICC_DocumentCheckList.label'])[1]")
	private WebElement docCheckListTab;
	
	@FindBy(how=How.XPATH,using="//select[@ng-model='claimVo.claimDecision']")
	private WebElement claimDes;
	
	@FindBy(how=How.XPATH,using="(//input[@id='nttdataLogo'])[2]")
	private WebElement nttLogo;
	
	@FindBy(how=How.XPATH,using="(//i[@class='icon-dashboard-my-profile'])[1]")
	private WebElement profile;
	
	@FindBy(how=How.XPATH,using="//i[@class='icon-dashboard-logout']")
	private WebElement logout;
	
	@FindBy(how=How.XPATH,using="(//label[text()='بانک'])[2]")
	private WebElement outside;
	
	@FindBy(how=How.XPATH,using="//select[@ng-model='claimVo.claimDecision']")
	private WebElement cDess;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FICC_ClaimFeedback.label']")
	private WebElement feedBackTab;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FICC_ClaimRecoveries.label']")
	private WebElement recoveries;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='FICC_Documents.label'])[1]")
	private WebElement documetTab;
	
	
	//METHODS FOR SETTLEMENT PAGE
	
	public SettlementPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public SettlementPage clickOnpayee() throws InterruptedException
	{
		Thread.sleep(10000);
		waitForWebElementPresent(payee, getTimeOut());
		waitForElementToBeClickable(payee, getTimeOut());
		payee.click();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	public SettlementPage clickOnSearch() throws InterruptedException
	{
		wait2sec();
		waitForWebElementPresent(searchBtn, getTimeOut());
		waitForElementToBeClickable(searchBtn, getTimeOut());
		searchBtn.click();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	public SettlementPage clickOnPartyNum(String Pnum) throws InterruptedException
	{
		String s = "//td/label[text()='"+Pnum+" ']";
		waitForElementPresent(s, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(s)), getTimeOut());
		Thread.sleep(2000);
		mouseClick(s, getTimeOut());
		wait2sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	public SettlementPage provideIbanNo(String IbanNo) throws InterruptedException
	{
		wait2sec();
		waitForWebElementPresent(iBanNo, getTimeOut());
		mouseClickByWebElement(iBanNo);
		clear(iBanNo, IbanNo);
		enterValueInFieldInput(iBanNo, IbanNo);
		outside.click();
		waitfor5sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	public SettlementPage clickOnDocchecKListTab() throws InterruptedException
	{
		Thread.sleep(10000);
		waitForWebElementPresent(docCheckListTab, getTimeOut());
		waitForElementToBeClickable(docCheckListTab, getTimeOut());
		docCheckListTab.click();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	
	
	public SettlementPage clickOndocumetTab() throws InterruptedException
	{
		waitfor5sec();
		waitForWebElementPresent(documetTab, getTimeOut());
		waitForElementToBeClickable(documetTab, getTimeOut());
		documetTab.click();
		wait2sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	public SettlementPage clickOnRecoveriesTab() throws InterruptedException
	{
		waitfor5sec();
		waitForWebElementPresent(recoveries, getTimeOut());
		waitForElementToBeClickable(recoveries, getTimeOut());
		recoveries.click();
		wait2sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	public SettlementPage clickOnfeedbackTab() throws InterruptedException
	{
		waitfor5sec();
		waitForWebElementPresent(feedBackTab, getTimeOut());
		waitForElementToBeClickable(feedBackTab, getTimeOut());
		feedBackTab.click();
		wait2sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	
	public SettlementPage clickOnAdd() throws InterruptedException
	{
		Thread.sleep(5000);
		waitForWebElementPresent(addIcon, getTimeOut());
		waitForElementToBeClickable(addIcon, getTimeOut());
		addIcon.click();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	public SettlementPage selectClaimDession(String CDes) throws InterruptedException
	{
		wait2sec();
		waitForWebElementPresent(claimDecission,getTimeOut());
		mouseClickByWebElement(claimDecission);
		wait2sec();
		selectDropDown(claimDecission,CDes , getTimeOut());
		_waitForPageLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	public SettlementPage clickOnConfirm() throws InterruptedException
	{
		waitForWebElementPresent(confirmBtn, getTimeOut());
		waitForElementToBeClickable(confirmBtn, getTimeOut());
		confirmBtn.click();
		waitfor5sec();
		_waitForPageLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	public SettlementPage clickOnNttLogo() throws InterruptedException
	{
		waitfor5sec();
		waitForWebElementPresent(nttLogo, getTimeOut());
		waitForElementToBeClickable(nttLogo, getTimeOut());
		nttLogo.click();
		waitfor5sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	public DashboardPage clickOnLogOut() throws InterruptedException
	{
		Thread.sleep(5000);
		_waitForPageLoad();
		waitForWebElementPresent(profile, getTimeOut());
		mouseOver(profile, getTimeOut());
		waitForWebElementPresent(logout, getTimeOut());
		logout.click();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	
	
	//after login fakharinejad
	
	public SettlementPage selectClaimDess(String CDess) throws InterruptedException
	{
		wait2sec();
		waitForWebElementPresent(cDess,getTimeOut());
		mouseClickByWebElement(cDess);
		wait2sec();
		selectDropDown(cDess,CDess , getTimeOut());
		_waitForPageLoad();
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	
	
}

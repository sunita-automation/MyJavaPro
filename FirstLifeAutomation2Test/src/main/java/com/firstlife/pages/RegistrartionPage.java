package com.firstlife.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class RegistrartionPage extends FirstLifeDriverHelper
{

	//XPATHS FOR REGISTRATION PAGE
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='claimFilterVO.claimNo']")
	private WebElement claimNo;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary btn-search button-size']")
	private WebElement searchBtn;
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='claimFilterVO.status'])[2]")
	private WebElement statuscl;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='BenefitDetails.Label'])[1]")
	private WebElement benefitDetailTab;
	
	@FindBy(how=How.XPATH,using="(//i[@class='icon-login-down-arrow'])[5]")
	private WebElement claimOptForCalc;
	
	@FindBy(how=How.XPATH,using="(//td/label[text()='Death'])[1]")
	private WebElement normaldeath;
	
	@FindBy(how=How.XPATH,using="(//button[@ficlabel='FICC_FL_Registration_CalculateElgibility.button'])[1]")
	private WebElement calulateBtn;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='FICC_DocumentCheckList.label'])[1]")
	private WebElement documentCheckListTab;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='claimVo.trust_Flag']")
	private WebElement chechkBox;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FICC_Confirm.button']")
	private WebElement confirmBtn;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='FICC_Payee.label'])[1]")
	private WebElement payeeLabel;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='FICC_ReserveDetails.label'])[1]")
	private WebElement reserveDetailTab;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='FICC_Recoveries.label'])[1]")
	private WebElement recoveriesTab;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='FICC_Documents.label'])[1]")
	private WebElement documentsTab;
	
	
	
	//METHODS FOR REGISTRATION PAGE
	
	public RegistrartionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public RegistrartionPage provideClaimNo(String CNum) throws InterruptedException
	{
		wait2sec();
		waitForWebElementPresent(claimNo, getTimeOut());
		mouseClickByWebElement(claimNo);
		clear(claimNo, CNum);
		claimNo.sendKeys(CNum);
		wait2sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	public RegistrartionPage clickOnSearch() throws InterruptedException
	{
		_waitForPageLoad();
		waitForWebElementPresent(searchBtn, getTimeOut());
		waitForElementToBeClickable(searchBtn, getTimeOut());
		searchBtn.click();
		wait2sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	public RegistrartionPage clickOnStatus() throws InterruptedException
	{
		_waitForPageLoad();
		waitForWebElementPresent(statuscl, getTimeOut());
		waitForElementToBeClickable(statuscl, getTimeOut());
		statuscl.click();
		wait2sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	public RegistrartionPage clickOnCliamNo(String CNum) throws InterruptedException
	{
		_waitForPageLoad();
		String s = "//td/label[text()='"+CNum+" ']";
		waitForElementPresent(s, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(s)), getTimeOut());
		Thread.sleep(2000);
		mouseClick(s, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	public RegistrartionPage clickOnBenTab() throws InterruptedException
	{
		Thread.sleep(10000);
		_waitForPageLoad();
		waitForWebElementPresent(benefitDetailTab, getTimeOut());
		waitForElementToBeClickable(benefitDetailTab, getTimeOut());
		benefitDetailTab.click();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	public RegistrartionPage selectclaimtype(String claimopt) throws InterruptedException
	{
		waitForWebElementPresent(claimOptForCalc, getTimeOut());
		scrollToWebElement(claimOptForCalc);
		waitForElementToBeClickable(claimOptForCalc, getTimeOut());
		claimOptForCalc.click();
		_waitForPageLoad();
		String xpath = "(//td/label[text()='"+claimopt+"'])[1]";
		waitForElementPresent(xpath, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(xpath)), getTimeOut());
		wait2sec();
		mouseClick(xpath, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	public RegistrartionPage clickCalcEligibility() throws InterruptedException
	{
		waitForWebElementPresent(calulateBtn, getTimeOut());
		waitForElementToBeClickable(calulateBtn, getTimeOut());
		calulateBtn.click();
		waitfor5sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	public RegistrartionPage clickOnPayeeTab() throws InterruptedException
	{
		waitForWebElementPresent(payeeLabel, getTimeOut());
		waitForElementToBeClickable(payeeLabel, getTimeOut());
		payeeLabel.click();
		wait2sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	public RegistrartionPage clickOnReserveDetailTab() throws InterruptedException
	{
		waitForWebElementPresent(reserveDetailTab, getTimeOut());
		waitForElementToBeClickable(reserveDetailTab, getTimeOut());
		reserveDetailTab.click();
		wait2sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	public RegistrartionPage clickOnRecoveriesTab() throws InterruptedException
	{
		waitForWebElementPresent(recoveriesTab, getTimeOut());
		waitForElementToBeClickable(recoveriesTab, getTimeOut());
		recoveriesTab.click();
		wait2sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	public RegistrartionPage clickOnDocListTab()
	{
		waitForWebElementPresent(documentCheckListTab, getTimeOut());
		waitForElementToBeClickable(documentCheckListTab, getTimeOut());
		documentCheckListTab.click();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	public RegistrartionPage clickOnCheckBox() throws InterruptedException
	{
		waitForWebElementPresent(chechkBox, getTimeOut());
		waitForElementToBeClickable(chechkBox, getTimeOut());
		chechkBox.click();
		wait2sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	public RegistrartionPage clickOnDocumentsTab() throws InterruptedException
	{
		waitForWebElementPresent(documentsTab, getTimeOut());
		waitForElementToBeClickable(documentsTab, getTimeOut());
		documentsTab.click();
		wait2sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	public RegistrartionPage clickOnConfirm() throws InterruptedException
	{
		waitForWebElementPresent(confirmBtn, getTimeOut());
		waitForElementToBeClickable(confirmBtn, getTimeOut());
		confirmBtn.click();
		waitfor5sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	
	
}

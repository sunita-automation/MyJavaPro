package com.firstlife.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class AdressChnageTransationPage extends FirstLifeDriverHelper {

	
	@FindBy(how=How.XPATH, using="(//select[@name='policyHeaderVO.role_Flag'])[1]")
	private WebElement personsRole;
	
	@FindBy(how=How.XPATH, using="(//select[@name='policyHeaderVO.role_Flag'])[3]")
	private WebElement personsRoleRopA;
	@FindBy(how=How.XPATH, using="(//select[@name='policyHeaderVO.role_Flag'])[3]")
	private WebElement personsRoleRopd;
	
	@FindBy(how=How.XPATH, using="//select[@name='policyHeaderVO.address_Type']")
	private WebElement howToSend;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FLPS_AddressChangeMovement.title']")
	private WebElement changeOfAddressTab;
	
	@FindBy(how=How.XPATH, using="//i[@class=' icon-transaction-edit iconblock']")
	private WebElement editBtn;
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='tempData.zip_Code']")
	private WebElement zipCode;
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='tempData.email_Id']")
	private WebElement email;
	
	@FindBy(how=How.XPATH, using="(//button[@class='btn btn-primary'])[2]")
	private WebElement saveBtn;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FLPS_policySelectedforchange.label']")
	private WebElement policyToChangetab;
	
	@FindBy(how=How.XPATH, using="(//input[@name='data.updateForMovtFlag'])[2]")
	private WebElement updateCheckBox;
	
	@FindBy(how=How.XPATH, using="(//label[@ficlabel='FLUW_Doc_Upload.label'])[1]")
	private WebElement documentTab;
	

	@FindBy(how=How.XPATH, using="//label[@ficlabel='FLPS_NonMedicalRequirements.label']")
	private WebElement nonMediacalDocumentTab;
	
	@FindBy(how=How.XPATH, using="//input[@type='file']")
	private WebElement chosefile1;
	
	@FindBy(how=How.XPATH, using="//input[@id='uploadBtn1']")
	private WebElement chosefile2;
	
	@FindBy(how=How.XPATH, using="//input[@id='uploadBtn2']")
	private WebElement chosefile3;
	
	@FindBy(how=How.XPATH, using="//i[@class='icon-header-confirm']")
	private WebElement confirmBtn;
	
	@FindBy(how=How.XPATH, using="(//div[@class='col-md-7'])[1]")
	private WebElement firststTab;
	
	@FindBy(how=How.XPATH, using="//button[@ficlabel='FLUW_Refresh.button']")
	private WebElement retrieveBtn;
	
	public AdressChnageTransationPage(WebDriver webdriver) {
		super(webdriver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public AdressChnageTransationPage selectPersonsRole(String Role)
	{
		waitForWebElementPresent(personsRole, getTimeOut());
    	_waitForJStoLoad();
    	selectDropDown(personsRole, Role, getTimeOut());
    	_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	public AdressChnageTransationPage selectPersonsRoleForRopA(String Role)
	{
		waitForWebElementPresent(personsRoleRopA, getTimeOut());
    	_waitForJStoLoad();
    	selectDropDown(personsRoleRopA, Role, getTimeOut());
    	_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	public AdressChnageTransationPage selectPersonsRoleRopd(String Role)
	{
		waitForWebElementPresent(personsRoleRopd, getTimeOut());
    	_waitForJStoLoad();
    	selectDropDown(personsRoleRopd, Role, getTimeOut());
    	_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	
	
	public AdressChnageTransationPage selectHowToSend(String Address)
	{
		waitForWebElementPresent(howToSend, getTimeOut());
    	_waitForJStoLoad();
    	selectDropDown(howToSend, Address, getTimeOut());
    	_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	public AdressChnageTransationPage clickOnChangeOFAddressTab()
	{
		waitForWebElementPresent(changeOfAddressTab, getTimeOut());
		scrollToWebElement(changeOfAddressTab);
		waitForElementToBeClickable(changeOfAddressTab, getTimeOut());
		_clickUsingJavaScript(changeOfAddressTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	public AdressChnageTransationPage clickOnEditBtn()
	{
		waitForWebElementPresent(editBtn, getTimeOut());
		scrollToWebElement(editBtn);
		waitForElementToBeClickable(editBtn, getTimeOut());
		_clickUsingJavaScript(editBtn);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	
	public AddressChangePage editZipCode(String code)
	{
		waitForWebElementPresent(zipCode, getTimeOut());
		waitForElementToBeClickable(zipCode, getTimeOut());
		clear(zipCode, "clear zip code");
		enterValueInFieldInput(zipCode, code);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AddressChangePage.class);
		
	}
	
	
	
	public AddressChangePage editemaifield(String Email)
	{
		waitForWebElementPresent(email, getTimeOut());
		waitForElementToBeClickable(email, getTimeOut());
		clear(email, "clear email field");
		enterValueInFieldInput(email, Email);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AddressChangePage.class);
		
	}
	
	public AdressChnageTransationPage clickOnSaveBTn()
	{
		waitForWebElementPresent(saveBtn, getTimeOut());
		scrollToWebElement(saveBtn);
		waitForElementToBeClickable(saveBtn, getTimeOut());
		_clickUsingJavaScript(saveBtn);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	
	public AdressChnageTransationPage clickOnPolicyToChangeTab()
	{
		waitForWebElementPresent(policyToChangetab, getTimeOut());
		scrollToWebElement(policyToChangetab);
		waitForElementToBeClickable(policyToChangetab, getTimeOut());
		_clickUsingJavaScript(policyToChangetab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	
	public AdressChnageTransationPage clickOnUpdateCheckBox()
	{
		waitForWebElementPresent(updateCheckBox, getTimeOut());
		scrollToWebElement(updateCheckBox);
		waitForElementToBeClickable(updateCheckBox, getTimeOut());
		_clickUsingJavaScript(updateCheckBox);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	
	public AdressChnageTransationPage clickOnDocumentTab()
	{
		waitForWebElementPresent(documentTab, getTimeOut());
		scrollToWebElement(documentTab);
		waitForElementToBeClickable(documentTab, getTimeOut());
		_clickUsingJavaScript(documentTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	public AdressChnageTransationPage clickOnNonMedicalDocumentTab()
	{
		waitForWebElementPresent(nonMediacalDocumentTab, getTimeOut());
		scrollToWebElement(nonMediacalDocumentTab);
		waitForElementToBeClickable(nonMediacalDocumentTab, getTimeOut());
		_clickUsingJavaScript(nonMediacalDocumentTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	public AdressChnageTransationPage clickOnLoadingFile1() throws Exception
	{
		
		waitfor5sec();
		Actions builder= new Actions(driver);
		builder.moveToElement(chosefile1).click(chosefile1);
		builder.perform();
		_waitForPageLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	public AdressChnageTransationPage clickOnLoadingFile2() throws Exception
	{
		
		waitfor5sec();
		Actions builder= new Actions(driver);
		builder.moveToElement(chosefile2).click(chosefile2);
		builder.perform();
		_waitForPageLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	
	public AdressChnageTransationPage clickOnLoadingFile3() throws Exception
	{
		
		waitfor5sec();
		Actions builder= new Actions(driver);
		builder.moveToElement(chosefile3).click(chosefile3);
		builder.perform();
		_waitForPageLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	
	
	public AdressChnageTransationPage clickOnFirstTab()
	{
		waitForWebElementPresent(firststTab, getTimeOut());
		scrollToWebElement(firststTab);
		waitForElementToBeClickable(firststTab, getTimeOut());
		_clickUsingJavaScript(firststTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	
	public AdressChnageTransationPage clickOnRetrieveBtn() throws Exception
	{
		waitForWebElementPresent(retrieveBtn, getTimeOut());
		scrollToWebElement(retrieveBtn);
		waitForElementToBeClickable(retrieveBtn, getTimeOut());
		_clickUsingJavaScript(retrieveBtn);
		_waitForJStoLoad();
		wait2sec();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	
	

	public AdressChnageTransationPage clickOnconfirmBtn()
	{
		waitForWebElementPresent(confirmBtn, getTimeOut());
		scrollToWebElement(confirmBtn);
		waitForElementToBeClickable(confirmBtn, getTimeOut());
		_clickUsingJavaScript(confirmBtn);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AdressChnageTransationPage.class);
	}
	

}

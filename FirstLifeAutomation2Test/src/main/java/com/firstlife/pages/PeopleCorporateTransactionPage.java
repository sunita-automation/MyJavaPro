package com.firstlife.pages;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class PeopleCorporateTransactionPage extends FirstLifeDriverHelper
{

							//XPATHS
	@FindBy(how=How.XPATH,using="//button[@ficlabel='PARTY_GenPartyID.label ']")
	private WebElement createCorp;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='corporateTO.name.fullName']")
	private WebElement fullName;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='corporateTO.registrationNumber']")
	private WebElement registrationNum;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='corporateTO.externalIDs[0].id']")
	private WebElement nationalId;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='corporateTO.companyUniqueCode']")
	private WebElement ecoCode;
	
	@FindBy(how=How.XPATH,using="//i[@class='icon-transaction-arrow-next']")
	private WebElement nextBtn;
	
	@FindBy(how=How.XPATH,using="//select[@ng-model='addresspurpose']")
	private WebElement addressPrpse;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.countryDesc']")
	private WebElement countryCode;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.stateDesc']")
	private WebElement stateCode;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.cityDesc']")
	private WebElement cityCode;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.line1']")
	private WebElement street;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.zipNumber']")
	private WebElement zipCode;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.phnPhone']")
	private WebElement phnno1;

	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.phnCountry']")
	private WebElement phnno2;
	
	@FindBy(how=How.XPATH,using="//button[@ficlabel='PARTY_Save.label']")
	private WebElement saveBtn;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FICUTILS.otheractions.label']")
	private WebElement othrActn;
	
	@FindBy(how=How.XPATH,using="//i[@class='btn-lg icon-header-confirm']")
	private WebElement confirmBtn;
	
	
	public PeopleCorporateTransactionPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
							//METHODS
	
	public PeopleCorporateTransactionPage createCorprtn() throws Exception 
	{
		Thread.sleep(10000);
		waitForWebElementPresent(createCorp, getTimeOut());
		mouseClickByWebElement(createCorp);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage provideName(String FlName) throws Exception
	{
		waitfor5sec();
		waitForWebElementPresent(fullName, getTimeOut());
		mouseClickByWebElement(fullName);
		clear(fullName, FlName);
		enterValueInFieldInput(fullName, FlName);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage provideRegNo(String RegNo)
	{
		waitForWebElementPresent(registrationNum, getTimeOut());
		mouseClickByWebElement(registrationNum);
		clear(registrationNum, RegNo);
		enterValueInFieldInput(registrationNum, RegNo);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage provideNationalId(String NatId)
	{
		waitForWebElementPresent(nationalId, getTimeOut());
		mouseClickByWebElement(nationalId);
		clear(nationalId, NatId);
		enterValueInFieldInput(nationalId, NatId);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage provideEconmicCode(String EcoCode) throws Exception
	{
		waitForWebElementPresent(ecoCode, getTimeOut());
		mouseClickByWebElement(ecoCode);
		waitfor5sec();
		clear(ecoCode, EcoCode);
		enterValueInFieldInput(ecoCode, EcoCode);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage clickOnNxtBtn()
	{
		waitForWebElementPresent(nextBtn, getTimeOut());
		mouseClickByWebElement(nextBtn);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage selectaddresstype(String AddType)
	{
		waitForWebElementPresent(addressPrpse,getTimeOut());
		mouseClickByWebElement(addressPrpse);
		selectDropDown(addressPrpse,AddType , getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage provideCountry(String CountryName) throws Exception
	{
		waitForWebElementPresent(countryCode, getTimeOut());
		mouseClickByWebElement(countryCode);
		clear(countryCode, CountryName);
		enterValueInFieldInput(countryCode, CountryName);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage provideState(String StateName) throws Exception
	{
		waitForWebElementPresent(stateCode, getTimeOut());
		mouseClickByWebElement(stateCode);
		clear(stateCode, StateName);
		enterValueInFieldInput(stateCode, StateName);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage provideCity(String CityName) throws Exception
	{
		waitForWebElementPresent(cityCode, getTimeOut());
		mouseClickByWebElement(cityCode);
		clear(cityCode, CityName);
		enterValueInFieldInput(cityCode, CityName);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage provideStreet(String StreetName)
	{
		waitForWebElementPresent(street, getTimeOut());
		mouseClickByWebElement(street);
		clear(street, StreetName);
		enterValueInFieldInput(street, StreetName);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage provideZIP(String ZIpCode)
	{
		waitForWebElementPresent(zipCode, getTimeOut());
		mouseClickByWebElement(zipCode);
		clear(zipCode, ZIpCode);
		enterValueInFieldInput(zipCode, ZIpCode);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage providePhnNO1(String PhnNo1)
	{
		waitForWebElementPresent(phnno1, getTimeOut());
		mouseClickByWebElement(phnno1);
		clear(phnno1, PhnNo1);
		enterValueInFieldInput(phnno1, PhnNo1);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage providePhnNo2(String PhnNo2)
	{
		waitForWebElementPresent(phnno2, getTimeOut());
		mouseClickByWebElement(phnno2);
		clear(phnno2, PhnNo2);
		enterValueInFieldInput(phnno2, PhnNo2);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage clickOnSaveBtn()
	{
		waitForWebElementPresent(saveBtn, getTimeOut());
		mouseClickByWebElement(saveBtn);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	public PeopleCorporateTransactionPage clickOnRecord()
	{
		mouseOver(othrActn, getTimeOut());
		waitForElementToBeClickable(confirmBtn,getTimeOut());
		mouseClickByWebElement(confirmBtn);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	
	
	
	
	

}

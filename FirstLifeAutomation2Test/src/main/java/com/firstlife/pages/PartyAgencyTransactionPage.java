package com.firstlife.pages;

import com.firstlife.utils.FirstLifeDriverHelper;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PartyAgencyTransactionPage extends FirstLifeDriverHelper
{
	
							            //XPATHS

	@FindBy(how=How.XPATH,using="(//input[@ng-model='manualseries'])[2]")
	private WebElement automatic;
	
	@FindBy(how=How.XPATH,using="//button[@ficlabel='PARTY_GeneratePartyID.label ']")
	private WebElement createIdBtn;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='corporateTO.name.fullName']")
	private WebElement fullName;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='corporateTO.registrationNumber']")
	private WebElement registrationNo;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='corporateTO.companyUniqueCode']")
	private WebElement companyUCode;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='corporateTO.persianDateregistrationDate']")
	private WebElement startOfCopDate;
	
	@FindBy(how=How.XPATH,using="//i[@class='icon-transaction-arrow-next']")
	private WebElement clickaddress;
	
	@FindBy(how=How.XPATH,using="//select[@ng-model='addresspurpose']")
	private WebElement addressPurpose;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.zipNumber']")
	private WebElement zipNo;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.line1']")
	private WebElement addl1;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.line2']")
	private WebElement addl2;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.line3']")
	private WebElement addl3;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.cityDesc']")
	private WebElement city;

	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.stateDesc']")
	private WebElement province;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.countryDesc']")
	private WebElement country;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.area']")
	private WebElement phn1;
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='tempData.phone'])[1]")
	private WebElement phn2;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='corporateTO.roleMap.AO.licenseNumber']")
	private WebElement repCode;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='corporateTO.roleMap.AO.persianDatecontractExpiryDate']")
	private WebElement dDate;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='PARTY_AddressDetails.label     ']")
	private WebElement addressDetailTab;
	
	@FindBy(how=How.XPATH,using="(//button[@ficlabel='PARTY_Save.label '])[1]")
	private WebElement saveBtn;

	@FindBy(how=How.XPATH,using="//i[@class='icon-header-other-actions other-action-align']")
	private WebElement otherAction;
	
	@FindBy(how=How.XPATH,using="//i[@class='btn-lg icon-header-confirm']")
	private WebElement record;
	
	
	
	public PartyAgencyTransactionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
										//METHODS		
	
	public PartyAgencyTransactionPage chooseAutomatic() 
	{
		waitForWebElementPresent(automatic, getTimeOut());
		mouseClickByWebElement(automatic);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage clickOnCreateId() throws Exception
	{
		waitForWebElementPresent(createIdBtn, getTimeOut());
		mouseClickByWebElement(createIdBtn);
		waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideFullName(String FName)
	{
		waitForWebElementPresent(fullName, getTimeOut());
		mouseClickByWebElement(fullName);
		clear(fullName, FName);
		enterValueInFieldInput(fullName, FName);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideRegNo(String RegNo)
	{
		waitForWebElementPresent(registrationNo, getTimeOut());
		mouseClickByWebElement(registrationNo);
		clear(registrationNo, RegNo);
		enterValueInFieldInput(registrationNo, RegNo);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideComUnqCode(String CUCOde)
	{
		waitForWebElementPresent(companyUCode, getTimeOut());
		mouseClickByWebElement(companyUCode);
		clear(companyUCode, CUCOde);
		enterValueInFieldInput(companyUCode, CUCOde);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideStartOfCopDate(String SOCDate)
	{
		waitForWebElementPresent(startOfCopDate, getTimeOut());
		mouseClickByWebElement(startOfCopDate);
		clear(startOfCopDate, SOCDate);
		enterValueInFieldInput(startOfCopDate, SOCDate);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage clickOnAdderss() 
	{
		waitForWebElementPresent(clickaddress, getTimeOut());
		mouseClickByWebElement(clickaddress);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage selectaddresstype(String AddType)
	{
		waitForWebElementPresent(addressPurpose,getTimeOut());
		mouseClickByWebElement(addressPurpose);
		selectDropDown(addressPurpose,AddType , getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideZIP(String ZIPCode)
	{
		waitForWebElementPresent(zipNo, getTimeOut());
		mouseClickByWebElement(zipNo);
		clear(zipNo, ZIPCode);
		enterValueInFieldInput(zipNo, ZIPCode);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideAddress1(String AddL1)
	{
		waitForWebElementPresent(addl1, getTimeOut());
		mouseClickByWebElement(addl1);
		clear(addl1, AddL1);
		enterValueInFieldInput(addl1, AddL1);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideAddress2(String AddL2)
	{
		waitForWebElementPresent(addl2, getTimeOut());
		mouseClickByWebElement(addl2);
		clear(addl2, AddL2);
		enterValueInFieldInput(addl2, AddL2);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideAddress3(String AddL3)
	{
		waitForWebElementPresent(addl3, getTimeOut());
		mouseClickByWebElement(addl3);
		clear(addl3, AddL3);
		enterValueInFieldInput(addl3, AddL3);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideCity(String City) throws Exception
	{
		waitForWebElementPresent(city, getTimeOut());
		mouseClickByWebElement(city);
		clear(city, City);
		waitfor5sec();
		enterValueInFieldInput(city, City);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideProvince(String Prvnc) throws Exception
	{
		waitForWebElementPresent(province, getTimeOut());
		mouseClickByWebElement(province);
		clear(province, Prvnc);
		enterValueInFieldInput(province, Prvnc);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideCountry(String Country) throws Exception
	{
		waitForWebElementPresent(country, getTimeOut());
		mouseClickByWebElement(country);
		clear(country, Country);
		enterValueInFieldInput(country, Country);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage providePhnNo1(String PhNo1) 
	{
		waitForWebElementPresent(phn1, getTimeOut());
		mouseClickByWebElement(phn1);
		clear(phn1, PhNo1);
		enterValueInFieldInput(phn1, PhNo1);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage providePhnNo2(String PhNo2) 
	{
		waitForWebElementPresent(phn2, getTimeOut());
		mouseClickByWebElement(phn2);
		clear(phn2, PhNo2);
		enterValueInFieldInput(phn2, PhNo2);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideRepCode(String RepCode) 
	{
		waitForWebElementPresent(repCode, getTimeOut());
		mouseClickByWebElement(repCode);
		clear(repCode, RepCode);
		enterValueInFieldInput(repCode, RepCode);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage provideDDate(String DDAte) 
	{
		waitForWebElementPresent(dDate, getTimeOut());
		mouseClickByWebElement(dDate);
		clear(dDate, DDAte);
		enterValueInFieldInput(dDate, DDAte);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage clickOnAdderssDetailTab() 
	{
		waitForWebElementPresent(addressDetailTab, getTimeOut());
		mouseClickByWebElement(addressDetailTab);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage clickOnSAve() 
	{
		waitForWebElementPresent(saveBtn, getTimeOut());
		mouseClickByWebElement(saveBtn);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	public PartyAgencyTransactionPage clickRecord() 
	{
		mouseOver(otherAction, getTimeOut());
		waitForElementToBeClickable(record, getTimeOut());
		mouseClickByWebElement(record);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
}

package com.firstlife.pages;

import com.firstlife.utils.FirstLifeDriverHelper;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PartyAgentTransactionPage extends FirstLifeDriverHelper 
{

								//XPATHS
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='manualseries'])[2]")
	private WebElement automatic;
	
	@FindBy(how=How.XPATH,using="//button[@ficlabel='PARTY_GenPartyID.label ']")
	private WebElement createPersonIdCode;
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='individualTO.sex'])[1]")
	private WebElement male;
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='individualTO.sex'])[2]")
	private WebElement female;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='individualTO.name.firstName']")
	private WebElement name;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='individualTO.name.lastName']")
	private WebElement surName;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='individualTO.freeText4']")
	private WebElement fatherName;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='individualTO.persianDateDOB']")
	private WebElement dob;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='individualTO.externalIDs[2].id']")
	private WebElement nationalCode;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='PARTY_AddressDetails.label'])[1]")
	private WebElement addressDetailTab;
	
	@FindBy(how=How.XPATH,using="//select[@ng-model='addresspurpose']")
	private WebElement typeOfAddress;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.zipNumber']")
	private WebElement zipCode;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.line1']")
	private WebElement add1;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.line2']")
	private WebElement add2;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.line3']")
	private WebElement add3;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.cityDesc']")
	private WebElement city;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.stateDesc']")
	private WebElement province;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.countryDesc']")
	private WebElement country;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.phnCountry']")
	private WebElement phn1;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='tempData.phone']")
	private WebElement phn2;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='PARTY_AgentDetails.label'])[1]")
	private WebElement agentdetailtab;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='individualTO.roleMap.AG.licenseNumber']")
	private WebElement representativeCode;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='individualTO.roleMap.AG.persianDatecontractExpiryDate']")
	private WebElement deadlinePaymentDate;
	
	@FindBy(how=How.XPATH,using="(//button[@ficlabel='PARTY_Save.label '])[1]")
	private WebElement saveBtn;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FICUTILS.otheractions.label']")
	private WebElement otherAction;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='PARTY_Submit.label ']")
	private WebElement record;

	
	public PartyAgentTransactionPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
								//METHODS
	
	public PartyAgentTransactionPage chooseAutomatic() throws Exception 
	{
		waitForWebElementPresent(automatic, getTimeOut());
		mouseClickByWebElement(automatic);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	

	public PartyAgentTransactionPage clickOnCreateId()
	{
		waitForWebElementPresent(createPersonIdCode, getTimeOut());
		mouseClickByWebElement(createPersonIdCode);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage chooseGender(String Gender) throws Exception
	{
		if(Gender =="Male")
		{
			waitfor5sec();
			waitForWebElementPresent(male, getTimeOut());
			mouseClickByWebElement(male);
			_waitForPageLoad();
		}
		else
		{
			waitfor5sec();
			waitForWebElementPresent(female, getTimeOut());
			mouseClickByWebElement(female);
			_waitForPageLoad();
		}
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage provideName(String Name)
	{
		waitForWebElementPresent(name, getTimeOut());
		mouseClickByWebElement(name);
		clear(name, Name);
		enterValueInFieldInput(name, Name);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage provideSurName(String SName)
	{
		waitForWebElementPresent(surName, getTimeOut());
		mouseClickByWebElement(surName);
		clear(surName, SName);
		enterValueInFieldInput(surName, SName);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage providefatherName(String FatName)
	{
		waitForWebElementPresent(fatherName, getTimeOut());
		mouseClickByWebElement(fatherName);
		clear(fatherName, FatName);
		enterValueInFieldInput(fatherName, FatName);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	

	public PartyAgentTransactionPage provideDOB(String DOB)
	{
		waitForWebElementPresent(dob, getTimeOut());
		mouseClickByWebElement(dob);
		clear(dob, DOB);
		enterValueInFieldInput(dob, DOB);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	

	public PartyAgentTransactionPage provideSSn(String Ncode) throws Exception
	{
		waitfor5sec();
		waitForWebElementPresent(nationalCode, getTimeOut());
		mouseClickByWebElement(nationalCode);
		waitfor5sec();
		clear(nationalCode, Ncode);
		enterValueInFieldInput(nationalCode, Ncode);
		waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage clickOnAddressDetailTab()
	{
		waitForWebElementPresent(addressDetailTab, getTimeOut());
		mouseClickByWebElement(addressDetailTab);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage selectaddresstype(String AddType)
	{
		waitForWebElementPresent(typeOfAddress,getTimeOut());
		mouseClickByWebElement(typeOfAddress);
		selectDropDown(typeOfAddress,AddType , getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	

	public PartyAgentTransactionPage provideZIP(String ZIP)
	{
		waitForWebElementPresent(zipCode, getTimeOut());
		mouseClickByWebElement(zipCode);
		clear(zipCode, ZIP);
		enterValueInFieldInput(zipCode, ZIP);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage provideADDress1(String ADD1)
	{
		waitForWebElementPresent(add1, getTimeOut());
		mouseClickByWebElement(add1);
		clear(add1, ADD1);
		enterValueInFieldInput(add1, ADD1);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage provideADDress2(String ADD2)
	{
		waitForWebElementPresent(add2, getTimeOut());
		mouseClickByWebElement(add2);
		clear(add2, ADD2);
		enterValueInFieldInput(add2, ADD2);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage provideADDress3(String ADD3)
	{
		waitForWebElementPresent(add3, getTimeOut());
		mouseClickByWebElement(add3);
		clear(add3, ADD3);
		enterValueInFieldInput(add3, ADD3);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage provideCity(String CityName) throws Exception
	{
		waitForWebElementPresent(city, getTimeOut());
		mouseClickByWebElement(city);
		clear(city, CityName);
		enterValueInFieldInput(city, CityName);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage provideProvince(String ProvinceName) throws Exception
	{
		waitForWebElementPresent(province, getTimeOut());
		mouseClickByWebElement(province);
		clear(province, ProvinceName);
		enterValueInFieldInput(province, ProvinceName);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage provideCountry(String CountryName) throws Exception
	{
		waitForWebElementPresent(country, getTimeOut());
		mouseClickByWebElement(country);
		clear(country, CountryName);
		enterValueInFieldInput(country, CountryName);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage providePhone1(String PhNo1)
	{
		waitForWebElementPresent(phn1, getTimeOut());
		mouseClickByWebElement(phn1);
		clear(phn1, PhNo1);
		enterValueInFieldInput(phn1, PhNo1);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage providePhone2(String PhNo2)
	{
		waitForWebElementPresent(phn2, getTimeOut());
		mouseClickByWebElement(phn2);
		clear(phn2, PhNo2);
		enterValueInFieldInput(phn2, PhNo2);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage clickOnAgentDeatilTab()
	{
		waitForWebElementPresent(agentdetailtab, getTimeOut());
		mouseClickByWebElement(agentdetailtab);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage provideRepresentativeCode(String RepCode)
	{
		waitForWebElementPresent(representativeCode, getTimeOut());
		mouseClickByWebElement(representativeCode);
		clear(representativeCode, RepCode);
		enterValueInFieldInput(representativeCode, RepCode);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage provideProvideDealineDate(String DDate)
	{
		waitForWebElementPresent(deadlinePaymentDate, getTimeOut());
		mouseClickByWebElement(deadlinePaymentDate);
		clear(deadlinePaymentDate, DDate);
		enterValueInFieldInput(deadlinePaymentDate, DDate);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage clickOnSave()
	{
		waitForWebElementPresent(saveBtn, getTimeOut());
		mouseClickByWebElement(saveBtn);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
	public PartyAgentTransactionPage clickOnRecord()
	{
		mouseOver(otherAction, getTimeOut());
		waitForElementToBeClickable(record,getTimeOut());
		mouseClickByWebElement(record);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
	
}
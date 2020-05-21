package com.firstlife.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class PeopleIndividualTransactionPage extends FirstLifeDriverHelper
{
							//XPATHS
	
	
	@FindBy(how=How.XPATH,using="//div/button[text()='ايجاد کد شناسه شخص	']")
	private WebElement createIdCode;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='individualTO.name.firstName']")
	private WebElement perName;

	@FindBy(how=How.XPATH,using="//div/select[@ng-model='individualTO.name.prefix']")
	private WebElement prefix;
	
	@FindBy(how=How.XPATH,using="//div/input[@ng-model='individualTO.name.lastName']")
	private WebElement surName;
	
	@FindBy(how=How.XPATH,using="//div/input[@ng-model='individualTO.freeText4']")
	private WebElement fatherName;
	
	@FindBy(how=How.XPATH,using="//div/input[@ng-model='individualTO.externalIDs[2].id']")
	private WebElement nationalCode;
	
	@FindBy(how=How.XPATH,using="(//span/input[@ng-model='individualTO.sex'])[1]")
	private WebElement male;
	
	@FindBy(how=How.XPATH,using="(//span/input[@ng-model='individualTO.sex'])[2]")
	private WebElement female;
	
	@FindBy(how=How.XPATH,using="//p/input[@ng-model='individualTO.persianDateDOB']")
	private WebElement dob;
	
	@FindBy(how=How.XPATH,using="//div/input[@ng-model='individualTO.handPhones[0].phone']")
	private WebElement mobno;
	
	@FindBy(how=How.XPATH,using="//div/label[text()='شماره تلفن همراه	']")
	private WebElement outsideSlick;
	
	@FindBy(how=How.XPATH,using="//div/strong/i[@class='icon-transaction-arrow-next']")
	private WebElement nextTab;
	
	@FindBy(how=How.XPATH,using="//div/select[@ng-model='addresspurpose']")
	private WebElement addresstype;
	
	@FindBy(how=How.XPATH,using="(//div/input[@ng-model='tempData.countryDesc'])[1]")
	private WebElement country;
	
	@FindBy(how=How.XPATH,using="(//div/input[@ng-model='tempData.stateDesc'])[1]")
	private WebElement province;
	
	@FindBy(how=How.XPATH,using="(//div/input[@ng-model='tempData.cityDesc'])[1]")
	private WebElement city;
	
	@FindBy(how=How.XPATH,using="//div/input[@ng-model='tempData.line1']")
	private WebElement street;
	
	@FindBy(how=How.XPATH,using="//div/input[@ng-model='tempData.zipNumber']")
	private WebElement postalCode;
	
	@FindBy(how=How.XPATH,using="//div/input[@ng-model='tempData.phnCountry']")
	private WebElement phncountrycode;
	
	@FindBy(how=How.XPATH,using="//div/input[@ng-model='tempData.phnPhone']")
	private WebElement phncode;
	
	@FindBy(how=How.XPATH,using="(//button[@ficlabel='PARTY_Save.label '])[1]")
	private WebElement savebtn;
	
	@FindBy(how=How.XPATH,using="//span/label[@ficlabel='PARTY_Submit.label ']")
	private WebElement submit;
	
	
	
	
	public PeopleIndividualTransactionPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
                  			//METHODS
	
	
	public PeopleIndividualTransactionPage clickOnCreateId()
	{
		waitForWebElementPresent(createIdCode, getTimeOut());
		waitForElementToBeClickable(createIdCode, getTimeOut());
		createIdCode.click();
		//mouseClickByWebElement(createIdCode);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public String capturePartyId()
	{
		//waitForWebElementPresent(element, timeout);
		waitForElementPresent("//input[@name='individualTO.partyID']", getTimeOut());
		
		WebElement proposalno=driver.findElement(By.xpath("//input[@name='individualTO.partyID']"));
		String s = driver.findElement(By.xpath("//input[@name='individualTO.partyID']")).getAttribute("value");
		String capturePropasalNo=proposalno.getText();
		System.out.println("Number is"+capturePropasalNo);
		System.out.println("number is "+s);
		return 	s;
		
	}
	
	public PeopleIndividualTransactionPage providePersonName(String Pname)
	{
		waitForWebElementPresent(perName, getTimeOut());
		mouseClickByWebElement(perName);
		clear(perName, Pname);
		enterValueInFieldInput(perName, Pname);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage selectPrefix(String pfix)
	{
		waitForWebElementPresent(prefix,getTimeOut());
		mouseClickByWebElement(prefix);
		selectDropDown(prefix,pfix , getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage provideSurname(String SurName)
	{
		waitForWebElementPresent(surName, getTimeOut());
		mouseClickByWebElement(surName);
		clear(surName, SurName);
		enterValueInFieldInput(surName, SurName);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage provideFatherName(String Fathername)
	{
		waitForWebElementPresent(fatherName, getTimeOut());
		mouseClickByWebElement(fatherName);
		clear(fatherName, Fathername);
		enterValueInFieldInput(fatherName, Fathername);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage provideNationalCode(String NatCode)
	{
		waitForWebElementPresent(nationalCode, getTimeOut());
		mouseClickByWebElement(nationalCode);
		clear(nationalCode, NatCode);
		enterValueInFieldInput(nationalCode, NatCode);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage provideGender(String Gender)
	{
		if(Gender == "Male")
		{
			waitForWebElementPresent(male,getTimeOut());
			mouseClickByWebElement(male);
		}
		else
		{
			waitForWebElementPresent(female,getTimeOut());
			mouseClickByWebElement(female);
		}
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage provideDOB(String DOb) throws Exception
	{
		waitfor5sec();
		waitForWebElementPresent(dob, getTimeOut());
		mouseClickByWebElement(dob);
		clear(dob, DOb);
		enterValueInFieldInput(dob, DOb);
		waitfor5sec();
	//	_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	

	public PeopleIndividualTransactionPage provideMobileNo(String MoBoNo) throws Exception
	{
		waitfor5sec();
		waitForWebElementPresent(mobno, getTimeOut());
		mouseClickByWebElement(mobno);
		clear(mobno, MoBoNo);
		enterValueInFieldInput(mobno, MoBoNo);
		_waitForJStoLoad();
		outsideSlick.click();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage clickOnAddress()
	{
		waitForWebElementPresent(nextTab, getTimeOut());
		mouseClickByWebElement(nextTab);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage selectaddresstype(String AddType)
	{
		waitForWebElementPresent(addresstype,getTimeOut());
		mouseClickByWebElement(addresstype);
		selectDropDown(addresstype,AddType , getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage provideCountry(String CountryNAme) throws Exception
	{
		waitForWebElementPresent(country, getTimeOut());
		mouseClickByWebElement(country);
		clear(country, CountryNAme);
		waitfor5sec();
		enterValueInFieldInput(country, CountryNAme);
		waitfor5sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage provideProvince(String Province) throws Exception
	{
		waitForWebElementPresent(province, getTimeOut());
		mouseClickByWebElement(province);
		clear(province, Province);
		enterValueInFieldInput(province, Province);
		waitfor5sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage provideCity(String City) throws Exception
	{
		waitForWebElementPresent(city, getTimeOut());
		mouseClickByWebElement(city);
		clear(city, City);
		enterValueInFieldInput(city, City);
		waitfor5sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage provideStreetName(String Street) throws Exception
	{
		waitForWebElementPresent(street, getTimeOut());
		mouseClickByWebElement(street);
		clear(street, Street);
		enterValueInFieldInput(street, Street);
		waitfor5sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage providePostalCode(String PostalZip)
	{
		waitForWebElementPresent(postalCode, getTimeOut());
		mouseClickByWebElement(postalCode);
		clear(postalCode, PostalZip);
		enterValueInFieldInput(postalCode, PostalZip);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage providePhnCountryCode(String PHN1)
	{
		waitForWebElementPresent(phncountrycode, getTimeOut());
		mouseClickByWebElement(phncountrycode);
		clear(phncountrycode, PHN1);
		enterValueInFieldInput(phncountrycode, PHN1);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage providePhnNumber(String PHN2)
	{
		waitForWebElementPresent(phncode, getTimeOut());
		mouseClickByWebElement(phncode);
		clear(phncode, PHN2);
		enterValueInFieldInput(phncode, PHN2);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage clickOnSave()
	{
		waitForWebElementPresent(savebtn, getTimeOut());
		mouseClickByWebElement(savebtn);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	public PeopleIndividualTransactionPage clickOnRecord()
	{
		waitForWebElementPresent(submit, getTimeOut());
		mouseClickByWebElement(submit);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
	
	

}

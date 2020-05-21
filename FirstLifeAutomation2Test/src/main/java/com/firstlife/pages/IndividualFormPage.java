package com.firstlife.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.firstlife.utils.FirstLifeDriverHelper;

public class IndividualFormPage extends FirstLifeDriverHelper
{
	
	@FindBy(how=How.XPATH, using="//input[@value='S']")
	private WebElement seriesRadioButton;
	
	@FindBy(how=How.XPATH, using="//select[@name='individualTO.series']")
	private WebElement seriesDropDown;
	
	@FindBy(how=How.XPATH, using="//button[text()='Generate Party ID']")
	private WebElement generatePartyIDButton;
	
	@FindBy(how=How.XPATH, using="(//input[@name='individualTO.name.firstName'])[2]")
	private WebElement firstName;
	
	@FindBy(how=How.XPATH, using="(//input[@name='individualTO.name.lastName'])[2]")
	private WebElement lastName;
	
	@FindBy(how=How.XPATH, using="//input[@value='M']")
	private WebElement male;
	
	@FindBy(how=How.XPATH, using="//input[@value='F']")
	private WebElement female;
	
	@FindBy(how=How.XPATH, using="//input[@name='individualTO.DOB']")
	private WebElement DOB;
	
	@FindBy(how=How.XPATH, using="//input[@name='individualTO.taxTypeDesc']")
	private WebElement taxType;
	
	@FindBy(how=How.XPATH, using="//button[contains(@ng-click,'taxTypeDesc')]")
	private WebElement taxTypeArrow;

	public IndividualFormPage(WebDriver driver) 
	{
		super(driver);
	}
	
	public IndividualFormPage enterBOD(String value)
	{
		waitForWebElementPresent(DOB, getTimeOut());
		scrollToElementView(DOB);
		clear(DOB, "clearing ODB input field");
		enterValueInFieldInput(DOB, value);
		return PageFactory.initElements(driver, IndividualFormPage.class);
	}
	
	public IndividualFormPage selectACode(String code)
	{
		String xpath = "(//td/label[text()='"+code+"'])[1]";
		waitForElementPresent(xpath, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(xpath)), getTimeOut());
		mouseClick(xpath, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, IndividualFormPage.class);
	}
	
	public IndividualFormPage clickOnTaxTypeArrow()
	{
		waitForWebElementPresent(taxTypeArrow, getTimeOut());
		scrollToWebElement(taxTypeArrow);
		waitForElementToBeClickable(taxTypeArrow, getTimeOut());
		taxTypeArrow.click();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, IndividualFormPage.class);
	}
	
	public IndividualFormPage selectMale()
	{
		waitForWebElementPresent(male, getTimeOut());
		scrollToWebElement(male);
		waitForElementToBeClickable(male, getTimeOut());
		_clickUsingJavaScript(male);
		return PageFactory.initElements(driver, IndividualFormPage.class);
	}
	
	public IndividualFormPage selectFemale()
	{
		waitForWebElementPresent(female, getTimeOut());
		scrollToWebElement(female);
		waitForElementToBeClickable(female, getTimeOut());
		_clickUsingJavaScript(female);
		return PageFactory.initElements(driver, IndividualFormPage.class);
	}
	
	public IndividualFormPage enterFirstName(String firstname)
	{
		waitForWebElementPresent(firstName, getTimeOut());
		scrollToWebElement(firstName);
		enterValueInFieldInput(firstName, firstname);
		return PageFactory.initElements(driver, IndividualFormPage.class);
	}
	
	public IndividualFormPage enterLastName(String lastname)
	{
		waitForWebElementPresent(lastName, getTimeOut());
		scrollToWebElement(lastName);
		enterValueInFieldInput(lastName, lastname);
		return PageFactory.initElements(driver, IndividualFormPage.class);
	}
	
	public IndividualFormPage clickOnGeneratePartyIDButton()
	{
		waitForWebElementPresent(generatePartyIDButton, getTimeOut());
		waitForElementToBeClickable(generatePartyIDButton, getTimeOut());
		_clickUsingJavaScript(generatePartyIDButton);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, IndividualFormPage.class);
	}
	
    public IndividualFormPage clickOnSeriesRadioButton()
	{
		waitForWebElementPresent(seriesRadioButton, getTimeOut());
		waitForElementToBeClickable(seriesRadioButton, getTimeOut());
		_clickUsingJavaScript(seriesRadioButton);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, IndividualFormPage.class);
	}
    
    public IndividualFormPage selectSeriesDropDownAs(String value)
    {
    	waitForWebElementPresent(seriesDropDown, getTimeOut());
    	selectDropDown(seriesDropDown, value, getTimeOut());
    	return PageFactory.initElements(driver, IndividualFormPage.class);
    	
    }


}

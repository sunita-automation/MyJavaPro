package com.firstlife.pages;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.firstlife.utils.FirstLifeDriverHelper;

public class QuotationPage extends FirstLifeDriverHelper
{
				
							//XPATHS
	
	@FindBy(how=How.XPATH,using="(//i[@class='icon-login-down-arrow'])[1]")
	private WebElement typeOfInsuranceArrow;
	
	@FindBy(how=How.XPATH,using="(//td/label[text()='06'])[1]")
	private WebElement insurance;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='quotationVO.flquotationHdrVO.poQuotPartyVO.partyDesc']")
	private WebElement insurer;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='quotationVO.flquotationHdrVO.laQuotPartyVO.partyDesc']")
	private WebElement insured;
	
	@FindBy(how=How.XPATH,using="//i[@class='icon-transaction-create']")
	private WebElement createBtn;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='quotationVO.flquotationHdrVO.policyTerm']")
	private WebElement policyTerm;
	
	
	
/*	@FindBy(how=How.XPATH,using="//input[@ng-model='flquotationVO.flquotationHdrVO.saCurrencyDesc']")
	private WebElement currencies;
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='flquotationVO.flquotationHdrVO.sumAssuredFA.formattedPrimeAmount'])[1]")
	private WebElement capitalOfDeath;
	
	@FindBy(how=How.XPATH,using="(//select[@ng-model='flquotationVO.flquotationHdrVO.frequencyMode'])[1]")
	private WebElement howToPay;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FLQOT_ClientDetails.label']")
	private WebElement clientDetailTab;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='flquotationVO.flquotationHdrVO.poQuotPartyVO.height']")
	private WebElement height;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='flquotationVO.flquotationHdrVO.poQuotPartyVO.weight']")
	private WebElement weight;
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='flquotationVO.flquotationHdrVO.poQuotPartyVO.occupation_Class_Desc'])[1]")
	private WebElement occupation;
	
	@FindBy(how=How.XPATH,using="//div/label[@ficlabel='FLPS_BeneficiaryDetail.label']")
	private WebElement beneficiarytab;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='FilterVO1.agentDesc']")
	private WebElement beneficiaryName;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='FilterVO1.relDesc']")
	private WebElement relationship;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='FilterVO1.sharePerecentage']")
	private WebElement sharePercentage;
	
	@FindBy(how=How.XPATH,using="//select[@ng-model='FilterVO1.benfLevel']")
	private WebElement priorityOfBenficiary;
	
	@FindBy(how=How.XPATH,using="(//i[@class=' icon-transaction-add iconinline'])[1]")
	private WebElement addBtn;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FLQOT_Summary.label']")
	private WebElement summarylabel;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FIC_Quot_Calculate_Premium.Button']")
	private WebElement calculateBtn;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FLNB_Confirm.button']")
	private WebElement confirmBtn;
	*/
	
	
	
	public QuotationPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
							//METHODS
	
	
	public QuotationPage selectTypeOfInsurance(String Inscode) throws InterruptedException
	{
		waitForWebElementPresent(typeOfInsuranceArrow, getTimeOut());
		mouseClickByWebElement(typeOfInsuranceArrow);
		wait2sec();
		_waitForPageLoad();
		String xpath = "(//td/label[text()='"+Inscode+"'])[1]";
		waitForElementPresent(xpath, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(xpath)), getTimeOut());
		wait2sec();
		mouseClick(xpath, getTimeOut());
		_waitForPageLoad();
		return PageFactory.initElements(driver, QuotationPage.class);
	}
	
	public QuotationPage provideInsurerName(String InName) throws Exception
	{
		waitForWebElementPresent(insurer, getTimeOut());
		mouseClickByWebElement(insurer);
		waitfor5sec();
		clear(insurer, InName);
		enterValueInFieldInput(insurer, InName);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		waitfor5sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, QuotationPage.class);
	}
	
	public QuotationPage provideInsureedName(String InsdName) throws Exception
	{
		waitForWebElementPresent(insured, getTimeOut());
		mouseClickByWebElement(insured);
		clear(insured, InsdName);
		enterValueInFieldInput(insured, InsdName);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, QuotationPage.class);
	}
	
	public QuotationPage providePolicyTerm(String Term) throws Exception
	{
		waitForWebElementPresent(policyTerm, getTimeOut());
		mouseClickByWebElement(policyTerm);
		//clear(policyTerm, Term);
		enterValueInFieldInput(policyTerm, Term);
		waitfor5sec();
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, QuotationPage.class);
	}
	
	
	public QuotationTransactionPage clickOnCreate() throws Exception
	{
		waitForWebElementPresent(createBtn, getTimeOut());
		mouseClickByWebElement(createBtn);
		Thread.sleep(10000);
		_waitForPageLoad();
		return PageFactory.initElements(driver, QuotationTransactionPage.class);
	}
	
	
	
	/*
	
	  public QuotationPage provideCurrency(String CurCode) throws Exception 
	  {
		  	_waitForPageLoad();
		    waitForWebElementPresent(currencies, getTimeOut());
			mouseClickByWebElement(currencies);
			clear(currencies, CurCode);
			enterValueInFieldInput(currencies, CurCode);
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationPage.class); 
	  }
	  
	  public QuotationPage provideCapitalOfDeath(String Amount)
	  {
		  waitForWebElementPresent(capitalOfDeath, getTimeOut());
			mouseClickByWebElement(capitalOfDeath);
			clear(capitalOfDeath, Amount);
			enterValueInFieldInput(capitalOfDeath, Amount);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationPage.class);   
	  }
	  
	  public QuotationPage selectHowToPay(String Way)
	  {

			waitForWebElementPresent(howToPay,getTimeOut());
			mouseClickByWebElement(howToPay);
			selectDropDown(howToPay,Way , getTimeOut());
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationPage.class);
	  }
	  
	  public QuotationPage clickOnClientDetailTab()
		{
			waitForWebElementPresent(clientDetailTab, getTimeOut());
			mouseClickByWebElement(clientDetailTab);
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationPage.class);
		}
	  
	  public QuotationPage provideHeight(String HGht)
	  {
		  waitForWebElementPresent(height, getTimeOut());
			mouseClickByWebElement(height);
			clear(height, HGht);
			enterValueInFieldInput(height, HGht);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationPage.class);   
	  }
	  
	  public QuotationPage provideWeight(String WGht)
	  {
		  waitForWebElementPresent(weight, getTimeOut());
			mouseClickByWebElement(weight);
			clear(weight, WGht);
			enterValueInFieldInput(weight, WGht);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationPage.class); 
	  }
	  
	  public QuotationPage provideOccupation(String OccCode)
	  {
		  waitForWebElementPresent(occupation, getTimeOut());
			mouseClickByWebElement(occupation);
			clear(occupation, OccCode);
			enterValueInFieldInput(occupation, OccCode);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationPage.class); 
	  }
	  
	  public QuotationPage clickOnBenficiaryTab()
	  {
		  waitForWebElementPresent(beneficiarytab, getTimeOut());
			mouseClickByWebElement(beneficiarytab);
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationPage.class);
	  }
	  
	  public QuotationPage provideBeneficiaryName(String BeneName)
	  {
		  waitForWebElementPresent(beneficiaryName, getTimeOut());
			mouseClickByWebElement(beneficiaryName);
			clear(beneficiaryName, BeneName);
			enterValueInFieldInput(beneficiaryName, BeneName);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationPage.class); 
	  }
	  
	  public QuotationPage provideRelationship(String RelCode)
	  {
		  waitForWebElementPresent(relationship, getTimeOut());
			mouseClickByWebElement(relationship);
			clear(relationship, RelCode);
			enterValueInFieldInput(relationship, RelCode);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationPage.class); 
	  }
	  
	  public QuotationPage providepercentageShare(String Percentage)
	  {
		  waitForWebElementPresent(sharePercentage, getTimeOut());
			mouseClickByWebElement(sharePercentage);
			clear(sharePercentage, Percentage);
			enterValueInFieldInput(sharePercentage, Percentage);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationPage.class);
	  }
	  
	  public QuotationPage selectPriorityBeneficiary(String Priority)
	  {
		  waitForWebElementPresent(priorityOfBenficiary,getTimeOut());
			mouseClickByWebElement(priorityOfBenficiary);
			selectDropDown(priorityOfBenficiary,Priority , getTimeOut());
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationPage.class);  
	  }
	  
	  public QuotationPage clickOnAdd()
	  {
		  waitForWebElementPresent(addBtn, getTimeOut());
			mouseClickByWebElement(addBtn);
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationPage.class);  
	  }
	  
	  public QuotationPage clickOnSummary()
	  {
		  waitForWebElementPresent(summarylabel, getTimeOut());
			mouseClickByWebElement(summarylabel);
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationPage.class);  
	  }
	  
	  public QuotationPage clickOnCalculate()
	  {
		  waitForWebElementPresent(calculateBtn, getTimeOut());
			mouseClickByWebElement(calculateBtn);
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationPage.class);  
	  }
	  
	  public QuotationPage clickOnConfirm()
	  {
		  waitForWebElementPresent(confirmBtn, getTimeOut());
			mouseClickByWebElement(confirmBtn);
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationPage.class);  
	  }
	  
	  */
	
	//METHODS FOR AGENT PORTAL
	public QuotationPage selectTypeOfInsuranceAgent(String Inscode) throws InterruptedException
	{
		waitForWebElementPresent(typeOfInsuranceArrow, getTimeOut());
		mouseClickByWebElement(typeOfInsuranceArrow);
		wait2sec();
		_waitForPageLoad();
		String xpath = "//div[text()='"+Inscode+"']";
		waitForElementPresent(xpath, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(xpath)), getTimeOut());
		mouseClick(xpath, getTimeOut());
		_waitForPageLoad();
		return PageFactory.initElements(driver, QuotationPage.class);
	}
	
	
	

}

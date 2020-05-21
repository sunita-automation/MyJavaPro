package com.firstlife.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.firstlife.utils.FirstLifeDriverHelper;

public class QuotationTransactionPage extends FirstLifeDriverHelper
{
	  					    //XPATHS
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='flquotationVO.flquotationHdrVO.saCurrencyDesc']")
	private WebElement currencies;
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='flquotationVO.flquotationHdrVO.sumAssuredFA.formattedPrimeAmount'])[1]")
	private WebElement capitalOfDeath;
	
	@FindBy(how=How.XPATH,using="(//select[@ng-model='flquotationVO.flquotationHdrVO.frequencyMode'])[1]")
	private WebElement howToPay;
	
	@FindBy(how=How.XPATH,using="(//select[@ng-model='flquotationVO.flquotationHdrVO.frequencyMode'])[3]")
	private WebElement howToPayTerm;
	

	@FindBy(how=How.XPATH,using="(//select[@ng-model='flquotationVO.flquotationHdrVO.frequencyMode'])[1]")
	private WebElement howToPayMrta;
	
	@FindBy(how=How.XPATH,using="(//select[@ng-model='flquotationVO.flquotationHdrVO.frequencyMode'])[2]")
	private WebElement howToPayWH;
	

	@FindBy(how=How.XPATH,using="(//select[@ng-model='flquotationVO.flquotationHdrVO.frequencyMode'])[4]")
	private WebElement howToPayUniversal;
	

	@FindBy(how=How.XPATH,using="(//select[@ng-model='flquotationVO.flquotationHdrVO.frequencyMode'])[3]")
	private WebElement howToPayaGENT;
	
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FLQOT_ClientDetails.label']")
	private WebElement clientDetailTab;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='flquotationVO.flquotationHdrVO.poQuotPartyVO.height']")
	private WebElement height;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='flquotationVO.flquotationHdrVO.poQuotPartyVO.formattedAmountheight']")
	private WebElement heightAgnt;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='flquotationVO.flquotationHdrVO.poQuotPartyVO.weight']")
	private WebElement weight;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='flquotationVO.flquotationHdrVO.poQuotPartyVO.formattedAmountweight']")
	private WebElement weightAgent;
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='flquotationVO.flquotationHdrVO.poQuotPartyVO.occupation_Class_Desc'])[1]")
	private WebElement occupation;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='FLQT_occupationClass.label'])[1]")
	private WebElement occupationAgnet;
	
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
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='flquotationVO.flquotationHdrVO.quotNumber']")
	private WebElement quoteNo;
	
	@FindBy(how=How.XPATH,using="//button[@ng-click='NextScreen()']")
	private WebElement nextScreen;
	
	@FindBy(how=How.XPATH,using="(//i[@class=' icon-transaction-add iconinline iconColor_Theme1'])[1]")
	private WebElement addBtnAgent;
	
	@FindBy(how=How.XPATH,using="(//label[text()='سرمایه فوت'])[1]")
	private WebElement outClick;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FIC_Quot_Life_Assured1.Label']")
	private WebElement insuredTab;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FIC_Quot_Policy_Owner.Label']")
	private WebElement policyOwnerTab;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FIC_Quot_Life_Assured1.Label']")
	private WebElement lATabAgent;
	

	@FindBy(how=How.XPATH,using="(//input[@ng-model='flquotationVO.flquotationHdrVO.laSameAsPOFlag'])[1]")
	private WebElement radioAgentla;

	@FindBy(how=How.XPATH, using="(//label[@ficlabel=\"FLPS_Beneficiary_Name_Maturity.label\"])[1]")
	private WebElement lifeIterestTab;

	@FindBy(how=How.XPATH,using="//input[@ng-model='FilterVO2.agentDesc']")
	private WebElement benefitOflife;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='FilterVO2.relDesc']")
	private WebElement benefitrelationship;


	@FindBy(how=How.XPATH,using="//input[@ng-model='FilterVO2.sharePerecentage']")
	private WebElement benefitsharePercentage;
	
	@FindBy(how=How.XPATH,using="//select[@ng-model='FilterVO2.benfLevel']")
	private WebElement benefitlevel;
	
	@FindBy(how=How.XPATH,using="(//i[@class=' icon-transaction-add iconinline'])[2]")
	private WebElement benefitAddBtn;
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='flquotationVO.flquotationHdrVO.laSameAsPOFlag'])[1]")
	private WebElement insuredRadiobtn;

	@FindBy(how=How.XPATH,using="(//input[@ng-model='flquotationVO.flquotationHdrVO.formattedAmountpremContribution'])[1]")
	private WebElement planedPremium;
	
	
	
	
	
	
	public QuotationTransactionPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	       
	
	
	                       //METHODS
	public String getQuotationNumber2() throws InterruptedException
	{
		_waitForPageLoad();
		waitfor5sec();
		waitForElementPresent("//input[@ng-model='flquotationVO.flquotationHdrVO.quotNumber']", getTimeOut());
		String s = driver.findElement(By.xpath("//input[@ng-model='flquotationVO.flquotationHdrVO.quotNumber']")).getAttribute("value");
		System.out.println("number is "+s);
		return 	s;
		
	}
	
	 public QuotationTransactionPage provideCurrency(String CurCode) throws Exception 
	  {
		    waitForWebElementPresent(currencies, getTimeOut());
			mouseClickByWebElement(currencies);
			//waitfor5sec();
		//	clear(currencies, CurCode);
			enterValueInFieldInput(currencies, CurCode);
			//waitfor5sec();
			_waitForJStoLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class); 
	  }
	  
	  public QuotationTransactionPage provideCapitalOfDeath(String Amount) throws Exception
	  {
		    waitForWebElementPresent(capitalOfDeath, getTimeOut());
			mouseClickByWebElement(capitalOfDeath);
			wait2sec();
			//clear(capitalOfDeath, Amount);
			//capitalOfDeath.clear();
			capitalOfDeath.click();
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			enterValueInFieldInput(capitalOfDeath, Amount);
			waitfor5sec();
			_waitForJStoLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);   
	  }
	  
	  public QuotationTransactionPage selectHowToPay(String Way) throws InterruptedException
	  {
		  	waitfor5sec();
			waitForWebElementPresent(howToPayTerm,getTimeOut());
			mouseClickByWebElement(howToPayTerm);
			selectDropDown(howToPayTerm,Way , getTimeOut());
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }
	  public QuotationTransactionPage selectHowToPayWH(String Way) throws InterruptedException
	  {
		  	scrollToWebElement(howToPayWH);
		  	waitfor5sec();
			waitForWebElementPresent(howToPayWH,getTimeOut());
			mouseClickByWebElement(howToPayWH);
			selectDropDown(howToPayWH,Way , getTimeOut());
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }
	  

	  public QuotationTransactionPage selectHowToPayMrta(String Way) throws InterruptedException
	  {
		  	scrollToWebElement(howToPayMrta);
		  	waitfor5sec();
			waitForWebElementPresent(howToPayMrta,getTimeOut());
			mouseClickByWebElement(howToPayMrta);
			selectDropDown(howToPayMrta,Way , getTimeOut());
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }
	  

	  public QuotationTransactionPage selectHowToPayForUniversal(String Way) throws InterruptedException
	  {
		  	waitfor5sec();
			waitForWebElementPresent(howToPayUniversal,getTimeOut());
			mouseClickByWebElement(howToPayUniversal);
			selectDropDown(howToPayUniversal,Way , getTimeOut());
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }
	  
	  public QuotationTransactionPage clickOnClientDetailTab() throws InterruptedException

		{
		  wait2sec();
			waitForWebElementPresent(clientDetailTab, getTimeOut());
			mouseClickByWebElement(clientDetailTab);
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
		}
	  
	  public QuotationTransactionPage provideHeight(String HGht)
	  {
		  waitForWebElementPresent(height, getTimeOut());
			mouseClickByWebElement(height);
			clear(height, HGht);
			enterValueInFieldInput(height, HGht);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);   
	  }
	  
	  public QuotationTransactionPage provideWeight(String WGht)
	  {
		  waitForWebElementPresent(weight, getTimeOut());
			mouseClickByWebElement(weight);
			clear(weight, WGht);
			enterValueInFieldInput(weight, WGht);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class); 
	  }
	  
	  public QuotationTransactionPage provideOccupation(String OccCode) throws Exception
	  {
		  scrollToWebElement(occupation);
		  waitForWebElementPresent(occupation, getTimeOut());
			mouseClickByWebElement(occupation);
			waitfor5sec();
			clear(occupation, OccCode);
			enterValueInFieldInput(occupation, OccCode);
			waitfor5sec();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class); 
	  }
	  
	  public QuotationTransactionPage clickOnBenficiaryTab()
	  {
		  waitForWebElementPresent(beneficiarytab, getTimeOut());
			mouseClickByWebElement(beneficiarytab);
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }
	  
	  public QuotationTransactionPage provideBeneficiaryName(String BeneName) throws Exception
	  {
		  	waitForWebElementPresent(beneficiaryName, getTimeOut());
		  	scrollToWebElement(relationship);
			mouseClickByWebElement(beneficiaryName);
			waitfor5sec();
			clear(beneficiaryName, BeneName);
			enterValueInFieldInput(beneficiaryName, BeneName);
			waitfor5sec();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class); 
	  }
	  
	  public QuotationTransactionPage provideRelationship(String RelCode) throws Exception
	  {
		  waitForWebElementPresent(relationship, getTimeOut());
			mouseClickByWebElement(relationship);
			clear(relationship, RelCode);
			enterValueInFieldInput(relationship, RelCode);
			waitfor5sec();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class); 
	  }
	  
	  public QuotationTransactionPage providepercentageShare(String Percentage)
	  {
		  scrollToWebElement(addBtn);
		  waitForWebElementPresent(sharePercentage, getTimeOut());
			mouseClickByWebElement(sharePercentage);
			//clear(sharePercentage, Percentage);
			enterValueInFieldInput(sharePercentage, Percentage);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }
	  
	  public QuotationTransactionPage selectPriorityBeneficiary(String Priority)
	  {
		  
		  waitForWebElementPresent(priorityOfBenficiary,getTimeOut());
			mouseClickByWebElement(priorityOfBenficiary);
			selectDropDown(priorityOfBenficiary,Priority , getTimeOut());
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);  
	  }
	  
	  public QuotationTransactionPage clickOnAdd() throws InterruptedException
	  {
		  waitForWebElementPresent(addBtn, getTimeOut());
			mouseClickByWebElement(addBtn);
			waitfor5sec();
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);  
	  }
	  
	  public QuotationTransactionPage clickOnSummary() throws InterruptedException
	  {
		    waitForWebElementPresent(summarylabel, getTimeOut());
			mouseClickByWebElement(summarylabel);
			wait2sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);  
	  }
	  
	  public QuotationTransactionPage clickOnCalculate() throws InterruptedException
	  {
		  	waitForWebElementPresent(calculateBtn, getTimeOut());
			mouseClickByWebElement(calculateBtn);
			waitfor5sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);  
	  }
	  
	  public QuotationTransactionPage clickOnConfirm()
	  {
		  waitForWebElementPresent(confirmBtn, getTimeOut());
			mouseClickByWebElement(confirmBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);  
	  }
	  
	  public QuotationTransactionPage selectHowToPayAgent(String Way) throws InterruptedException
	  {
		  	scrollToWebElement(howToPayaGENT);
		  	waitfor5sec();
			waitForWebElementPresent(howToPayaGENT,getTimeOut());
			mouseClickByWebElement(howToPayaGENT);
			selectDropDown(howToPayaGENT,Way , getTimeOut());
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }
	  
	  public QuotationTransactionPage clickOnNextAgent()
		{
			waitForWebElementPresent(nextScreen, getTimeOut());
			mouseClickByWebElement(nextScreen);
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
		}
	  
	  public QuotationTransactionPage clickOnAddAgent() throws InterruptedException
	  {
		  waitForWebElementPresent(addBtnAgent, getTimeOut());
			mouseClickByWebElement(addBtnAgent);
			waitfor5sec();
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);  
	  }
	  
	  public QuotationTransactionPage provideCapitalOfDeathAgent(String Amount) throws Exception
	  {
		    waitForWebElementPresent(capitalOfDeath, getTimeOut());
			mouseClickByWebElement(capitalOfDeath);
			//waitfor5sec();
			//clear(capitalOfDeath, Amount);
			//capitalOfDeath.clear();
			capitalOfDeath.click();
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			enterValueInFieldInput(capitalOfDeath, Amount);
			outClick.click();
			waitfor5sec();
			_waitForJStoLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);   
	  }
	  
	  public QuotationTransactionPage providepercentageShareAgnt(String Percentage)
	  {
		  scrollToWebElement(addBtnAgent);
		  waitForWebElementPresent(sharePercentage, getTimeOut());
			mouseClickByWebElement(sharePercentage);
			//clear(sharePercentage, Percentage);
			enterValueInFieldInput(sharePercentage, Percentage);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }
	
	  public QuotationTransactionPage clickonPOTab()
	  {
		  waitForWebElementPresent(policyOwnerTab, getTimeOut());
			mouseClickByWebElement(policyOwnerTab);
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }

	  public QuotationTransactionPage provideOccupationAgent(String OccCode) throws Exception
	  {
		  scrollToWebElement(occupationAgnet);
		  waitForWebElementPresent(occupation, getTimeOut());
			mouseClickByWebElement(occupation);
			waitfor5sec();
			clear(occupation, OccCode);
			enterValueInFieldInput(occupation, OccCode);
			waitfor5sec();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class); 
	  }

	  
	  public QuotationTransactionPage provideHeightAgent(String HGht)
	  {
		  	scrollToWebElement(weightAgent);
		  	waitForWebElementPresent(heightAgnt, getTimeOut());
			mouseClickByWebElement(heightAgnt);
			heightAgnt.sendKeys(HGht);
		//	clear(heightAgnt, HGht);
		//	enterValueInFieldInput(heightAgnt, HGht);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);   
	  }
	  
	  public QuotationTransactionPage provideWeightAgent(String WGht) throws InterruptedException
	  {
		  wait2sec();
		  waitForWebElementPresent(weightAgent, getTimeOut());
			mouseClickByWebElement(weightAgent);
			weightAgent.sendKeys(WGht);
		//	clear(weightAgent, WGht);
		//	enterValueInFieldInput(weightAgent, WGht);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class); 
	  }
	  
	  public QuotationTransactionPage clickonLATab() throws InterruptedException
	  {
		  wait2sec();
		  waitForWebElementPresent(lATabAgent, getTimeOut());
			mouseClickByWebElement(lATabAgent);
			wait2sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }
	  
	  public QuotationTransactionPage clickonLATabradiobtn() throws InterruptedException
	  {
		  scrollToWebElement(lATabAgent);
		  waitForWebElementPresent(radioAgentla, getTimeOut());
			mouseClickByWebElement(radioAgentla);
			waitfor5sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }

	  
	  public ProposalTransactionPage clickOnLifeInterestTab()
		{
			waitForWebElementPresent(lifeIterestTab, getTimeOut());
			scrollToWebElement(lifeIterestTab);
			waitForElementToBeClickable(lifeIterestTab, getTimeOut());
			_clickUsingJavaScript(lifeIterestTab);
			_waitForJStoLoad();
			scrollWindowToBottomOfPage();
			return PageFactory.initElements(driver, ProposalTransactionPage.class);
		}
	  
	  public QuotationTransactionPage enterBenefitlifeDetails(String BenefitLife) throws Exception
	  {
		  	waitForWebElementPresent(benefitOflife, getTimeOut());
		  	scrollToWebElement(benefitrelationship);
			mouseClickByWebElement(benefitOflife);
			waitfor5sec();
			clear(benefitOflife, BenefitLife);
			enterValueInFieldInput(benefitOflife, BenefitLife);
			waitfor5sec();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class); 
	  }
	  
	  public QuotationTransactionPage enterBenefitRelationship(String RatioCode) throws Exception
	  {
		  waitForWebElementPresent(benefitrelationship, getTimeOut());
			mouseClickByWebElement(benefitrelationship);
			clear(benefitrelationship, RatioCode);
			enterValueInFieldInput(benefitrelationship, RatioCode);
			waitfor5sec();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class); 
	  }
	  
	  public QuotationTransactionPage enterBenefitpercentageShare(String SharePercentage)
	  {
		 
		  waitForWebElementPresent(benefitsharePercentage, getTimeOut());
			mouseClickByWebElement(benefitsharePercentage);
			enterValueInFieldInput(benefitsharePercentage, SharePercentage);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }
	
	  
	  public QuotationTransactionPage selectPriorityBenefit(String Level)
	  {
		  
		  waitForWebElementPresent(benefitlevel,getTimeOut());
			mouseClickByWebElement(benefitlevel);
			selectDropDown(benefitlevel,Level , getTimeOut());
			_waitForJStoLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);  
	  }
	  
	  public QuotationTransactionPage clickOnBenefitAddbtn() throws InterruptedException
	  {
		  waitForWebElementPresent(benefitAddBtn, getTimeOut());
			mouseClickByWebElement(benefitAddBtn);
			waitfor5sec();
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);  
	  }
	
	  public ProposalTransactionPage enterSecondBenefitDetails(String BenefitLife,String RatioCode,String SharePercentage,String Level) throws Exception
		{
			clickOnLifeInterestTab();
			enterBenefitlifeDetails(BenefitLife);
			enterBenefitRelationship(RatioCode);
			enterBenefitpercentageShare(SharePercentage);
			selectPriorityBenefit(Level); 
			clickOnBenefitAddbtn();
			return PageFactory.initElements(driver, ProposalTransactionPage.class);
		}
	  
	  
	  public QuotationTransactionPage clickOnInsuredTab()
	  {
		  waitForWebElementPresent(insuredTab, getTimeOut());
			mouseClickByWebElement(insuredTab);
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);
	  }
	  
	  public QuotationTransactionPage clickOnRadioBtn() throws InterruptedException
	  {
		  	waitForWebElementPresent(insuredRadiobtn, getTimeOut());
			mouseClickByWebElement(insuredRadiobtn);
			waitfor5sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);  
	  }
	  
	  
	  //planedPremium
	  public QuotationTransactionPage enterPlanedPremium(String PremiumAmount) throws Exception
	  {
		    waitForWebElementPresent(planedPremium, getTimeOut());
			mouseClickByWebElement(planedPremium);
			planedPremium.sendKeys(PremiumAmount);
			_waitForJStoLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);   
	  }

}

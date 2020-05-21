package com.firstlife.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class PsNonFinancialTransationpage extends FirstLifeDriverHelper{

	@FindBy(how=How.XPATH, using="(//select[@name='policyHeaderVO.role_Flag'])[1]")
	private WebElement personRoleBC;
	
	@FindBy(how=How.XPATH, using="(//label[@ficlabel='FLPS_BeneficiaryChange.label'])[3]")
	private WebElement BeneficiaryDiedTab;
	
	@FindBy(how=How.XPATH, using="//input[@name='beneficiaryFilterVO.party_Name']")
	private WebElement beneficiaryName;
	
	@FindBy(how=How.XPATH, using="//input[@name='beneficiaryFilterVO.rel_With_LA_Desc']")
	private WebElement beneficiaryreletionship;
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='beneficiaryFilterVO.share_Per']")
	private WebElement beneficiaryPercentage;
	
	@FindBy(how=How.XPATH, using="//select[@ng-model='beneficiaryFilterVO.levelCode']")
	private WebElement beneficiarylevel;
	
	@FindBy(how=How.XPATH, using="(//i[@ng-click='initServiceCall()'])[1]")
	private WebElement addBtn;
	
	@FindBy(how=How.XPATH, using="(//i[@class=' icon-transaction-delete iconblock'])[1]")
	private WebElement delectBtn;
	
	@FindBy(how=How.XPATH, using="(//label[@class='TabNames tabname'])[2]")
	private WebElement documentTab;
	
	@FindBy(how=How.XPATH, using="(//label[@class='TabNames tabname'])[3]")
	private WebElement loadingDocumentTab;
	
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
	public PsNonFinancialTransationpage(WebDriver driver) {
	
		
		
		
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	 public PsNonFinancialTransationpage selectPersonsRoleBc(String role)
	  {
		  
		  waitForWebElementPresent(personRoleBC,getTimeOut());
			mouseClickByWebElement(personRoleBC);
			selectDropDown(personRoleBC,role , getTimeOut());
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PsNonFinancialTransationpage.class);  
	  }
	
	 public PsNonFinancialTransationpage ClickOnBeneficiaryDiedTab() throws Exception
	  {
		 waitForWebElementPresent(BeneficiaryDiedTab, getTimeOut());
			mouseOver(BeneficiaryDiedTab, getTimeOut());
			BeneficiaryDiedTab.click();
			_waitForJStoLoad();
		 return PageFactory.initElements(driver, PsNonFinancialTransationpage.class); 
	  }
	
	 public PsNonFinancialTransationpage provideBeneficiaryName(String BeneName) throws Exception
	  {
		  	waitForWebElementPresent(beneficiaryName, getTimeOut());
		  	scrollToWebElement(beneficiaryreletionship);
			mouseClickByWebElement(beneficiaryName);
			waitfor5sec();
			clear(beneficiaryName, BeneName);
			enterValueInFieldInput(beneficiaryName, BeneName);
			waitfor5sec();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PsNonFinancialTransationpage.class); 
	  }
	
	 public PsNonFinancialTransationpage provideRelationship(String RelCode) throws Exception
	  {
		  waitForWebElementPresent(beneficiaryreletionship, getTimeOut());
			mouseClickByWebElement(beneficiaryreletionship);
			clear(beneficiaryreletionship, RelCode);
			enterValueInFieldInput(beneficiaryreletionship, RelCode);
			waitfor5sec();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PsNonFinancialTransationpage.class); 
	  }
	
	 public PsNonFinancialTransationpage providepercentageShare(String Percentage)
	  {
		  scrollToWebElement(addBtn);
		  waitForWebElementPresent(beneficiaryPercentage, getTimeOut());
			mouseClickByWebElement(beneficiaryPercentage);
			//clear(sharePercentage, Percentage);
			enterValueInFieldInput(beneficiaryPercentage, Percentage);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PsNonFinancialTransationpage.class);
	  }
	  
	  public PsNonFinancialTransationpage selectPriorityBeneficiary(String Priority)
	  {
		  
		  waitForWebElementPresent(beneficiarylevel,getTimeOut());
			mouseClickByWebElement(beneficiarylevel);
			selectDropDown(beneficiarylevel,Priority , getTimeOut());
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PsNonFinancialTransationpage.class);  
	  }
	  
	
	  public QuotationTransactionPage clickOnDelectBtn() throws InterruptedException
	  {
		  waitForWebElementPresent(delectBtn, getTimeOut());
			mouseClickByWebElement(delectBtn);
			waitfor5sec();
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);  
	  }
	  
	  public QuotationTransactionPage clickOnAddBtn() throws InterruptedException
	  {
		  waitForWebElementPresent(addBtn, getTimeOut());
			mouseClickByWebElement(addBtn);
			waitfor5sec();
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, QuotationTransactionPage.class);  
	  }
	
	
	  public PsNonFinancialTransationpage ClickOnDocumentTab() throws Exception
	  {
		 waitForWebElementPresent(documentTab, getTimeOut());
			mouseOver(documentTab, getTimeOut());
			documentTab.click();
			_waitForJStoLoad();
		 return PageFactory.initElements(driver, PsNonFinancialTransationpage.class); 
	  }
	
	  
	  public PsNonFinancialTransationpage ClickOnLoadingDocumentTab() throws Exception
	  {
		 waitForWebElementPresent(loadingDocumentTab, getTimeOut());
			mouseOver(loadingDocumentTab, getTimeOut());
			loadingDocumentTab.click();
			_waitForJStoLoad();
		 return PageFactory.initElements(driver, PsNonFinancialTransationpage.class); 
	  }
	  
	  public PsNonFinancialTransationpage clickOnNonMedicalDocumentTab()
		{
			waitForWebElementPresent(nonMediacalDocumentTab, getTimeOut());
			scrollToWebElement(nonMediacalDocumentTab);
			waitForElementToBeClickable(nonMediacalDocumentTab, getTimeOut());
			_clickUsingJavaScript(nonMediacalDocumentTab);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PsNonFinancialTransationpage.class);
		}
		
		public PsNonFinancialTransationpage clickOnLoadingFile1() throws Exception
		{
			
			waitfor5sec();
			Actions builder= new Actions(driver);
			builder.moveToElement(chosefile1).click(chosefile1);
			builder.perform();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PsNonFinancialTransationpage.class);
		}
		
		public PsNonFinancialTransationpage clickOnLoadingFile2() throws Exception
		{
			
			waitfor5sec();
			Actions builder= new Actions(driver);
			builder.moveToElement(chosefile2).click(chosefile2);
			builder.perform();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PsNonFinancialTransationpage.class);
		}
		
		
		public PsNonFinancialTransationpage clickOnLoadingFile3() throws Exception
		{
			
			waitfor5sec();
			Actions builder= new Actions(driver);
			builder.moveToElement(chosefile3).click(chosefile3);
			builder.perform();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PsNonFinancialTransationpage.class);
		}
		
		
		
		public PsNonFinancialTransationpage clickOnFirstTab()
		{
			waitForWebElementPresent(firststTab, getTimeOut());
			scrollToWebElement(firststTab);
			waitForElementToBeClickable(firststTab, getTimeOut());
			_clickUsingJavaScript(firststTab);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PsNonFinancialTransationpage.class);
		}
		
		
		public PsNonFinancialTransationpage clickOnRetrieveBtn() throws Exception
		{
			waitForWebElementPresent(retrieveBtn, getTimeOut());
			scrollToWebElement(retrieveBtn);
			waitForElementToBeClickable(retrieveBtn, getTimeOut());
			_clickUsingJavaScript(retrieveBtn);
			_waitForJStoLoad();
			wait2sec();
			return PageFactory.initElements(driver, PsNonFinancialTransationpage.class);
		}
		
		

		public PsNonFinancialTransationpage clickOnconfirmBtn()
		{
			waitForWebElementPresent(confirmBtn, getTimeOut());
			scrollToWebElement(confirmBtn);
			waitForElementToBeClickable(confirmBtn, getTimeOut());
			_clickUsingJavaScript(confirmBtn);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PsNonFinancialTransationpage.class);
		}
		


}

package com.firstlife.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class PolicyTransactionPage extends FirstLifeDriverHelper
{
	
	//  XPATHS
	
	@FindBy(how=How.XPATH, using="(//input[@ng-model='policyHeaderVO.formattedAmountsa_Orig'])[1]")
	private WebElement saAmountChange;
	
	@FindBy(how=How.XPATH,using="//label[text()='شماره بيمه نامه			']")
	private WebElement outClick;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FICUTILS.otheractions.label']")
	private WebElement detailsTab;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FLNB_Date.button']")
	private WebElement date;
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='policyHeaderVO.persianDatepaid_To_Date'])[2]")
	private WebElement dueDate;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FLNB_Cancel.button']")
	private WebElement cancelBtn;
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='policyHeaderVO.persianDateeffectiveDate']")
	private WebElement effectiveDate;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FLPS_LARiskDetails.label']")
	private WebElement laDetailTab;
	
	@FindBy(how=How.XPATH, using="//select[@ng-model='data.marital_Status']")
	private WebElement maritalStatus;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FLPS_Underwriting.label']")
	private WebElement uwtab;
	
	@FindBy(how=How.XPATH, using="//select[@ng-model='policyHeaderVO.uw_Result_Code']")
	private WebElement choice;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FLUW_SummaryandDocuments.label']")
	private WebElement summaryTab;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FLNB_Calculate_Premium.button']")
	private WebElement calculateBtn;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FLNB_Confirm.button']")
	private WebElement confirmBtn;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FLPS_PartyRoles.label']")
	private WebElement personsRoleTab;

	@FindBy(how=How.XPATH, using="//label[@ficlabel='FLPS_CovrgesandBenfts.label']")
	private WebElement coverageTab;

	@FindBy(how=How.XPATH, using="(//label[@ficlabel='FLUW_RiderDetails.label'])[1]")
	private WebElement additionalCoverageTab;
	
	@FindBy(how=How.XPATH, using="//input[@name='filterBenefitVO.benefitLongDesc']")
	private WebElement riderField;
	
	@FindBy(how=How.XPATH, using="(//i[@class=' icon-transaction-add iconinline'])[1]	")
	private WebElement addBtn;	
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='data.formattedAmounttrunchePremAllocPrcnt']")
	private WebElement cofficient;	
	
	@FindBy(how=How.XPATH, using="(//input[@ng-model='data.formattedAmounttrunchePremAllocPrcnt'])[2]")
	private WebElement cofficient1;	
	
	@FindBy(how=How.XPATH,using="(//label[text()='بيمه شده'])[4]")
	private WebElement outClick1;
	
	
	
	
	
	
	
	public PolicyTransactionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//   METHODS
	
	 public PolicyTransactionPage changeSAAmount(String SAmount) throws Exception
	  {
		 /*
		  	waitForWebElementPresent(saAmountChange, getTimeOut());
			mouseClickByWebElement(saAmountChange);
			clear(saAmountChange, SAmount);
			enterValueInFieldInput(saAmountChange, SAmount);
			_waitForJStoLoad();
			*/
			
		 /*
			 waitForWebElementPresent(saAmountChange, getTimeOut());
				mouseClickByWebElement(saAmountChange);
				waitfor5sec();
				clear(saAmountChange, SAmount);
				//capitalOfDeath.clear();
				//saAmountChange.click();
				//robot.keyPress(KeyEvent.VK_BACK_SPACE);
				//robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				//waitfor5sec();
				mouseClickByWebElement(saAmountChange);
			
				clear(saAmountChange, SAmount);
				waitfor5sec();
				enterValueInFieldInput(saAmountChange, SAmount);
				waitfor5sec();
				_waitForJStoLoad();
				_waitForPageLoad();
				*/
		 waitForWebElementPresent(saAmountChange, getTimeOut());
			mouseClickByWebElement(saAmountChange);
			//waitfor5sec();
			//clear(capitalOfDeath, Amount);
			//capitalOfDeath.clear();
			//saAmountChange.click();
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			waitfor5sec();
			enterValueInFieldInput(saAmountChange, SAmount);
			outClick.click();
			waitfor5sec();
			_waitForJStoLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class); 
	  }
	 
	 public PolicyTransactionPage ClickOnDetailsTab() throws Exception
	  {
		 waitForWebElementPresent(detailsTab, getTimeOut());
			mouseOver(detailsTab, getTimeOut());
			_waitForJStoLoad();
		 return PageFactory.initElements(driver, PolicyTransactionPage.class); 
	  }
	 
	 public PolicyTransactionPage ClickOnDateTab() throws Exception
	  {
		 waitForWebElementPresent(date, getTimeOut());
			mouseOver(date, getTimeOut());
			_clickUsingJavaScript(date);
			_waitForPageLoad();
			waitfor5sec();
		 return PageFactory.initElements(driver, PolicyTransactionPage.class); 
	  }
	 
	 
	 public String capturedueDate() throws Exception
	 {
		//waitForWebElementPresent(element, timeout);
			waitForElementPresent("(//input[@ng-model='policyHeaderVO.persianDatepaid_To_Date'])[2]", getTimeOut());
			
			WebElement proposalno=driver.findElement(By.xpath("(//input[@ng-model='policyHeaderVO.persianDatepaid_To_Date'])[2]"));
			String s = driver.findElement(By.xpath("(//input[@ng-model='policyHeaderVO.persianDatepaid_To_Date'])[2]")).getAttribute("value");
			String capturePropasalNo=proposalno.getText();
			System.out.println("Number is"+capturePropasalNo);
			System.out.println("number is "+s);
			return 	s;
		 
	 }
	 
	 
	 
	 public PolicyTransactionPage clickOnCancelBtn() throws Exception
	  {
			waitForWebElementPresent(cancelBtn, getTimeOut());
			scrollToWebElement(cancelBtn);
			waitForElementToBeClickable(cancelBtn, getTimeOut());
			_clickUsingJavaScript(cancelBtn);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
	  }
	 
	  
	 
	 public PolicyTransactionPage provideEffectiveDate(String DAte) throws Exception
	  {
		
		  	waitForWebElementPresent(effectiveDate, getTimeOut());
			mouseClickByWebElement(effectiveDate);
			clear(effectiveDate, DAte);
			enterValueInFieldInput(effectiveDate, DAte);
			_waitForJStoLoad();
			
			return PageFactory.initElements(driver, PolicyTransactionPage.class); 
	  }
	 
	 public PolicyTransactionPage clickOnLADetailTab() throws Exception
		{
			waitForWebElementPresent(laDetailTab, getTimeOut());
			mouseClickByWebElement(laDetailTab);
			waitfor5sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	 
	 public PolicyTransactionPage selectMaritalStatus(String mstatus)
	  {
		  
		  waitForWebElementPresent(maritalStatus,getTimeOut());
			mouseClickByWebElement(maritalStatus);
			selectDropDown(maritalStatus,mstatus , getTimeOut());
			_waitForJStoLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);  
	  }
	 
	 public PolicyTransactionPage clickOnUWTab() throws Exception
		{
			waitForWebElementPresent(uwtab, getTimeOut());
			mouseClickByWebElement(uwtab);
			waitfor5sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	 
	 public PolicyTransactionPage selectChoice(String Choice)
	  {
		  
		  waitForWebElementPresent(choice,getTimeOut());
			mouseClickByWebElement(choice);
			selectDropDown(choice,Choice , getTimeOut());
			_waitForJStoLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);  
	  }
	 
	 public PolicyTransactionPage clickOnSummaryTab() throws Exception
		{
			waitForWebElementPresent(summaryTab, getTimeOut());
			mouseClickByWebElement(summaryTab);
			waitfor5sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	 
	 public PolicyTransactionPage clickOnCalculate() throws Exception
		{
			waitForWebElementPresent(calculateBtn, getTimeOut());
			mouseClickByWebElement(calculateBtn);
			waitfor5sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	 
	 public PolicyTransactionPage clickOnConfirm() throws Exception
		{
			waitForWebElementPresent(confirmBtn, getTimeOut());
			mouseClickByWebElement(confirmBtn);
			//confirmBtn.click();
			waitfor5sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	 
	 public PolicyTransactionPage clickOnPersonsRoleTab() throws Exception
		{
			waitForWebElementPresent(personsRoleTab, getTimeOut());
			mouseClickByWebElement(personsRoleTab);
			personsRoleTab.click();
			waitfor5sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	 
	 public PolicyTransactionPage clickOnCoverageTab() throws Exception
		{
			waitForWebElementPresent(coverageTab, getTimeOut());
			mouseClickByWebElement(coverageTab);
			coverageTab.click();
			waitfor5sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	 
	 public PolicyTransactionPage clickOnAdditionCoverageTab() throws Exception
		{
		 waitForWebElementPresent(additionalCoverageTab, getTimeOut());
			scrollToWebElement(additionalCoverageTab);
			waitForElementToBeClickable(additionalCoverageTab, getTimeOut());
			_clickUsingJavaScript(additionalCoverageTab);
			//_waitForPageLoad();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	 public PolicyTransactionPage addRider(String Rider1) throws Exception
		{
		 //select Rider
		 mouseClickByWebElement(riderField);
			waitfor5sec();
			clear(riderField, Rider1);
			enterValueInFieldInput(riderField, Rider1);
			waitfor5sec();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			waitfor5sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	 
	 
	 
	 public PolicyTransactionPage clickAddBtn() throws Exception
		{
		//add rider
			waitForWebElementPresent(addBtn, getTimeOut());
			mouseClickByWebElement(addBtn);
			waitfor5sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	 
	 public PolicyTransactionPage changeCofficient(String coating) throws Exception
		{
		//change cofficient
			
		 waitForWebElementPresent(cofficient, getTimeOut());
			mouseClickByWebElement(cofficient);
			//waitfor5sec();
			//clear(capitalOfDeath, Amount);
			//capitalOfDeath.clear();
			//saAmountChange.click();
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			waitfor5sec();
			enterValueInFieldInput(cofficient, coating);
			outClick1.click();
			waitfor5sec();
			_waitForJStoLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	 
	 public PolicyTransactionPage changeCofficientPartialDisablity(String coating) throws Exception
		{
		//change cofficient
			
		 waitForWebElementPresent(cofficient1, getTimeOut());
			mouseClickByWebElement(cofficient1);
			//waitfor5sec();
			//clear(capitalOfDeath, Amount);
			//capitalOfDeath.clear();
			//saAmountChange.click();
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			waitfor5sec();
			enterValueInFieldInput(cofficient1, coating);
			outClick1.click();
			waitfor5sec();
			_waitForJStoLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	    public PolicyTransactionPage Select1stRiderRider(String Rider1,String coating) throws Exception
		{
	    addRider(Rider1);
		  clickAddBtn();
		  changeCofficient(coating);	
		  return PageFactory.initElements(driver, PolicyTransactionPage.class);
		 }
	
	    public PolicyTransactionPage Select2ndRiderRider(String Rider2) throws Exception
		{
	      addRider(Rider2);
		  clickAddBtn();
		  return PageFactory.initElements(driver, PolicyTransactionPage.class);
		 }
	    
	    public PolicyTransactionPage Select3rdRiderRider(String Rider3) throws Exception
		{
	      addRider(Rider3);
		  clickAddBtn();
		  return PageFactory.initElements(driver, PolicyTransactionPage.class);
		 }
	    
	    public PolicyTransactionPage Select4thRiderRider(String Rider4 ,String coating1) throws Exception
		{
	      addRider(Rider4);
		  clickAddBtn();
		  changeCofficientPartialDisablity(coating1);	
		  return PageFactory.initElements(driver, PolicyTransactionPage.class);
		 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

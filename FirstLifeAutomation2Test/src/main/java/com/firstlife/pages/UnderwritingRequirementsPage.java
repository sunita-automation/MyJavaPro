package com.firstlife.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.firstlife.utils.FirstLifeDriverHelper;

public class UnderwritingRequirementsPage extends FirstLifeDriverHelper {
	
	
	@FindBy(how=How.XPATH,using="(//ul[@class='pagination table-pagination']/li/a)[2]")
	private WebElement nextBtn;
	
	@FindBy(how=How.XPATH, using="//label[text()='مدارک']")
	private WebElement documentTab;
	
	@FindBy(how=How.XPATH, using="//select[@name='proposalHeaderVO.wfToBeActioned']")
	private WebElement nextStep;
	
	@FindBy(how=How.XPATH, using="//label[text()='مدارک پزشکي']")
	private WebElement medicaldoct;
	
	@FindBy(how=How.XPATH, using="//select[@name='proposalHeaderVO.receiveAllMedDocs']")
	private WebElement receiveMedicalDoct;
	
	@FindBy(how=How.XPATH, using="(//label[text()='نمايش محاسبات و مستندات'])[1]")
	private WebElement calculationTab;
	
	@FindBy(how=How.XPATH, using="//i[@class='icon-header-rating']")
	private WebElement compensationIcon;
	
	@FindBy(how=How.XPATH, using="//i[@class='icon-header-confirm']")
	private WebElement conformationIcon;
	
	@FindBy(how=How.XPATH, using="//input[@ng-click='clickhome()']")
	private WebElement NTTData;
	

	public UnderwritingRequirementsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//captur the value of proposal no/ offer no
			public String captureproposalno()
			{
				//waitForWebElementPresent(element, timeout);
				waitForElementPresent("(//input[@name='proposalHeaderVO.proposal_No'])[1]", getTimeOut());
				
				WebElement proposalno=driver.findElement(By.xpath("(//input[@name='proposalHeaderVO.proposal_No'])[1]"));
				String s = driver.findElement(By.xpath("(//input[@name='proposalHeaderVO.proposal_No'])[1]")).getAttribute("value");
				String capturePropasalNo=proposalno.getText();
				System.out.println("Number is"+capturePropasalNo);
				System.out.println("number is "+s);
				return 	s;
				
			}
			
			public UnderwritingRequirementsPage clickOnDocumentTab()
			{

				waitForWebElementPresent(documentTab, getTimeOut());
				scrollToWebElement(documentTab);
				waitForElementToBeClickable(documentTab, getTimeOut());
				_clickUsingJavaScript(documentTab);
				_waitForJStoLoad();
				return PageFactory.initElements(driver, UnderwritingRequirementsPage.class);
				
			}
			
			public UnderwritingRequirementsPage selectNextStep(String Nextstep)
			{
				
		    	
		    	waitForWebElementPresent(nextStep, getTimeOut());
		    	_waitForJStoLoad();
		    	selectDropDown(nextStep, Nextstep, getTimeOut());
		    	_waitForJStoLoad();
		    	return PageFactory.initElements(driver, UnderwritingRequirementsPage.class);
		    	
		    	
			}
			
			public UnderwritingRequirementsPage clickOnMedicalDocumentTab()
			{
				waitForWebElementPresent(medicaldoct, getTimeOut());
				_waitForJStoLoad();
				waitForElementToBeClickable(medicaldoct, getTimeOut());
				_clickUsingJavaScript(medicaldoct);
				_waitForJStoLoad();
				return PageFactory.initElements(driver, UnderwritingRequirementsPage.class);
			}
			
			public UnderwritingRequirementsPage selectAllMedicalDoctRecieved(String received)
			{
				waitForWebElementPresent(receiveMedicalDoct, getTimeOut());
				_waitForJStoLoad();
				selectDropDown(receiveMedicalDoct, received, getTimeOut());
				_waitForJStoLoad();
				return PageFactory.initElements(driver, UnderwritingRequirementsPage.class);
				
			}
			

			public ProposalTransactionPage clickOnCalculationTab() 
			{
				waitForWebElementPresent(calculationTab, getTimeOut());
				scrollToWebElement(calculationTab);
				waitForElementToBeClickable(calculationTab, getTimeOut());
				_clickUsingJavaScript(calculationTab);
				//_waitForPageLoad();
				_waitForJStoLoad();
				return PageFactory.initElements(driver, ProposalTransactionPage.class);
			}
			
			public ProposalTransactionPage clickCompensationBtn() throws InterruptedException
			{
				waitForWebElementPresent(compensationIcon, getTimeOut());
				scrollToWebElement(compensationIcon);
				waitForElementToBeClickable(compensationIcon, getTimeOut());
				_clickUsingJavaScript(compensationIcon);
				_waitForPageLoad();
				waitfor5sec();
				//Thread.sleep(10000);
				return PageFactory.initElements(driver, ProposalTransactionPage.class);
			}
			
			public ProposalTransactionPage clickConformationBtn() throws InterruptedException
			{
				waitForWebElementPresent(conformationIcon, getTimeOut());
				scrollToWebElement(conformationIcon);
				waitForElementToBeClickable(conformationIcon, getTimeOut());
				waitfor5sec();
				_clickUsingJavaScript(conformationIcon);
				waitfor5sec();
				WebDriverWait wait=WebDriverWait(driver,10);
				String closeButton="//div/button[text()='بله']";
				driver.findElement(By.xpath(closeButton)).click();
				_waitForPageLoad();
				
				//Thread.sleep(10000);
				return PageFactory.initElements(driver, ProposalTransactionPage.class);
			}

			private WebDriverWait WebDriverWait(WebDriver driver, int i) {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			
			/**
			 * 
			 * calculate the value
			 * @throws Exception 
			 */
			public ProposalTransactionPage calculateTheValue() throws Exception
			{
				clickOnCalculationTab();
				clickCompensationBtn();
				return PageFactory.initElements(driver, ProposalTransactionPage.class);
			}
			
			public DashboardPage clickonNTTDataLogo() throws Exception
			{
				waitForWebElementPresent(NTTData, getTimeOut());
				waitForElementToBeClickable(NTTData, getTimeOut());
				_clickUsingJavaScript(NTTData);
				_waitForPageLoad();
				waitfor5sec();
				return PageFactory.initElements(driver, DashboardPage.class);
				
			}

	

}

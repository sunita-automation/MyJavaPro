package com.firstlife.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.firstlife.utils.FirstLifeDriverHelper;

public class DashboardPage extends FirstLifeDriverHelper
{
	@FindBy(how=How.XPATH, using="//li[@id='burgerDropdown']/a/i[@role='button']")
	private WebElement manuBarDropDown;
	
	@FindBy(how=How.XPATH, using="//span[text()=' اشخاص']")
	private WebElement peopleOnDropDown;

	
	@FindBy(how=How.XPATH, using="(//span[text()=' Client'])[1]")
	private WebElement clientOnDropdown;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' تعریف شخص'])[1]")
	private WebElement personDefinOnDropDown;
	
	@FindBy(how=How.XPATH, using ="(//span[text()=' Individual'])[1]")
	private WebElement individualperson;
	
	@FindBy(how=How.XPATH,using="(//span[text()=' Corporate'])[1]")
	private WebElement corporateperson;
	
	
	@FindBy(how=How.XPATH, using ="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'Quotation')]/../following-sibling::ul/li/a/span[text()=' New Quotation']")
	private WebElement newQuotation;
	
	@FindBy(how=How.XPATH, using="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'New Business')]")
	private WebElement newbussiness;
	
	//Quotation Xpaths 
	
	@FindBy(how=How.XPATH,using="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'Quotation')]")
	private WebElement QuoteDropDown;
	
	@FindBy(how=How.XPATH,using="//span[text()=' Quotation']")
	private WebElement quotaionondropdown;
	
	@FindBy(how=How.XPATH,using="(//span[text()=' New Quotation'])[1]")
	private WebElement newQuotaion;
	
	@FindBy(how=How.XPATH,using="(//span[text()=' Convert Quote To Prop'])[1]")
	private WebElement convertToProp;
	
	
	
//XPATHS FOR PARTY AGENT

	@FindBy(how=How.XPATH,using="//span[text()=' Party']")
	private WebElement partyOnDropdown;
	
	@FindBy(how=How.XPATH,using="(//span[text()=' Change Party'])[1]")
	private WebElement changepartyOnDropdown;
	
	@FindBy(how=How.XPATH,using="(//span[text()=' شبکه فروش'])[1]")
	private WebElement salesnetworkOnDropdown;
	
	@FindBy(how=How.XPATH,using="(//span[text()=' نماینده حقیقی'])[1]")
	private WebElement realrepresentativeOnDropdown;
	
	//AGENCY
	@FindBy(how=How.XPATH,using="(//span[text()=' نماینده حقوقی'])[1]")
	private WebElement  legalRepOnDropdown;
	
	
	
	
	

	
	
//XPATH FOR NEW BUSINESS
	
	@FindBy(how=How.XPATH, using="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'New Business')]")
	private WebElement newbusinessTab;
	
	@FindBy(how=How.XPATH, using="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'New Business')]/../following-sibling::ul/li/a/span[contains(text(),' New Proposal')]")
	private WebElement newproposaldropdown;
	
	@FindBy(how=How.XPATH, using="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'New Business')]/../following-sibling::ul/li/a/span[contains(text(),' New Proposal')]/../following-sibling::ul/li/a/span[contains(text(),' Create New')]")
    private WebElement createnewdropdown;	
	

	@FindBy(how=How.XPATH,using="(//ul[@class='pagination table-pagination']/li/a)[2]")
	private WebElement nextBtn;
	
	@FindBy(how=How.XPATH, using="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'Policy Servicing')]")
	private WebElement policyServiceTab;
	
	@FindBy(how=How.XPATH, using="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'Policy Servicing')]/../following-sibling::ul/li/a/span[contains(text(),' Policy Enquiry')]")
	private WebElement policyEnquiry;
	
	
	@FindBy(how=How.XPATH, using="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'Accounts')]")
	private WebElement accountsTab;
	
	@FindBy(how=How.XPATH, using="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'Accounts')]/../following-sibling::ul/li/a/span[contains(text(),' Enquiry')]")
	private WebElement enquiry;
	
	@FindBy(how=How.XPATH, using="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'Accounts')]/../following-sibling::ul/li/a/span[contains(text(),' Enquiry')]/../following-sibling::ul/li/a/span[contains(text(),' Dr/Cr Enquiry')]")
	private WebElement dr_crEnquiry;
	
	@FindBy(how=How.XPATH, using="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'Accounts')]/../following-sibling::ul/li/a/span[contains(text(),' بارگذاری')]")
	private WebElement upload;
	
	@FindBy(how=How.XPATH,using="//li[@id='burgerDropdown']/following-sibling::li/a/label[contains(text(),'Accounts')]/../following-sibling::ul/li/a/span[contains(text(),' بارگذاری')]/../following-sibling::ul/li/a/span[contains(text(),' بارگذاری فایل تسویه مالی')]")
    private WebElement settlementUpload;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' ارسال فایل تسویه مالی'])[2]")
	private WebElement sendFinancialBillingPage;
	
	
	//XPATH FOR CLAIMS MODULE
	@FindBy(how=How.XPATH,using="(//a/i[@class='icon-dashboard-menu-dropdown'])[4]")
	private WebElement claimDropdown;
	
	@FindBy(how=How.XPATH,using="(//a/span[text()=' FNOL'])[2]")
	private WebElement fnol;
	
	@FindBy(how=How.XPATH,using="(//a/span[text()=' Registration'])[2]")
	private WebElement registration;
	
	@FindBy(how=How.XPATH,using="(//a/span[text()=' Settlement'])[2]")
	private WebElement settlement;
	
	@FindBy(how=How.XPATH,using="(//a/span[text()=' Close Claim'])[2]")
	private WebElement  closeClaim;
	
	@FindBy(how=How.XPATH,using="(//a/span[text()=' Add'])[7]")
	private WebElement  addFNOL;
	
	@FindBy(how=How.XPATH,using="(//a/span[text()=' Add'])[8]")
	private WebElement  addReg;
	
	//AGENT PORTAL
	
	@FindBy(how=How.XPATH,using="//label[text()='بیمه نامه']")
	private WebElement  policy;
	
	@FindBy(how=How.XPATH,using="(//span[text()=' ایجاد استعلام'])[2]")
	private WebElement  creatpolicy;
	
	
	//PS FINANCIAL XPATHS
	
	@FindBy(how=How.XPATH,using="(//label[text()='Policy Servicing'])[2]")
	private WebElement policyservicing;
	
	@FindBy(how=How.XPATH,using="(//span[text()=' Financial'])[2]")
	private WebElement financial;
	
	@FindBy(how=How.XPATH,using="(//span[text()=' Change in SA'])[2]")
	private WebElement chnginsa;
	
	@FindBy(how=How.XPATH,using="(//span[text()=' Addition of Riders'])[2]")
	private WebElement addOFRider;
	
	
	
	
	
	
	
	
	
	
	//policy Service-Nonfinancial xpaths
	
	@FindBy(how=How.XPATH,using="(//span[text()=' Non Financial'])[2]")
	private WebElement nonfinancial;
	
	@FindBy(how=How.XPATH,using="(//span[text()=' Address Change'])[3]")
	private WebElement addressChange;
	
	
	@FindBy(how=How.XPATH,using="(//span[text()=' Beneficiary Change'])[3]")
	private WebElement beneficiaryChange;
	
	
	public DashboardPage(final WebDriver driver)
	{
		super(driver);
	}
	
	
	public DashboardPage mouseOverToPersonDefinitionOnDropDown()
	{
		waitForWebElementPresent(personDefinOnDropDown, getTimeOut());
		mouseOver(personDefinOnDropDown, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToclientOnDropPersonDown() throws InterruptedException
	{	Thread.sleep(10000);
		waitForWebElementPresent(clientOnDropdown, getTimeOut());
		mouseOver(clientOnDropdown, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToManuBarDropDown()
	{
		waitForWebElementPresent(manuBarDropDown, getTimeOut());
		mouseOver(manuBarDropDown, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToPeopleOnDropDown()
	{
		waitForWebElementPresent(peopleOnDropDown, getTimeOut());
		mouseOver(peopleOnDropDown, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	
	public PeopleIndividualSearchPage clickOnIndividualonclientPer()
	{
		waitForWebElementPresent(peopleOnDropDown, getTimeOut());
		mouseClickByWebElement(individualperson);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleIndividualSearchPage.class);
	}
	
	public PeoplecorporateSearchPage clickOnCorporateonclientPer()
	{
		waitForWebElementPresent(peopleOnDropDown, getTimeOut());
		mouseClickByWebElement(corporateperson);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeoplecorporateSearchPage.class);
	}
	
	//click on Quotation 
	
	public DashboardPage mouseOverToQuotationonDropDown()
	{
		waitForWebElementPresent(quotaionondropdown, getTimeOut());
		mouseOver(quotaionondropdown, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public QuotationPage clickOnNewQoutation() throws InterruptedException
	{
		waitForWebElementPresent(quotaionondropdown, getTimeOut());
		mouseClickByWebElement(newQuotaion);
		waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, QuotationPage.class);
	}
	
	public ConvertQuotePage clickonConvert() throws InterruptedException
	{
		waitForWebElementPresent(convertToProp, getTimeOut());
		mouseClickByWebElement(convertToProp);
		Thread.sleep(10000);
		_waitForPageLoad();
		return PageFactory.initElements(driver, ConvertQuotePage.class);	
	}
	
	//QUTATION AGENT PORTAL
	
	public DashboardPage mouseOverToPolicyOnDropDown()
	{
		waitForWebElementPresent(policy, getTimeOut());
		mouseOver(policy, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public QuotationPage clickOnCreate() throws InterruptedException
	{
		waitForWebElementPresent(creatpolicy, getTimeOut());
		mouseClickByWebElement(creatpolicy);
		Thread.sleep(10000);
		_waitForPageLoad();
		return PageFactory.initElements(driver, QuotationPage.class);
	}
	
	//CLICK ON AGENT 
	
	public DashboardPage mouseOverToPartyonDropDown()
	{
		waitForWebElementPresent(partyOnDropdown, getTimeOut());
		mouseOver(partyOnDropdown, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToChangePartyonDropDown()
	{
		waitForWebElementPresent(changepartyOnDropdown, getTimeOut());
		mouseOver(changepartyOnDropdown, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToSalesnetworkDropDown()
	{
		waitForWebElementPresent(salesnetworkOnDropdown, getTimeOut());
		mouseOver(salesnetworkOnDropdown, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public PartyAgentSearchPage mouseOverToRealrepkDropDown()
	{
		waitForWebElementPresent(realrepresentativeOnDropdown, getTimeOut());
		mouseOver(realrepresentativeOnDropdown, getTimeOut());
		realrepresentativeOnDropdown.click();
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentSearchPage.class);
	}

	//CLICK ON AGENCY
	
	public PartyAgencySearchPage mouseOverToLegalRepDropDown()
	{
		waitForWebElementPresent(legalRepOnDropdown, getTimeOut());
		mouseOver(legalRepOnDropdown, getTimeOut());
		legalRepOnDropdown.click();
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencySearchPage.class);
	}
	
	/**
	 * click on new bussiness tab which is in manu bar on top
	 * @return
	 */
	public DashboardPage mouseOverToNewBusiness() 
	{
		
		waitForWebElementPresent(newbussiness, getTimeOut());
		mouseOver(newbussiness, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	             //NEW BUSSINESS FUNCTIONS STARTS FROM HERE
	
	
	
	
	
	public DashboardPage mouseOverToNewBussinessBar()
	{
		
		waitForWebElementPresent(newbusinessTab, getTimeOut());
		mouseOver(newbusinessTab, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
		
	}
	
	
	public DashboardPage mouseOverToNewProposalDropdown()
	{
		waitForWebElementPresent(newproposaldropdown, getTimeOut());
		mouseOver(newproposaldropdown, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	
	public CreatNewProposalPage mouseOverToCreatNewDropdown() throws Exception
	{
		waitForWebElementPresent(createnewdropdown, getTimeOut());
		mouseOver(createnewdropdown, getTimeOut());
		_clickUsingJavaScript(createnewdropdown);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, CreatNewProposalPage.class);
	}
	
	
	public UnderwritingRequirementsPage choosePropNo(String num) throws Exception
	{
		waitfor5sec();
		String a="//td[5]/div/a[2]";
		//num="00000030531";
		int temp = 0;
		waitfor5sec();
		int iCount = driver.findElements(By.xpath(a)).size();
		System.out.println("iCount  -->"+iCount);
		//div/a[2][text()='1398120080000080001']
		int c=1;
		while(c<10)
		{
			for(int i = 1;i<=iCount;i++)
				{
					System.out.println("i  -->"+i);
					String xPath = "//*[@id='content0']/div/div[2]/div/div/div/scrollable-table/div/div[2]/table/tbody/tr["+i+"]/td[5]/div/a[2]";
					String value = driver.findElement(By.xpath(xPath)).getText();
					System.out.println("value  -->"+value);
					if(value.equals(num))
						{
						temp = i;
						}
					System.out.println("temp  -->"+temp);
					if(temp>0)
						{
							a = "//*[@id='content0']/div/div[2]/div/div/div/scrollable-table/div/div[2]/table/tbody/tr["+temp+"]/td[5]/div/a[2]";
							//mouseClick(a, getTimeOut());
							mouseClick(a, getTimeOut());
							break;
						}
					
					}
			if(temp==0)
			{
			waitfor5sec();
			nextBtn.click();
			Thread.sleep(10000);
			_waitForPageLoad();
			}
				if(c<10)
				{
					System.out.println("?????????????????????????????????????????????"+c);
				
				c++;
				}
		    }
		return PageFactory.initElements(driver, UnderwritingRequirementsPage.class);
	}

	
	
	public UnderwrittingPage chooseUnderwrittingNo(String num) throws Exception
	{
		waitfor5sec();
		String a="//td[5]/div/a[2]";
		//num="00000030531";
		int temp = 0;
		waitfor5sec();
		int iCount = driver.findElements(By.xpath(a)).size();
		System.out.println("iCount  -->"+iCount);
		//div/a[2][text()='1398120080000080001']
		int c=1;
		while(c<10)
		{
			for(int i = 1;i<=iCount;i++)
				{
					System.out.println("i  -->"+i);
					String xPath = "//*[@id='content0']/div/div[2]/div/div/div/scrollable-table/div/div[2]/table/tbody/tr["+i+"]/td[5]/div/a[2]";
					String value = driver.findElement(By.xpath(xPath)).getText();
					System.out.println("value  -->"+value);
					if(value.equals(num))
						{
						temp = i;
						}
					System.out.println("temp  -->"+temp);
					if(temp>0)
						{
							a = "//*[@id='content0']/div/div[2]/div/div/div/scrollable-table/div/div[2]/table/tbody/tr["+temp+"]/td[5]/div/a[2]";
							//mouseClick(a, getTimeOut());
							mouseClick(a, getTimeOut());
							break;
						}
					
					}
			if(temp==0)
			{
			waitfor5sec();
			nextBtn.click();
			Thread.sleep(10000);
			_waitForPageLoad();
			}
				if(c<10)
				{
					System.out.println("?????????????????????????????????????????????"+c);
				
				c++;
				}
		    }
		return PageFactory.initElements(driver, UnderwrittingPage.class);
	}
	
	
	public AcceptancePage chooseAcceptanceNo(String num) throws Exception
	{
		waitfor5sec();
		String a="//td[5]/div/a[2]";
		//num="00000030531";
		int temp = 0;
		waitfor5sec();
		int iCount = driver.findElements(By.xpath(a)).size();
		System.out.println("iCount  -->"+iCount);
		//div/a[2][text()='1398120080000080001']
		int c=1;
		while(c<10)
		{
			for(int i = 1;i<=iCount;i++)
				{
					System.out.println("i  -->"+i);
					String xPath = "//*[@id='content0']/div/div[2]/div/div/div/scrollable-table/div/div[2]/table/tbody/tr["+i+"]/td[5]/div/a[2]";
					String value = driver.findElement(By.xpath(xPath)).getText();
					System.out.println("value  -->"+value);
					if(value.equals(num))
						{
						temp = i;
						}
					System.out.println("temp  -->"+temp);
					if(temp>0)
						{
							a = "//*[@id='content0']/div/div[2]/div/div/div/scrollable-table/div/div[2]/table/tbody/tr["+temp+"]/td[5]/div/a[2]";
							//mouseClick(a, getTimeOut());
							mouseClick(a, getTimeOut());
							break;
						}
					
					}
			if(temp==0)
			{
			waitfor5sec();
			nextBtn.click();
			Thread.sleep(10000);
			_waitForPageLoad();
			}
				if(c<10)
				{
					System.out.println("?????????????????????????????????????????????"+c);
				
				c++;
				}
		    }
		return PageFactory.initElements(driver, AcceptancePage.class);
	}
	
	
	public ConversionPage chooseConversionNo(String num) throws Exception
	{
		waitfor5sec();
		String a="//td[5]/div/a[2]";
		//num="00000030531";
		int temp = 0;
		waitfor5sec();
		int iCount = driver.findElements(By.xpath(a)).size();
		System.out.println("iCount  -->"+iCount);
		//div/a[2][text()='1398120080000080001']
		int c=1;
		while(c<10)
		{
			for(int i = 1;i<=iCount;i++)
				{
					System.out.println("i  -->"+i);
					String xPath = "//*[@id='content0']/div/div[2]/div/div/div/scrollable-table/div/div[2]/table/tbody/tr["+i+"]/td[5]/div/a[2]";
					String value = driver.findElement(By.xpath(xPath)).getText();
					System.out.println("value  -->"+value);
					if(value.equals(num))
						{
						temp = i;
						}
					System.out.println("temp  -->"+temp);
					if(temp>0)
						{
							a = "//*[@id='content0']/div/div[2]/div/div/div/scrollable-table/div/div[2]/table/tbody/tr["+temp+"]/td[5]/div/a[2]";
							//mouseClick(a, getTimeOut());
							mouseClick(a, getTimeOut());
							break;
						}
					
					}
			if(temp==0)
			{
			waitfor5sec();
			nextBtn.click();
			Thread.sleep(10000);
			_waitForPageLoad();
			}
				if(c<10)
				{
					System.out.println("?????????????????????????????????????????????"+c);
				
				c++;
				}
		    }
		return PageFactory.initElements(driver, ConversionPage.class);
	}
	
	
	
	
	public DashboardPage mouseOverToPolicySericeBar()
	{
		
		waitForWebElementPresent(policyServiceTab, getTimeOut());
		mouseOver(policyServiceTab, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
		
	}
	
	public PolicyEnquirePage mouseOverToPolicyenquiry() throws Exception
	{
		waitForWebElementPresent(policyEnquiry, getTimeOut());
		mouseOver(policyEnquiry, getTimeOut());
		_clickUsingJavaScript(policyEnquiry);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, PolicyEnquirePage.class);
	}
	
	
	
	
	
	public DashboardPage mouseOverToAccountsTab()
	{
		
		waitForWebElementPresent(accountsTab, getTimeOut());
		mouseOver(accountsTab, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
		
	}
	
	
	public DashboardPage mouseOverToEnquiryDropdown()
	{
		waitForWebElementPresent(enquiry, getTimeOut());
		mouseOver(enquiry, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	
	public InforcePage mouseOverToDr_CrEnquiryDropdown() throws Exception
	{
		waitForWebElementPresent(dr_crEnquiry, getTimeOut());
		mouseOver(dr_crEnquiry, getTimeOut());
		_clickUsingJavaScript(dr_crEnquiry);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	
	public DashboardPage mouseOverToUploadDropdown()
	{
		waitForWebElementPresent(upload, getTimeOut());
		mouseOver(upload, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public InforcePage mouseOverToSettlementUploadDropdown() throws Exception
	{
		waitForWebElementPresent(settlementUpload, getTimeOut());
		mouseOver(settlementUpload, getTimeOut());
		_clickUsingJavaScript(settlementUpload);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	
	
	public InforcePage sendFinacialBillingFile()
	{
		waitForWebElementPresent(sendFinancialBillingPage, getTimeOut());
		waitForElementToBeClickable(sendFinancialBillingPage, getTimeOut());
		sendFinancialBillingPage.click();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	
	
	
	
	
	/*
	 * function for go to creat proposal page
	 * 
	 */
	public CreatNewProposalPage openCreatProposalPage() throws Exception
	{
		mouseOverToNewBussinessBar();
		mouseOverToNewProposalDropdown();
		mouseOverToCreatNewDropdown();
		
		return PageFactory.initElements(driver, CreatNewProposalPage.class);
	}
	
	
	/**
	 * 
	 * function for go to policy enquiry page
	 * @return
	 * @throws Exception
	 */
	public PolicyEnquirePage openPolicyEnquiryPage() throws Exception
	{
		mouseOverToPolicySericeBar();
		mouseOverToPolicyenquiry();
		return PageFactory.initElements(driver, PolicyEnquirePage.class);
	}
	
	
	/**
	 * 
	 * function for go to account->enquiry->dr/cr enquiry
	 * @throws Exception 
	 */
	public InforcePage openDr_CrEnquiryPage() throws Exception
	{
		mouseOverToAccountsTab();
		mouseOverToEnquiryDropdown();
		mouseOverToDr_CrEnquiryDropdown();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	

	/**
	 * 
	 * this function is for go to settlement upload
	 * @throws Exception 
	 */
	public InforcePage openSettlementUpload() throws Exception
	{
		waitfor5sec();
		mouseOverToAccountsTab();
		mouseOverToUploadDropdown();
		mouseOverToSettlementUploadDropdown();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	public InforcePage openFincialBillingFilePage() throws Exception
	{
		waitfor5sec();
		mouseOverToAccountsTab();
		mouseOverToUploadDropdown();
		sendFinacialBillingFile();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	/*
	 * METHODS FOR CLAIMS MODULE
	 */
	public DashboardPage mouseOverToclaimsDropdown() throws InterruptedException
	{	Thread.sleep(10000);
		waitForWebElementPresent(claimDropdown, getTimeOut());
		mouseOver(claimDropdown, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToclaimsFnolDropdown()
	{
		waitForWebElementPresent(fnol, getTimeOut());
		mouseOver(fnol, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToclaimsRegistrationDropdown()
	{
		waitForWebElementPresent(registration, getTimeOut());
		mouseOver(registration, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToclaimsSettlementDropdown()
	{
		waitForWebElementPresent(settlement, getTimeOut());
		mouseOver(settlement, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToclaimsCloseClaimDropdown()
	{
		waitForWebElementPresent(closeClaim, getTimeOut());
		mouseOver(closeClaim, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public FnolPage clickOnaddfnol()
	{
		waitForWebElementPresent(addFNOL, getTimeOut());
		mouseClickByWebElement(addFNOL);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, FnolPage.class);
	}
	public RegistrartionPage clickOnaddreg()
	{
		waitForWebElementPresent(addReg, getTimeOut());
		mouseClickByWebElement(addReg);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, RegistrartionPage.class);
	}
	
	public SettlementPage chooseClaimNum(String num) throws Exception
	{
		waitfor5sec();
	String a="//td[5]/div/a[2]";
	//num="00000030531";
	int temp = 0;
	waitfor5sec();
	int iCount = driver.findElements(By.xpath(a)).size();
	System.out.println("iCount  -->"+iCount);
	//div/a[2][text()='1398120080000080001']
	int c=1;
	while(c<10)
	{
		for(int i = 1;i<=iCount;i++)
			{
				System.out.println("i  -->"+i);
				String xPath = "//*[@id='content0']/div/div[2]/div/div/div/scrollable-table/div/div[2]/table/tbody/tr["+i+"]/td[5]/div/a[2]";
				String value = driver.findElement(By.xpath(xPath)).getText();
				System.out.println("value  -->"+value);
				if(value.equals(num))
					{
					if(temp>0)
					{
						break;
					}
					temp = i;
					
				System.out.println("temp  -->"+temp);
				if(temp>0)
					{
						a = "//*[@id='content0']/div/div[2]/div/div/div/scrollable-table/div/div[2]/table/tbody/tr["+temp+"]/td[5]/div/a[2]";
						//mouseClick(a, getTimeOut());
						mouseClick(a, getTimeOut());
						break;
					}
				
					}
				
				
				}
		System.out.println("temp>>>>>>>>>>"+temp);
		if(temp==0)
		{
		waitfor5sec();
		nextBtn.click();
		System.out.println("temp>>>>>>>>>>"+temp);
		Thread.sleep(10000);
		_waitForPageLoad();
		}
			if(c<10)
			{
				System.out.println("?????????????????????????????????????????????"+c);
			
			c++;
			}
	    }
		return PageFactory.initElements(driver, SettlementPage.class);
	}
	public CloseClaimPage chooseClaimNumber(String num) throws Exception
	{	waitfor5sec();
	String a="//td[5]/div/a[2]";
	//num="00000030531";
	int temp = 0;
	waitfor5sec();
	int iCount = driver.findElements(By.xpath(a)).size();
	System.out.println("iCount  -->"+iCount);
	//div/a[2][text()='1398120080000080001']
	int c=1;
	while(c<10)
	{
		for(int i = 1;i<=iCount;i++)
			{
				System.out.println("i  -->"+i);
				String xPath = "//*[@id='content0']/div/div[2]/div/div/div/scrollable-table/div/div[2]/table/tbody/tr["+i+"]/td[5]/div/a[2]";
				String value = driver.findElement(By.xpath(xPath)).getText();
				System.out.println("value  -->"+value);
				if(value.equals(num))
					{
					if(temp>0)
					{
						break;
					}
					temp = i;
					
				System.out.println("temp  -->"+temp);
				if(temp>0)
					{
						a = "//*[@id='content0']/div/div[2]/div/div/div/scrollable-table/div/div[2]/table/tbody/tr["+temp+"]/td[5]/div/a[2]";
						//mouseClick(a, getTimeOut());
						mouseClick(a, getTimeOut());
						break;
					}
				
					}
				
				
				}
		System.out.println("temp>>>>>>>>>>"+temp);
		if(temp==0)
		{
		waitfor5sec();
		nextBtn.click();
		System.out.println("temp>>>>>>>>>>"+temp);
		Thread.sleep(10000);
		_waitForPageLoad();
		}
			if(c<10)
			{
				System.out.println("?????????????????????????????????????????????"+c);
			
			c++;
			}
	    }	    		return PageFactory.initElements(driver, CloseClaimPage.class);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	                // policy Service Functions starts from here
	
	
	
	public DashboardPage mouseOverToNonfinancialDropdown()
	{
		waitForWebElementPresent(nonfinancial, getTimeOut());
		mouseOver(nonfinancial, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	
	public AddressChangePage mouseOverToAddressChange() throws Exception
	{
		waitForWebElementPresent(addressChange, getTimeOut());
		mouseOver(addressChange, getTimeOut());
		_clickUsingJavaScript(addressChange);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, AddressChangePage.class);
	}
	
	public PsNonFinancialSearchPage mouseOverToBeneficiaryChange() throws Exception
	{
		waitForWebElementPresent(beneficiaryChange, getTimeOut());
		mouseOver(beneficiaryChange, getTimeOut());
		_clickUsingJavaScript(beneficiaryChange);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, PsNonFinancialSearchPage.class);
	}
	
	// PS FINANCIAL METHODS
	
	public DashboardPage mouseOverToPS()
	{
		waitForWebElementPresent(policyservicing, getTimeOut());
		mouseOver(policyservicing, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToFinancial()
	{
		waitForWebElementPresent(financial, getTimeOut());
		mouseOver(financial, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public PsfinancialnSearchpage clickonchangeinSA()
	{
		waitForWebElementPresent(chnginsa, getTimeOut());
		mouseOver(chnginsa, getTimeOut());
		chnginsa.click();
		_waitForPageLoad();
		return PageFactory.initElements(driver, PsfinancialnSearchpage.class);
	}
	
	
	public PsfinancialnSearchpage clickOnAdditionOfRider()
	{
		waitForWebElementPresent(addOFRider, getTimeOut());
		mouseOver(addOFRider, getTimeOut());
		addOFRider.click();
		_waitForPageLoad();
		return PageFactory.initElements(driver, PsfinancialnSearchpage.class);
	}
	
	
	
	

}

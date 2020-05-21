package com.firstlife.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.firstlife.utils.FirstLifeDriverHelper;

public class ProposalTransactionPage extends FirstLifeDriverHelper{
	
	@FindBy(how=How.XPATH, using="//i[@class='icon-header-abandon']")
	private WebElement abandon;
	
	@FindBy(how=How.XPATH, using="(//select[@name='proposalHeaderVO.payment_Mode'])[2]")
	private WebElement payway;

	@FindBy(how=How.XPATH,using="(//input[@name='proposalHeaderVO.sa.formattedPrimeAmount'])[1]")
	private WebElement capitalOfDeath;
	
	@FindBy(how=How.XPATH,using="(//input[@ng-model='proposalHeaderVO.formattedAmountpremContribution'])[1]")
	private WebElement plannedPreium;
	
	@FindBy(how=How.XPATH,using="//label[text()='نقش افراد']")
	private WebElement theRoleOFPeopleTab;
	
	@FindBy(how=How.XPATH,using="//a[@id='partyRoleVOListFormacc2']/div/div/label[text()='مشخصات ذينفع			']")
	private WebElement beneficiaryTab;
	
	@FindBy(how=How.XPATH,using="//input[@name='FilterVO1.intro_Agent_Name']")
	private WebElement BeneficiaryName;
	
	@FindBy(how=How.XPATH,using="//input[@name='FilterVO1.relDesc']/following-sibling::span/button/i[@class='icon-login-down-arrow']")
	private WebElement RelationshipDropdown;
	
	@FindBy(how=How.XPATH,using="//input[@name='FilterVO1.sharePerecentage']")
	private WebElement share;
	
	@FindBy(how=How.XPATH, using="//select[@name='FilterVO1.benfLevel']")
	private WebElement priorityLevel;
	
	@FindBy(how=How.XPATH,using="(//label[text()='اضافه نمودن			']/following-sibling::i[@class=' icon-transaction-add iconinline'])[1]")
	private WebElement BeneficiaryAddIcon;
	
	@FindBy(how=How.XPATH,using="(//label[text()='جزئيات تحليل ريسک بيمه شده'])[1]")
	private WebElement riskAnalysisTab;
	
	@FindBy(how=How.XPATH,using="(//input[@name='data.height'])[1]")
	private WebElement height;
	
	@FindBy(how=How.XPATH,using="(//input[@name='data.weight'])[1]")
	private WebElement weight;
	
	@FindBy(how=How.XPATH,using="(//select[@name='data.marital_Status'])[1]")
	private WebElement MaritalStatusDropdown;
	
	@FindBy(how=How.XPATH,using="(//input[contains(@name,'data.non_Medical_Flag')])[1]")
	private WebElement NonMedicalNo;
	
	@FindBy(how=How.XPATH,using="(//button[text()='سوالات بيمه نامه			'])[1]")
	private WebElement insurancePolicyQuesbtn;
	
	@FindBy(how=How.XPATH, using="(//input[@name='FilterVO.question_Status_Flag'])[1]")
	private WebElement groupSelectionRadioBtn;
	
	@FindBy(how=How.XPATH, using="//label[text()='سؤالات پزشکي']")
	private WebElement medicalquesTab;
	
	@FindBy(how=How.XPATH,using="(//i[@class='icon-header-save'])[2]")
	private WebElement Savebtn;
	
	@FindBy(how=How.XPATH,using="(//button[text()='اطلاعات تکميلي			'])[1]")
	private WebElement supplementaryInformationBtn;
	
	@FindBy(how=How.XPATH,using="//label[text()='جزئيات طبقه شغلي']")
	private WebElement detailsOfTheJobClassTab;
	
	@FindBy(how=How.XPATH,using="(//input[@name='proposalLifeAssuredVO.occupation_Class_Desc']/following-sibling::span/button/i[@class='icon-login-down-arrow'])[2]")
	private WebElement OccupationIcon;
	
	@FindBy(how=How.XPATH,using="//label[text()='مدارک']")
	private WebElement documentTab;
	
	@FindBy(how=How.XPATH, using="//select[@name='proposalHeaderVO.wfToBeActioned']")
	private WebElement selectionTheNextStep;
	
	@FindBy(how=How.XPATH, using="(//label[text()='نمايش محاسبات و مستندات'])[1]")
	private WebElement calculationTab;
	
	@FindBy(how=How.XPATH, using="//i[@class='icon-header-rating']")
	private WebElement compensationIcon;
	
	@FindBy(how=How.XPATH, using="//i[@class='icon-header-confirm']")
	private WebElement conformationIcon;
	
	@FindBy(how=How.XPATH, using="//input[@ng-click='clickhome()']")
	private WebElement NTTData;
	
	@FindBy(how=How.XPATH, using="(//label[text()='ذينفع حيات'])[1]")
	private WebElement lifeIterest;
	
	@FindBy(how=How.XPATH, using="//input[@name='FilterVO2.intro_Agent_Name']")
	private WebElement benefitOflife;
	
	@FindBy(how=How.XPATH, using="//input[@name='FilterVO2.relCode']/following-sibling::span/button/i[@class='icon-login-down-arrow']")
	private WebElement ratio;
	
	@FindBy(how=How.XPATH, using="//input[@name='FilterVO2.sharePerecentage']")
	private WebElement percentageShare;
	
	@FindBy(how=How.XPATH, using="//select[@name='FilterVO2.benfLevel']")
	private WebElement benefitLevel;
	
	@FindBy(how=How.XPATH, using="(//label[text()='اضافه نمودن			'])[2]/following-sibling::i[@class=' icon-transaction-add iconinline']")
	private WebElement lifeInterestAddBtn;
	
	public ProposalTransactionPage(WebDriver driver) {
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
	
	public ProposalTransactionPage clickAbandon() throws InterruptedException
	{
		waitForWebElementPresent(abandon, getTimeOut());
		scrollToWebElement(abandon);
		waitForElementToBeClickable(abandon, getTimeOut());
		_clickUsingJavaScript(abandon);
		_waitForPageLoad();
		//Thread.sleep(10000);
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	public ProposalTransactionPage selectHowToPay(String pay) throws Exception
	{
		_waitForJStoLoad();
		waitForWebElementPresent(payway, getTimeOut());
		_waitForJStoLoad();
    	selectDropDown(payway, pay, getTimeOut());
    	_waitForJStoLoad();
    	return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	public ProposalTransactionPage enterCapitalOfDeath(String sumassured) throws Exception 
	{
		//Thread.sleep(20000);
		//waitfor5sec();
		waitForWebElementPresent(capitalOfDeath, getTimeOut());
		waitForElementToBeClickable(capitalOfDeath, getTimeOut());
		capitalOfDeath.click();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		enterValueInFieldInput(capitalOfDeath, sumassured);
		driver.findElement(By.xpath("//label[@ficlabel='FLNB_Policy_Currency.label']")).click();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	public ProposalTransactionPage enterPlanedPremium(String premium) throws Exception 
	{
		waitForWebElementPresent(plannedPreium, getTimeOut());
		mouseClickByWebElement(plannedPreium);
		plannedPreium.sendKeys(premium);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	public ProposalTransactionPage clickRoleOfPeopleTab()
	{
		waitForWebElementPresent(theRoleOFPeopleTab, getTimeOut());
		scrollToWebElement(theRoleOFPeopleTab);
		waitForElementToBeClickable(theRoleOFPeopleTab, getTimeOut());
		_clickUsingJavaScript(theRoleOFPeopleTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	
	public ProposalTransactionPage clickonbeneficiarytab()
	{
		waitForWebElementPresent(beneficiaryTab, getTimeOut());
		scrollToWebElement(beneficiaryTab);
		waitForElementToBeClickable(beneficiaryTab, getTimeOut());
		_clickUsingJavaScript(beneficiaryTab);
		_waitForJStoLoad();
		scrollWindowToBottomOfPage();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	public ProposalTransactionPage enterBeneficiaryname(String beneficiaryame) throws Exception 
	{
		
		String xPath1 = "//label[text()='"+beneficiaryame+"']";
		waitfor5sec();
		waitForWebElementPresent(BeneficiaryName, getTimeOut());
		scrollToWebElement(RelationshipDropdown);
		clear(BeneficiaryName, "We are clearing input box");
		enterValueInFieldInput(BeneficiaryName, beneficiaryame);
		_waitForJStoLoad();
		waitForElementPresent(xPath1, getTimeOut());
		Thread.sleep(1000);
		//driver.findElement(byLocator(xPath1)).click();
		_clickUsingJavaScript(driver.findElement(byLocator(xPath1)));
		
		//hitEnter();
		//timeOutFor5Sec();
		//_waitForJStoLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);	
	}
	
	public ProposalTransactionPage clickrBeneficiaryelationshiparrow() throws Exception 
	{
		waitForWebElementPresent(RelationshipDropdown, getTimeOut());
		scrollToWebElement(RelationshipDropdown);
		_waitForJStoLoad();
		waitForElementToBeClickable(RelationshipDropdown, getTimeOut());
		_waitForJStoLoad();
		//Thread.sleep(2000);
		_clickUsingJavaScript(RelationshipDropdown);
		//RelationshipDropdown.click();
		//Thread.sleep(2000);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
	}
	
	public ProposalTransactionPage selectBeneficiaryrelationshipCode(String beneficiaryrelationship) throws Exception
	{
		//(//td/label[text()='R05'])[1]
		String xpath = "(//td/label[text()='"+beneficiaryrelationship+"'])[1]";
		waitForElementPresent(xpath, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(xpath)), getTimeOut());
		mouseClick(xpath, getTimeOut());
		waitfor5sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	public ProposalTransactionPage entershareofbeneficiary(String Share)
	{
		waitForWebElementPresent(share, getTimeOut());
		scrollToWebElement(share);
		enterValueInFieldInput(share, Share);
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	public ProposalTransactionPage selectPriorityOfTheBeneficiary(String PriorityLevel) 
	{
		waitForWebElementPresent(priorityLevel, getTimeOut());
		//selectDropDownByIndex(priorityLevel, 1);
    	selectDropDown(priorityLevel, PriorityLevel, getTimeOut());
    	return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
	}
	
	public ProposalTransactionPage clickonbeneficiaryAddbtn() throws Exception 
	{
		waitForWebElementPresent(BeneficiaryAddIcon, getTimeOut());
		scrollToWebElement(BeneficiaryAddIcon);
		waitForElementToBeClickable(BeneficiaryAddIcon, getTimeOut());
		_clickUsingJavaScript(BeneficiaryAddIcon);
		waitfor5sec();
		Thread.sleep(2000);
		_waitForPageLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
	}
	
	public ProposalTransactionPage clickOnLifeInterestTab()
	{
		waitForWebElementPresent(lifeIterest, getTimeOut());
		scrollToWebElement(lifeIterest);
		waitForElementToBeClickable(lifeIterest, getTimeOut());
		_clickUsingJavaScript(lifeIterest);
		_waitForJStoLoad();
		scrollWindowToBottomOfPage();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	
	
	
	
	
	public ProposalTransactionPage enterBenefitlifeDetails(String BenefitLife) throws Exception 
	{
		
		String xPath1 = "//label[text()='"+BenefitLife+"']";
		waitfor5sec();
		waitForWebElementPresent(benefitOflife, getTimeOut());
		clear(benefitOflife, "We are clearing input box");
		enterValueInFieldInput(benefitOflife, BenefitLife);
		_waitForJStoLoad();
		waitForElementPresent(xPath1, getTimeOut());
		Thread.sleep(1000);
		//driver.findElement(byLocator(xPath1)).click();
		_clickUsingJavaScript(driver.findElement(byLocator(xPath1)));
		
		//hitEnter();
		//timeOutFor5Sec();
		//_waitForJStoLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);	
	}
	
	public ProposalTransactionPage clickRatioDropdown() throws Exception 
	{
		waitForWebElementPresent(ratio, getTimeOut());
		scrollToWebElement(ratio);
		_waitForJStoLoad();
		waitForElementToBeClickable(ratio, getTimeOut());
		_waitForJStoLoad();
		//Thread.sleep(2000);
		_clickUsingJavaScript(ratio);
		//RelationshipDropdown.click();
		//Thread.sleep(2000);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
	}
	public ProposalTransactionPage selectRatioCode(String RatioCode) throws Exception
	{
		//(//td/label[text()='R05'])[1]
		String xpath = "(//td/label[text()='"+RatioCode+"'])[1]";
		waitForElementPresent(xpath, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(xpath)), getTimeOut());
		mouseClick(xpath, getTimeOut());
		waitfor5sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	public ProposalTransactionPage enterPercentageOfShare(String SharePercentage)
	{
		waitForWebElementPresent(percentageShare, getTimeOut());
		scrollToWebElement(percentageShare);
		enterValueInFieldInput(percentageShare, SharePercentage);
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	public ProposalTransactionPage selectBenefitlevel(String Level) 
	{
		waitForWebElementPresent(benefitLevel, getTimeOut());
		//selectDropDownByIndex(priorityLevel, 1);
    	selectDropDown(benefitLevel, Level, getTimeOut());
    	return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
	}
	public ProposalTransactionPage clickLifeInterestAddbtn() throws Exception 
	{
		waitForWebElementPresent(lifeInterestAddBtn, getTimeOut());
		scrollToWebElement(lifeInterestAddBtn);
		waitForElementToBeClickable(lifeInterestAddBtn, getTimeOut());
		_clickUsingJavaScript(lifeInterestAddBtn);
		waitfor5sec();
		Thread.sleep(2000);
		_waitForPageLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
	}
	public ProposalTransactionPage enterSecondBenefitDetails(String BenefitLife,String RatioCode,String SharePercentage,String Level) throws Exception
	{
		clickOnLifeInterestTab();
		enterBenefitlifeDetails(BenefitLife);
		clickRatioDropdown();
		selectRatioCode(RatioCode);
		enterPercentageOfShare(SharePercentage);
		selectBenefitlevel(Level); 
		clickLifeInterestAddbtn();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ProposalTransactionPage insuredRiskAnalysistab()
	{
		waitForWebElementPresent(riskAnalysisTab, getTimeOut());
		scrollToWebElement(riskAnalysisTab);
		waitForElementToBeClickable(riskAnalysisTab, getTimeOut());
		_clickUsingJavaScript(riskAnalysisTab);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	public ProposalTransactionPage enterheight(String Height) 
	{
	waitForWebElementPresent(height, getTimeOut());
		waitForElementToBeClickable(height, getTimeOut());
		height.click();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		//clear(SumAssured, "We are clearing  input box");
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		waitForWebElementPresent(height, getTimeOut());
		scrollToWebElement(height);
		enterValueInFieldInput(height, Height);
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
	}
	
	
	public ProposalTransactionPage enterweight(String Weight) 
	{
		waitForElementToBeClickable(weight, getTimeOut());
		weight.click();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		//clear(SumAssured, "We are clearing  input box");
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		waitForWebElementPresent(weight, getTimeOut());
		scrollToWebElement(weight);
		enterValueInFieldInput(weight, Weight);
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
	}
	
	public ProposalTransactionPage selectMaritalStatus(String status) 
	{
		_waitForJStoLoad();
		waitForWebElementPresent(MaritalStatusDropdown, getTimeOut());
		_waitForJStoLoad();
		mouseClickByWebElement(MaritalStatusDropdown);
    	selectDropDown(MaritalStatusDropdown, status, getTimeOut());
    	_waitForJStoLoad();
    	return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
	}
	
	public ProposalTransactionPage clickonnonmedicalNOradiobtn() throws Exception
	{
		waitfor5sec();
		waitForWebElementPresent(NonMedicalNo, getTimeOut());
		waitForElementToBeClickable(NonMedicalNo, getTimeOut());
		_clickUsingJavaScript(NonMedicalNo);
		_waitForJStoLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	
	public ProposalTransactionPage clickOnInsurancePolicyQuesBtn()
	{
		waitForWebElementPresent(insurancePolicyQuesbtn, getTimeOut());
		scrollToWebElement(insurancePolicyQuesbtn);
		waitForElementToBeClickable(insurancePolicyQuesbtn, getTimeOut());
		_clickUsingJavaScript(insurancePolicyQuesbtn);
		//_waitForJStoLoad();
		//_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);		
	}
	
	
	public ProposalTransactionPage clickGroupSelectionRadioBtn() throws Exception
	{
		waitfor5sec();
		waitForWebElementPresent(groupSelectionRadioBtn, getTimeOut());
		waitForElementToBeClickable(groupSelectionRadioBtn, getTimeOut());
		_clickUsingJavaScript(groupSelectionRadioBtn);
		_waitForJStoLoad();
		
		
		//click on medical ques tab  
		
		waitForWebElementPresent(medicalquesTab, getTimeOut());
		scrollToWebElement(medicalquesTab);
		waitForElementToBeClickable(medicalquesTab, getTimeOut());
		_clickUsingJavaScript(medicalquesTab);
		_waitForJStoLoad();
		_clickUsingJavaScript(groupSelectionRadioBtn);
		Thread.sleep(2000);
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	public ProposalTransactionPage clickonsavebtn() throws Exception 
	{

//		WebElement xpath=driver.findElement(By.xpath("//label[text()='زمينه فعاليت		']"));
//		waitForWebElementPresent(xpath, getTimeOut());
//		scrollToWebElement(xpath);
//		
//		WebElement xpath1=driver.findElement(By.xpath("//label[text()='اطلاعات تکميلي			']"));
//		waitForWebElementPresent(xpath1, getTimeOut());
//		scrollToWebElement(xpath1);
		
		
		//scrollWindowToTopOfPage();
		
		//scrollUp();
		pageup();
		
		waitForWebElementPresent(Savebtn, getTimeOut());
		scrollToWebElement(Savebtn);
		waitForElementToBeClickable(Savebtn, getTimeOut());
		_clickUsingJavaScript(Savebtn);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
	}
	
	//Supplementary information
	
	public ProposalTransactionPage clickOnSupplementaryInformationBtn()
	{
		waitForWebElementPresent(supplementaryInformationBtn, getTimeOut());
		scrollToWebElement(supplementaryInformationBtn);
		waitForElementToBeClickable(supplementaryInformationBtn, getTimeOut());
		_clickUsingJavaScript(supplementaryInformationBtn);
		//_waitForJStoLoad();
		//_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);		
	}
	
	
	public ProposalTransactionPage clickOnDetailsOfTheJobClassTab() 
	{
		waitForWebElementPresent(detailsOfTheJobClassTab, getTimeOut());
		scrollToWebElement(detailsOfTheJobClassTab);
		waitForElementToBeClickable(detailsOfTheJobClassTab, getTimeOut());
		_clickUsingJavaScript(detailsOfTheJobClassTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
	}
	
	public ProposalTransactionPage clickoccuptionarrow() 
	{
		waitForWebElementPresent(OccupationIcon, getTimeOut());
		scrollToWebElement(OccupationIcon);
		waitForElementToBeClickable(OccupationIcon, getTimeOut());
		OccupationIcon.click();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
	}
	
	public ProposalTransactionPage selectoccuption(String occuption) throws Exception
	{
		//(//td/label[text()='INDOOR'])[1]
				String xpath = "(//td/label[text()='"+occuption+"'])[1]";
				waitForElementPresent(xpath, getTimeOut());
				waitForElementToBeClickable(driver.findElement(byLocator(xpath)), getTimeOut());
				mouseClick(xpath, getTimeOut());
				_waitForJStoLoad();
				waitfor5sec();
				return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	public ProposalTransactionPage clickOnDocumentTab() 
	{
		waitForWebElementPresent(documentTab, getTimeOut());
		scrollToWebElement(documentTab);
		waitForElementToBeClickable(documentTab, getTimeOut());
		_clickUsingJavaScript(documentTab);
		//_waitForPageLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	
	public ProposalTransactionPage selectNextStep(String nextstep) 
	{
		_waitForJStoLoad();
		waitForWebElementPresent(selectionTheNextStep, getTimeOut());
		_waitForJStoLoad();
    	selectDropDown(selectionTheNextStep, nextstep, getTimeOut());
    	_waitForJStoLoad();
    	return PageFactory.initElements(driver, ProposalTransactionPage.class);
		
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
		waitfor5sec();
		//Thread.sleep(10000);
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	

	private WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	public DashboardPage clickonNTTDataLogo() throws Exception
	{
		waitfor5sec();
		waitForWebElementPresent(NTTData, getTimeOut());
		waitForElementToBeClickable(NTTData, getTimeOut());
		_clickUsingJavaScript(NTTData);
		_waitForPageLoad();
		waitfor5sec();
		Thread.sleep(2000);
		return PageFactory.initElements(driver, DashboardPage.class);
		
	}

	
	
	
	
	
	
	
	
	
	
	

	/**
	 * beneficiary details adding
	 * @throws Exception 
	 * 
	 */
	public ProposalTransactionPage addingBeneficiaryDetails(String beneficiaryame,String beneficiaryrelationship,String Share,String PriorityLevel) throws Exception
	{
		enterBeneficiaryname(beneficiaryame);
		clickrBeneficiaryelationshiparrow();
		selectBeneficiaryrelationshipCode(beneficiaryrelationship);
		entershareofbeneficiary(Share);
		selectPriorityOfTheBeneficiary(PriorityLevel); 
		clickonbeneficiaryAddbtn();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	/**
	 * enter Hight and Weight
	 * @param Height
	 * @param Weight
	 * @return
	 */
	public ProposalTransactionPage enterHightAndWeight(String Height,String Weight)
	{
		enterheight(Height);
		enterweight(Weight); 
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	/**
	 * 
	 * enter marital status and radio btn
	 * @throws Exception 
	 */
	public ProposalTransactionPage enterMaritalSatusdetails(String status) throws Exception
	{
		selectMaritalStatus(status);
		clickonnonmedicalNOradiobtn();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	
	/**
	 * 
	 * enter Insurance policy ques ans 
	 * @throws Exception 
	 */
	public ProposalTransactionPage enterInsurancePolicyQuesDetails() throws Exception
	{
		clickOnInsurancePolicyQuesBtn();
		clickGroupSelectionRadioBtn();
		clickonsavebtn() ;
		waitfor5sec();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	

	/**
	 * 
	 * enter supplementary Information details
	 * @throws Exception 
	 */
	public ProposalTransactionPage entersupplementaryInfoDetails(String occuption) throws Exception
	{
		clickOnSupplementaryInformationBtn();
		clickOnDetailsOfTheJobClassTab();
		clickoccuptionarrow();
		selectoccuption(occuption);
		clickOnDetailsOfTheJobClassTab();
		clickonsavebtn(); 
		waitfor5sec();
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
	}
	
	
	/**
	 * 
	 * enter document details
	 */
	public ProposalTransactionPage enterDocumentdetails(String nextstep)
	{
		clickOnDocumentTab();
		selectNextStep(nextstep);
		return PageFactory.initElements(driver, ProposalTransactionPage.class);
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

}

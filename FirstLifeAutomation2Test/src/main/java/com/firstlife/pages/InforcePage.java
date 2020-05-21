package com.firstlife.pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class InforcePage extends FirstLifeDriverHelper {
	
	@FindBy(how=How.XPATH, using="//input[@name='drcrSearch.policyNumber']")
	private WebElement insuranceNo;
	
	@FindBy(how=How.XPATH, using="//input[@name='drcrSearch.branchName']/../span/button/i[@class='icon-login-down-arrow']")
	private WebElement branchArrowIcon;
	
	@FindBy(how=How.XPATH, using="//label[text()='جستجو']")
	private WebElement search;
	
	@FindBy(how=How.XPATH, using="//label[text()='IRR ']")
	private WebElement searchTable;
	
	@FindBy(how=How.XPATH, using="(//label[text()='تراکنش'])[1]")
	private WebElement transaction;
	
	@FindBy(how=How.XPATH, using="//input[@ng-click='clickhome()']")
	private WebElement NTTData;
	
	//@FindBy(how=How.XPATH,using=".//input[@ng-model='batchHeaderVO.uploadFile']")
	@FindBy(how=How.XPATH,using="//input[@type='file']")
	private WebElement chosefile;
	
	@FindBy(how=How.XPATH, using="//ul[@id='navbuttons']/li/following-sibling::li/div/div/i[@class='icon-header-confirm']")
	private WebElement uploadBtn;
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='batchHeaderVO.trimFlag']")
	private WebElement checkbox;
	
	@FindBy(how=How.XPATH, using="//input[@name='batchFilterVO.batchId']")
	private WebElement batchId;
	
	@FindBy(how=How.XPATH, using="//i[@class=' icon-transaction-extract iconblock']")
	private WebElement inforcebtn;

	public InforcePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public InforcePage enterPolicyNo(String policyno)
	{
		waitForWebElementPresent(insuranceNo, getTimeOut());
		clear(insuranceNo, "clear the field first");
		enterValueInFieldInput(insuranceNo, policyno);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	public InforcePage clickOnBranchArrowIcon()
	{
		waitForWebElementPresent(branchArrowIcon, getTimeOut());
		scrollToElementView(branchArrowIcon);
		waitForElementToBeClickable(branchArrowIcon, getTimeOut());
		_clickUsingJavaScript(branchArrowIcon);
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	public InforcePage selectBranchCode(String branchcode)
	{
		//(//label[text()='008'])[1]
		String xpath="(//label[text()='"+branchcode+"'])[1]";
		waitForElementPresent(xpath, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(xpath)), getTimeOut());
		mouseClick(xpath, getTimeOut());
		_waitForJStoLoad();
		//waitfor5sec();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	public InforcePage clickOnSearchBtn()
	{
		waitForWebElementPresent(search, getTimeOut());
		scrollToElementView(search);
		waitForElementToBeClickable(search, getTimeOut());
		_clickUsingJavaScript(search);
		_waitForPageLoad();
		return PageFactory.initElements(driver, InforcePage.class);
		
	}
	
	/**
	 * 
	 * function for seach Insurance no
	 */
	public InforcePage searchInsuranceNo(String policyno,String branchcode)
	{
		enterPolicyNo(policyno);
		clickOnBranchArrowIcon();
		selectBranchCode(branchcode);
		clickOnSearchBtn();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	
	public InforcePage clickOnSearchTable() throws Exception
	{
		waitForWebElementPresent(searchTable, getTimeOut());
		waitForElementToBeClickable(searchTable, getTimeOut());
		_clickUsingJavaScript(searchTable);
		_waitForPageLoad();
		Thread.sleep(1000);
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	public InforcePage clickOnSearchTable2() throws Exception
	{
		WebElement searchTable2= driver.findElement(By.xpath("//label[text()='m_ezatkhah ']"));
		waitForWebElementPresent(searchTable2, getTimeOut());
		waitForElementToBeClickable(searchTable2, getTimeOut());
		_clickUsingJavaScript(searchTable2);
		_waitForPageLoad();
		Thread.sleep(1000);
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	public InforcePage clickOnTransactionTab()
	{
		waitForWebElementPresent(transaction, getTimeOut());
		waitForElementToBeClickable(transaction, getTimeOut());
		_clickUsingJavaScript(transaction);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	public String capturePaymentcode()
	{
		//waitForWebElementPresent(element, timeout);
		waitForElementPresent("(//input[@name='drcrVo.alternateReference'])[2]", getTimeOut());
		
		WebElement proposalno=driver.findElement(By.xpath("(//input[@name='drcrVo.alternateReference'])[2]"));
		String s = driver.findElement(By.xpath("(//input[@name='drcrVo.alternateReference'])[2]")).getAttribute("value");
		String capturePropasalNo=proposalno.getText();
		System.out.println("Number is"+capturePropasalNo);
		System.out.println("number is "+s);
		return 	s;
		
	}
	
	public String captureDebt()
	{
		//waitForWebElementPresent(element, timeout);
				waitForElementPresent("(//input[@name='drcrVo.openingBalance.formattedAmountbaseAmount'])[2]", getTimeOut());
				
				WebElement proposalno=driver.findElement(By.xpath("(//input[@name='drcrVo.openingBalance.formattedAmountbaseAmount'])[2]"));
				String a = driver.findElement(By.xpath("(//input[@name='drcrVo.openingBalance.formattedAmountbaseAmount'])[2]")).getAttribute("value");
				String capturePropasalNo=proposalno.getText();
				System.out.println("Number is"+capturePropasalNo);
				System.out.println("number is "+a);
				return 	a;
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

	
	public InforcePage clickOnChoseFile() throws Exception
	{
		waitForWebElementPresent(chosefile, getTimeOut());
		waitForElementToBeClickable(chosefile, getTimeOut());
		_clickUsingJavaScript(chosefile);
		chosefile.click();
		waitfor5sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	

	public InforcePage clickOnCheckbox() throws Exception
	{
		
		waitForWebElementPresent(checkbox, getTimeOut());
		waitForElementToBeClickable(checkbox, getTimeOut());
		checkbox.click();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	public InforcePage clickOnuploadBTn() throws Exception
	{
		waitfor5sec();
		Actions builder= new Actions(driver);
		builder.moveToElement(uploadBtn).click(uploadBtn);
		builder.perform();
		_waitForPageLoad();
		
		/*
		waitfor5sec();
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",uploadBtn);
		_waitForPageLoad();
		*/
		
		
		/*
		waitfor5sec();
		uploadBtn.sendKeys(Keys.ENTER);
		_waitForPageLoad();
		*/
		
	/*	Thread.sleep(1000);
		waitForWebElementPresent(uploadBtn, getTimeOut());
		scrollToElementView(uploadBtn);
		waitForElementToBeClickable(uploadBtn, getTimeOut());
		uploadBtn.click();
		//_clickUsingJavaScript(uploadBtn);
		_waitForJStoLoad();
		
		String xapth="//label[text()='batch error Deta']";
		waitForElementPresent(xapth, getTimeOut());
		mouseClick(xapth, getTimeOut());
		_waitForJStoLoad();
		
		waitForWebElementPresent(checkbox, getTimeOut());
		waitForElementToBeClickable(checkbox, getTimeOut());
		checkbox.click();
		_waitForJStoLoad();
		*/
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	
	/*
	public InforcePage sendkeysupload()
	{
		//WebElement element = driver.findElement(By.xpath(chosefile));
		//To input the filename along with path
		chosefile.sendKeys("D:\\\\8003checkout\\\\FirstLifeAutomation2Test\\\\propertyFile\\\\NEW_NTT_Settlement_Upload.xlsx");
		// To click on the submit button (Not the browse button)
		driver.findElement(By.xpath("//ul[@id='navbuttons']/li/following-sibling::li/div/div/i[@class='icon-header-confirm']")).click();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	*/
	
	
	public String captureBatchId()
	{
		//waitForWebElementPresent(element, timeout);
		waitForElementPresent("//input[@name='batchHeaderVO.batchId']", getTimeOut());
		
		WebElement proposalno=driver.findElement(By.xpath("//input[@name='batchHeaderVO.batchId']"));
		String s = driver.findElement(By.xpath("//input[@name='batchHeaderVO.batchId']")).getAttribute("value");
		System.out.println("number is "+s);
		return 	s;
		
	}
	
	public InforcePage enterBatchId(String Batchid)
	{
		waitForWebElementPresent(batchId, getTimeOut());
		clear(batchId, "clear batch id if any data is there");
		enterValueInFieldInput(batchId, Batchid);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	
	public InforcePage clickonInforcebtn()
	{
		waitForWebElementPresent(inforcebtn, getTimeOut());
		waitForElementToBeClickable(inforcebtn, getTimeOut());
		inforcebtn.click();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, InforcePage.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

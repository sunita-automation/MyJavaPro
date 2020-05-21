package com.firstlife.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class PolicyEnquirePage extends FirstLifeDriverHelper {
	
	
	@FindBy(how=How.XPATH,using="//input[@name='policyFilterVO.proposal_No']")
	private WebElement offerNo;
	
	@FindBy(how=How.XPATH, using="//button[text()='جستجو			']")
	private WebElement Search;
	
	
	@FindBy(how=How.XPATH,using="//label[text()='معوق ']")
	private WebElement status;
	
	
	

	public PolicyEnquirePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public PolicyEnquirePage enterOfferNo(String OfferNo) 
	{
		waitForWebElementPresent(offerNo, getTimeOut());
		clear(offerNo, "We are clearing input box");
		enterValueInFieldInput(offerNo, OfferNo);
		return PageFactory.initElements(driver, PolicyEnquirePage.class);	
	}
	
	public PolicyEnquirePage clickonsearchbtn() throws Exception
	{
		waitfor5sec();
		waitForWebElementPresent(Search, getTimeOut());
		scrollToWebElement(Search);
		waitForElementToBeClickable(Search, getTimeOut());
		Search.click();
		//_clickUsingJavaScript(Search);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, PolicyEnquirePage.class);
		
	}
	
	 public PolicyEnquirePage clickOnSearchTable()
	 {
		 String xpath= "//label[text()='معوق ']";
		 waitForWebElementPresent(status, getTimeOut());
		 waitForElementToBeClickable(status, getTimeOut());
		 mouseDoubleClick(xpath, getTimeOut());
		 return PageFactory.initElements(driver, PolicyEnquirePage.class);
		 
	 }
	
	
	
	
	
	public String capturePolicyNo()
	{
		//waitForWebElementPresent(element, timeout);
		waitForElementPresent("//input[@name='policyEnquiryHdrVO.policyNo']", getTimeOut());
		
		WebElement proposalno=driver.findElement(By.xpath("//input[@name='policyEnquiryHdrVO.policyNo']"));
		String s = driver.findElement(By.xpath("//input[@name='policyEnquiryHdrVO.policyNo']")).getAttribute("value");
		String capturePropasalNo=proposalno.getText();
		System.out.println("Number is"+capturePropasalNo);
		System.out.println("number is "+s);
		return 	s;
		
	}

}

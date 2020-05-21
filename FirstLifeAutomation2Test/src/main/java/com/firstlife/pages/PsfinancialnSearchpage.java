package com.firstlife.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.firstlife.utils.FirstLifeDriverHelper;

public class PsfinancialnSearchpage extends FirstLifeDriverHelper
{
	
	//XPATHS
	
	@FindBy(how=How.XPATH, using="//select[@ng-model='policyFilterVO.movtAction']")
	private WebElement activitytype;
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='policyFilterVO.policyNo']")
	private WebElement policynofield;
	
	@FindBy(how=How.XPATH, using="//i[@class='icon-transaction-search searchbutton-icon-align']")
	private WebElement searchBtn;
	
	

	public PsfinancialnSearchpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//METHODS
	
	  public PsfinancialnSearchpage slectActType(String Atype)
	  {
		  
		  waitForWebElementPresent(activitytype,getTimeOut());
			mouseClickByWebElement(activitytype);
			selectDropDown(activitytype,Atype , getTimeOut());
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PsfinancialnSearchpage.class);  
	  }

	  public PsfinancialnSearchpage providePolicyNO(String Pno) throws Exception
	  {
		  	waitForWebElementPresent(policynofield, getTimeOut());
			mouseClickByWebElement(policynofield);
			clear(policynofield, Pno);
			enterValueInFieldInput(policynofield, Pno);
			_waitForJStoLoad();
			return PageFactory.initElements(driver, PsfinancialnSearchpage.class); 
	  }
	  
	  public PsfinancialnSearchpage clickOnSearch() throws Exception
		{
			waitForWebElementPresent(searchBtn, getTimeOut());
			mouseClickByWebElement(searchBtn);
			waitfor5sec();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PsfinancialnSearchpage.class);
		}
	  
	  public PolicyTransactionPage clickOnpolicynum(String Pno) throws Exception
		{
		  _waitForPageLoad();
		//label[text()='1395010080000628 ']
			String s = "//label[text()='"+Pno+" ']";
			waitForElementPresent(s, getTimeOut());
			waitForElementToBeClickable(driver.findElement(byLocator(s)), getTimeOut());
			Thread.sleep(2000);
			mouseClick(s, getTimeOut());
			_waitForJStoLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, PolicyTransactionPage.class);
		}
	  
	 
	  
}

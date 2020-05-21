package com.firstlife.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class ConvertQuotePage extends FirstLifeDriverHelper
{
	//XPATHS
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='fLQuotationFilterVO.quotNumber']")
	private WebElement provideQuoNO;
	
	@FindBy(how=How.XPATH,using="//button[@ficlabel='FLUW_Search.button']")
	private WebElement searchBtn;
	
	@FindBy(how=How.XPATH,using="//input[@ng-model='data.quotSelectedFlag']")
	private WebElement selectquote;
	
	@FindBy(how=How.XPATH,using="//button[@ficlabel='FLQT_Convert.label']")
	private WebElement convertBtn;
	
	

	public ConvertQuotePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//METHODS
	
	public ConvertQuotePage provideQuoteNO(String Qno) throws Exception
	{
		waitForWebElementPresent(provideQuoNO, getTimeOut());
		mouseClickByWebElement(provideQuoNO);
		waitfor5sec();
		enterValueInFieldInput(provideQuoNO, Qno);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		waitfor5sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ConvertQuotePage.class);
	}
	
	public ConvertQuotePage clickOnSearch() throws Exception
	{
		waitForWebElementPresent(searchBtn, getTimeOut());
		mouseClickByWebElement(searchBtn);
		waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, ConvertQuotePage.class);
	}
	
	public ConvertQuotePage selectQuote() throws Exception
	{
		waitForWebElementPresent(selectquote, getTimeOut());
		mouseClickByWebElement(selectquote);
		_waitForPageLoad();
		return PageFactory.initElements(driver, ConvertQuotePage.class);
	}
	
	public ConvertQuotePage clickOnConvert() throws Exception
	{
		waitForWebElementPresent(convertBtn, getTimeOut());
		mouseClickByWebElement(convertBtn);
		waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, ConvertQuotePage.class);
	}
	
	public ConvertQuotePage gettextvalue() throws Exception
	{
		_waitForPageLoad();
		waitfor5sec();
		waitForElementPresent("//div/label[@class='ng-binding']", getTimeOut());
		String s = driver.findElement(By.xpath("//div/label[@class='ng-binding']")).getText();
		System.out.println("text is "+s);
		return PageFactory.initElements(driver, ConvertQuotePage.class);
	}

}

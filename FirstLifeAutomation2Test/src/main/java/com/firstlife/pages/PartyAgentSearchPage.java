package com.firstlife.pages;

import com.firstlife.utils.FirstLifeDriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PartyAgentSearchPage extends FirstLifeDriverHelper
{
					//XPATHS

	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='FICUTIL_add.label']")
	private WebElement addBtn;
	
	
	
	

	public PartyAgentSearchPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
					//METHODS
	
	public PartyAgentTransactionPage clickOnAdd() throws Exception
	{
		waitfor5sec();
		waitForWebElementPresent(addBtn, getTimeOut());
		mouseClickByWebElement(addBtn);
		Thread.sleep(10000);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgentTransactionPage.class);
	}
}

package com.firstlife.pages;

import com.firstlife.utils.FirstLifeDriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class PartyAgencySearchPage extends FirstLifeDriverHelper
{

							//XPATHS
	@FindBy(how=How.XPATH,using="//i[@class='glyphicon glyphicon-pencil addbutton-icon-align']")
	private WebElement addBtn;
	
	
	
	public PartyAgencySearchPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
							//METHODS
	
	public PartyAgencyTransactionPage clickOnAdd() throws Exception
	{
		waitfor5sec();
		waitForWebElementPresent(addBtn, getTimeOut());
		mouseClickByWebElement(addBtn);
		Thread.sleep(10000);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PartyAgencyTransactionPage.class);
	}
	
	
}

package com.firstlife.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class PeopleIndividualPage extends FirstLifeDriverHelper
{

	//XPATHS
	@FindBy(how=How.XPATH,using="//div[@class='verticalline searchbutton-verticalilline']")
	private WebElement addBtn;
	
	public PeopleIndividualPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//METHODS

	public PeopleIndividualTransactionPage clickOnAdd() throws Exception
	{	waitfor5sec();
		waitForWebElementPresent(addBtn, getTimeOut());
		mouseClickByWebElement(addBtn);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleIndividualTransactionPage.class);
	}
	
}

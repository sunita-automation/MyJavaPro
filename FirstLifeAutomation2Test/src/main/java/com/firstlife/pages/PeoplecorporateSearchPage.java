package com.firstlife.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.firstlife.utils.FirstLifeDriverHelper;

public class PeoplecorporateSearchPage extends FirstLifeDriverHelper
{
	
					//XPATHS
	
	@FindBy(how=How.XPATH,using="//LABEL[@ficlabel='FICUTIL_add.label']")
	private WebElement addBtn;


	public PeoplecorporateSearchPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

					//METHODS
	
	public PeopleCorporateTransactionPage clickOnAdd() throws Exception
	{	waitfor5sec();
		waitForWebElementPresent(addBtn, getTimeOut());
		mouseClickByWebElement(addBtn);
		_waitForPageLoad();
		return PageFactory.initElements(driver, PeopleCorporateTransactionPage.class);
	}
	
	
}

package com.firstlife.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.firstlife.utils.FirstLifeDriverHelper;

public class SearchIndividualPage extends FirstLifeDriverHelper
{
	
	@FindBy(how=How.XPATH, using="//label[text()='Add']")
	private WebElement addButton;

	public SearchIndividualPage(WebDriver driver) 
	{
		super(driver);
	}
	
	public IndividualFormPage clickOnAddButton()
	{
		waitForWebElementPresent(addButton, getTimeOut());
		scrollToWebElement(addButton);
		waitForElementToBeClickable(addButton, getTimeOut());
		_clickUsingJavaScript(addButton);
		_waitForPageLoad();
		return PageFactory.initElements(driver, IndividualFormPage.class);
	}
}

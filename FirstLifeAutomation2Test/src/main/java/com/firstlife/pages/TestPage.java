package com.firstlife.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.firstlife.utils.FirstLifeDriverHelper;

public class TestPage extends FirstLifeDriverHelper 
{

							//XPATH
	@FindBy(how=How.XPATH,using="(//ul[@class='pagination table-pagination']/li/a)[2]")
	private WebElement nextBtn;
	
	
	public TestPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

							//METHODS
	public TestPage choosePropNo(String num)
	{
		
		return PageFactory.initElements(driver, TestPage.class);
	}
	
	
}

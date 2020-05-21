package com.firstlife.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.firstlife.utils.FirstLifeDriverHelper;

public class SuccessMessagePage extends FirstLifeDriverHelper {
	public SuccessMessagePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(how=How.XPATH,using="//input[@name='proposalHeaderVO.message']/..")
	private WebElement proposalnomsg;
	
	
	public String captureproposalno()
	{
		System.out.println("hi");
		//WebElement value=driver.findElement(By.xpath("(//div[@class=' col-lg-4 col-md-4 col-sm-4 col-xs-12 col-md-offset-1 col-sm-offset-1 col-xs-offset-1']/label/text())[1]"));
		By be = By.xpath("(//div[@class=' col-lg-4 col-md-4 col-sm-4 col-xs-12 col-md-offset-1 col-sm-offset-1 col-xs-offset-1']/label/text())[1]");
		WebElement ele = (WebElement)driver.findElement(be);
		//String result = obj.toString();
		String fetchvalue=ele.getText();
		System.out.println(fetchvalue);
		//return PageFactory.initElements(driver, SuccessMessagePage.class);
		
		return fetchvalue;
	}

}

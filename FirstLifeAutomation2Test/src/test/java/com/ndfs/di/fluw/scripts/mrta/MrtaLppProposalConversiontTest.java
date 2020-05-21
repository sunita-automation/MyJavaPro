package com.ndfs.di.fluw.scripts.mrta;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.ConvertQuotePage;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class MrtaLppProposalConversiontTest extends FirstLifeTestCaseHelper 
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private ConvertQuotePage convertQuotePage;
	
	//VARIABLES
	private String Qno;
	
	@Test
	public void qutotationConversion() throws Exception
	{
		//EXCEL DATA
		
		Qno=propertyReader.getCellData2(1, 7, 13);
		
		
		
		//SCRIPTS
		
		repoterLog = extent.createTest("openLoginPage");
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		dashboardPage.mouseOverToManuBarDropDown();
		logger.info("Hovering mouse to manu bar");		
		dashboardPage.mouseOverToManuBarDropDown();
		dashboardPage.mouseOverToQuotationonDropDown();
		
		convertQuotePage=dashboardPage.clickonConvert();
		
		convertQuotePage.provideQuoteNO(Qno);
		convertQuotePage.clickOnSearch();
		convertQuotePage.selectQuote();
		convertQuotePage.clickOnConvert();
		
		Thread.sleep(10000);
		
	}
	
}

package com.firstlife.test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.IndividualFormPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.SearchIndividualPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class Test1 extends FirstLifeTestCaseHelper
{
	
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private SearchIndividualPage searchIndividualPage;
	private IndividualFormPage individualFormPage;
	
	@Test
	public void openLoginPage() throws Exception
	{
		repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		dashboardPage.mouseOverToManuBarDropDown();
		logger.info("Hovering mouse to manu bar");
		Thread.sleep(2000);
		
	dashboardPage.mouseOverToManuBarDropDown();
	dashboardPage.mouseOverToPeopleOnDropDown();
	dashboardPage.mouseOverToPersonDefinitionOnDropDown();
	dashboardPage.mouseOverToclientOnDropPersonDown();
		
		
		
		
	takeScreenShot("test");
		
		//searchIndividualPage = dashboardPage.clickOnIndividualOnDropDown();
		/*individualFormPage = searchIndividualPage.clickOnAddButton();
		individualFormPage.clickOnSeriesRadioButton();
		individualFormPage.selectSeriesDropDownAs("CI");
		individualFormPage.clickOnGeneratePartyIDButton();
		individualFormPage.enterFirstName("mark");
		individualFormPage.enterLastName("mark");
		individualFormPage.selectMale();
		individualFormPage.enterBOD("12/11/1991");
		individualFormPage.clickOnTaxTypeArrow();
		individualFormPage.selectACode("ITAX");*/
		
	}


}

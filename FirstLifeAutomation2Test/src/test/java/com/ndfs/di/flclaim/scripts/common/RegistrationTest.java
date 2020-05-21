package com.ndfs.di.flclaim.scripts.common;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.RegistrartionPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class RegistrationTest  extends FirstLifeTestCaseHelper
{

	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private RegistrartionPage registrartionPage;
	
	//VARIABLES
    private String 	CNum,claimopt;
	
	@Test
	public void RegistrationPage() throws Exception
	{
		//EXCEL SHEET DATA
		CNum=propertyReader.getCellData2(5, 1, 4);
		claimopt=propertyReader.getCellData2(5, 1, 5);
		
		
		
		//SCRIPTS
		
		repoterLog = extent.createTest("Registration Result");
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		

		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		logger.info("Hovering mouse to manu bar");	
		dashboardPage.mouseOverToclaimsDropdown();
		dashboardPage.mouseOverToclaimsRegistrationDropdown();
		
		registrartionPage=dashboardPage.clickOnaddreg();
		registrartionPage.provideClaimNo(CNum);
//	registrartionPage.clickOnStatus();
		registrartionPage.clickOnSearch();
		registrartionPage.clickOnCliamNo(CNum);
		registrartionPage.clickOnBenTab();
		registrartionPage.selectclaimtype(claimopt);
		registrartionPage.clickCalcEligibility();
		registrartionPage.clickOnPayeeTab();
		registrartionPage.clickOnReserveDetailTab();
		registrartionPage.clickOnRecoveriesTab();
		registrartionPage.clickOnDocListTab();
		registrartionPage.clickOnCheckBox();
		registrartionPage.clickOnDocumentsTab();
		registrartionPage.clickOnConfirm();
		
		
		Thread.sleep(10000);

	}
}

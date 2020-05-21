package com.ndfs.di.fluw.scripts.endw20;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.PolicyTransactionPage;
import com.firstlife.pages.PsfinancialnSearchpage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class PSAdditionOfRiderENDW20Test extends FirstLifeTestCaseHelper{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private PsfinancialnSearchpage psfinancialnSearchpage;
	private PolicyTransactionPage policyTransactionPage;
	// variables
		private String insuranceNo , Atype,Rider1,coating ,Rider2,Rider3,Rider4,coating1,Choice;
		
		
		
		
		@Test
		public void AdditionOfRiders() throws Throwable 
		{
			
			
			Atype=propertyReader.getCellData(15, 1, 2);
			insuranceNo=propertyReader.getCellData(15, 12, 1);
			Rider1= propertyReader.getCellData(15, 13, 7);
			coating =propertyReader.getCellData(15, 1, 8);
			Choice=propertyReader.getCellData(15, 1, 6);
			
			
			//login details
			 repoterLog = extent.createTest("Addition Of Rider Result Page");
			
			
			loginPage = applicationSetup();
			logger.info("Launching application");
			repoterLog.log(Status.INFO, "Application setup completed");
			
			dashboardPage = loginPage.login();
			logger.info("Log in to application");
			Thread.sleep(2000);
			
			
			
			
			dashboardPage.mouseOverToPolicySericeBar();
			dashboardPage.mouseOverToFinancial();
			psfinancialnSearchpage = dashboardPage.clickOnAdditionOfRider();
			psfinancialnSearchpage.slectActType(Atype);
			psfinancialnSearchpage.providePolicyNO(insuranceNo);
			psfinancialnSearchpage.clickOnSearch();
			
			policyTransactionPage = psfinancialnSearchpage.clickOnpolicynum(insuranceNo);
			Thread.sleep(20000);
			policyTransactionPage.clickOnPersonsRoleTab();
			policyTransactionPage.clickOnCoverageTab();
			policyTransactionPage.clickOnAdditionCoverageTab();
			policyTransactionPage.Select1stRiderRider(Rider1,coating);
			policyTransactionPage.clickOnUWTab();
			policyTransactionPage.selectChoice(Choice);
			policyTransactionPage.clickOnSummaryTab();
			policyTransactionPage.clickOnCalculate();
			Thread.sleep(2000);
			policyTransactionPage.clickOnConfirm();
			
			
			Thread.sleep(20000);
		
		}

}

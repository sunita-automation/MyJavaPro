package com.ndfs.di.fluw.scripts.universallife;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.PolicyTransactionPage;
import com.firstlife.pages.PsfinancialnSearchpage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class PSAdditionOfRiderULTest extends FirstLifeTestCaseHelper{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private PsfinancialnSearchpage psfinancialnSearchpage;
	private PolicyTransactionPage policyTransactionPage;
	// variables
		private String insuranceNo , Atype,Rider1,coating ,Rider2,Rider3,Rider4,coating1,Rider5,Rider6,Choice;
		
		
		
		
		@Test
		public void AdditionOfRiders() throws Throwable 
		{
			
			
			Atype=propertyReader.getCellData(15, 1, 2);
			insuranceNo=propertyReader.getCellData(15, 9, 1);
			Rider1= propertyReader.getCellData(15, 7, 7);
			coating =propertyReader.getCellData(15, 1, 8);
			Rider2=propertyReader.getCellData(15, 8, 7);
			Rider3 = propertyReader.getCellData(15, 9, 7);
			Rider4 =propertyReader.getCellData(15, 10, 7);
			coating1= propertyReader.getCellData(15, 2, 8);
			Rider5=propertyReader.getCellData(15, 11, 7);
			Rider6=propertyReader.getCellData(15, 12, 7);
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
			Thread.sleep(10000);
			policyTransactionPage.clickOnPersonsRoleTab();
			policyTransactionPage.clickOnCoverageTab();
			policyTransactionPage.clickOnAdditionCoverageTab();
			policyTransactionPage.Select1stRiderRider(Rider1,coating);
			policyTransactionPage.Select2ndRiderRider(Rider2);
			policyTransactionPage.Select3rdRiderRider(Rider3);
			policyTransactionPage.Select4thRiderRider(Rider4,coating1);
			policyTransactionPage.Select2ndRiderRider(Rider5);
			policyTransactionPage.Select2ndRiderRider(Rider6);
			policyTransactionPage.clickOnUWTab();
			policyTransactionPage.selectChoice(Choice);
			policyTransactionPage.clickOnSummaryTab();
			policyTransactionPage.clickOnCalculate();
			policyTransactionPage.clickOnConfirm();
			
			
			Thread.sleep(20000);
		
		}

}

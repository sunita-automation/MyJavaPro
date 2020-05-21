package com.ndfs.di.fluw.scripts.endw12;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.ProposalTransactionPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class AcceptanceENDW12Test extends FirstLifeTestCaseHelper{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.AcceptancePage AcceptancePage;
	private ProposalTransactionPage ProposalTransactionPage;
	private com.firstlife.pages.SuccessMessagePage SuccessMessagePage;
	
	private String num,status;
	
	@Test
	public void UnderwrittingRequirement() throws Throwable 
	{
		//input data
		int i=1;
		num=propertyReader.getCellData(12, i, 28);
		status=propertyReader.getCellData(12, 1, 20);
		
		
		
		
		//login details
		 repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		Thread.sleep(2000);
		
		
		
		AcceptancePage=dashboardPage.chooseAcceptanceNo(num);
		Thread.sleep(20000);
		
		
		String s= AcceptancePage.captureproposalno();
		//propertyReader.updateProperty("conversion_06", s);
		propertyReader.setCellDataXlsx(12, i, 29, s);
		
		AcceptancePage.clickOnReceptionTab();
		AcceptancePage.selectOfferStatus(status);
		AcceptancePage.calculateTheValue();
		AcceptancePage.clickConformationBtn();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
	}

}








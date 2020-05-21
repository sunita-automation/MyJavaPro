package com.ndfs.di.fluw.scripts.convertibleterm;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.ProposalTransactionPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class AcceptanceCTTest extends FirstLifeTestCaseHelper{
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
		num=propertyReader.getCellData(9, i, 24);
		status=propertyReader.getCellData(9, i, 18);
		
		
		
		
		//login details
		 repoterLog = extent.createTest("Acceptance CTT Result");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		takeScreenShot("Login_AC");
		Thread.sleep(2000);
		
		
		
		AcceptancePage=dashboardPage.chooseAcceptanceNo(num);
		Thread.sleep(20000);
		
		
		String s= AcceptancePage.captureproposalno();
		//propertyReader.updateProperty("conversion_06", s);
		propertyReader.setCellDataXlsx(9, i, 25, s);
		
		AcceptancePage.clickOnReceptionTab();
		AcceptancePage.selectOfferStatus(status);
		takeScreenShot("AC_Page1");
		AcceptancePage.calculateTheValue();
		takeScreenShot("AC_Page2");
		AcceptancePage.clickConformationBtn();
		Thread.sleep(10000);
		
		
		
		
		
		
		
		
	}

}


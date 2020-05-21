package com.ndfs.di.fluw.scripts.simplelife;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.ProposalTransactionPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class UnderwrittingTLTest extends FirstLifeTestCaseHelper {
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.UnderwrittingPage UnderwrittingPage;
	private ProposalTransactionPage ProposalTransactionPage;
	private com.firstlife.pages.SuccessMessagePage SuccessMessagePage;
	
	private String num,Result;
	
	@Test
	public void UnderwrittingRequirement() throws Throwable 
	{
		//input data
		int i=1;
		num=propertyReader.getCellData(1, i, 23);
		Result=propertyReader.getCellData(1, 1, 17);
		
		
		//login details
		 repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		takeScreenShot("Login_UW");
		
		Thread.sleep(2000);
		
		
		UnderwrittingPage=dashboardPage.chooseUnderwrittingNo(num);
		takeScreenShot("UW_Page1");
		Thread.sleep(20000);
		
		String s= UnderwrittingPage.captureproposalno();
		//propertyReader.updateProperty("Acceptance_06", s);
		propertyReader.setCellDataXlsx(1, i, 24, s);
		
		UnderwrittingPage.clickOnExpertiseOfIssuanceTab();
		UnderwrittingPage.selectExaminationResult(Result);
		takeScreenShot("UW_Page2");
		UnderwrittingPage.calculateTheValue();
		takeScreenShot("UW_Page3");
		UnderwrittingPage.clickConformationBtn();
		
		Thread.sleep(2000);
		
	}

}

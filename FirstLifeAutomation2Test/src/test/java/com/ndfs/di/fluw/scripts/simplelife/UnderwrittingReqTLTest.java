package com.ndfs.di.fluw.scripts.simplelife;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.ProposalTransactionPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class UnderwrittingReqTLTest extends FirstLifeTestCaseHelper{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.UnderwritingRequirementsPage UnderwritingRequirementsPage;
	private ProposalTransactionPage ProposalTransactionPage;
	private com.firstlife.pages.SuccessMessagePage SuccessMessagePage;
	
	private String num,Nextstep,received;
	
	@Test
	public void UnderwrittingRequirement() throws Throwable 
	{
		//input data
		int i=1;
		num=propertyReader.getCellData(1, i, 22);
		Nextstep=propertyReader.getCellData(1, i, 14);
		received=propertyReader.getCellData(1, i, 16);
		
		//login details
		
         repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		takeScreenShot("Login_UWRQ");
		Thread.sleep(2000);
		
		
		UnderwritingRequirementsPage=dashboardPage.choosePropNo(num);
		takeScreenShot("Login_UWRQ1");
		Thread.sleep(20000);
		
		String s=UnderwritingRequirementsPage.captureproposalno();
		//propertyReader.updateProperty("underwritting_06", s);
		propertyReader.setCellDataXlsx(1, i, 23, s);
		
		
		UnderwritingRequirementsPage.clickOnDocumentTab();
		UnderwritingRequirementsPage.selectNextStep(Nextstep);
		takeScreenShot("UWRQ_page1");
		UnderwritingRequirementsPage.clickOnMedicalDocumentTab();
		UnderwritingRequirementsPage.selectAllMedicalDoctRecieved(received);
		takeScreenShot("UWRQ_page2");
		UnderwritingRequirementsPage.calculateTheValue();
		UnderwritingRequirementsPage.clickConformationBtn();
		takeScreenShot("UWRQ_page3");
		Thread.sleep(10000);
		dashboardPage=UnderwritingRequirementsPage.clickonNTTDataLogo();
		Thread.sleep(2000);
	}

}

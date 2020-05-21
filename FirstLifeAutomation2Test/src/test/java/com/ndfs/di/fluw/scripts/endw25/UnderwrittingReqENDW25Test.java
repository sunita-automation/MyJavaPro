package com.ndfs.di.fluw.scripts.endw25;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.ProposalTransactionPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class UnderwrittingReqENDW25Test extends FirstLifeTestCaseHelper {
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
		num=propertyReader.getCellData(14, i, 26);
		Nextstep=propertyReader.getCellData(14, i, 16);
		received=propertyReader.getCellData(14, i, 18);
		
		//login details
		
         repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		Thread.sleep(2000);
		
		
		UnderwritingRequirementsPage=dashboardPage.choosePropNo(num);
		Thread.sleep(20000);
		
		String s=UnderwritingRequirementsPage.captureproposalno();
		//propertyReader.updateProperty("underwritting_06", s);
		propertyReader.setCellDataXlsx(14, i, 27, s);
		
		
		UnderwritingRequirementsPage.clickOnDocumentTab();
		UnderwritingRequirementsPage.selectNextStep(Nextstep);
		UnderwritingRequirementsPage.clickOnMedicalDocumentTab();
		UnderwritingRequirementsPage.selectAllMedicalDoctRecieved(received);
		UnderwritingRequirementsPage.calculateTheValue();
		UnderwritingRequirementsPage.clickConformationBtn();
		Thread.sleep(10000);
		dashboardPage=UnderwritingRequirementsPage.clickonNTTDataLogo();
		Thread.sleep(2000);
	}

}



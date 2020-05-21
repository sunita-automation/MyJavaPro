package com.ndfs.di.fluw.scripts.ipp;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.ProposalTransactionPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class UnderwrittingRequirementIPPTest extends FirstLifeTestCaseHelper {
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.UnderwritingRequirementsPage UnderwritingRequirementsPage;
	private ProposalTransactionPage ProposalTransactionPage;
	private com.firstlife.pages.SuccessMessagePage SuccessMessagePage;
	
	
	private String num,Nextstep,received;
	
	@Test
	public void UnderwrittingRequirement() throws Throwable 
	{
		int i = 1;
		//input data
		
		//num=propertyReader.readTestData("ProposalNo_06");
		num=propertyReader.getCellData(0, i, 22);
		Nextstep=propertyReader.getCellData(0, 1, 14);
		received=propertyReader.getCellData(0, 1, 16);
		

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
		propertyReader.setCellDataXlsx(0, i, 23, s);
		
		
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

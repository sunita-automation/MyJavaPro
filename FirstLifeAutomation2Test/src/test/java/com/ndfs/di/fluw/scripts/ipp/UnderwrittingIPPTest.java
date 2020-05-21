package com.ndfs.di.fluw.scripts.ipp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.ProposalTransactionPage;
import com.firstlife.utils.FirstLifeDriverHelper;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class UnderwrittingIPPTest extends FirstLifeTestCaseHelper {
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.UnderwrittingPage UnderwrittingPage;
	private ProposalTransactionPage ProposalTransactionPage;
	private com.firstlife.pages.SuccessMessagePage SuccessMessagePage;
	
	
	private String num,Result;
	
	@Test
	public void UnderwrittingRequirement() throws Throwable 
	{
		int i=1;
		//input data
		
		//num=propertyReader.readTestData("underwritting_06");
		num=propertyReader.getCellData(0, i, 23);
		Result=propertyReader.getCellData(0, 1, 17);
		
		
		//login details
		 repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		Thread.sleep(2000);
		
		
		UnderwrittingPage=dashboardPage.chooseUnderwrittingNo(num);
		Thread.sleep(20000);
		
		String s= UnderwrittingPage.captureproposalno();
		//propertyReader.updateProperty("Acceptance_06", s);
		propertyReader.setCellDataXlsx(0, i, 24, s);
		
		UnderwrittingPage.clickOnExpertiseOfIssuanceTab();
		UnderwrittingPage.selectExaminationResult(Result);
		UnderwrittingPage.calculateTheValue();
		UnderwrittingPage.clickConformationBtn();
		Thread.sleep(2000);
		
	}
	
	
	
	
	
	
	
	
	
	
	

	
}

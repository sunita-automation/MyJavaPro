package com.ndfs.di.fluw.scripts.ipp;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class PolicyEnquiryIPPTest extends FirstLifeTestCaseHelper {
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.PolicyEnquirePage PolicyEnquirePage;
	
	private String OfferNo;
	
	@Test
	public void UnderwrittingRequirement() throws Throwable 
	{
		int i=1;
		//input
		//OfferNo=propertyReader.readTestData("offerNo_06");
		OfferNo=propertyReader.getCellData(0, i, 26);
		
		
		//login details
		 repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		Thread.sleep(2000);
		
		
		
		
		PolicyEnquirePage=dashboardPage.openPolicyEnquiryPage();
		PolicyEnquirePage.enterOfferNo(OfferNo);
		PolicyEnquirePage.clickonsearchbtn();
		Thread.sleep(20000);
		PolicyEnquirePage.clickOnSearchTable();
		Thread.sleep(20000);
		String s=PolicyEnquirePage.capturePolicyNo();
		//propertyReader.updateProperty("policyno_06", s);
		propertyReader.setCellDataXlsx(0, i, 27, s);
		
		//update the policy no in non-financial sheet
		propertyReader.setCellDataXlsx(8, 6, 1, s);
		Thread.sleep(2000);
	
	}

}

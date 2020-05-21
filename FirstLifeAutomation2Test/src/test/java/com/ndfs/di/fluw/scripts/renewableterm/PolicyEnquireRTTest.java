package com.ndfs.di.fluw.scripts.renewableterm;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class PolicyEnquireRTTest  extends FirstLifeTestCaseHelper {
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.PolicyEnquirePage PolicyEnquirePage;
	
	private String OfferNo;
	
	@Test
	public void PolicyEnquiry() throws Throwable 
	{
		//input
		int i=1;
		OfferNo=propertyReader.getCellData(10, i, 26);
		
		
		
		//login details
		 repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		takeScreenShot("PI_Login");
		Thread.sleep(2000);
		
		
		
		dashboardPage.mouseOverToPolicySericeBar();
		PolicyEnquirePage=dashboardPage.mouseOverToPolicyenquiry();
		takeScreenShot("PE_Page1");
		PolicyEnquirePage.enterOfferNo(OfferNo);
		PolicyEnquirePage.clickonsearchbtn();
		Thread.sleep(2000);
		PolicyEnquirePage.clickOnSearchTable();
		Thread.sleep(20000);
		String s=PolicyEnquirePage.capturePolicyNo();
		//propertyReader.updateProperty("policyno_06", s);
		propertyReader.setCellDataXlsx(10, i, 27, s);
		
		//update the policy no in non-financial sheet
		propertyReader.setCellDataXlsx(8, i, 1, s);
		takeScreenShot("PE_Page2");
		Thread.sleep(2000);
	
	}

}

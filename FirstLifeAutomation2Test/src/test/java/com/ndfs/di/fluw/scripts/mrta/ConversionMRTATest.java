package com.ndfs.di.fluw.scripts.mrta;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.ProposalTransactionPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class ConversionMRTATest extends FirstLifeTestCaseHelper{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.ConversionPage ConversionPage;
	private ProposalTransactionPage ProposalTransactionPage;
	private com.firstlife.pages.SuccessMessagePage SuccessMessagePage;
	
	private String num,status;
	
	@Test
	public void UnderwrittingRequirement() throws Throwable 
	{
		//input data
		int i=1;
		num=propertyReader.getCellData(3, i, 25);
				
				
				
				
		//login details
		 repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		takeScreenShot("Login_CV");
		Thread.sleep(2000);
		
		ConversionPage=dashboardPage.chooseConversionNo(num);
		Thread.sleep(20000);
		
		String s= ConversionPage.captureproposalno();
		//propertyReader.updateProperty("offerNo_06", s);
		propertyReader.setCellDataXlsx(3, i, 26, s);
		
		ConversionPage.calculateTheValue();
		takeScreenShot("CV_Page");
		ConversionPage.clickConformationBtn();
		Thread.sleep(10000);
		
	}

}

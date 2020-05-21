package com.ndfs.di.fluw.scripts.universallife;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.ProposalTransactionPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class ConversionULTest extends FirstLifeTestCaseHelper{
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
		num=propertyReader.getCellData(11, i, 29);
				
				
				
				
		//login details
		 repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		Thread.sleep(2000);
		
		ConversionPage=dashboardPage.chooseConversionNo(num);
		Thread.sleep(20000);
		
		String s= ConversionPage.captureproposalno();
		//propertyReader.updateProperty("offerNo_06", s);
		propertyReader.setCellDataXlsx(11, i, 30, s);
		
		ConversionPage.calculateTheValue();
		ConversionPage.clickConformationBtn();
		Thread.sleep(10000);
		
	}

}



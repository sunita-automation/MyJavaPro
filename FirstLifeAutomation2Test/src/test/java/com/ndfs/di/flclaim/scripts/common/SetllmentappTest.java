package com.ndfs.di.flclaim.scripts.common;


import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class SetllmentappTest  extends FirstLifeTestCaseHelper
{

	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.SettlementPage settlementPage;
	
	//VARIABLES
	private String username,password,num,CDess;
	
	//EXCEL SHEET DATA
	
	
	@Test
	public void SettlementPage() throws Exception
	{
		
		//EXCEL SHEET DATA
	
	num=propertyReader.getCellData2(5,1, 4);
	CDess=propertyReader.getCellData2(5, 1, 12);
	username=propertyReader.getCellData2(5, 1, 10);
	password=propertyReader.getCellData2(5, 1, 11);
	

	
	//SCRIPTS
	repoterLog = extent.createTest("Settlement Approval Result");
	loginPage = applicationSetup();
	logger.info("Launching application");
	repoterLog.log(Status.INFO, "Application setup completed");
	

	dashboardPage = loginPage.loginWithDifferentUser(username, password);
	logger.info("Log in to application");
	logger.info("Hovering mouse to manu bar");	

	settlementPage=dashboardPage.chooseClaimNum(num);
	settlementPage.clickOnfeedbackTab();

	settlementPage.clickOnDocchecKListTab();
	settlementPage.selectClaimDess(CDess);
	settlementPage.clickOndocumetTab();
	settlementPage.clickOnConfirm();
	
	Thread.sleep(10000);
	}

}

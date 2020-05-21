package com.ndfs.di.flclaim.scripts.common;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.CloseClaimPage;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class CloseClaimTest extends FirstLifeTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private CloseClaimPage closeClaimPage;
	
	//VARIABLES
	private String num,Reason;
	
	@Test
	public void CloseclaimPage() throws Exception
	{
		//EXCEL SHEET DATA
		num=propertyReader.getCellData2(5, 1, 4);
		Reason=propertyReader.getCellData2(5, 1, 13);
		
		
		//SCRIPTS
		
		repoterLog = extent.createTest("Close claim Result");
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		

		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		logger.info("Hovering mouse to manu bar");	
		
		closeClaimPage=dashboardPage.chooseClaimNumber(num);
		closeClaimPage.clickOnClaimfeedbackTab();
		closeClaimPage.provideReason(Reason);
		closeClaimPage.clickOnDocchecKListTab();
		closeClaimPage.clickOnDoucumentCheckBox();
		closeClaimPage.clickOndocumetTab();
		closeClaimPage.clickOnConfirm();
		
		Thread.sleep(10000);
	}

}

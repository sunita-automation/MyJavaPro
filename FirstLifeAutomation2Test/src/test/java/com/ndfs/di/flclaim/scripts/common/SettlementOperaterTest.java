package com.ndfs.di.flclaim.scripts.common;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class SettlementOperaterTest extends FirstLifeTestCaseHelper
{

	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.SettlementPage settlementPage;
	
	
	//VARIABLES
	private String username,password,Pnum,IbanNo,num,CDes;
	
	@Test
	public void SettlementPage() throws Exception
	{
		//EXCEL SHEET DATA
		username=propertyReader.getCellData2(5, 1, 7);
		password=propertyReader.getCellData2(5, 1, 8);
		num=propertyReader.getCellData2(5, 1, 4);
		Pnum=propertyReader.getCellData2(5, 1, 14);
		IbanNo=propertyReader.getCellData2(5, 1, 6);
		CDes=propertyReader.getCellData2(5, 1, 9);
		
		
		//SCRIPTS
		
		repoterLog = extent.createTest("Settlement Operator Result");
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		

		dashboardPage = loginPage.loginWithDifferentUser(username, password);
		logger.info("Log in to application");
		logger.info("Hovering mouse to manu bar");	
		
		settlementPage=dashboardPage.chooseClaimNum(num);
		settlementPage.clickOnpayee();
		settlementPage.clickOnSearch();
		settlementPage.clickOnPartyNum(Pnum);
		settlementPage.provideIbanNo(IbanNo);
		settlementPage.clickOnAdd();
		settlementPage.clickOnfeedbackTab();
		settlementPage.clickOnRecoveriesTab();
		settlementPage.clickOnDocchecKListTab();
		settlementPage.selectClaimDession(CDes);
		settlementPage.clickOndocumetTab();
		settlementPage.clickOnConfirm();
	//	settlementPage.clickOnNttLogo();
		
	//	dashboardPage=settlementPage.clickOnLogOut();
		
		
//		dashboardPage = loginPage.loginWithDifferentUser(username, password);
//		
//		settlementPage=dashboardPage.chooseClaimNum(num);
//		settlementPage.clickOnDocchecKListTab();
//		settlementPage.selectClaimDess(CDess);
//		settlementPage.clickOnConfirm();
		
		
		
		Thread.sleep(10000);

	}

}

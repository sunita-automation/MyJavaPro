package com.ndfs.di.flclaim.scripts.common;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.FnolPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class FnolTest  extends FirstLifeTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private FnolPage fnolPage;
	
	//VARIABLES
	private String LAname,Ctype,Pnum,Ropt,LDate;
	
	@Test
	public void Fnolpage() throws Exception
	{
		//EXCEL SHEET DATA
		LAname=propertyReader.getCellData2(5, 1, 0);
		Ctype=propertyReader.getCellData2(5, 1, 1);
		Pnum=propertyReader.getCellData2(5, 1, 2);
		Ropt=propertyReader.getCellData2(5, 1, 3);
		LDate=propertyReader.getCellData2(5, 1, 15);
		
		//SCRIPTS
		
		repoterLog = extent.createTest("FNOL Result");
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		

		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		logger.info("Hovering mouse to manu bar");
		dashboardPage.mouseOverToclaimsDropdown();
		dashboardPage.mouseOverToclaimsFnolDropdown();
		
		fnolPage=dashboardPage.clickOnaddfnol();
		fnolPage.provideLAName(LAname);
		fnolPage.provideClaimType(Ctype);
		fnolPage.clickOnSearch();
		fnolPage.clickOnPolicyNum(Pnum);
	//	String s=fnolPage.getClaimNumber1();
	//	propertyReader.setCellDataXls(5, 1, 4, s);
		
		String s1=fnolPage.getClaimNumber2();
		propertyReader.setCellDataXls(5, 1, 4, s1);
		fnolPage.provideLossDateAuto();
	//	fnolPage.provideLossDate(LDate);
		fnolPage.clickOnPolicyDetailTab();
		fnolPage.clickOnDoucumentCheckListTab();
		fnolPage.selectReceivedOpt(Ropt);
		fnolPage.clickOnDoucumentCheckBox();
		fnolPage.clickOnDocumentLabelTab();
		fnolPage.clickOnConfirm();
		
		Thread.sleep(10000);

	}
	
}


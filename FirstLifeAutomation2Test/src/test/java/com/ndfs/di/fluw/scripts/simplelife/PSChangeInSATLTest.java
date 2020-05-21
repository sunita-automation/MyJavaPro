package com.ndfs.di.fluw.scripts.simplelife;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.PolicyTransactionPage;
import com.firstlife.pages.PsfinancialnSearchpage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class PSChangeInSATLTest  extends FirstLifeTestCaseHelper 
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private PsfinancialnSearchpage psfinancialnSearchpage;
	private PolicyTransactionPage policyTransactionPage;
	

	//   VARIABLES
	
	private String Atype,Pno,SAmount,DAte,mstatus,Choice;
	
	@Test
	public void changeinsa() throws Exception
	{
		
		//    EXCEL DATA
		
		Atype=propertyReader.getCellData(15, 1, 2);
		Pno=propertyReader.getCellData(15, 1, 1);
		SAmount=propertyReader.getCellData(15, 1, 3);
		DAte=propertyReader.getCellData(15, 1, 4);
		mstatus=propertyReader.getCellData(15, 1, 5);
		Choice=propertyReader.getCellData(15, 1, 6);
		
		
		//    SCRIPTS
		
		repoterLog = extent.createTest("openLoginPage");
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		dashboardPage.mouseOverToPS();
		dashboardPage.mouseOverToFinancial();
		
		psfinancialnSearchpage = dashboardPage.clickonchangeinSA();
		
		psfinancialnSearchpage.slectActType(Atype);
		psfinancialnSearchpage.providePolicyNO(Pno);
		psfinancialnSearchpage.clickOnSearch();
		
		policyTransactionPage = psfinancialnSearchpage.clickOnpolicynum(Pno);
		policyTransactionPage.changeSAAmount(SAmount);
		policyTransactionPage.ClickOnDetailsTab();
		policyTransactionPage.ClickOnDateTab();
		String s= policyTransactionPage.capturedueDate();
		
		String dt = s;  // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(dt));
		c.add(Calendar.DATE, 1);  // number of days to add
		dt = sdf.format(c.getTime());
		System.out.println(dt);
		//String ndt=dt.replaceAll("[^0-9]", "");
	//	System.out.println(ndt);
		
		propertyReader.setCellDataXlsx(15, 1, 4, dt);
		policyTransactionPage.clickOnCancelBtn();
		DAte=propertyReader.getCellData(15, 1, 4);
		System.out.println(DAte);
		
		policyTransactionPage.provideEffectiveDate(DAte);
		policyTransactionPage.clickOnLADetailTab();
		policyTransactionPage.selectMaritalStatus(mstatus);
		policyTransactionPage.clickOnUWTab();
		
		//Thread.sleep(20000);
		
		
		
		policyTransactionPage.selectChoice(Choice);
		policyTransactionPage.clickOnSummaryTab();
		policyTransactionPage.clickOnCalculate();
		policyTransactionPage.clickOnConfirm();
		
		Thread.sleep(10000);
	}
}

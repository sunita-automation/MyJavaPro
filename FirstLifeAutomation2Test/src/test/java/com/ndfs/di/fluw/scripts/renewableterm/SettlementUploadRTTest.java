package com.ndfs.di.fluw.scripts.renewableterm;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class SettlementUploadRTTest  extends FirstLifeTestCaseHelper {

	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.InforcePage InforcePage;
	
	
	private String username,password,policyno,branchcode,path,Batchid;
	
	@Test
	public void Inforce() throws Throwable 
	{
		int i=1;
		username=propertyReader.getCellData(10,i, 19);
		password=propertyReader.getCellData(10, i, 20);
		policyno=propertyReader.getCellData(10, i, 27);
		branchcode=propertyReader.getCellData(10, i, 21);
		path=propertyReader.readApplicationFile("Upload_Path");
		Batchid=propertyReader.readTestData("BatchId");

         // log in for diff user
		 repoterLog = extent.createTest("openLoginPage");
			
			
			loginPage = applicationSetup();
			logger.info("Launching application");
			repoterLog.log(Status.INFO, "Application setup completed");
			
			dashboardPage = loginPage.loginWithDifferentUser(username,password);
			logger.info("Log in to application");
			takeScreenShot("Login_IN");
			Thread.sleep(2000);
			
			
			dashboardPage.mouseOverToAccountsTab();
			dashboardPage.mouseOverToEnquiryDropdown();
			takeScreenShot("IN_ENQ_Page");
			InforcePage=dashboardPage.mouseOverToDr_CrEnquiryDropdown();
			InforcePage.searchInsuranceNo(policyno, branchcode);
			InforcePage.clickOnSearchTable();
			takeScreenShot("IN_Page1");
			InforcePage.clickOnTransactionTab();
			Thread.sleep(10000);
			String s=InforcePage.capturePaymentcode();
	    	propertyReader.setCellDataXlsx1(path, 0, 1, 5, s);
			Thread.sleep(10000);
			
			String a=InforcePage.captureDebt();
			System.out.println(a);
			 String numberOnly= a.replaceAll("[^0-9]", "");
			Integer m = Integer.valueOf(numberOnly);
			String b=Integer.toString(m);
			System.out.println(m);
			propertyReader.setCellDataXlsx1(path, 0, 1, 10, b);
			
			dashboardPage=InforcePage.clickonNTTDataLogo();
			
			
			Thread.sleep(5000);
			dashboardPage.mouseOverToAccountsTab();
			dashboardPage.mouseOverToUploadDropdown();
			takeScreenShot("IN_Page2");
			InforcePage=dashboardPage.mouseOverToSettlementUploadDropdown();
			
			InforcePage.clickOnChoseFile();
			InforcePage.upload(path);
			InforcePage.clickOnuploadBTn();
			takeScreenShot("IN_Page3");
			Thread.sleep(10000);
			String r=InforcePage.captureBatchId();
			propertyReader.updateProperty("BatchId", r);
			dashboardPage=InforcePage.clickonNTTDataLogo();
			
			Batchid=propertyReader.readTestData("BatchId");
			InforcePage=dashboardPage.openFincialBillingFilePage();
			Batchid=propertyReader.readTestData("BatchId");
			InforcePage.enterBatchId(Batchid);
			InforcePage.clickOnSearchBtn();
			takeScreenShot("IN_Page4");
			InforcePage.clickonInforcebtn();
			Thread.sleep(2000);
			
			
	}

}

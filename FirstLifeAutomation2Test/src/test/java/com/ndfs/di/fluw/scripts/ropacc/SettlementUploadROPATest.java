package com.ndfs.di.fluw.scripts.ropacc;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class SettlementUploadROPATest extends FirstLifeTestCaseHelper {

	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.InforcePage InforcePage;
	
	
	private String username,password,policyno,branchcode,path,Batchid;
	
	@Test
	public void Inforce() throws Throwable 
	{
		int i=1;
		username=propertyReader.getCellData(6, i, 21);
		password=propertyReader.getCellData(6, i, 22);
		policyno=propertyReader.getCellData(6, i, 31);
		branchcode=propertyReader.getCellData(6, i, 23);
		path=propertyReader.readApplicationFile("Upload_Path");
		Batchid=propertyReader.readTestData("BatchId");

         // log in for diff user
		 repoterLog = extent.createTest("openLoginPage");
			
			
			loginPage = applicationSetup();
			logger.info("Launching application");
			repoterLog.log(Status.INFO, "Application setup completed");
			
			dashboardPage = loginPage.loginWithDifferentUser(username,password);
			logger.info("Log in to application");
			Thread.sleep(2000);
			
			
			
			InforcePage=dashboardPage.openDr_CrEnquiryPage();
			InforcePage.searchInsuranceNo(policyno, branchcode);
			Thread.sleep(5000);
			InforcePage.clickOnSearchTable2();
			InforcePage.clickOnTransactionTab();
			Thread.sleep(10000);
			String s=InforcePage.capturePaymentcode();
	    	propertyReader.setCellDataXlsx1(path, 0, i, 5, s);
			Thread.sleep(10000);
			
			String a=InforcePage.captureDebt();
			System.out.println(a);
			 String numberOnly= a.replaceAll("[^0-9]", "");
			Integer m = Integer.valueOf(numberOnly);
			String b=Integer.toString(m);
			System.out.println(m);
			propertyReader.setCellDataXlsx1(path, 0, i, 10, b);
			
			dashboardPage=InforcePage.clickonNTTDataLogo();
			
			
			
			InforcePage=dashboardPage.openSettlementUpload();
			InforcePage.clickOnChoseFile();
			InforcePage.upload(path);
			InforcePage.clickOnuploadBTn();
			Thread.sleep(10000);
			String r=InforcePage.captureBatchId();
			propertyReader.updateProperty("BatchId", r);
			dashboardPage=InforcePage.clickonNTTDataLogo();
			InforcePage=dashboardPage.openFincialBillingFilePage();
			InforcePage.enterBatchId(Batchid);
			InforcePage.clickOnSearchBtn();
			InforcePage.clickonInforcebtn();
			Thread.sleep(2000);
			
			
	}

}



package com.ndfs.di.fluw.scripts.universallife;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class PSAddressChangeULTest extends FirstLifeTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.AddressChangePage AddressChangePage;
	private com.firstlife.pages.AdressChnageTransationPage AdressChnageTransationPage;
	
	
	
	
	// variables
	private String insuranceNo, path , Role , Address, code, Email;
	
	
	
	@Test
	public void AddressChange() throws Throwable 
	{
		
		insuranceNo = propertyReader.getCellData(8, 9, 1);
		Role = propertyReader.getCellData(8, 1, 3);
		Address = propertyReader.getCellData(8, 1, 5);
		code = propertyReader.getCellData(8, 1, 6);
		Email = propertyReader.getCellData(8, 1, 7);
		path ="D:\\FirstLifeAutomation2Test\\propertyFile\\1.png";
		
		
		//login details
		 repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		Thread.sleep(2000);
		
		
		
		dashboardPage.mouseOverToPolicySericeBar();
		dashboardPage.mouseOverToNonfinancialDropdown();
		AddressChangePage=dashboardPage.mouseOverToAddressChange();
		AddressChangePage.selectInsuranceradioBtn();
		AddressChangePage.providepolicyNo(insuranceNo);
	    AddressChangePage.clickOnSearchBtn();
	    AdressChnageTransationPage= AddressChangePage.clickOnSearchTable();
	    AdressChnageTransationPage.selectPersonsRole(Role);
	    AdressChnageTransationPage.selectHowToSend(Address);
	    AdressChnageTransationPage.clickOnChangeOFAddressTab();
	    AdressChnageTransationPage.clickOnEditBtn();
	    AdressChnageTransationPage.editZipCode(code);
	    AdressChnageTransationPage.editemaifield(Email);
	    AdressChnageTransationPage.clickOnSaveBTn();	    
	    AdressChnageTransationPage.clickOnChangeOFAddressTab();
	    AdressChnageTransationPage.clickOnPolicyToChangeTab();
	    AdressChnageTransationPage.clickOnUpdateCheckBox();
	    AdressChnageTransationPage.clickOnPolicyToChangeTab();
	    AdressChnageTransationPage.clickOnDocumentTab();
	    AdressChnageTransationPage.clickOnNonMedicalDocumentTab();
	    AdressChnageTransationPage.clickOnLoadingFile1();
	    AdressChnageTransationPage.upload(path);
	    AdressChnageTransationPage.clickOnLoadingFile2();
	    AdressChnageTransationPage.upload(path);
	    AdressChnageTransationPage.clickOnLoadingFile3();
	    AdressChnageTransationPage.upload(path);
	    AdressChnageTransationPage.clickOnFirstTab();
	    AdressChnageTransationPage.clickOnRetrieveBtn();
	    AdressChnageTransationPage.clickOnconfirmBtn();
	    
		Thread.sleep(20000);
	}
	

}

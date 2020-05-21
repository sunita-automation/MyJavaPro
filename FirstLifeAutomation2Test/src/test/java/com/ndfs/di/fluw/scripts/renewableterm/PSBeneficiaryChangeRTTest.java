package com.ndfs.di.fluw.scripts.renewableterm;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class PSBeneficiaryChangeRTTest extends FirstLifeTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.PsNonFinancialSearchPage PsNonFinancialSearchPage;
	private com.firstlife.pages.PsNonFinancialTransationpage PsNonFinancialTransationpage;
	
	
	
	
	// variables
	private String insuranceNo, role,BeneName,RelCode,Percentage,Priority, path;
	
	
	
	@Test
	public void AddressChange() throws Throwable 
	{
		insuranceNo = propertyReader.getCellData(8, 8, 1);
		role = propertyReader.getCellData(8, 1, 8);
		BeneName=propertyReader.getCellData(8, 1, 9);
		RelCode=propertyReader.getCellData(8, 1, 10);
		Percentage =propertyReader.getCellData(8, 1, 11);
	    Priority=propertyReader.getCellData(8, 1, 12);
	    path ="D:\\8003checkout\\FirstLifeAutomation2Test\\propertyFile\\1.png";
	    
	    
	    
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
		PsNonFinancialSearchPage=dashboardPage.mouseOverToBeneficiaryChange();
		PsNonFinancialSearchPage.selectInsuranceradioBtn();
		PsNonFinancialSearchPage.providepolicyNo(insuranceNo);
		PsNonFinancialSearchPage.clickOnSearchBtn();
		PsNonFinancialTransationpage= PsNonFinancialSearchPage.clickOnSearchTable(insuranceNo);
		//PsNonFinancialTransationpage.selectPersonsRoleBc(role);
		PsNonFinancialTransationpage.ClickOnBeneficiaryDiedTab();
		PsNonFinancialTransationpage.provideBeneficiaryName(BeneName);
		PsNonFinancialTransationpage.provideRelationship(RelCode);
		PsNonFinancialTransationpage.providepercentageShare(Percentage);
		PsNonFinancialTransationpage.selectPriorityBeneficiary(Priority);
		PsNonFinancialTransationpage.clickOnDelectBtn();
		PsNonFinancialTransationpage.clickOnAddBtn();
		PsNonFinancialTransationpage.ClickOnDocumentTab();
		PsNonFinancialTransationpage.ClickOnLoadingDocumentTab();
		
		PsNonFinancialTransationpage.clickOnNonMedicalDocumentTab();
		PsNonFinancialTransationpage.clickOnLoadingFile1();
		PsNonFinancialTransationpage.upload(path);
		PsNonFinancialTransationpage.clickOnLoadingFile2();
		PsNonFinancialTransationpage.upload(path);
		PsNonFinancialTransationpage.clickOnLoadingFile3();
		PsNonFinancialTransationpage.upload(path);
		PsNonFinancialTransationpage.clickOnconfirmBtn();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
	}
	

}

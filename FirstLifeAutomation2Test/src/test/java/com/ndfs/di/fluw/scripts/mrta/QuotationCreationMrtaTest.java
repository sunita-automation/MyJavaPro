package com.ndfs.di.fluw.scripts.mrta;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class QuotationCreationMrtaTest extends FirstLifeTestCaseHelper 
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.QuotationPage QuotationPage;
	private com.firstlife.pages.QuotationTransactionPage QuotationTransactionPage;
					//VARIABLES
	
	private String Inscode,InName,InsdName,CurCode,Amount,Way,HGht,WGht,OccCode,BeneName,RelCode,Percentage,Priority,Term;
	
	
	
	@Test
	public void quotaionCreation() throws Exception
	{
		
		
					//	EXCEL DATA
		
		
		
		
		Inscode=propertyReader.getCellData2(1, 7, 0);
		InName=propertyReader.getCellData2(1, 7, 1);
		InsdName=propertyReader.getCellData2(1,7, 2);
		CurCode=propertyReader.getCellData2(1, 7, 3);
		Amount=propertyReader.getCellData2(1, 7, 4);
		Way=propertyReader.getCellData2(1, 7, 5);
		HGht=propertyReader.getCellData2(1, 7, 6);
		WGht=propertyReader.getCellData2(1, 7, 7);
		OccCode=propertyReader.getCellData2(1, 7, 8);
		BeneName=propertyReader.getCellData2(1, 7, 9);
		RelCode=propertyReader.getCellData2(1, 7, 10);
		Percentage=propertyReader.getCellData2(1, 7, 11);
		Priority=propertyReader.getCellData2(1, 7, 12);
		Term=propertyReader.getCellData2(1, 7, 14);
		
		
		
					//SCRIPTS
		
		repoterLog = extent.createTest("openLoginPage");
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		dashboardPage.mouseOverToManuBarDropDown();
		logger.info("Hovering mouse to manu bar");		
		dashboardPage.mouseOverToManuBarDropDown();
		dashboardPage.mouseOverToQuotationonDropDown();
		
		QuotationPage=dashboardPage.clickOnNewQoutation();
		
		QuotationPage.selectTypeOfInsurance(Inscode);
		QuotationPage.provideInsurerName(InName);
		QuotationPage.provideInsureedName(InsdName);
		QuotationPage.providePolicyTerm(Term);
		
		QuotationTransactionPage=QuotationPage.clickOnCreate();
		
		String s1=QuotationTransactionPage.getQuotationNumber2();
		propertyReader.setCellDataXls(1, 7, 13, s1);
		QuotationTransactionPage.provideCurrency(CurCode);
		QuotationTransactionPage.provideCapitalOfDeath(Amount);
		QuotationTransactionPage.selectHowToPayMrta(Way);
		QuotationTransactionPage.clickOnClientDetailTab();
		QuotationTransactionPage.provideHeight(HGht);
		QuotationTransactionPage.provideWeight(WGht);
		QuotationTransactionPage.provideOccupation(OccCode);
		QuotationTransactionPage.clickOnBenficiaryTab();
		QuotationTransactionPage.provideBeneficiaryName(BeneName);
		QuotationTransactionPage.provideRelationship(RelCode);
		QuotationTransactionPage.providepercentageShare(Percentage);
		QuotationTransactionPage.selectPriorityBeneficiary(Priority);
		QuotationTransactionPage.clickOnAdd();
		QuotationTransactionPage.clickOnSummary();
		QuotationTransactionPage.clickOnCalculate();
		QuotationTransactionPage.clickOnConfirm();
		Thread.sleep(10000);
		
	}
	

}

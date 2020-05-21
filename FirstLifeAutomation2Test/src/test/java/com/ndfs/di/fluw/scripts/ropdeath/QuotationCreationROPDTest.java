package com.ndfs.di.fluw.scripts.ropdeath;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class QuotationCreationROPDTest extends FirstLifeTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.QuotationPage QuotationPage;
	private com.firstlife.pages.QuotationTransactionPage QuotationTransactionPage;
					//VARIABLES
	
	private String Inscode,InName,InsdName,CurCode,Amount,Way,HGht,WGht,OccCode,BeneName,RelCode,Percentage,Priority,Term,
	BenefitLife,RatioCode,SharePercentage,Level;
	
	
	
	@Test
	public void quotaionCreation() throws Exception
	{
		Inscode=propertyReader.getCellData2(1, 19, 0);
		InName=propertyReader.getCellData2(1, 19, 1);
		InsdName=propertyReader.getCellData2(1,19, 2);
		CurCode=propertyReader.getCellData2(1, 19, 3);
		Amount=propertyReader.getCellData2(1, 19, 4);
		Way=propertyReader.getCellData2(1, 19, 5);
		HGht=propertyReader.getCellData2(1, 19, 6);
		WGht=propertyReader.getCellData2(1, 19, 7);
		OccCode=propertyReader.getCellData2(1, 19, 8);
		BeneName=propertyReader.getCellData2(1, 19, 9);
		RelCode=propertyReader.getCellData2(1, 19, 10);
		Percentage=propertyReader.getCellData2(1, 19, 11);
		Priority=propertyReader.getCellData2(1, 19, 12);
		Term=propertyReader.getCellData2(1, 19, 14);
		BenefitLife =propertyReader.getCellData2(1, 19, 15);
		RatioCode=propertyReader.getCellData2(1, 19, 10);
		SharePercentage=propertyReader.getCellData2(1, 19, 11);
		Level=propertyReader.getCellData2(1, 19, 12);
		
	//SCRIPTS
		
		repoterLog = extent.createTest("Create New Quotation Page");
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
		propertyReader.setCellDataXls(1, 19, 13, s1);
		QuotationTransactionPage.provideCurrency(CurCode);
		Thread.sleep(2000);
		QuotationTransactionPage.provideCapitalOfDeath(Amount);
		//QuotationTransactionPage.selectHowToPay(Way);
		QuotationTransactionPage.clickOnClientDetailTab();
		QuotationTransactionPage.provideHeight(HGht);
		Thread.sleep(2000);
		QuotationTransactionPage.provideWeight(WGht);
		QuotationTransactionPage.provideOccupation(OccCode);
		
		QuotationTransactionPage.clickOnInsuredTab();
		QuotationTransactionPage.clickOnRadioBtn();
		QuotationTransactionPage.clickOnInsuredTab();
		
		QuotationTransactionPage.clickOnBenficiaryTab();
		QuotationTransactionPage.provideBeneficiaryName(BeneName);
		QuotationTransactionPage.provideRelationship(RelCode);
		QuotationTransactionPage.providepercentageShare(Percentage);
		QuotationTransactionPage.selectPriorityBeneficiary(Priority);
		QuotationTransactionPage.clickOnAdd();
		
		Thread.sleep(10000);
		QuotationTransactionPage.enterSecondBenefitDetails(BenefitLife, RatioCode, SharePercentage, Level);
		Thread.sleep(10000);
		
		QuotationTransactionPage.clickOnSummary();
		QuotationTransactionPage.clickOnCalculate();
		QuotationTransactionPage.clickOnConfirm();
		Thread.sleep(10000);
	}

}

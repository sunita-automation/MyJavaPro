package com.ndfs.di.fluw.scripts.universallife;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class QuotationCreationULTest extends FirstLifeTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.QuotationPage QuotationPage;
	private com.firstlife.pages.QuotationTransactionPage QuotationTransactionPage;
					//VARIABLES
	
	private String Inscode,InName,InsdName,CurCode,Amount,Way,HGht,WGht,OccCode,BeneName,RelCode,Percentage,Priority,Term,
	BenefitLife,RatioCode,SharePercentage,Level,PremiumAmount;
	
	
	
	@Test
	public void quotaionCreation() throws Exception
	{
		Inscode=propertyReader.getCellData2(1, 25, 0);
		InName=propertyReader.getCellData2(1, 25, 1);
		InsdName=propertyReader.getCellData2(1,25, 2);
		CurCode=propertyReader.getCellData2(1, 25, 3);
		Amount=propertyReader.getCellData2(1, 25, 4);
		Way=propertyReader.getCellData2(1, 25, 5);
		HGht=propertyReader.getCellData2(1, 25, 6);
		WGht=propertyReader.getCellData2(1, 25, 7);
		OccCode=propertyReader.getCellData2(1, 25, 8);
		BeneName=propertyReader.getCellData2(1, 25, 9);
		RelCode=propertyReader.getCellData2(1, 25, 10);
		Percentage=propertyReader.getCellData2(1, 25, 11);
		Priority=propertyReader.getCellData2(1, 25, 12);
		Term=propertyReader.getCellData2(1, 25, 14);
		BenefitLife =propertyReader.getCellData2(1, 25, 15);
		RatioCode=propertyReader.getCellData2(1, 25, 10);
		SharePercentage=propertyReader.getCellData2(1, 25, 11);
		Level=propertyReader.getCellData2(1, 25, 12);
		PremiumAmount=propertyReader.getCellData2(1, 25, 16);
		
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
		propertyReader.setCellDataXls(1, 25, 13, s1);
		QuotationTransactionPage.provideCurrency(CurCode);
		Thread.sleep(2000);
		QuotationTransactionPage.provideCapitalOfDeath(Amount);
		QuotationTransactionPage.selectHowToPayForUniversal(Way);
		
		QuotationTransactionPage.enterPlanedPremium(PremiumAmount);

		//enterPlanedPremium(String PremiumAmount)
		
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

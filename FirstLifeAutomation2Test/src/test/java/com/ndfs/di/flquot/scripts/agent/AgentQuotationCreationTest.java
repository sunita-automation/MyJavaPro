package com.ndfs.di.flquot.scripts.agent;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class AgentQuotationCreationTest extends FirstLifeTestCaseHelper 
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.QuotationPage QuotationPage;
	private com.firstlife.pages.QuotationTransactionPage QuotationTransactionPage;
					//VARIABLES
	
	private String Inscode,InName,Term,InsdName,CurCode,Amount,Way,HGht,WGht,OccCode,BeneName,RelCode,Percentage,Priority;
	
	
	
	@Test
	public void quotaionCreation() throws Exception
	{
		
		
					//	EXCEL DATA
		
		
		
		
		Inscode=propertyReader.getCellData2(1, 10, 0);
		InName=propertyReader.getCellData2(1, 10, 1);
		InsdName=propertyReader.getCellData2(1, 10, 2);
		CurCode=propertyReader.getCellData2(1, 10, 3);
		Amount=propertyReader.getCellData2(1, 10, 4);
		Way=propertyReader.getCellData2(1, 10, 5);
		HGht=propertyReader.getCellData2(1, 10, 6);
		WGht=propertyReader.getCellData2(1, 10, 7);
		OccCode=propertyReader.getCellData2(1, 10, 8);
		BeneName=propertyReader.getCellData2(1, 10, 9);
		Term=propertyReader.getCellData2(1, 10, 14);
		RelCode=propertyReader.getCellData2(1, 10, 10);
		Percentage=propertyReader.getCellData2(1, 10, 11);
		Priority=propertyReader.getCellData2(1, 10, 12);
		
		
		
		
					//SCRIPTS
		
		repoterLog = extent.createTest("Agent portal Qiuotation Creation");
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.loginAgent();
		logger.info("Log in to application");
	
		logger.info("Hovering mouse to manu bar");	
		dashboardPage.mouseOverToPolicyOnDropDown();
		
		QuotationPage=dashboardPage.clickOnCreate();
		
		QuotationPage.selectTypeOfInsuranceAgent(Inscode);
		QuotationPage.provideInsurerName(InName);
		QuotationPage.provideInsureedName(InsdName);
		QuotationPage.providePolicyTerm(Term);
		
		QuotationTransactionPage=QuotationPage.clickOnCreate();
		
		String s1=QuotationTransactionPage.getQuotationNumber2();
		propertyReader.setCellDataXls(1, 10, 13, s1);
		
		QuotationTransactionPage.provideCurrency(CurCode);
		QuotationTransactionPage.provideCapitalOfDeathAgent(Amount);
		QuotationTransactionPage.selectHowToPayAgent(Way);
		QuotationTransactionPage.clickOnNextAgent();
		QuotationTransactionPage.clickonPOTab();
		QuotationTransactionPage.provideHeightAgent(HGht);
		QuotationTransactionPage.provideWeightAgent(WGht);
		QuotationTransactionPage.provideOccupationAgent(OccCode);
		QuotationTransactionPage.clickonLATab();
		QuotationTransactionPage.clickonLATabradiobtn();
		QuotationTransactionPage.clickOnBenficiaryTab();
		QuotationTransactionPage.provideBeneficiaryName(BeneName);
		QuotationTransactionPage.provideRelationship(RelCode);
		QuotationTransactionPage.providepercentageShareAgnt(Percentage);
		QuotationTransactionPage.selectPriorityBeneficiary(Priority);
		QuotationTransactionPage.clickOnAddAgent();
		QuotationTransactionPage.clickOnNextAgent();
		Thread.sleep(5000);
		QuotationTransactionPage.clickOnNextAgent();
	//	QuotationTransactionPage.clickOnSummary();
		QuotationTransactionPage.clickOnCalculate();
		QuotationTransactionPage.clickOnConfirm();
		Thread.sleep(20000);
		
	}
	

}

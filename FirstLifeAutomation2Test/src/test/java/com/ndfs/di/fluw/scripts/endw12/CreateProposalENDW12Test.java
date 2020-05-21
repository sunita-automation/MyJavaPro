package com.ndfs.di.fluw.scripts.endw12;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.CreatNewProposalPage;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class CreateProposalENDW12Test extends FirstLifeTestCaseHelper{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private CreatNewProposalPage CreatNewProposalpage;
	private com.firstlife.pages.ProposalTransactionPage ProposalTransactionPage;
	
	
	private String productCode,Insurer,Maininsured,Policyterm,
	sumassured,beneficiaryame,beneficiaryrelationship,Share,PriorityLevel,BenefitLife,RatioCode,SharePercentage,Level,Height,Weight,
	status,occuption,nextstep;
	
	@Test
	public void CreatAProposal() throws Throwable 
	{
		//input data
		int i=1;
		productCode=propertyReader.getCellData(12, i, 0);
		Insurer=propertyReader.getCellData(12, i, 1);
		Maininsured=propertyReader.getCellData(12, i, 2);
		Policyterm=propertyReader.getCellData(12, 1, 3);
		sumassured=propertyReader.getCellData(12, i, 5);
		beneficiaryame=propertyReader.getCellData(12, i, 6);
		beneficiaryrelationship=propertyReader.getCellData(12, i, 7);
		Share=propertyReader.getCellData(12, i, 8);	
		PriorityLevel=propertyReader.getCellData(12, i, 9);
		BenefitLife=propertyReader.getCellData(12, i, 10);
		RatioCode=propertyReader.getCellData(12, i, 11);
		SharePercentage=propertyReader.getCellData(12, i, 8);
		Level=propertyReader.getCellData(12, i, 9);
		Height=propertyReader.getCellData(12, i, 12);
		Weight=propertyReader.getCellData(12, i, 13);
		status=propertyReader.getCellData(12, i, 14);
		occuption=propertyReader.getCellData(12, i, 15);
		nextstep=propertyReader.getCellData(12, i, 16);
		
		
		
		// log in details
		repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		
		CreatNewProposalpage=dashboardPage.openCreatProposalPage();
		CreatNewProposalpage.clickProductArrow();
		CreatNewProposalpage.enterProduct(productCode);
		CreatNewProposalpage.enterInsurerName(Insurer);
		CreatNewProposalpage.enterMainInsured(Maininsured);
		//CreatNewProposalpage.enterPolicyTerm(Policyterm);
		ProposalTransactionPage=CreatNewProposalpage.clicknext();
		Thread.sleep(20000);
	    //capture proposal no
		String s = ProposalTransactionPage.captureproposalno();
		propertyReader.setCellDataXlsx(12, i, 26, s);
		ProposalTransactionPage.enterCapitalOfDeath(sumassured);
		ProposalTransactionPage.clickRoleOfPeopleTab();
		ProposalTransactionPage.clickonbeneficiarytab();
		ProposalTransactionPage.addingBeneficiaryDetails(beneficiaryame,beneficiaryrelationship,Share,PriorityLevel);
		Thread.sleep(10000);
		ProposalTransactionPage.enterSecondBenefitDetails(BenefitLife, RatioCode, SharePercentage, Level);
		Thread.sleep(10000);
	    ProposalTransactionPage.insuredRiskAnalysistab();
		ProposalTransactionPage.enterHightAndWeight(Height,Weight);
	    ProposalTransactionPage.enterMaritalSatusdetails(status);
		ProposalTransactionPage.entersupplementaryInfoDetails(occuption);
	    ProposalTransactionPage.enterInsurancePolicyQuesDetails();
	    ProposalTransactionPage.enterDocumentdetails(nextstep);
	    ProposalTransactionPage.calculateTheValue();
	    ProposalTransactionPage.clickConformationBtn();
	//Thread.sleep(10000);
		dashboardPage=ProposalTransactionPage.clickonNTTDataLogo();
	
		
		//ProposalTransactionPage.clickAbandon();
		
	}

}

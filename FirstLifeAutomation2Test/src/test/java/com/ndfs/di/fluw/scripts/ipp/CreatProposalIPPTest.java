package com.ndfs.di.fluw.scripts.ipp;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.CreatNewProposalPage;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class CreatProposalIPPTest extends FirstLifeTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private CreatNewProposalPage CreatNewProposalpage;
	private com.firstlife.pages.ProposalTransactionPage ProposalTransactionPage;
	
	
	private String productCode,Insurer,Maininsured,sumassured,beneficiaryame,beneficiaryrelationship,Share,PriorityLevel,Height,Weight,
	status,occuption,nextstep;
	
	
	@Test
	public void CreatAProposal() throws Throwable 
	{
		int i = 1;
		//input data
		/*
		int rowCount = propertyReader.getRowCountXls(3);
		System.out.println("rowCount------->>>"+rowCount);
		for(int i =1;i<rowCount;i++)
		{
		productCode=propertyReader.getCellData(0, i, 0);
		Insurer=propertyReader.getCellData(0, i, 1);
		Maininsured=propertyReader.getCellData(0, i, 2);
		sumassured=propertyReader.getCellData(0, i, 5);
		beneficiaryame=propertyReader.getCellData(0, i, 6);
		beneficiaryrelationship=propertyReader.getCellData(0, i, 7);
		Share=propertyReader.getCellData(0, i, 8);	
		PriorityLevel=propertyReader.getCellData(0, i, 9);
		Height=propertyReader.getCellData(0, i, 10);
		Weight=propertyReader.getCellData(0, i, 11);
		status=propertyReader.getCellData(0, i, 12);
		occuption=propertyReader.getCellData(0, i, 13);
		nextstep=propertyReader.getCellData(0, i, 14);
		
		*/
		productCode=propertyReader.getCellData(0, 1, 0);
		Insurer=propertyReader.getCellData(0, 1, 1);
		Maininsured=propertyReader.getCellData(0, 1, 2);
		sumassured=propertyReader.getCellData(0, 1, 5);
		beneficiaryame=propertyReader.getCellData(0, 1, 6);
		beneficiaryrelationship=propertyReader.getCellData(0, 1, 7);
		Share=propertyReader.getCellData(0, 1, 8);	
		PriorityLevel=propertyReader.getCellData(0, 1, 9);
		Height=propertyReader.getCellData(0, 1, 10);
		Weight=propertyReader.getCellData(0, 1, 11);
		status=propertyReader.getCellData(0, 4, 12);
		occuption=propertyReader.getCellData(0, 1, 13);
		nextstep=propertyReader.getCellData(0, 1, 14);
		
		
		
		// log in details
		/*
		if(i==1)
		{
		*/
		 repoterLog = extent.createTest("openLoginPage");
			
			
			loginPage = applicationSetup();
			logger.info("Launching application");
			repoterLog.log(Status.INFO, "Application setup completed");
			
			dashboardPage = loginPage.login();
			logger.info("Log in to application");
		/*	
		   }
		   */
			CreatNewProposalpage=dashboardPage.openCreatProposalPage();
			ProposalTransactionPage=CreatNewProposalpage.openProposalTrasationPage(productCode,Insurer,Maininsured);
			
		/*
		// capture offer no in property file
		String s = ProposalTransactionPage.captureproposalno();
		propertyReader.updateProperty("ProposalNo_06", s);
		*/
		
			
			//capture proposal no in excel
			String s = ProposalTransactionPage.captureproposalno();
			propertyReader.setCellDataXlsx(0, i, 22, s);
			
			
			ProposalTransactionPage.enterCapitalOfDeath(sumassured);
			ProposalTransactionPage.clickRoleOfPeopleTab();
			ProposalTransactionPage.clickonbeneficiarytab();
			//ProposalTransactionPage.enterBeneficiaryname(beneficiaryame);
			//ProposalTransactionPage.clickrBeneficiaryelationshiparrow();
			//ProposalTransactionPage.selectBeneficiaryrelationshipCode(beneficiaryrelationship);
			//ProposalTransactionPage.entershareofbeneficiary(Share);
			//ProposalTransactionPage.selectPriorityOfTheBeneficiary(PriorityLevel);
			//ProposalTransactionPage.clickonbeneficiaryAddbtn();
			ProposalTransactionPage.addingBeneficiaryDetails(beneficiaryame,beneficiaryrelationship,Share,PriorityLevel);
			ProposalTransactionPage.insuredRiskAnalysistab();
			ProposalTransactionPage.enterHightAndWeight(Height,Weight);
			ProposalTransactionPage.enterMaritalSatusdetails(status);
			ProposalTransactionPage.entersupplementaryInfoDetails(occuption);
			ProposalTransactionPage.enterInsurancePolicyQuesDetails();
			ProposalTransactionPage.enterDocumentdetails(nextstep);
			ProposalTransactionPage.calculateTheValue();
			ProposalTransactionPage.clickConformationBtn();
			Thread.sleep(10000);
			dashboardPage=ProposalTransactionPage.clickonNTTDataLogo();
			Thread.sleep(2000);
			//ProposalTransactionPage.clickAbandon();
			/*
		}
		*/
	}

}

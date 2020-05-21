package com.ndfs.di.fluw.scripts.wholelife;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.CreatNewProposalPage;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class CreateProposalWLTest extends FirstLifeTestCaseHelper{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private CreatNewProposalPage CreatNewProposalpage;
	private com.firstlife.pages.ProposalTransactionPage ProposalTransactionPage;
	
	private String productCode,Insurer,Maininsured,Policyterm,pay,sumassured,beneficiaryame,beneficiaryrelationship,Share,PriorityLevel,Height,Weight,
	status,occuption,nextstep;
	
	@Test
	public void CreatAProposal() throws Throwable 
	{
		//input data
		int i=1;
		productCode=propertyReader.getCellData(2, i, 0);
		Insurer=propertyReader.getCellData(2, i, 1);
		Maininsured=propertyReader.getCellData(2, i, 2);
		Policyterm=propertyReader.getCellData(2, 1, 3);
		sumassured=propertyReader.getCellData(2, i, 5);
		beneficiaryame=propertyReader.getCellData(2, i, 6);
		beneficiaryrelationship=propertyReader.getCellData(2, i, 7);
		Share=propertyReader.getCellData(2, i, 8);	
		PriorityLevel=propertyReader.getCellData(2, i, 9);
		Height=propertyReader.getCellData(2, i, 10);
		Weight=propertyReader.getCellData(2, i, 11);
		status=propertyReader.getCellData(2, i, 12);
		occuption=propertyReader.getCellData(2, i, 13);
		nextstep=propertyReader.getCellData(2, i, 14);
		pay=propertyReader.getCellData(2, i, 19);
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
			    //capture proposal no
				String s = ProposalTransactionPage.captureproposalno();
				propertyReader.setCellDataXlsx(2, i, 26, s);
				ProposalTransactionPage.selectHowToPay(pay);
				ProposalTransactionPage.enterCapitalOfDeath(sumassured);
				ProposalTransactionPage.clickRoleOfPeopleTab();
				ProposalTransactionPage.clickonbeneficiarytab();
				ProposalTransactionPage.addingBeneficiaryDetails(beneficiaryame,beneficiaryrelationship,Share,PriorityLevel);
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
				//Thread.sleep(2000);
				//ProposalTransactionPage.clickAbandon();
				
			}

		


}

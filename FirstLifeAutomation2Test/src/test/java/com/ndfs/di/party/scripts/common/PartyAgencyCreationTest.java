package com.ndfs.di.party.scripts.common;


import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.PartyAgencySearchPage;
import com.firstlife.pages.PartyAgencyTransactionPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;


public class PartyAgencyCreationTest extends FirstLifeTestCaseHelper 
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private PartyAgencySearchPage PartyAgencySearchPage;
	private PartyAgencyTransactionPage PartyAgencyTransactionPage;
	
								//VARIABLES
	
	private String username,password,FName,RegNo,CUCOde,SOCDate,AddType,ZIPCode,AddL1,AddL2,AddL3,City,Prvnc,Country,PhNo1,PhNo2,RepCode,DDAte;
								
								
	
	
	
	
	@Test
	public void PartyAgencyCreation() throws Exception
	{
		int rowCount = propertyReader.getRowCountXls(3);
		System.out.println("rowCount------->>>"+rowCount);
		for(int i =1;i<rowCount;i++)
		{
		username=propertyReader.getCellData2(3, i, 0);
		password=propertyReader.getCellData2(3, i, 1);
		FName=propertyReader.getCellData2(3, i, 2);
		RegNo=propertyReader.getCellData2(3, i, 3);
		CUCOde=propertyReader.getCellData2(3, i, 4);
		SOCDate=propertyReader.getCellData2(3, i, 5);
		AddType=propertyReader.getCellData2(3, i,6 );
		ZIPCode=propertyReader.getCellData2(3, i, 7);
		AddL1=propertyReader.getCellData2(3, i, 8);
		AddL2=propertyReader.getCellData2(3, i, 9);
		AddL3=propertyReader.getCellData2(3, i, 10);
		City=propertyReader.getCellData2(3, i, 11);
		Prvnc=propertyReader.getCellData2(3, i, 12);
		Country=propertyReader.getCellData2(3, i, 13);
		PhNo1=propertyReader.getCellData2(3, i, 14);
		PhNo2=propertyReader.getCellData2(3, i, 15);
		RepCode=propertyReader.getCellData2(3, i, 16);
		DDAte=propertyReader.getCellData2(3, i,17 );
		
		
		
		
								//SCRIPTS
		if(i==1)
		{
		repoterLog = extent.createTest("openLoginPage");
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		
		dashboardPage=loginPage.loginWithDifferentUser(username, password);
		
		logger.info("Log in to application");
		dashboardPage.mouseOverToManuBarDropDown();
		logger.info("Hovering mouse to manu bar");		
		dashboardPage.mouseOverToManuBarDropDown();
		dashboardPage.mouseOverToPartyonDropDown();
		dashboardPage.mouseOverToChangePartyonDropDown();
		dashboardPage.mouseOverToSalesnetworkDropDown();
		
		PartyAgencySearchPage=dashboardPage.mouseOverToLegalRepDropDown();
		}
		
		PartyAgencyTransactionPage = PartyAgencySearchPage.clickOnAdd();
		
		PartyAgencyTransactionPage.chooseAutomatic();
		PartyAgencyTransactionPage.clickOnCreateId();
		PartyAgencyTransactionPage.provideFullName(FName);
		PartyAgencyTransactionPage.provideRegNo(RegNo);
		PartyAgencyTransactionPage.provideComUnqCode(CUCOde);
		PartyAgencyTransactionPage.provideStartOfCopDate(SOCDate);
		PartyAgencyTransactionPage.clickOnAdderss();
		PartyAgencyTransactionPage.selectaddresstype(AddType);
		PartyAgencyTransactionPage.provideZIP(ZIPCode);
		PartyAgencyTransactionPage.provideAddress1(AddL1);
		PartyAgencyTransactionPage.provideAddress2(AddL2);
		PartyAgencyTransactionPage.provideAddress3(AddL3);
		PartyAgencyTransactionPage.provideCity(City);
		PartyAgencyTransactionPage.provideProvince(Prvnc);
		PartyAgencyTransactionPage.provideCountry(Country);
		PartyAgencyTransactionPage.providePhnNo1(PhNo1);
		PartyAgencyTransactionPage.providePhnNo2(PhNo2);
		PartyAgencyTransactionPage.clickOnAdderss();
		PartyAgencyTransactionPage.provideRepCode(RepCode);
		PartyAgencyTransactionPage.provideDDate(DDAte);
		PartyAgencyTransactionPage.clickOnAdderssDetailTab();
		PartyAgencyTransactionPage.clickOnSAve();
		PartyAgencyTransactionPage.clickRecord();
		
		Thread.sleep(10000);
		}
	}
}

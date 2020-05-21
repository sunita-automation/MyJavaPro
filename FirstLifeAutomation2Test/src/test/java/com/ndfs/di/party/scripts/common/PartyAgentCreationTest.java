package com.ndfs.di.party.scripts.common;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.pages.PartyAgentSearchPage;
import com.firstlife.pages.PartyAgentTransactionPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class PartyAgentCreationTest extends FirstLifeTestCaseHelper 
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private PartyAgentSearchPage PartyAgentSearchPage;
	private PartyAgentTransactionPage PartyAgentTransactionPage;
	
							//VARIABLES
	
	private String username,password,Gender,Name,SName,FatName,DOB,Ncode,AddType,ZIP,ADD1,ADD2,ADD3,CityName,ProvinceName,CountryName,
					PhNo1,PhNo2,RepCode,DDate;
						
	
	
	
	
	@Test
	public void PartyAgentCreation() throws Exception
	{
		
							//EXCEL DATA
		
		username=propertyReader.getCellData2(2, 1, 0);
		password=propertyReader.getCellData2(2, 1, 1);
		Gender=propertyReader.getCellData2(2, 1, 2);
		Name=propertyReader.getCellData2(2, 1, 3);
		SName=propertyReader.getCellData2(2, 1, 4);
		FatName=propertyReader.getCellData2(2, 1, 5);
		DOB=propertyReader.getCellData2(2, 1, 6);
		Ncode=propertyReader.getCellData2(2, 1, 7);
		AddType=propertyReader.getCellData2(2, 1, 8);
		ZIP=propertyReader.getCellData2(2, 1, 9);
		ADD1=propertyReader.getCellData2(2, 1, 10);
		ADD2=propertyReader.getCellData2(2, 1, 11);
		ADD3=propertyReader.getCellData2(2, 1, 12);
		CityName=propertyReader.getCellData2(2, 1, 13);
		ProvinceName=propertyReader.getCellData2(2, 1, 14);
		CountryName=propertyReader.getCellData2(2, 1, 15);
		PhNo1=propertyReader.getCellData2(2, 1, 16);
		PhNo2=propertyReader.getCellData2(2, 1, 17);
		RepCode=propertyReader.getCellData2(2, 1, 18);
		DDate=propertyReader.getCellData2(2, 1, 19);
		
		
		
		
		
		
		
							//SCRIPTS
		
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
		
		PartyAgentSearchPage = dashboardPage.mouseOverToRealrepkDropDown();
		
		PartyAgentTransactionPage = PartyAgentSearchPage.clickOnAdd();
		
		PartyAgentTransactionPage.chooseAutomatic();
		PartyAgentTransactionPage.clickOnCreateId();
		PartyAgentTransactionPage.chooseGender(Gender);
		PartyAgentTransactionPage.provideName(Name);
		PartyAgentTransactionPage.provideSurName(SName);
		PartyAgentTransactionPage.providefatherName(FatName);
		PartyAgentTransactionPage.provideDOB(DOB);
		PartyAgentTransactionPage.provideSSn(Ncode);
		PartyAgentTransactionPage.clickOnAddressDetailTab();
		PartyAgentTransactionPage.selectaddresstype(AddType);
		PartyAgentTransactionPage.provideZIP(ZIP);
		PartyAgentTransactionPage.provideADDress1(ADD1);
		PartyAgentTransactionPage.provideADDress2(ADD2);
		PartyAgentTransactionPage.provideADDress3(ADD3);
		PartyAgentTransactionPage.provideCity(CityName);
		PartyAgentTransactionPage.provideProvince(ProvinceName);
		PartyAgentTransactionPage.provideCountry(CountryName);
		PartyAgentTransactionPage.providePhone1(PhNo1);
		PartyAgentTransactionPage.providePhone2(PhNo2);
		PartyAgentTransactionPage.clickOnAgentDeatilTab();
		PartyAgentTransactionPage.provideRepresentativeCode(RepCode);
		PartyAgentTransactionPage.provideProvideDealineDate(DDate);
		PartyAgentTransactionPage.clickOnAddressDetailTab();
		PartyAgentTransactionPage.clickOnSave();
		PartyAgentTransactionPage.clickOnRecord();
		
		
		
		
		Thread.sleep(10000);
	}
	
	
}

package com.ndfs.di.party.scripts.common;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class PeopleCorporateClientTest extends FirstLifeTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.PeoplecorporateSearchPage PeoplecorporateSearchPage;
	private com.firstlife.pages.PeopleCorporateTransactionPage PeopleCorporateTransactionPage;
	
					//VARIABLES
	private String FlName,RegNo,NatId,EcoCode,AddType,CountryName,StateName,CityName,StreetName,ZIpCode,PhnNo1,PhnNo2;
	
	@Test
	public void peopleCorporatepage() throws Exception
	{
					//EXCEL SHEET DATA
		FlName=propertyReader.getCellData2(4, 1, 0);
		RegNo=propertyReader.getCellData2(4, 1, 1);
		NatId=propertyReader.getCellData2(4, 1, 2);
		EcoCode=propertyReader.getCellData2(4, 1, 3);
		AddType=propertyReader.getCellData2(4, 1, 4);
		CountryName=propertyReader.getCellData2(4, 1, 5);
		StateName=propertyReader.getCellData2(4, 1, 6);
		CityName=propertyReader.getCellData2(4, 1, 7);
		StreetName=propertyReader.getCellData2(4, 1, 8);
		ZIpCode=propertyReader.getCellData2(4, 1, 9);
		PhnNo1=propertyReader.getCellData2(4, 1, 10);
		PhnNo2=propertyReader.getCellData2(4, 1, 11);
		
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
		dashboardPage.mouseOverToPeopleOnDropDown();
		dashboardPage.mouseOverToPersonDefinitionOnDropDown();
		dashboardPage.mouseOverToclientOnDropPersonDown();
		
		PeoplecorporateSearchPage =dashboardPage.clickOnCorporateonclientPer();
		
		PeopleCorporateTransactionPage=PeoplecorporateSearchPage.clickOnAdd();
		takeScreenShot("addbtn");
		PeopleCorporateTransactionPage.createCorprtn();
		PeopleCorporateTransactionPage.provideName(FlName);
		PeopleCorporateTransactionPage.provideRegNo(RegNo);
		PeopleCorporateTransactionPage.provideNationalId(NatId);
		PeopleCorporateTransactionPage.provideEconmicCode(EcoCode);
		PeopleCorporateTransactionPage.clickOnNxtBtn();
		PeopleCorporateTransactionPage.selectaddresstype(AddType);
		PeopleCorporateTransactionPage.provideCountry(CountryName);
		PeopleCorporateTransactionPage.provideState(StateName);
		PeopleCorporateTransactionPage.provideCity(CityName);
		takeScreenShot("city");
		PeopleCorporateTransactionPage.provideStreet(StreetName);
		PeopleCorporateTransactionPage.provideZIP(ZIpCode);
		PeopleCorporateTransactionPage.providePhnNO1(PhnNo1);
		PeopleCorporateTransactionPage.providePhnNo2(PhnNo2);
		takeScreenShot("phnno");
		PeopleCorporateTransactionPage.clickOnSaveBtn();
		PeopleCorporateTransactionPage.clickOnRecord();
		Thread.sleep(20000);
	}
	
}

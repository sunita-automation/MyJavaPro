package com.ndfs.di.party.scripts.common;


import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.firstlife.pages.DashboardPage;
import com.firstlife.pages.LoginPage;
import com.firstlife.utils.FirstLifeTestCaseHelper;

public class PeopleIndividualClientTest extends FirstLifeTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private com.firstlife.pages.PeopleIndividualSearchPage PeopleIndividualSearchPage;
	private com.firstlife.pages.PeopleIndividualTransactionPage PeopleIndividualTransactionPage;
	
	
					//variables
	private String Pname,pfix,SurName,Fathername,NatCode,Gender,DOb,MoBoNo,AddType,CountryNAme,Province,City,Street,PostalZip,PHN1,PHN2;
	
	
	
	
	
	@Test
	public void peopleIndividualPage() throws Exception
	{
		
		
					//Excel Sheet Data
		Pname=propertyReader.getCellData2 (0, 1, 1);
		pfix=propertyReader.getCellData2 (0, 1, 0);
		SurName=propertyReader.getCellData2 (0, 1, 2);
		Fathername=propertyReader.getCellData2 (0, 1, 3);
		NatCode=propertyReader.getCellData2 (0, 1, 4);
		Gender=propertyReader.getCellData2 (0, 1, 5);
		DOb=propertyReader.getCellData2 (0, 1, 6);
		MoBoNo=propertyReader.getCellData2 (0, 1, 7);
		AddType=propertyReader.getCellData2(0, 1, 8);
		CountryNAme=propertyReader.getCellData2(0, 1, 9);
		Province=propertyReader.getCellData2(0, 1, 10);
		City=propertyReader.getCellData2(0, 1, 11);
		Street=propertyReader.getCellData2(0, 1, 12);
		PostalZip=propertyReader.getCellData2(0, 1, 13);
		PHN1=propertyReader.getCellData2(0, 1, 14);
		PHN2=propertyReader.getCellData2(0, 1, 15);
		
		
		
		
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
		
		PeopleIndividualSearchPage=dashboardPage.clickOnIndividualonclientPer();
		
		PeopleIndividualTransactionPage=PeopleIndividualSearchPage.clickOnAdd();
		Thread.sleep(10000);
		PeopleIndividualTransactionPage.clickOnCreateId();
		Thread.sleep(10000);
		
		String s=PeopleIndividualTransactionPage.capturePartyId();
		Thread.sleep(1000);
		propertyReader.setCellDataXls( 0, 1, 16, s);
		propertyReader.setCellDataXlsx(0, 1, 1, s);
		propertyReader.setCellDataXlsx(0, 1, 2, s);
		
		PeopleIndividualTransactionPage.selectPrefix(pfix);
		PeopleIndividualTransactionPage.providePersonName(Pname);
		PeopleIndividualTransactionPage.provideSurname(SurName);
		PeopleIndividualTransactionPage.provideFatherName(Fathername);
		PeopleIndividualTransactionPage.provideNationalCode(NatCode);
		PeopleIndividualTransactionPage.provideGender(Gender);
		PeopleIndividualTransactionPage.provideDOB(DOb);
		PeopleIndividualTransactionPage.provideMobileNo(MoBoNo);
		PeopleIndividualTransactionPage.clickOnAddress();
		PeopleIndividualTransactionPage.selectaddresstype(AddType);
		PeopleIndividualTransactionPage.provideCountry(CountryNAme);
		PeopleIndividualTransactionPage.provideProvince(Province);
		PeopleIndividualTransactionPage.provideCity(City);
		PeopleIndividualTransactionPage.provideStreetName(Street);
		PeopleIndividualTransactionPage.providePostalCode(PostalZip);
		PeopleIndividualTransactionPage.providePhnCountryCode(PHN1);
		PeopleIndividualTransactionPage.providePhnNumber(PHN2);
		PeopleIndividualTransactionPage.clickOnSave();
		PeopleIndividualTransactionPage.clickOnRecord();
		Thread.sleep(2000);
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

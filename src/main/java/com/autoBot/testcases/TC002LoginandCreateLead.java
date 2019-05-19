package com.autoBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoBot.pages.LoginPage;
import com.autoBot.testng.api.base.Annotations;

public class TC002LoginandCreateLead extends Annotations {
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_CreateLead";
		testcaseDec = "Login into leaftaps";
		author = "rajkumar";
		category = "smoke";
		excelFileName = "TC002";
	} 

	
	@Test(dataProvider = "fetchData")
	public void loginLogout(String userName, String password, String logInName, String compName, String firstName, String lastName) throws InterruptedException {
	new LoginPage()
		.enterUserName(userName)
		.enterPassWord(password)
		.clickLogin()
		.verifyLoginName(logInName)
		.clickCRMLink()
		.clickLeadsTab()
		.clickCreateLead()
		.enterCompanyName(compName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadButton()
		.verifyCreatedLead(firstName);
	}
	
}

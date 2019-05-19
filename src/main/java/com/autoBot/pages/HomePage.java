package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;


public class HomePage extends Annotations{ 

	/*public HomePage() {
       PageFactory.initElements(driver, this);
	} 
*/
//	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogout;
	public LoginPage clickLogout() {
		WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(eleLogout);  
		return new LoginPage();
	}

	public HomePage verifyLoginName(String logInName) {
		// TODO Auto-generated method stub
		return this;
	}
	
	public MyHomePage clickCRMLink() {
		WebElement crmLink = locateElement("link", "CRM/SFA");
		click(crmLink); 
		return new MyHomePage();
		

}

}








package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class CreateLeadPage extends Annotations {
	
	
	public CreateLeadPage enterCompanyName(String data) {
		WebElement elecompanyName = locateElement("id", "createLeadForm_companyName");
		clearAndType(elecompanyName, data);  
		return new CreateLeadPage();		
	}
	
	public CreateLeadPage enterFirstName(String data) {
		WebElement elefirstName = locateElement("id", "createLeadForm_firstName");
		clearAndType(elefirstName, data); 
		
		return new CreateLeadPage();		
	}
	
	public CreateLeadPage enterLastName(String data) {
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		clearAndType(eleLastName, data); 
		return new CreateLeadPage();		
	}
	
	public ViewLeadPage clickCreateLeadButton() throws InterruptedException {
		Thread.sleep(500);
		WebElement createLeadButton = locateElement("xpath", "//input[@class='smallSubmit']");
		click(createLeadButton);
		return new ViewLeadPage();
	}
	
	
}

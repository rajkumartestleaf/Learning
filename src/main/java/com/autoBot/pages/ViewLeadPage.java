package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class ViewLeadPage extends Annotations {
	
	
	public ViewLeadPage verifyCreatedLead(String data) {
		
		
		WebElement eleFirstName = locateElement("id", "viewLead_firstName_sp");
		
		String expFirstName = eleFirstName.getText();
		String actFirstname = data;
		System.out.println(expFirstName);
		if (expFirstName.equals(actFirstname))
			System.out.println("Expected FirstName "+expFirstName+" should appear after the Create Lead : "+actFirstname);
		else
			System.out.println("Expected FirstName"+expFirstName+" is not appearing after the Create Lead : "+actFirstname);
				
		return this;
		
	}
}

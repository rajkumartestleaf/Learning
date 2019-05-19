package com.autoBot.pages;


import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class MyHomePage extends Annotations {
	
	
	public MyLeadsPage clickLeadsTab() {
		WebElement clickLeads = locateElement("link", "Leads");
		click(clickLeads);  
		return new MyLeadsPage();
		
	}
	
	
}

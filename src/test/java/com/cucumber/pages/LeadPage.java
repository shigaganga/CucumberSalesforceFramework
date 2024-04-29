package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class LeadPage extends BasePage {
	static WebDriver driver;
	public LeadPage() {
	super(driver=BaseTest.getDriver("Chrome"));	

	//addObject(, By.xpath());
	addObject("LeadSelectDrpdown", By.xpath("//select[@id='fcf']"));
	addObject("go", By.xpath("//input[@title='Go!']"));
	addObject("newbtn", By.xpath("//input[@title='New']"));
	addObject("lastname", By.xpath("//input[@id='name_lastlea2']"));
	addObject("companyname", By.xpath("//input[@id='lea3']"));
	addObject( "LeadcreateSave", By.xpath("//td[@id='bottomButtonRow']/input[1]"));
	
}
}
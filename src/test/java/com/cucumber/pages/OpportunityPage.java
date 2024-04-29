package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class OpportunityPage extends BasePage{

	static WebDriver driver;
	public OpportunityPage () {
	super(driver=BaseTest.getDriver("Chrome"));	
	
	
	addObject("OppDropDown", By.xpath("//select[@id='fcf']"));
	//addObject(, By.xpath());
	
	addObject( "NewOpp", By.xpath("//form[@id='hotlist']/table/tbody/tr/td[2]/input"));
	addObject("OppName", By.xpath("//input[@id='opp3']"));
	addObject("AccntName", By.xpath("//input[@id='opp4']"));
	addObject("searchiconopp", By.xpath("//a[@id='opp4_lkwgt']/img"));
	addObject("frame1", By.xpath("//frame[@id='searchFrame']"));
	addObject("Accountbox", By.xpath("//form[@id='theForm']/div/div[2]/input[1]"));
	addObject("go" , By.xpath("//input[@name='go']"));
	addObject("frame2" , By.xpath("//frame[@id='resultsFrame']"));
	addObject("table", By.xpath("//form[@id='new']/div/div[3]/div/div[2]/table/tbody/tr[2]/th/a"));
	addObject( "save" ,By.xpath("//td[@id='bottomButtonRow']/input[1]"));
	addObject("oppPipeline"	, By.xpath("//a[text()='Opportunity Pipeline']"));
	addObject("StuckOpp", By.xpath("//a[text()='Stuck Opportunities']"));
	addObject("QuarterlyLink", By.xpath("//h3[normalize-space()='Quarterly Summary']"));
	addObject("interval", By.xpath("//select[@id='quarter_q']"));
	addObject("include", By.xpath("//select[@id='open']"));
	addObject("Runreport", By.xpath("//input[@title='Run Report']"));
	 
	
}
}
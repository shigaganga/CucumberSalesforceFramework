package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class RandomScenarioPage extends BasePage {
	static WebDriver driver;
 public RandomScenarioPage() {
		
	super(driver=BaseTest.getDriver("Chrome"));	

	
	
	addObject("name", By.xpath("//div[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
	addObject("EditProfile", By.xpath("//*[@id='chatterTab']/div[2]/div[2]/div[1]/h3/div/div/a/img"));
	addObject("frame1", By.xpath("//iframe[@id='contactInfoContentId']"));
	addObject("About", By.xpath("//a[contains(text(),'About')]"));
	addObject("lastname", By.id("lastName"));
	addObject("SaveAll", By.xpath("//input[@value='Save All']"));
	addObject("CustomizeTab", By.xpath("//input[@title='Customize My Tabs']"));
	addObject("selectab", By.xpath("//option[text()='Subscriptions']"));
	addObject("remove", By.xpath("//img[@title='Remove']"));
	addObject("savetab", By.xpath("//input[@title='Save']"));
	addObject("Logout", By.xpath("//a[normalize-space()='Logout']"));
	addObject("currentDate", By.xpath("//div[@id=\"ptBody\"]/div/div[2]/span[2]/a"));
	addObject("eightPM", By.xpath("//div[@id='p:f:j_id25:j_id61:28:j_id64']"));
	addObject("SubjectCombo", By.xpath("//table[@class='detailList']/tbody/tr[2]/td[2]/div/a/img"));
	addObject("other", By.xpath("//div[2][@class='choicesBox tertiaryPalette brandSecondaryBrd']/ul/li[5]/a"));
	addObject("EndTime", By.xpath("//input[@id='EndDateTime_time']"));
	addObject("saveEvent", By.xpath("//td[@id='bottomButtonRow']/input[1]"));
	addObject("recurrance", By.xpath("//input[@id='IsRecurrence']"));
	addObject("weeklyRadio", By.id("rectypeftw"));
	addObject("EndDate", By.xpath("//input[@id='RecurrenceEndDateOnly']"));
	addObject("monthview", By.className("monthViewIcon"));
	addObject("fourPM", By.xpath("//div[@id='p:f:j_id25:j_id61:20:j_id64']"));
	addObject("EndTime2", By.xpath("//input[@id='EndDateTime_time']"));
	addObject("saveEvent2", By.xpath("//td[@id='bottomButtonRow']//input[@title='Save & New Event']"));
	
}
}
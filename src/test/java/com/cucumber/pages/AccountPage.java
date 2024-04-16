package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class AccountPage extends BasePage{

	static WebDriver driver;
	public AccountPage () {
	super(driver=BaseTest.getDriver("Chrome"));	
	//addObject(, By.xpath());
	//addObject(, By.xpath());
	addObject("createViewLink", By.xpath("//a[text()='Create New View']"));
	addObject("vIewname", By.xpath("//input[@id='fname']"));
	addObject("NewvIewname", By.xpath("//input[@id='devname']"));
	addObject("SaveView", By.xpath("//form[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[1]" ));
	
	addObject( "new", By.xpath("//input[@name='new']"));
	addObject("Accountname", By.xpath("//input[@id='acc2']"));
	addObject("type", By.xpath("//select[@id='acc6']"));
	addObject( "priority" , By.xpath("//select[@id='00NHp00000blNWX']"));
	addObject("SLA", By.xpath("//select[@id='00NHp00000blNWZ']"));
	addObject("SLANo" , By.xpath("//input[@id='00NHp00000blNWb']"));
	addObject("Date", By.xpath("//input[@id='00NHp00000blNWa']"));
	addObject("SaveAccnt", By.xpath("//td[@id='topButtonRow']/input[1]"));
	
}}
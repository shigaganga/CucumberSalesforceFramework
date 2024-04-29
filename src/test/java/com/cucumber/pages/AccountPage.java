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
	addObject("MergeAccount", By.xpath("//a[text()='Merge Accounts']"));
	addObject("srchbox", By.xpath("//input[@id='srch']"));
	addObject("FindAccounts", By.xpath("//form[@id='stageForm']/div/div[2]/div[4]/input[2]"));
	addObject("next", By.xpath("//form[@id='stageForm']/div/div[2]/div[5]/div/input[1]"));
	addObject("Merge", By.xpath("//form[@id='stageForm']/div/div[2]/div[5]/div/input[2]"));
	//addObject(, By.xpath());
	//addObject(, By.xpath());
	addObject("FromDate", By.xpath("//input[@id='ext-comp-1042']"));
	addObject("lastActvityReport", By.xpath("//a[text()='Accounts with last activity > 30 days']"));
	addObject("RunReport", By.xpath("//button[@id='ext-gen63']"));
	//addObject(, By.xpath())
	


	addObject("save", By.xpath("//form[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1] "));
	addObject("add", By.xpath("//a[@id='colselector_select_0_right']/img"));
	addObject("lastActivity", By.xpath("//select[@id='colselector_select_0']/option[32]"));
	addObject( "Entervalue", By.xpath("//input[@name='fval1']"));
	addObject("selectEquals" , By.xpath("//select[@id='fop1']"));
	addObject("NewvIewname",By.xpath("//input[@id='devname']"));
	addObject("vIewname", By.xpath("//input[@id='fname']"));
	addObject("selectAccountname" , By.xpath("//select[@id='fcol1']"));
	addObject("editview", By.xpath("//a[text()='Edit']"));
	addObject("viewDrop", By.xpath("//select[@name='fcf']"));
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
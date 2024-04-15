package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class ContactPage extends BasePage {
	static WebDriver driver;
	public ContactPage() {
	super(driver=BaseTest.getDriver("Chrome"));	

	//addObject(, By.xpath());
	
	addObject("Onecontact", By.xpath("//a[text()='Gonzalez, Rose']"));
	addObject( "RightDropdown", By.id("hotlist_mode"));
	addObject("viewDropdown", By.xpath("//select[@name='fcf']"));
	addObject("viewsave", By.xpath("//form[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[1]"));
	addObject( "viewUniquename" , By.xpath("//input[@id='devname']"));
	addObject("ViewName", By.xpath("//input[@id='fname']"));
	addObject("ContactCreateNewView" , By.xpath("//a[text()='Create New View']"));
	addObject("save", By.xpath("(//input[@name='save'])[1]"));
	addObject("table", By.xpath("//form[@id='new']/div/div[3]/div/div[2]/table/tbody/tr[2]/th/a"));
	addObject("frame2" , By.xpath("//frame[@id='resultsFrame']"));
	addObject("go", By.xpath("//input[@name='go']"));
	addObject("Accountbox", By.xpath("//form[@id='theForm']/div/div[2]/input[1]"));
	addObject("frame1", By.xpath("//frame[@id='searchFrame']"));
	addObject("searchicon" , By.xpath("//a[@id='con4_lkwgt']/img"));
	addObject("Continue", By.xpath("//input[@title='Continue']"));
	addObject("AccntName", By.xpath("//input[@id='con4']"));
	addObject("New", By.xpath("//form[@id='hotlist']/table/tbody/tr/td[2]/input"));
	addObject("lastname", By.xpath("//input[@id='name_lastcon2']"));
	addObject("ContactPage", By.xpath("//li[@id='Contact_Tab']/a"));
	
	}
}
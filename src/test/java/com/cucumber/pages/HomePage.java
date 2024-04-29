package com.cucumber.pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class HomePage extends BasePage{
static WebDriver driver;
public HomePage() {
super(driver=BaseTest.getDriver("Chrome"));	
addObject("usermenudropdown",By.id("userNavLabel"));
addObject("UsernameText", By.xpath("//span[@id='idcard-identity']"));
addObject("Logout", By.xpath("//a[@title='Logout']"));
	addObject("Profile",By.xpath("//a[@title='My Profile']"));
	addObject("EditPen",By.xpath("//*[@id='chatterTab']/div[2]/div[2]/div[1]/h3/div/div/a/img"));
	addObject("frame1",By.id("contactInfoContentId"));
	addObject("About",By.xpath("//li[@id='aboutTab']/a"));
	addObject("Lastname",By.id("lastName"));
	addObject("saveall",By.xpath("//input[@value='Save All']"));
	addObject("Post",By.xpath("//a[@id='publisherAttachTextPost']/span[1]"));
	addObject("frame2",By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']"));
	addObject("textArea",By.xpath("/html/body"));
	addObject("share",By.xpath("//input[@id='publishersharebutton']"));
	addObject("file",By.xpath("//a[@id='publisherAttachContentPost']/span[1]"));
	addObject("moderator",By.id("displayBadge"));
	addObject("uploadphoto",By.xpath("//a[@id='uploadLink']"));
	
	addObject("frame3",By.id("uploadPhotoContentId"));
	addObject("photopath",By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
	addObject("usermenudropdown",By.xpath("//div[@id='userNavButton']"));
	addObject("photosave1",By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));
	addObject("frame4",By.id("uploadPhotoContentId"));
	addObject("photosave2",By.xpath("//input[@id='j_id0:j_id7:save']"));
addObject("Profile",By.xpath("//a[@title='My Profile']"));
addObject("EditPen",By.xpath("//*[@id='chatterTab']/div[2]/div[2]/div[1]/h3/div/div/a/img"));
addObject("frame1",By.id("contactInfoContentId"));
addObject("About",By.xpath("//li[@id='aboutTab']/a"));
addObject("Lastname",By.id("lastName"));
addObject("saveall",By.xpath("//input[@value='Save All']"));
addObject("Post",By.xpath("//a[@id='publisherAttachTextPost']/span[1]"));
addObject("frame2",By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']"));
addObject("textArea",By.xpath("/html/body"));
addObject("share",By.xpath("//input[@id='publishersharebutton']"));
addObject("file",By.xpath("//a[@id='publisherAttachContentPost']/span[1]"));
addObject("moderator",By.id("displayBadge"));
addObject("uploadphoto",By.xpath("//a[@id='uploadLink']"));
addObject("frame3",By.id("uploadPhotoContentId"));
addObject("photopath",By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
addObject("photosave1",By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));
addObject("frame4",By.id("uploadPhotoContentId"));
addObject("photosave2",By.xpath("//input[@id='j_id0:j_id7:save']"));
addObject("Settings",By.xpath("//a[@title='My Settings']"));
addObject("Personal",By.id("PersonalInfo_font"));
addObject("LoginHistory",By.id("LoginHistory_font"));
addObject("displayFormat",By.id("DisplayAndLayout_font"));
addObject("customizetab",By.xpath("//span[@id='CustomizeTabs_font']"));
addObject("salesforceChatterEle",By.xpath("//select[@id='p4']"));
addObject("Report",By.xpath("//option[@value='report']"));
addObject("Add",By.xpath("//img[@title='Add']"));
addObject("SaveReport",By.xpath("//input[@title='Save']"));
addObject("Email",By.xpath("//div[@id='EmailSetup']/a"));
addObject("EmailSettings",By.xpath("//span[@id='EmailSettings_font']"));
addObject("Emailname",By.xpath("//input[@id='sender_name']"));
addObject("EmailAddress",By.xpath("//input[@id='sender_email']"));
addObject("bcc",By.xpath("//input[@id='auto_bcc0']"));
addObject("saveEmailsettings",By.xpath("//input[@title='Save']"));
addObject("calender",By.id("CalendarAndReminders_font"));
addObject("activityremainder",By.xpath("//span[@id='Reminders_font']"));
addObject("openRemainder",By.id("testbtn"));
addObject("parentwindow",By.xpath("//div[@id='userNav']"));
addObject("developerConsole", By.xpath("//a[@title='Developer Console (New Window)']"));
addObject("Contact", By.xpath("//li[@id='Contact_Tab']/a"));
addObject("Account", By.xpath("//a[@title='Accounts Tab']"));
addObject("Opportunity", By.xpath("//a[text()='Opportunities']"));
addObject("Lead", By.xpath("//a[text()='Leads']"));
addObject("Home", By.xpath("//a[text()='Home']"));
addObject("plusTab", By.xpath("//img[@title='All Tabs']"));

}
}
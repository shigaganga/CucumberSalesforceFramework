package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class LoginPage extends BasePage{
	static WebDriver driver;

public LoginPage() {
		super(driver=BaseTest.getDriver("Chrome"));
		addObject("Username", By.id("username"));
		addObject("Password", By.id("password"));
		addObject("Login", By.id("Login"));
		addObject("TextMessage", By.xpath("//div[@id='error']"));
		addObject("forgotpassword", By.id("forgot_password_link"));
		addObject("UsernameFogtpge", By.xpath("//input[@id='un']"));
		addObject("Continue", By.xpath("//input[@id='continue']"));
		//addObject("errormessage", By.xpath("//div[@id='error']"));
	}


}

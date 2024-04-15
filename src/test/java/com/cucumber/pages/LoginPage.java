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
		addObject("error", By.xpath("//div[@id='error']"));
		addObject("forgotpassword", By.id("forgot_password_link"));
		addObject("UsernameFogtpge", By.xpath("//input[@id='un']"));
		addObject("Continue", By.xpath("//input[@id='continue']"));
		addObject("usermenudropdown",By.id("userNavLabel"));
		addObject("Logout", By.xpath("//a[@title='Logout']"));
		addObject( "RememberMe", By.id("rememberUn"));
		addObject("UsernameText", By.xpath("//span[@id='idcard-identity']"));
		
	}


}

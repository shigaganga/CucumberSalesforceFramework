package com.cucumber.base;


import java.util.HashMap;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
	WebDriver driver;
	HashMap<String, By> ObjectRepo = new HashMap<String, By>();
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}

	
	
	public void addObject(String logicalName, By by) {//By means how do you identify element(by xpath or by id etc
		ObjectRepo.put(logicalName, by);
	}
	
	
	public WebElement getElement(String logicalName) {
		By by = ObjectRepo.get(logicalName);
		WebElement element = driver.findElement(by);
		return element ;
	}
	public void enterIntoTextBox(String logicalName, String value) {
		WebElement element =getElement(logicalName);
		element.sendKeys(value);
		
		}
	public void ClickOnButton(String logicalName){
		WebElement element=getElement(logicalName);
		element.click();
	}
	public void waitForElement(String logicalName) {
		WebElement element=getElement(logicalName);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void clickonRadioButton(String logicalName) {
		WebElement element = getElement(logicalName);
		element.click();
		
	}
	public String getTextFromElement(String logicalName) {
		WebElement element=getElement(logicalName);
		String data = element.getText();
		return data;
	
}
	public  void selectText(String logicalName, String value)
	{
		WebElement element=getElement(logicalName);
		Select selectText=new Select(element);
		selectText.selectByVisibleText(value);
	
	}
	}

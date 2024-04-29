package com.cucumber.base;


import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



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
	public void ClickOnLink(String logicalName){
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
	public void clickonInterceptedExceptionButton(String logicalName) {
		WebElement element = getElement(logicalName);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element)); 
		element.click();
		
	}

   
    
	public String getTextFromElement(String logicalName) {
		WebElement element=getElement(logicalName);
		String data = element.getText();
		return data;
	
}
	  public String getPageTitle() {
	        return driver.getTitle();
	    }
	public void clearElement(String LogicalName) {
		WebElement element=getElement(LogicalName);
		if (element.isDisplayed()) {
			element.clear();
		}
		
	}
	public void validateText(String LogicalName,String expectedtext) {
		WebElement element=getElement(LogicalName);
		waitForElement(LogicalName);
		String actualtext=element.getText();
		Assert.assertEquals(expectedtext, actualtext);
		
		
		
	}
	public  void MoveToElementAction(String logicalName) {
		Actions action=new Actions(driver);
		WebElement element=getElement(logicalName);
		action.moveToElement(element).build().perform();
		
	}
	
	public  void DoubleclickAction(String logicalName) {
		Actions action=new Actions(driver);
		WebElement element=getElement(logicalName);
		action.doubleClick(element).build().perform();
		
	}
	
	public  void selectText(String logicalName, String value)
	{
		WebElement element=getElement(logicalName);
		Select selectText=new Select(element);
		selectText.selectByVisibleText(value);
	
	}
	public  void selectIndex(String logicalName, int value)
	{
		WebElement element=getElement(logicalName);
		Select selectText=new Select(element);
		selectText.selectByIndex(value);
	
	}
	public  void selectvaluedata(String logicalName, String value)
	{
		WebElement element=getElement(logicalName);
		Select selectText=new Select(element);
		selectText.selectByValue(value);
	
	}//frame methods
	public void frameElement(String logicalName){
		WebElement element=getElement(logicalName);
		waitForElement(logicalName);
		driver.switchTo().frame(element);
	}	
	public void framename(String frameName){
		driver.switchTo().frame(frameName);
	}	
	public void frameindex(int frameNo){
		driver.switchTo().frame(frameNo);
	}	
	public void defaultoriginalPage() {
		driver.switchTo().defaultContent();
		
	}
	//window methods
	public String getParentWindow() {
		String parentwindow=driver.getWindowHandle();
		System.out.println("Title of the current window:" + driver.getTitle());
		return parentwindow;
		
	}
	
	public void switchNewWindow() {
		String parentwindow=driver.getWindowHandle();
		Set<String>windowHandles=driver.getWindowHandles();
		for(String newWindowHandle:windowHandles) {
			 if (!newWindowHandle.equals(parentwindow))
		        {
		        
				 driver.switchTo().window(newWindowHandle);
		        }
			 System.out.println("Title of the new window:" + driver.getTitle());	}}
				
	public void switchToparentWndow(String parentwindow) {
		Set<String>windowHandles=driver.getWindowHandles();
		for(String newWindowHandle:windowHandles) {
			 if (newWindowHandle.equals(parentwindow))
		        {
		        
				 driver.switchTo().window(parentwindow);
		        }
			 System.out.println("Title of the new window:" + driver.getTitle());	}}
				
						
			
			
			
	
	
	public String getAlertText() {
		Alert alert=driver.switchTo().alert();
		return alert.getText();
	}
	public void AcceptAlert(Alert alert) {
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
	}
	public void dismissAlert() {
		Alert alert2=driver.switchTo().alert();
		alert2.dismiss();
	}
	}

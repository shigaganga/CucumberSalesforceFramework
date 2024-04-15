package com.cucumber.steps;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;
import com.cucumber.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Steps extends BaseTest{
	BasePage page;
	PageFactory pagefactory=new PageFactory();


	@Given("User launch the application in {string}")
public void user_launch_the_application_in(String browsername) {
    launchapplication(browsername);
}
@Given("User is on {string}")
public void user_is_on(String pageName) {
	page=pagefactory.initialize(pageName);
}

@Then("User waits for the element {string}")
public void user_waits_for_the_element(String logicalName) {
   page.waitForElement(logicalName);
}
@Then("user waits to loadpage")
public void user_waits_to_loadpage() {
  waitThread();
}

@Then("Clear Element {string}")
public void clear_element(String logicalName) {
    page.clearElement(logicalName);
}
@Then("User verifies the textbox {string} {string}")
public void user_verifies_the_textbox(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}






@Then("User Enter in to the text box {string} {string}")
public void user_enter_in_to_the_text_box(String logicalName, String value) {
	page.enterIntoTextBox(logicalName, value);
}
@Then("Click on the button {string}")
public void click_on_the_button(String logicalName) {
	 page.ClickOnButton(logicalName);
}
@Then("User Click on a RadioButton  {string}")
public void user_click_on_a_radio_button(String logicalName) {
    page.clickonRadioButton(logicalName);
}

@Then("User got new alert for reset password")
public void user_got_new_window_for_reset_password() {
   System.out.println("New alertbox for reset password ");
}

@Then("User verifies the message {string} {string}")
public void user_verifies_the_message(String logicalName, String expectedText) {
	page.validateText(logicalName,expectedText);
}

@Then("Click on the link {string}")
public void click_on_the_link(String logicalName) {
    page.ClickOnLink(logicalName);
}
@Then("Select from dropdown {string} {string}")
public void select_from_dropdown1(String logicalName, String value) {
	page.selectText(logicalName,value );
}


@Then("Change to frame {string}")
public void change_to_frame(String logicalName) {
    page.frameElement(logicalName);
}
@Then("Back to defaultframe")
public void back_to_defaultframe() {
    page.defaultoriginalPage();
}
@When("Mousehover to element {string}")
public void mousehover_to_element(String logicalName) {
    page.MoveToElementAction(logicalName);
}

@Then("Click on the radiobutton {string}")
public void click_on_the_radiobutton(String logicalName) {
    page.clickonRadioButton(logicalName);
}
@When("Find the current parent window {string}")
public void find_the_current_parent_window(String logicalName) {
   page.getParentWindow();
   
}
@When("Switch to the new window {string}")
public void switch_to_the_new_window(String string) {
   page.switchNewWindow();
}
@Then("Switch back to the parent window")
public void switch_back_to_the_parent_window() {
    page.switchtoParentWindow();

}



@After
public void teardown(Scenario scenario) {
	
	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshot, "image/png",scenario.getName());
	
	
	driver.close();
	driver=null;
}

}

	
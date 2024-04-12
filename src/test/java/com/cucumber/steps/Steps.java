package com.cucumber.steps;



import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;
import com.cucumber.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
@Then("User got text {string}")
public void user_got_error_text(String string) {
   String actual= page.getTextFromElement(string);
    String expectederrormsg="Please enter your password.";
    if(expectederrormsg.equals(actual))
		System.out.println("both actual and expected are same message");
}
@Then("User got new alert for reset password")
public void user_got_new_window_for_reset_password() {
   System.out.println("New alertbox for reset password ");
}




@After
public void teardown() {
	
	driver.close();
	driver=null;
}

}

	
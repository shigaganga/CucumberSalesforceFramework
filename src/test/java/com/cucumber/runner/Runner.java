package com.cucumber.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features\\",
				 glue = {"com.cucumber.steps"},
				 plugin= {"pretty", "html:target/cucumber-reports/cucumber.html",
						 "json:target/cucumber-reports/cucumber.json"},

                     tags="@Test37"
                     		
				 )



public class Runner {
	
	
	
	

}
//for currently working test we can give tag   @developing or @Test or@inprogress or whatever
//instead of giving coma seperated feature files we can give feature folder
//features="features\\"  so it will take all files inside feature folder and check the tag and execute it

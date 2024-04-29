Feature:Account scenarios of salesforce
@login
Scenario:Opportunity dropdown
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the link "Opportunity"
Given User is on "OpportunityPage"
Then Click on the link "OppDropDown"
@login 
Scenario:New Account
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the link "Opportunity"
Given User is on " OpportunityPage"
Then User waits for the element "NewOpp"
Then Click on the link "NewOpp"
Then User Enter in to the text box "OppName" "CucumberOpportunity"
Then Click on the button "AccntName"
When Find the current parent window 	   
Then Click on the link "searchiconopp"	
And Switch to the new window "newWindow"
Then User waits for the element "frame1"
Then Change to frame "frame1"
Then User waits for the element "Accountbox"
Then User Enter in to the text box "Accountbox" "sa"  
Then user waits to loadpage
Then Click on the button "go"  
Then Back to defaultframe
Then Change to frame "frame2"  
Then Click on the button "table"
And Switch back to the parent window	
Then User waits for the element "save"
Then Click on the button "save"  
@login 
Scenario:opportunity pipeline
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the link "Opportunity"
Given User is on " OpportunityPage" 
 Then Click on the link "oppPipeline"		 
 @login  
Scenario: stuck opportunities
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the link "Opportunity"
Given User is on " OpportunityPage" 
 Then Click on the link "StuckOpp"		 
  @login  
Scenario:Quarterly summary link
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the link "Opportunity"
Given User is on " OpportunityPage" 		 
Then Click on the link "QuarterlyLink"
 Then Select from dropdown "interval" "Current FQ" 
  Then Select from dropdown "include" "Open Opportunities" 
  Then Click on the link "Runreport"
  

			 
			     
Feature:Account scenarios of salesforce
@login
Scenario:New Account
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the link "Account"
Given User is on "AccountPage"
Then Click on the button "new"
Then User waits for the element "Accountname"
Then User Enter in to the text box "Accountname" "selenium"
 Then Select from dropdown "type" "Customer - Direct"
 Then Select from dropdown "priority" "High"
 Then Select from dropdown "SLA" "Gold"
Then User Enter in to the text box "SLANo" "6753"
Then User Enter in to the text box "Date" "4/15/2024"	 
Then User waits for the element "SaveAccnt"    
	Then Click on the button "SaveAccnt"		      
	@login 
Scenario: create ViewName
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the link "Account"
Given User is on "AccountPage"
Then Click on the link "createViewLink"
Then Clear Element "vIewname"
Then User Enter in to the text box "vIewname" "cucumberview"
Then Clear Element "NewvIewname"
Then User Enter in to the text box "NewvIewname" "Newcucumberview"			      
Then Click on the button "SaveView"			     
@login @Test1
Scenario: Edit ViewName
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the link "Account"
Given User is on "AccountPage"		      
Then Select from dropdown "viewDrop" "viewname"
Then Click on the button "editview"
Then Clear Element "vIewname"
Then User Enter in to the text box "vIewname" "newViewname"
Then Click on the button "NewvIewname"
Then Select from dropdown "selectAccountname" 
Then Select from dropdown "selectEquals" 			      
Then User Enter in to the text box "Entervalue" "a"			      
Then Select from dropdown "lastActivity" "Last Activity"		     
Then Click on the button "add"	      
Then Click on the button "save"				      
			 
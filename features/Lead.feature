Feature:Lead scenarios of salesforce
 @login
Scenario:Lead click
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the button "Lead"
@login 
Scenario:Lead defaultview
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the button "Lead"
Given User is on "LeadPage"
Then Click on the button "go"

@login 
Scenario:Lead todaysLead
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the button "Lead"
Given User is on "LeadPage"
Then Select from dropdown "LeadSelectDrpdown" "Today's Leads" 
Then Click on the button "go"
@login @Test28 
Scenario:Lead name update
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the button "Lead"
Given User is on "LeadPage"
Then Click on the button "newbtn"
Then User Enter in to the text box "lastname" "ABCD"
Then User Enter in to the text box "companyname" "abcd"
Then Click on the button "LeadcreateSave"

		      
		      



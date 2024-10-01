Feature:Account scenarios of salesforce
@Random @Test
Scenario:Opportunity dropdown
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"
Then user waits to loadpage
Given User is on "HomePage"
Then User waits for the element "Home"
Then Click on the link "Home"
Then user waits to loadpage
Given User is on "RandomScenarioPage"
 Then Click on the link "name"  
 Then gettitle of the page 
 @Random @Test
Scenario:Edit Profile name
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"
Then user waits to loadpage
Given User is on "HomePage"
Then User waits for the element "Home"
Then Click on the link "Home"
Then user waits to loadpage
Given User is on "RandomScenarioPage"
 Then Click on the link "name" 
 Then Click on the link "EditProfile"
 Then Change to frame "frame1" 
 Then Click on the button "About"
 Then Clear Element "lastname"
 Then User Enter in to the text box "lastname" "abcd"
 Then Click on the button "SaveAll"
 @Random @Test
Scenario:Edit Profile name
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"
Then user waits to loadpage
Given User is on "HomePage"
 Then Click on the button "plusTab"
 Then user waits to loadpage
 Given User is on "RandomScenarioPage"
 Then Click on the button "CustomizeTab"
 Then Click on the button "selectab"
 Then Click on the button "remove"
 Then Click on the button "savetab"
 Then User is on "HomePage"
Then Click on the button "usermenudropdown" 
Then User waits for the element "Logout"
Then Click on the button "Logout" 
Then user waits to loadpage
 Given User is on "LoginPage"
Then User waits for the element "Username"
Then Clear Element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"

 @Random @Test
Scenario:Edit Profile name
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"
Then user waits to loadpage
Given User is on "HomePage"
Then User waits for the element "Home"
Then Click on the link "Home"
Then user waits to loadpage
Given User is on "RandomScenarioPage"
Then Click on the link "currentDate"
Then Click on the link "eightPM"
When Find the current parent window
Then user waits to loadpage
Then Click on the button "SubjectCombo"
And Switch to the new window "newWindow"
Then Click on the button "other"
And Switch back to the parent window 
Then User Enter in to the text box "EndTime" "9:00 PM"
Then Click on the button "saveEvent"
@Random @Test
Scenario:Edit Profile name
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"
Then user waits to loadpage
Given User is on "HomePage"
Then User waits for the element "Home"
Then Click on the link "Home"
Then user waits to loadpage
Given User is on "RandomScenarioPage"
Then Click on the link "currentDate"
Then Click on the link "fourPM"
When Find the current parent window
Then user waits to loadpage
Then Click on the button "SubjectCombo"
And Switch to the new window "newWindow"
Then Click on the button "other"
And Switch back to the parent window 
Then User Enter in to the text box "EndTime2" "7:00 PM"
Then Click on the button "recurrance"
Then Click on the button "weeklyRadio"
Then User Enter in to the text box "EndDate" "5/20/2024"
Then user waits to loadpage
Then User waits for the element "saveEvent2"
Then Click on the exception "saveEvent2"
#Then User waits for the element "monthview"
#Then Click on the button "monthview"





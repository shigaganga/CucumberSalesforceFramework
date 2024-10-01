Feature:Login scenarios of salesforce
@Contact @Test
Scenario:New Contact
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"
Then user waits to loadpage
Given User is on "HomePage"
Then Click on the link "Contact"
Then user waits to loadpage
Given User is on "ContactPage"
Then User waits for the element "New"
Then Click on the button "New"
Then Click on the button "Continue"  
Then User waits for the element "lastname"   
Then User Enter in to the text box "lastname" "Lastname"   
When Find the current parent window 
Then Click on the link "searchicon" 
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
@Contact
Scenario:New Contactviewname
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"
Then user waits to loadpage
Given User is on "HomePage"   
Then Click on the link "Contact"
Then user waits to loadpage
  Given User is on "ContactPage"
 Then Click on the link "ContactCreateNewView" 
Then User Enter in to the text box "ViewName" "shigaCucumberview"
Then User Enter in to the text box "viewUniquename" "uniqueshigaCucumberview"
Then Click on the button "viewsave"
Then user waits to loadpage
#custom validation error
Then Click on the button "save"    
@Contact @Test
Scenario:Recently created Contact
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"
Then user waits to loadpage
Given User is on "HomePage"  
Then Click on the link "Contact"
Then user waits to loadpage
  Given User is on "ContactPage"		
 Then Select from dropdown "RightDropdown" "Recently Created"    
 @Contact @Test
Scenario:My Contact
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"
Then user waits to loadpage
Given User is on "HomePage"  
Then Click on the link "Contact"
Then user waits to loadpage
  Given User is on "ContactPage"		
 Then Select from dropdown "viewDropdown" "My Contacts"    
@Contact
Scenario:view a contact in contat page
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"
Then user waits to loadpage
Given User is on "HomePage"  
Then Click on the link "Contact"
Then user waits to loadpage
 Given User is on "ContactPage"		
 Then user waits to loadpage
 Then Click on the link "Onecontact"  
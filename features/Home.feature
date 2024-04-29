Feature:Home Usermenu scenarios
@Login  
Scenario:Login with valid username and password
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then User waits for the element "usermenudropdown"
Then Click on the button "usermenudropdown"

@Login 
Scenario:Usermenuprofile
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then User waits for the element "usermenudropdown"
Then Click on the button "usermenudropdown"
Then Click on the button "Profile"
Then Click on the link "EditPen"  
Then Change to frame "frame1"    
Then Click on the link "About" 
Then Clear Element "Lastname"
Then User Enter in to the text box "Lastname" "abcd" 
Then Click on the button "saveall"
Then Back to defaultframe
Then Click on the link "Post"  
Then Change to frame "frame2"  
Then User Enter in to the text box "textArea" "Hello teams"  
Then Back to defaultframe
Then Click on the button "share"   
Then Click on the button "file" 
When Mousehover to element "moderator"    
Then Click on the link "uploadphoto"
Then Change to frame "frame3"  
Then User Enter in to the text box "photopath" "C:\\Users\\shiga\\imagesProfile.jpg" 
Then Click on the button "photosave1"  
Then Back to defaultframe
Then Change to frame "frame4"
Then user waits to loadpage
Then Click on the button "photosave2"
@Login
Scenario:Usermenusettings home
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then User waits for the element "usermenudropdown"
Then Click on the button "usermenudropdown"
Then Click on the link "Settings"
Then User waits for the element "Personal"
Then Click on the link "Personal"
Then Click on the link "LoginHistory"    
Then Click on the button "displayFormat"   
Then Click on the button "customizetab"
Then Select from dropdown "salesforceChatterEle" "Salesforce Chatter" 
Then Click on the button "Report"   
Then Click on the button "Add"    
Then Click on the button "SaveReport"   
Then Click on the link "Email"   
Then Click on the link "EmailSettings"
Then User Enter in to the text box "Emailname" "Shiga" 
Then User Enter in to the text box "EmailAddress" "Shigaganga@gmail.com"   
Then Click on the radiobutton "bcc" 
Then Click on the button "saveEmailsettings" 
 Then User waits for the element "saveEmailsettings"
Then Click on the link "calender"
Then Click on the link "activityremainder"
Then Click on the button "openRemainder"
 @Login @Developing
Scenario:Developer Console
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then User waits for the element "usermenudropdown"
Then Click on the button "usermenudropdown" 
When Find the current parent window "parentwindow"		
Then Click on the button "developerConsole" 
And Switch to the new window "newWindow"
And Switch back to the parent window
@Login
Scenario:Usermenu Logout 
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Ganga@2024"
Then Click on the button "Login"
Given User is on "HomePage"
Then User waits for the element "usermenudropdown"
Then Click on the button "usermenudropdown" 
Then User waits for the element "Logout"
Then Click on the button "Logout" 












































































































































































































































































































































































































































   
   
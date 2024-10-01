Feature:Login scenarios of salesforce
@login @Login
Scenario:Login with valid username and password2
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"
@login @Login
Scenario:user login with valid username and clearPassword1
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" ""
Then Click on the button "Login"
Then User verifies the message "error" "Please enter your password."
@login @Login
Scenario:user check rememberme
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then Click on the button "RememberMe"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Arush@2013"
Then Click on the button "Login"
Then user waits to loadpage
Then User is on "HomePage"
Then User waits for the element "usermenudropdown"
Then Click on the button "usermenudropdown" 
Then User waits for the element "Logout"
Then Click on the button "Logout" 
Given User is on "LoginPage"
#Then User verifies the textbox "Usernametext" "shiga@tekarch.com"
@login @Login
Scenario:test forgot password4a
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then Click on the button "forgotpassword"
Then User Enter in to the text box "UsernameFogtpge" "shiga@tekarch.com"
Then Click on the button "Continue"
Then User got new alert for reset password
@login @Login
Scenario:Validate login error message4b
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User Enter in to the text box "Username" "123"
Then User Enter in to the text box "Password" "1234"
Then Click on the button "Login"

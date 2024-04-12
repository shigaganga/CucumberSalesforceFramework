Feature:Login scenarios of salesforce
Scenario:Login with valid username and password
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Kanmani@2018"
Then Click on the button "Login"

Scenario:user login with valid username and clearPassword
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" ""
Then Click on the button "Login"
Then User got text "TextMessage"
Scenario:test forgot password
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then Click on the button "forgotpassword"
Then User Enter in to the text box "UsernameFogtpge" "shiga@tekarch.com"
Then Click on the button "Continue"
Then User got new alert for reset password
Scenario:Validate login error message
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User Enter in to the text box "Username" "123"
Then User Enter in to the text box "Password" "1234"
Then Click on the button "Login"
Then User got text "TextMessage"
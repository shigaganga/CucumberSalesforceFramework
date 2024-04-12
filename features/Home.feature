Feature:Homescreen Usermenu scenarios
Scenario:Login with valid username and password
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User waits for the element "Username"
Then User Enter in to the text box "Username" "shiga@tekarch.com"
Then User Enter in to the text box "Password" "Kanmani@2018"
Then Click on the button "Login"
Scenario: usermenu dropdown validation
Given User is on "HomePage"
Then Click on the button "usermenudropdown"
Then User waits for the element "usermenudropdown"
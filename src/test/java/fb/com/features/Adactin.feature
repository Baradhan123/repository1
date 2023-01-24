Feature: Adactin username password testing
Background: 
Given User Launches the Chrome Browser 
And Verify land and Login page

@AdactinTC-001
Scenario: Adactin Login with Invalid details
And User Enter username "valid username"
And User Enter password "invalid password"
And User Click Login Button
And User Verify Error Message "Invalid Login details or Your Password might have expired. Click here to reset your password"
And User Enter username "invalid username"
And User Enter password "valid password"
And User Click Login Button
And User Verify Error Message "Invalid Login details or Your Password might have expired. Click here to reset your password"
And User Enter username "invalid username"
And User Enter password "valid password"
And User Click Login Button
Then User Verify Error Message "Invalid Login details or Your Password might have expired. Click here to reset your password"

@AdactinTC-002
Scenario Outline: adactin valid details verify
And User Enter username <username>
And User Enter password <password>
And User Click Login Button
And User Verify Error Message "Invalid Login details or Your Password might have expired. Click here to reset your password"

Examples: 
|username|password|
|"valid username"|"invalid password"|
|"invalid username"|"validpassword"|
|"invalid username"|"invalid password"|


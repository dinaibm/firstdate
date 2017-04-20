Feature: Login Feature of EMS Merchant Portal

Scenario: To Validate whether the User able to Login Successfully 

Given the "EMSMerchant" Application
And enter "UserName" as "TestUser3002"
And enter "Password" as "Password@1"
When user click on "Log in to My EMS" button
Then default Dashboard Page is Displayed
And Verify Dashboard Date displayed is "TODAY"
And verify "Payment" Dashboard is available
And verify "Sales" Dashboard is available
And verify "Transfers" Dashboard is available


Scenario Outline: To Validate User Not able to Login with Invalid Credentials

Given the "EMSMerchant" Application
And enter "UserName" as "<UserName>"
And enter "Password" as "<Password>"
When user click on "Log in to My EMS" button
Then Login Should Fail 
And should display Message "This combination of username and password is invalid. Please try again or request a new password."

Examples:
|UserName	 |Password	|
|TestUser3002|pass    	|
|TestUser	 |Password@1|
|TestUser	 |pass		|


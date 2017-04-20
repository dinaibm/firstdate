Feature: Transaction Details Feature of EMS Merchant Portal
@Login
Scenario: To Validate User Was able to Navigate to Transaction Details Module Page 

Given the "EMSMerchant" Application
And enter "UserName" as "TestUser3002"
And enter "Password" as "Password@1"
When user click on "Log in to My EMS" button
Then default Dashboard Page is Displayed
And user Navigate to "Transaction" module page
And verify "Transaction" page is displayed

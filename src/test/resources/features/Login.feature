@Login
Feature: Login Feature of EMS Merchant Portal

Scenario: To Validate whether the User able to Login Successfully 

Given the "EMSMerchant" Application
And enter "UserName" as "TestUser3002"
And enter "Password" as "Password@1"
When user click on "Log in to My EMS" button
Then default Dashboard Page is Displayed
And verify "Payment" Dashboard is available
And verify "Sales" Dashboard is available
And verify "Transfers" Dashboard is available
Feature: Transaction Details Feature of EMS Merchant Portal

Scenario: To Validate User was able to Navigate to Transaction Details Module Page 

Given the "EMSMerchant" Application
And enter "UserName" as "TestUser3002"
And enter "Password" as "Password@1"
When user click on "Log in to My EMS" button
Then default Dashboard Page is Displayed
And user Navigate to "Transactions" module page
And verify "Transactions" page is displayed

@Login
Scenario: To Validate Transactions ere getting displayed based on selected Date Range

Given the "EMSMerchant" Application
And enter "UserName" as "TestUser3002"
And enter "Password" as "Password@1"
When user click on "Log in to My EMS" button
Then default Dashboard Page is Displayed
And user Navigate to "Transactions" module page
And verify "Transactions" page is displayed
Given the date range "20/03/2017" to "20/03/2017" on Transactions Page
When user click on "Apply"
Then validate Transactions are displayed





Feature: User Registration
@ui
Scenario: Valid Registration on successful submit of User Details

Given the Registeration portal 
And user Navigate to URL "http://demoqa.com/registration/"
And user enter "FirstName" as "Serenity"
And user enter "LastName" as "BDD Demo"
And user enter "MartialStatus" as "Single"
And user enter "hobby" as "Dance"
And user enter "Country" as "India"
And user enter "DateofBirth" as "10-10-1988"
And user enter "PhoneNo" as "9996324859"
And user enter "UserName" as "kserenitybdd123"
And user enter "email" as "serenitybdd@gmail.com"
And user enter "password" as "Password-1"
And user enter "ConfirmPassword" as "Password-1"
When user click Submit Registeration
Then Submit Registeration is Successful with Message "Thank you for your registration"


#|FirstName|LastName|MartialStatus|hobby|Country|DateofBirth|PhoneNo|UserName|email|password|ConfirmPassword|

Scenario: Valid Registration on successful submit of User Details

Given the Registeration portal 
And user Navigate to URL "http://demoqa.com/registration/"
And user enter "FirstName" as "<FirstName>"
And user enter "LastName" as "<LastName>"
And user enter "MartialStatus" as "<MartialStatus>"
And user enter "hobby" as "<hobby>"
And user enter "Country" as "<Country>"
And user enter "DateofBirth" as "<DateofBirth>"
And user enter "PhoneNo" as "<PhoneNo>"
And user enter "UserName" as "<UserName>"
And user enter "email" as "<email>"
And user enter "password" as "<password>"
And user enter "ConfirmPassword" as "<ConfirmPassword>"
When user click Submit Registeration
Then Submit Registeration is Successful

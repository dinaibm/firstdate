Feature: To verify the API for Retrieving State List 


#Scenario: Verify whether states are retrieved for the Country Code "IND"
#
#Given a request for Country "IND"
#When request is sent to "getStateURI"
#Then status code is "200"
#And retrieved state count in "RestResponse.messages" is "36"
#
#Scenario: Verify whether states are retrieved for the country code "USA"
#
#Given a request for Country "USA"
#When request is sent to "getStateURI"
#Then status code is "200"
#And retrieved state count in "RestResponse.messages" is "56"

@getapi
Scenario Outline: Verify whetehr states are retrieved for the country code "IND" and "USA"

Given a request for Country "<CountryCode>"
When request is sent to "getStateURI"
Then status code is "200"
And retrieved state count in "RestResponse.messages" is "<stateCount>"

Examples:
|CountryCode|stateCount|
|USA		|56		   |
|IND		|36        |


Scenario: Test

Given a country code
When request is sent
Then state is retrieved
































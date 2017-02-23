Feature: To verify the API for Retrieving State List 
@getapi
Scenario: Verify whether states are retrieved for the Country Code "IND"

Given a request for Country "IND"
When request is sent to "getStateURI"
Then status code is "200"
And retrieved state count in "RestResponse.messages" is "36"
 
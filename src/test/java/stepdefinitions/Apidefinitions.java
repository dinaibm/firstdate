package stepdefinitions;

import com.jayway.restassured.response.Response;
import api.LoadRequest;
import api.PostRequest;
import api.Reqapi;
import api.ValidateRequest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Apidefinitions {


public static Response responsebody;

	@Steps
	LoadRequest loadrequest;
	
	@Steps
	PostRequest postrequest;
	
	@Steps
	ValidateRequest validateRequest;
	
	@Steps
	Reqapi reqapi;
	
	@Given("^a request for Country \"([^\"]*)\"$")
	public void a_GET_Method_request_for_Country(String CountryCode) throws Throwable {
	   loadrequest.loadgetrequestdata(CountryCode);
	}

	@When("^request is sent to \"([^\"]*)\"$")
	public void request_is_sent_to(String endPointVariable) throws Throwable {
		postrequest.postGETRequest(endPointVariable);
	   
	}

	@Then("^status code is \"([^\"]*)\"$")
	public void status_code_is(String statusCode) throws Throwable {
		
		validateRequest.statuscode(statusCode, responsebody);
	}
	
	
	
	@Then("^retrieved state count in \"([^\"]*)\" is \"([^\"]*)\"$")
	public void retrieved_state_count_in_is(String fieldName, String fieldValue) throws Throwable {			
		   validateRequest.resultvalidation(fieldName,fieldValue,responsebody);
	}
}

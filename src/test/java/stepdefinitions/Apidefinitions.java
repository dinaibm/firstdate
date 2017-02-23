package stepdefinitions;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;

import api.LoadRequest;
import api.PostRequest;
import api.ValidateRequest;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class Apidefinitions {


public static Response responsebody;
public static ResponseBody res1;
	@Steps
	LoadRequest loadrequest;
	@Steps
	PostRequest postrequest;
	@Steps
	ValidateRequest validateRequest;
	
	@Given("^a request for Country \"([^\"]*)\"$")
	public void a_GET_Method_request_for_Country(String arg1) throws Throwable {
	   loadrequest.loadgetrequestdata(arg1);
	}

	@When("^request is sent to \"([^\"]*)\"$")
	public void request_is_sent_to(String arg1) throws Throwable {
		postrequest.postGETRequest(arg1);
	   
	}

	@Then("^status code is \"([^\"]*)\"$")
	public void status_code_is(String arg1) throws Throwable {
		
		validateRequest.statuscode(arg1, responsebody);
	}
	
	
	
	@Then("^retrieved state count in \"([^\"]*)\" is \"([^\"]*)\"$")
	public void retrieved_state_count_in_is(String arg1, String arg2) throws Throwable {
		   validateRequest.resultvalidation(arg1,arg2,responsebody);
	}
}

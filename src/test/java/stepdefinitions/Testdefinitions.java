package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import com.jayway.restassured.response.Response;

import api.LoadRequest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class Testdefinitions extends SerenityRest{

public static String countrycode=null;
public static Response responsebody=null;
public static Map<String, Object> jsonAsMap = new HashMap<>();

@Given("^a country code$")
public void a_country_code() throws Throwable {
  
	countrycode="IND";
   
}

@When("^request is sent$")
public void request_is_sent() throws Throwable {
	jsonAsMap.put("contentType", "application/json");
	String URIpath = "http://services.groupkt.com/state/get/{CountryCode}/all";
	String URI = URIpath.replace("{CountryCode}",countrycode);
	
	responsebody = given().headers(jsonAsMap)
	  .proxy("proxy.cognizant.com", 6050)
	 .get(URI)
	 .andReturn();	
}

@Then("^state is retrieved$")
public void state_is_retrieved() throws Throwable {
	int stat = responsebody.andReturn().statusCode();
	org.junit.Assert.assertEquals(Integer.parseInt("200"),stat);
	responsebody.andReturn().peek();
	
	String nodeValue = responsebody.andReturn().body().jsonPath().get("RestResponse.messages").toString();
	if(nodeValue.contains("[" + "36" + "]")){
		org.junit.Assert.assertTrue(true);
	}else{
		//org.junit.Assert.assertThat("Expected is:" + arg2 + "Actual is:" + nodeValue, "T","T");			
		org.junit.Assert.assertTrue(false);
	}
  
}
}

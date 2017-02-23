package api;

import com.jayway.restassured.response.ResponseBody;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Step;
import stepdefinitions.Apidefinitions;
import stepdefinitions.ServiceURI;
import net.serenitybdd.*;
import net.serenitybdd.rest.SerenityRest;
public class PostRequest extends SerenityRest{

@Step
public void postGETRequest(String uri){
	String uriVal = getURI(uri);
	System.out.println(uriVal);
	post(uriVal);
}

public String getURI(String uri){
	String getreqUri = null;
	if(uri.equals("getStateURI")){
	getreqUri=ServiceURI.getStateURI.toString().replace("{countryCode}", LoadRequest.countryCode);
	
	}
	return getreqUri;
		
}

public static void post(String uri){
	
/*	 Apidefinitions.responsebody = 
	 given().headers(LoadRequest.jsonAsMap)
	 // .proxy("proxy.cognizant.com", 6050)
	 .get(uri)
	 .andReturn();	
	 		 
	*/
	System.out.println(LoadRequest.jsonAsMap.toString());
	 Apidefinitions.responsebody = 
	 given()
	 //.headers(LoadRequest.jsonAsMap)
	  .contentType("application/json")
	  .proxy("proxy.cognizant.com", 6050)
	  .log().body()
	  .when()
	 .get(uri)
	 .then()
	 .contentType("application/json")
	 .extract().response().peek();
	/*
	 Apidefinitions.res1 =rest().given()
			 .proxy("proxy.cognizant.com", 6050)
			 .contentType("application/json")
			 .get(uri)
			 .body().peek();
*/
}



}

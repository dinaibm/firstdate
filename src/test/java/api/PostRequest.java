package api;


import net.thucydides.core.annotations.Step;
import stepdefinitions.Apidefinitions;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;



import static net.serenitybdd.rest.SerenityRest.rest;


public class PostRequest {
	String uriVal = null;

@Step
public void postGETRequest(String uri){
	uriVal = getURI(uri);
	sendGetRequest(uriVal);
}

public String getURI(String uri){
	String getreqUri = null;
	if(uri.equals("getStateURI")){
	getreqUri=ServiceEndpoint.getStateURI.toString().replace("{countryCode}", LoadRequest.countryCode);
	
	}
	return getreqUri;
		
}

@Step
public void sendGetRequest(String URI){
	
	Apidefinitions.responsebody = rest().given()
									.when()
									.get(URI);
}



//Sample for POST Request
public void resp(){
//rest().then().statusCode(200);
	int id = Math.abs(new Random().nextInt());
    Map<String, Object> jsonAsMap = new HashMap<>();
    jsonAsMap.put("id", id);
    jsonAsMap.put("name", "Dog");
    jsonAsMap.put("status", "Active");
    jsonAsMap.put("photoUrls", new ArrayList<>(Arrays.asList()));

    given().contentType("application/json")
    		.proxy("proxy.cognizant.com", 6050)
            .content(jsonAsMap).log().body()
            .baseUri("http://petstore.swagger.io")
            .basePath("v2/pet")
    .when()
    .post();

}



}

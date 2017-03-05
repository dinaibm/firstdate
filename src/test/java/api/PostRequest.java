package api;


import net.thucydides.core.annotations.Step;
import stepdefinitions.ServiceURI;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.when;
import static net.serenitybdd.rest.SerenityRest.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;



import static net.serenitybdd.rest.SerenityRest.rest;





public class PostRequest {
	//public static ResponseSpecification response=null;
//	public static RequestSpecification po = null;
	String uriVal = null;
	@Step
public void postGETRequest(String uri){
	uriVal = getURI(uri);
	System.out.println(uriVal);
	//post(uriVal);
	//resp();
}

public String getURI(String uri){
	String getreqUri = null;
	if(uri.equals("getStateURI")){
	getreqUri=ServiceURI.getStateURI.toString().replace("{countryCode}", LoadRequest.countryCode);
	
	}
	return getreqUri;
		
}

@Step
public void giv(){
	rest().given()
	//.proxy("proxy.cognizant.com", 6050)
	.contentType("application/json")
	.when()
	.get("http://services.groupkt.com/state/get/{countryCode}/all", "IND")
	.then()
	.log().all()
	;
	//SerenityRest.setDefaultSessionId(bb.extract().sessionId());
}
@Step
public void postreq(){
	//then().statusCode(200);
}
@Step
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

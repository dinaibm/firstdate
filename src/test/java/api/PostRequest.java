package api;



import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;
import net.thucydides.core.annotations.Step;
import stepdefinitions.Apidefinitions;
import stepdefinitions.ServiceURI;

public class PostRequest {
	static String uri = null;
@Step
public void postGETRequest(String uri1){
	uri = getURI(uri1);
	System.out.println(uri);
	//post(uriVal);
}
@Step
public String getURI(String uri){
	String getreqUri = null;
	if(uri.equals("getStateURI")){
	getreqUri=ServiceURI.getStateURI.toString().replace("{countryCode}", LoadRequest.countryCode);
	
	}
	return getreqUri;
		
}
@Step
public static void post(){
	
	Apidefinitions.responsebody = 
	given()
	.contentType("application/json")
	.accept("application/json")
	.proxy("proxy.cognizant.com", 6050)
	.when()
	.baseUri(uri)
	.get()
	.then()
	 .extract()
	 .response();
	
			 
			 
			/* 
			 * given()
	 .contentType("application/json")
	 .headers(LoadRequest.jsonAsMap)
	  .proxy("proxy.cognizant.com", 6050)
	  .when()
	 .get(uri)
	 .then()
	 .extract()
	 .response();
	 		*/ 
	
	
	/*
	System.out.println(LoadRequest.jsonAsMap.toString());
	 Apidefinitions.responsebody = 
	 given()
	  .contentType("application/json")
	  .proxy("proxy.cognizant.com", 6050)
	  .log().body()
	  .when()
	 .get(uri)
	 .then()
	 .extract().response().peek();
*/
}



}

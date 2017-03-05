package api;

import static net.serenitybdd.rest.SerenityRest.then;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import net.serenitybdd.rest.SerenityRest;

import net.thucydides.core.annotations.Step;

//import static net.serenitybdd.rest.SerenityRest.*;

public class Reqapi {

@Step
public void r(){
	beforecase();
	int id = Math.abs(new Random().nextInt());
    Map<String, Object> jsonAsMap = new HashMap<>();
    jsonAsMap.put("id", id);
    jsonAsMap.put("name", "Dog");
    jsonAsMap.put("status", "Active");
    jsonAsMap.put("photoUrls", new ArrayList<>(Arrays.asList()));
SerenityRest.given()
    .contentType("application/json")
    	//	.proxy("proxy.cognizant.com", 6050)
            .content(jsonAsMap)
        //    .baseUri("http://petstore.swagger.io/")
         //   .basePath("v2/pet")
    .when()
    .post("http://petstore.swagger.io/v2/pet")
    .prettyPeek();
}

@Step
public void p(){
	
	then()
	.extract()
	.response()
	.peek();
}
	
public void beforecase(){
	/*RequestSpecification requestSpecification = (RequestSpecification) new RequestSpecBuilder();
	requestSpecification.accept("application.json");
	requestSpecification.contentType("application/json");
	requestSpecification.proxy("proxy.cognizant.com", 6050);*/
	/*
	setDefaultRequestSpecification((new RequestSpecBuilder())
			.setAccept("application.json")
			.setContentType("application/json")
			.setProxy("proxy.cognizant.com", 6050)
			.setBaseUri("https://tsys")
			.setBasePath("/do")
			.build()
			);
	*/
	final String pas= "Feb2017*";
	Authenticator authenticator = new Authenticator(){
		public PasswordAuthentication getPasswordAuthentication(){
			return(new PasswordAuthentication("253510",pas.toCharArray()));
		}
	};
	Authenticator.setDefault(authenticator);
}
}

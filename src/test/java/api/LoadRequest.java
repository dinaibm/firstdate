package api;

import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Map;

import net.serenitybdd.rest.SerenityRest;
public class LoadRequest {
public static Map<String, Object> jsonAsMap = new HashMap<>();
public static String countryCode=null;
@Step
public void loadgetrequestdata(String countryCd){
	countryCode=countryCd;
	requestHeaders();
	 DefaultCallParameters();
	}

public void requestHeaders(){
	jsonAsMap.put("contentType", "application/json");
}

public void DefaultCallParameters(){
	SerenityRest.proxy("proxy.cognizant.com", 6050);
	SerenityRest.useRelaxedHTTPSValidation();
	SerenityRest.preemptive();
}










}

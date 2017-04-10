package api;

import com.jayway.restassured.response.Response;

import net.thucydides.core.annotations.Step;

public class ValidateRequest {

	@Step	
	public void statuscode(String statuscode, Response responsebody){
		
		int stat = responsebody.andReturn().statusCode();
		org.junit.Assert.assertEquals(Integer.parseInt(statuscode),stat);
		responsebody.andReturn().peek();
	}
	
	@Step
	public void resultvalidation(String fieldName, String fieldValue, Response responsebody){
		String nodeValue = responsebody.andReturn().body().jsonPath().get(fieldName).toString();
		String actualValue = nodeValue.split(",")[1].toString().split(" ")[2].toString().replace("[", "").replace("]", "").trim(); //.split("]")[0].toString();
		org.junit.Assert.assertEquals(fieldValue, actualValue);
		
		/*
		if(nodeValue.contains("[" + fieldValue + "]")){
			org.junit.Assert.assertTrue(true);
		}else{
			//org.junit.Assert.assertThat("Expected is:" + arg2 + "Actual is:" + nodeValue, "T","T");			
			org.junit.Assert.assertTrue(false);
		}*/
	}
}

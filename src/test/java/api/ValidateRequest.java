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
	public void resultvalidation(String arg1, String arg2, Response responsebody){
		String nodeValue = responsebody.andReturn().body().jsonPath().get(arg1).toString();
		if(nodeValue.contains("[" + arg2 + "]")){
			org.junit.Assert.assertTrue(true);
		}else{
			//org.junit.Assert.assertThat("Expected is:" + arg2 + "Actual is:" + nodeValue, "T","T");			
			org.junit.Assert.assertTrue(false);
		}
	}
}

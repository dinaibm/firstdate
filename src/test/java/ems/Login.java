package ems;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Login extends PageObject{

public WebDriver driver=null;

ems.pageobject.Login login;

@Step
public void Navigate(String URL){
	driver = getDriver();
	driver.get(URL);
}

@Step
public void EnterUserDetails(String fieldName, String fieldValue){
	if (fieldName.equals("UserName")){
		login.UserName().sendKeys(fieldValue);
	}else if(fieldName.equals("Password")){
		login.Password().sendKeys(fieldValue);
	}
}

@Step
public void clickLogin(){
	login.btnLogin().click();
}

@Step
public void LandingHomePage(){
	String ExpectedURL="http://dev-business-track-mp-services.us-west-2.elasticbeanstalk.com//emsMerchantUI/#/dashboard/day";
	String ActualURL = driver.getCurrentUrl();
	org.junit.Assert.assertEquals(ExpectedURL, ActualURL);
}

@Step
public void DashBoard(String Dashboard){

}

}

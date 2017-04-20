package ems;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Login extends PageObject{

public WebDriver driver=null;

ems.pageobject.Login login;
ems.pageobject.DashBoard dashboard;

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
	List<WebElementFacade> dashBoard = null;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	if(Dashboard.equals("Payment")){
		dashBoard=dashboard.paymentDashboard();
		 if (dashBoard.size()>0){
			 new Actions(driver).moveToElement(dashBoard.get(0)).perform();
			 js.executeScript("arguments[0].style.border='2px groove green'", dashBoard.get(0));
		 }
		 
	}else if(Dashboard.equals("Sales")){
		dashBoard=dashboard.salesDashboard();
		 if (dashBoard.size()>0){
			 new Actions(driver).moveToElement(dashBoard.get(0)).perform();
			 js.executeScript("arguments[0].style.border='2px groove green'", dashBoard.get(0));
		 }
		
	}else if(Dashboard.equals("Transfers")){
		dashBoard=dashboard.transfersDashboard();
		 if (dashBoard.size()>0){
			 new Actions(driver).moveToElement(dashBoard.get(0)).perform();
			 js.executeScript("arguments[0].style.border='2px groove green'", dashBoard.get(0));
		 }
	}
		
		
}

public void TodaysDate(String Date) throws InterruptedException{
	Calendar calendar = Calendar.getInstance();
	Date date = calendar.getTime();
	if(Date.equals("TODAY")){		
		String ExpectedDay = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
		String ExpectedMonth = new SimpleDateFormat("MMMM").format(date.getTime());
		int ExpectedDate = calendar.get(Calendar.YEAR);
		int ExpectedYear = calendar.get(Calendar.DATE);
		String ExpectedValue = ExpectedDay + ", " + ExpectedMonth + " " + ExpectedYear + ", " + ExpectedDate;
		Thread.sleep(2000);
		String ActualDate=dashboard.DashBoardDate().getText();
		//System.out.println(ExpectedValue);
		//System.out.println(ActualDate);
		DashBoardDate(ExpectedValue,ActualDate);
		}
	}
@Step 
public void DashBoardDate(String ExpectedDate, String ActualDate){
	org.junit.Assert.assertEquals(ExpectedDate,ActualDate);
}

@Step
public void LoginFail(){
	String ExpectedURL="http://dev-business-track-mp-services.us-west-2.elasticbeanstalk.com//emsMerchantUI/#/";
	String ActualURL = driver.getCurrentUrl();
	org.junit.Assert.assertEquals(ExpectedURL, ActualURL);
}

public void inValidLogin(String LoginFailMessage){
	String ActualMessage = login.LoginFailMessage().getText();
	LoginFailValidation(LoginFailMessage,ActualMessage);
}
@Step
public void LoginFailValidation(String ExpectedFailMessage, String ActualFailMessage){
	org.junit.Assert.assertEquals(ExpectedFailMessage, ActualFailMessage);
}


}

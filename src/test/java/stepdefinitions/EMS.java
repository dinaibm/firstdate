package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ems.Login;
import ems.Transaction;
import net.thucydides.core.annotations.Steps;
import util.Config;

public class EMS {

@Steps
Login login;

@Steps
Transaction transaction;

	@Given("^the \"([^\"]*)\" Application$")
	public void the_Application(String AppName) throws Throwable {
	//	String URL = Config.get("AppURL","EMSMerchant");;
	//    login.Navigate(URL);
	}

	@Given("^enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void enter_as(String fieldName, String fieldValue) throws Throwable {
	   login.EnterUserDetails(fieldName, fieldValue);
	}
	
	@Given("^the \"([^\"]*)\" Application Launch in \"([^\"]*)\" Env$")
	public void the_Application_Launch_in_Env(String Application, String Env) throws Throwable {
		String URL = Config.get("Env",Env);
	    login.Navigate(URL,Env);	   
	}

	@Given("^enter \"([^\"]*)\" and \"([^\"]*)\" from \"([^\"]*)\"$")
	public void enter_and_from(String UserName, String Password, String DataFile) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login.EnterLoginDetails(UserName, Password, DataFile);
	}

	@When("^user click on \"([^\"]*)\" button$")
	public void user_click_on_button(String btnValue) throws Throwable {
	    login.clickLogin();
	}

	@Then("^default Dashboard Page is Displayed$")
	public void default_Dashboard_Page_is_Displayed() throws Throwable {
		login.LandingHomePage();
	}

	@Then("^verify \"([^\"]*)\" Dashboard is available$")
	public void verify_Dashboard_is_available(String DashBoard) throws Throwable {
	  login.DashBoard(DashBoard);
	}
	
	@Then("^Verify Dashboard Date displayed is \"([^\"]*)\"$")
	public void verify_Dashboard_Date_displayed_is(String date) throws Throwable {
		login.TodaysDate(date);
	}
	
	@Then("^Login Should Fail$")
	public void login_Should_Fail() throws Throwable {
	   login.LoginFail();
	}

	@Then("^should display Message \"([^\"]*)\"$")
	public void should_display_Message(String LoginFailMessage) throws Throwable {
	   login.inValidLogin(LoginFailMessage);
	}
	
	@Then("^user Navigate to \"([^\"]*)\" module page$")
	public void user_Navigate_to_module_page(String appModule) throws Throwable {
		transaction.NavigateToTransaction(appModule);
	    
	}
	
	@Then("^verify \"([^\"]*)\" page is displayed$")
	public void verify_page_is_displayed(String appModule) throws Throwable {
		transaction.validateTransactionPage(appModule);
	   
	}
	
	@Given("^the date range \"([^\"]*)\" to \"([^\"]*)\" on Transactions Page$")
	public void the_date_range_to_on_Transactions_Page(String startDate, String endDate) throws Throwable {
	  transaction.SelectDateRange(startDate, endDate);
	}

	@When("^user click on \"([^\"]*)\"$")
	public void user_click_on(String arg1) throws Throwable {
		transaction.ApplyDateRange();
	}

	@Then("^validate Transactions are displayed$")
	public void validate_Transactions_are_displayed() throws Throwable {
		transaction.TransactionList();
	}

}

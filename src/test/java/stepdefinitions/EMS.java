package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ems.Login;
import net.thucydides.core.annotations.Steps;

public class EMS {

@Steps
Login login;

	@Given("^the \"([^\"]*)\" Application$")
	public void the_Application(String URL) throws Throwable {
	    login.Navigate(URL);
	}

	@Given("^enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void enter_as(String fieldName, String fieldValue) throws Throwable {
	   login.EnterUserDetails(fieldName, fieldValue);
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
	  
	}
}

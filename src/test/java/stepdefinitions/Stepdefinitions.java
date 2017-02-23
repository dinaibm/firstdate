package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitions {

	@Given("^a user$")
	public void a_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("check1");
	}

	@When("^pass \"([^\"]*)\" and \"([^\"]*)\"$")
	public void pass_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("aas" +arg1 +arg2);
	}

	@Then("^logs in to system$")
	public void logs_in_to_system() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Final");
	}

}

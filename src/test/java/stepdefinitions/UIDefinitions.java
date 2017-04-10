package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import ui.registration.Registeration;

public class UIDefinitions {

@Steps
Registeration registeration;

//@Steps
//RegObjects regobjects;

public static WebDriver driver = null;

@Before
public void bfre(){
	//driver=new WrappedWebDriver().newDriver();
}
	@Given("^the Registeration portal$")
	public void the_Registeration_portal() throws Throwable {
		registeration.loadbrowser();
	}

	@Given("^user Navigate to URL \"([^\"]*)\"$")
	public void user_Navigate_to_URL(String arg1) throws Throwable {
		registeration.navigate(arg1);
	}

	@Given("^user enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_enter_as(String FieldName, String FieldValue) throws Throwable {
		registeration.userInput(FieldName,FieldValue);
	}

	@When("^user click Submit Registeration$")
	public void user_click_Submit_Registeration() throws Throwable {
	 System.out.println("Submit Registeration");
	 registeration.SubmitRegisteration();	 
	}

	@Then("^Submit Registeration is Successful with Message \"([^\"]*)\"$")
	public void submit_Registeration_is_Successful_with_Message(String ExpectedValue) throws Throwable {
	   registeration.RegisterationStatus(ExpectedValue);
	}
}

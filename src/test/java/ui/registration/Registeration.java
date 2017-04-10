package ui.registration;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import ui.pageobjects.registration.RegObjects;

	public class Registeration extends PageObject{
	

	

	//private static final long serialVersionUID = 1L;
	
	 WebDriver driver =null;
	RegObjects regobjects;
@Step
public void loadbrowser(){
	System.out.println("Loading Browser");
	System.out.println("Launched CHrome Browser");
	driver = this.getDriver();
	
}
	
@Step
public void navigate(String url) throws Exception{

	driver.get(url);
	
}

@Step
public void userInput(String fieldName, String fieldValue){
	if (fieldName.equals("FirstName")){
	regobjects.FirstName().sendKeys(fieldValue);
	}
	else if(fieldName.equals("LastName"))
		{
		regobjects.LastName().sendKeys(fieldValue);
		}
	else if(fieldName.equals("MartialStatus"))
	{
		regobjects.MartialStatus().click();
	}
	else if(fieldName.equals("hobby"))
	{
		regobjects.Hobby().click();
	}
	else if(fieldName.equals("Country"))
	{
		regobjects.selectFromDropdown(regobjects.Country(), fieldValue);
	}
	else if(fieldName.equals("DateofBirth"))
	{
		String[] obj = fieldValue.split("-");
		regobjects.selectFromDropdown(regobjects.DatofBirth_Month(),obj[0]);
		regobjects.selectFromDropdown(regobjects.DatofBirth_Date(),obj[1]);
		regobjects.selectFromDropdown(regobjects.DatofBirth_Year(),obj[2]);
		
	}
	else if(fieldName.equals("PhoneNo"))
	{
		regobjects.PhoneNo().sendKeys(fieldValue);
	}
	else if(fieldName.equals("UserName"))
	{
		Random randomGenerator = new Random();
		int rnd = randomGenerator.nextInt(100);
		regobjects.UserName().sendKeys(fieldValue+rnd);
	}
	else if(fieldName.equals("email"))
	{	Random randomGenerator = new Random();
		int rnd = randomGenerator.nextInt(1000);
		String email="SerenityBddEmail" + rnd + "@gmail.com";
		regobjects.eMail().sendKeys(email);
	}
	else if(fieldName.equals("password"))
	{
		regobjects.Password().sendKeys(fieldValue);
	}
	else if(fieldName.equals("ConfirmPassword"))
	{
		regobjects.ConfirmPassword().sendKeys(fieldValue);
	}
}
	
@Step
public void SubmitRegisteration() throws InterruptedException{
	regobjects.Submit().click();
	Thread.sleep(5000);
}

@Step
public void RegisterationStatus(String ExpectedValue){
	String actualValue= regobjects.RegMessage().getText();
	org.junit.Assert.assertEquals(ExpectedValue,actualValue);
	
	
}





}

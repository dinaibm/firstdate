package ems.pageobject;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Login extends PageObject{
	
	@FindBy(id="username")
	WebElementFacade UserName;
	
	@FindBy(id="passWord")
	WebElementFacade Password;

	@FindBy(id="submit")
	WebElementFacade btnLogin;
	

	
	public WebElement UserName(){
	    return UserName;
	  }
	
	public WebElement Password(){
	    return Password;
	  }
	
	public WebElement btnLogin(){
	    return btnLogin;
	  }
	

}

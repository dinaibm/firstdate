package ems.pageobject;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Login extends PageObject{
	
	@FindBy(id="username")
	WebElementFacade UserName;
	
	@FindBy(id="password")
	WebElementFacade Password;

	@FindBy(id="submit")
	WebElementFacade btnLogin;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/div[2]/div/section/div/form/div[1]/div/p[1]")
	WebElementFacade LoginFailMessage;
	
	public WebElement UserName(){
	    return UserName;
	  }
	
	public WebElement Password(){
	    return Password;
	  }
	
	public WebElement btnLogin(){
	    return btnLogin;
	  }
	public WebElement LoginFailMessage(){
	    return LoginFailMessage;
	  }
	
}

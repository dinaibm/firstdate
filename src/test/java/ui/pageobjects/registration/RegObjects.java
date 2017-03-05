package ui.pageobjects.registration;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class RegObjects extends PageObject{

@FindBy(id="name_3_firstname")
WebElementFacade FirstName;

@FindBy(id="name_3_lastname")
WebElementFacade LastName;

@FindBy(css="input[value='single'][type='radio']")
WebElementFacade MartialStatus;

@FindBy(css="input[value='dance'][type='checkbox']")
WebElementFacade Hobby;

@FindBy(id="dropdown_7")
WebElementFacade Country;

@FindBy(id="mm_date_8")
WebElementFacade DatofBirth_Month;

@FindBy(id="dd_date_8")
WebElementFacade DatofBirth_Date;

@FindBy(id="yy_date_8")
WebElementFacade DatofBirth_Year;

@FindBy(id="phone_9")
WebElementFacade PhoneNo;

@FindBy(id="username")
WebElementFacade UserName;

@FindBy(id="email_1")
WebElementFacade eMail;

@FindBy(id="password_2")
WebElementFacade Password;

@FindBy(id="confirm_password_password_2")
WebElementFacade ConfirmPassword;

@FindBy(css="input[value='Submit'][type='submit']")
WebElementFacade Submit;

@FindBy(xpath="//*[@id='post-49']/div/p")
WebElementFacade RegMessage;


public WebElement FirstName(){
    return FirstName;
  }

public WebElement LastName(){
    return LastName;
  }

public WebElement MartialStatus(){
    return MartialStatus;
  }
public WebElement Hobby(){
    return Hobby;
  }
public WebElement Country(){
    return Country;
  }
public WebElement DatofBirth_Month(){
    return DatofBirth_Month;
  }
public WebElement DatofBirth_Date(){
    return DatofBirth_Date;
  }
public WebElement DatofBirth_Year(){
    return DatofBirth_Year;
  }
public WebElement PhoneNo(){
    return PhoneNo;
  }
public WebElement UserName(){
    return UserName;
  }
public WebElement eMail(){
    return eMail;
  }
public WebElement Password(){
    return Password;
  }
public WebElement ConfirmPassword(){
    return ConfirmPassword;
  }
public WebElement Submit(){
    return Submit;
  }

public WebElement RegMessage(){
    return RegMessage;
  }
}

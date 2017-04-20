package ems.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Transaction extends PageObject{

@FindBy(xpath="/html/body/div[2]/div/navigation/div/ul/li[2]/a/span")
WebElementFacade TransactionModule;

@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[1]/h3")
WebElementFacade TransactionPage;

public WebElement TransactionModule(){
    return TransactionModule;
  }
public WebElement TransactionPage(){
    return TransactionPage;
  }
}

package ems;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import util.Config;

public class Transaction extends PageObject{
	
	public WebDriver driver=getDriver();	
	ems.pageobject.Transaction transaction;

	@Step
	public void NavigateToTransaction(String appURL) throws InterruptedException{
		transaction.TransactionModule().click();
		Thread.sleep(2000);
	}
	
	public void validateTransactionPage(String appURL) throws FileNotFoundException{
		String expectedURL = Config.get("AppURL",appURL);
		String actualURL = driver.getCurrentUrl();
		verifyURL(expectedURL,actualURL);
		verifyTransactionPage(appURL);
	}
	
	@Step
	public void verifyURL(String expectedURL,String actualURL){
		org.junit.Assert.assertEquals(expectedURL, actualURL);
	}
	
	@Step
	public void verifyTransactionPage(String appModule){
		String actualModule=transaction.TransactionPage().getText();
		org.junit.Assert.assertEquals(appModule, actualModule);
	}
	
}

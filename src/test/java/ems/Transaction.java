package ems;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import util.Config;

public class Transaction extends PageObject{
	
	public WebDriver driver=getDriver();	
	ems.pageobject.Transaction transaction;

	@Step
	public void NavigateToTransaction(String appURL) throws InterruptedException{
		Thread.sleep(2000);
		transaction.TransactionModule().click();
		Thread.sleep(2000);
	}
	
	public void validateTransactionPage(String appURL) throws FileNotFoundException{
		String expectedURL = Config.get("AppURL",appURL);
		String actualURL = getDriver().getCurrentUrl();
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
	
	
	@Step
	public void SelectDateRange(String startDate, String endDate) throws InterruptedException{
		transaction.DatePickerDropdown().click();
		Thread.sleep(1000);
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		String cMonth = new SimpleDateFormat("MM").format(date.getTime());	
		//Selecting the Start Date
		if(startDate.split("/")[1].contentEquals(cMonth)){
			
		}else{
			int MonthDiff = Integer.parseInt(cMonth)-Integer.parseInt(startDate.split("/")[1].toString());
			for(int i=1;i<=MonthDiff;i++){
				transaction.DateMovePrevMonth().click();
				Thread.sleep(1000);
			}
			List<WebElement> dateRow = transaction.calendarTable().findElements(By.tagName("td"));
			
			for(WebElement sDate:dateRow){
				if(sDate.getText().equals(startDate.split("/")[0].toString())){
					sDate.click();
					break;
				}
			}
		}
		//Selecting End Date
		
		if(endDate.split("/")[1].contentEquals(cMonth)){
					
				}else{
					/*int MonthDiff = Integer.parseInt(cMonth)-Integer.parseInt(startDate.split("/")[1].toString());
					for(int i=1;i<=MonthDiff;i++){
						transaction.DateMovePrevMonth().click();
						Thread.sleep(1000);
					}*/
					List<WebElement> dateRow = transaction.calendarTable().findElements(By.tagName("td"));
					
					for(WebElement sDate:dateRow){
						if(sDate.getText().equals(endDate.split("/")[0].toString())){
							sDate.click();
						//	sDate.click();
							break;
						}
					}
				}
	}
	
@Step
public void ApplyDateRange() throws InterruptedException{
	transaction.btnApplyDateRange().click();
	Thread.sleep(3000);
}

@Step
public void TransactionList(){
	int tranCount = transaction.transactionSearch().size(); 
	System.out.println(tranCount);
	if(tranCount>0){
		org.junit.Assert.assertTrue(true);
	}else{
		org.junit.Assert.assertTrue("No Transactions Available for Selected Date Range",false);
	}
	
	
	
}
	
}

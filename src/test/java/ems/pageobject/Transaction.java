package ems.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Transaction extends PageObject{

@FindBy(xpath="/html/body/div[2]/div/navigation/div/ul/li[2]/a/span")
WebElementFacade TransactionModule;

@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[1]/h3")
WebElementFacade TransactionPage;

@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div/transaction-search/form/div/div[1]/div/div/div/div/div[3]/div[1]/div/span[2]/button")
WebElementFacade DatePickerDropdown;

@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div/transaction-search/form/div/div[1]/div/div/div/div/div[3]/div[1]/div/extended-datepicker-popup/div[1]/table/thead/tr[1]/th[1]/span")
WebElementFacade DateMovePrevMonth;

@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div/transaction-search/form/div/div[1]/div/div/div/div/div[3]/div[1]/div/extended-datepicker-popup/div[1]/table")
WebElementFacade calendarTable;


@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div/transaction-search/form/div/div[1]/div/div/div/div/div[3]/div[1]/div/extended-datepicker-popup/div[2]/div/button[1]")
WebElementFacade btnApplyDateRange;

@FindBy(tagName="transaction-row")
List<WebElementFacade> transactionSearch;

public WebElement TransactionModule(){
    return TransactionModule;
  }
public WebElement TransactionPage(){
    return TransactionPage;
  }

public WebElement DatePickerDropdown(){
    return DatePickerDropdown;
  }

public WebElement DateMovePrevMonth(){
    return DateMovePrevMonth;
  }

public WebElement btnApplyDateRange(){
    return btnApplyDateRange;
  }
public WebElement calendarTable(){
    return calendarTable;
  }
public List<WebElementFacade> transactionSearch(){
    return transactionSearch;
  }

}

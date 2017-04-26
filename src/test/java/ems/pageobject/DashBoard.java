package ems.pageobject;

import java.util.List;



import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DashBoard extends PageObject{


	@FindBy(tagName="payments")
	List<WebElementFacade> paymentDashboard;	
	
	@FindBy(tagName="sales")
	List<WebElementFacade> salesDashboard;
	
	@FindBy(tagName="transfers")
	List<WebElementFacade> transfersDashboard;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]/section/div[1]/div/date-selector/div/div")
	WebElementFacade DashBoardDate;
	
	public List<WebElementFacade> paymentDashboard(){
	    return paymentDashboard;
	  }
	
	public List<WebElementFacade> salesDashboard(){
	    return salesDashboard;
	  }
	
	public List<WebElementFacade> transfersDashboard(){
	    return transfersDashboard;
	  }
	
	public WebElementFacade DashBoardDate(){
		return DashBoardDate;
	}
	
	
}

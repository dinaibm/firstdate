package common;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.thucydides.core.webdriver.DriverSource;
import util.Config;

public class WrappedWebDriver implements DriverSource {
	  static String driverName="";
	    static String provider="";
	@Override
	public WebDriver newDriver() {
		// TODO Auto-generated method stub     
	        WebDriver driver = null;
	       // String timeoutMilli = ConfigDetails.prop.getProperty("webdriver.implicitWaitTimeoutMilli", "0");
	String iePageLoadTimeout = ""; //Config.get("setup","webdriver.ie.pageLoadTimeout", "60");
	        try {
	         
	            driverName=Config.get("setup","driver");
	            System.out.println(driverName);
	            String driverpath=System.getProperty("user.dir"); 
	            File f = new File(driverpath+"//libs");
	            System.out.println("Driver is .."+driverName+":"+driverpath);
	            if(driverName.equalsIgnoreCase("internetExplorer") && (f.exists())){
	            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer(); 
	            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	            System.setProperty("webdriver.ie.driver", new File(".").getCanonicalPath()+"\\libs\\IEDriverServer.exe");
	            driver = new InternetExplorerDriver(capabilities);
	            driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(iePageLoadTimeout), TimeUnit.SECONDS);
	                System.out.println("IE DRIVER");
	            }
	            else if (driverName.equalsIgnoreCase("chromeDriver") && (f.exists())){
	                
	            System.setProperty("webdriver.chrome.driver", new File(".").getCanonicalPath()+"\\libs\\chromedriver.exe");
	            ChromeOptions options = new ChromeOptions();
	 
	            Map<String, Object> prefs = new HashMap<String, Object>();
	            prefs.put("profile.default_content_setting_values.notifications", 0);
	            options.setExperimentalOption("prefs", prefs);
	            options.addArguments("disable-extensions");
	            options.addArguments("--start-maximized");
	            driver = new ChromeDriver(options);
	            System.out.println("Chrome DRIVER");
	              }
	           
	            
	            else{
	                throw (new Exception("WebDriver provider ["+driverName+"] is not an valid option for WebDriver ["+driverName+"]"));
	                }
	            
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        
	        return driver;
	}

	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return true;
	}

}

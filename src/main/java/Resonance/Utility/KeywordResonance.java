package Resonance.Utility;

import java.time.Duration;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class KeywordResonance {
	static RemoteWebDriver driver;
	public static WebDriverWait Wait;
	
	private static final Logger LOG=Logger.getLogger(KeywordResonance.class);
	/*
	 * This method will use to Open Browser
	 * <ul>
	 * <li>chrome</li>
	 * <li>firefox</li>
	 * <li>internetExplorer</li>
	 * </ul>
	 */
	public static RemoteWebDriver OpenBrowser(String BrowserName) {
	
		if(BrowserName.equalsIgnoreCase("chrome")) {
			ChromeOptions option=new ChromeOptions();
			option.setAcceptInsecureCerts(true);
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(option);
		}else if(BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			}else if(BrowserName.equalsIgnoreCase("InternetExplrer")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			
			}else {
			LOG.error("Inavalid browsername");
			
		}
	    LOG.info(BrowserName+"Browser has successfully Launched");

		Wait=new WebDriverWait(driver, Duration.ofMillis(3000));
		return driver;
        }

/*
 * This Method is used to launch URL
 */
       public static  void launchUrl(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
	    }
       
 /*
  * This Method is used to Click Particular Webelement
 */
       public static  void Click(WebElement element) {
    	   
    	   element.click();
       }
       
    /*
     * Overloding Click Method   
     */
  public static  void Click(String locater) {
	  String[] parts=locater.split("##");
	  getWebElement(parts[0] , parts[1]).click();;
	  
    	   
         }
  
  /*
   * Overloding Click Method having two argument   
   */
  
  public static void Click(String Locatertype , String locatervalue) {
	  
	  getWebElement( Locatertype ,  locatervalue).click();
	  
  }
  public static void EnterText(String Locatertype , String locatervalue,String TextToEnter) {
	  
	  getWebElement( Locatertype ,  locatervalue).sendKeys(TextToEnter);
  }
	  
  
  
	  public static WebElement getWebElement(String Locatertype , String locatervalue) {
		  
	  if(Locatertype.equalsIgnoreCase("xpath")) {
			
			return driver.findElement(By.xpath(locatervalue));
		}
	  else if(Locatertype.equalsIgnoreCase("css")){
			
			return driver.findElement(By.cssSelector(locatervalue));
		}
	  else if(Locatertype.equalsIgnoreCase("id")){
			
		return driver.findElement(By.id(locatervalue));
		}
		
	  else if(Locatertype.equalsIgnoreCase("name")){
		
		return driver.findElement(By.name(locatervalue));
	}
		
		
	  else if(Locatertype.equalsIgnoreCase("class")){
		
		return driver.findElement(By.className(locatervalue));
	}
	  else if(Locatertype.equalsIgnoreCase("tag")){
		
		return driver.findElement(By.tagName(locatervalue));
	}
	  else {
		  LOG.error("Invalid Locater Type"+Locatertype);
		  return null;
	  }
	
  }
              
       
/*
 * This Method is used to Wait in millisecound       
 */
       public static  void WaitFor(long Duration){
    	   try {
			Thread.sleep(Duration);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
    	   
    	   
       }
	public static void CloseBrowser() {
		driver.close();
		
	}

	public void waitForPresenceOfElement(WebElement element) {
	
		
	}
	

       }

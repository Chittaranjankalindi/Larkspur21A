package Resonance.Utility;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Resonance.pages.ResonancePageConfigProperties;

import static Resonance.Utility.KeywordResonance.*;

public class ResonanceBeforeAndAfterMenthod {

public static RemoteWebDriver driver;	
@BeforeMethod
	public void setup() {
	
		this.driver=KeywordResonance.OpenBrowser("chrome");
		KeywordResonance.launchUrl("http://www.ijmeet.com");
		//The below method is used to get the URL from properties file
		//ResonancePageConfigProperties config=new ResonancePageConfigProperties();
		//KeywordResonance.launchUrl(config.getAppUrl());
		
	
			
	}
	//@AfterMethod
	public void Teardown() {
		
		KeywordResonance.CloseBrowser();
	}


}

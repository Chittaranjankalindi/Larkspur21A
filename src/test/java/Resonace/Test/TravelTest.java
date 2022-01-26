package Resonace.Test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Resonance.Constant.LocaterType;
import Resonance.Constant.WebElementLocater;
import Resonance.Utility.KeywordResonance;
import Resonance.Utility.ResonanaceProperties;
import Resonance.Utility.ResonanceBeforeAndAfterMenthod;

import static Resonance.Utility.KeywordResonance.*;

import java.time.Duration;

public class TravelTest extends ResonanceBeforeAndAfterMenthod {
	public static final Logger LOG=Logger.getLogger(TravelTest.class);

	
	public void VerfiyErrorOnSelectSameCitiesAsSourceAndDestination() throws InterruptedException {
		
    KeywordResonance.OpenBrowser("chrome");
	KeywordResonance.launchUrl("https://www.flipkart.com/");
	KeywordResonance.WaitFor(3000);
	
	KeywordResonance.Click(LocaterType.xpath, "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[8]/a[1]/div[1]/div[1]/img[1]");
	WaitFor(3000);
	KeywordResonance.Click(LocaterType.xpath, "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	Thread.sleep(2000);
	}
	@Test
	public void VerifySearchforshoes() throws InterruptedException {
		KeywordResonance.launchUrl("https://www.flipkart.com/");
		WaitFor(5000);
		Click(LocaterType.xpath,"//button[@class='_2KpZ6l _2doB4z']");
		//Or this is a close popup methhod by using Object Repository properties
		//ResonanaceProperties pro=new ResonanaceProperties();
		//Click(pro.getlocater("Home_ScreenClosePopUp")[0],pro.getlocater("Home_ScreenClosePopUp")[1]);
		
		Click(LocaterType.xpath,"//input[@placeholder='Search for products, brands and more']");
		EnterText(LocaterType.xpath, "//input[@placeholder='Search for products, brands and more']", "shoes");
		WaitFor(5000);
		LOG.info("Search for the enter product");
		WaitFor(2000);
		
		Click(LocaterType.xpath,"//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]");
		Thread.sleep(2000);
		Click(LocaterType.xpath,"//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/span[1]");
	    Thread.sleep(2000);
		Click(LocaterType.xpath,"//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/span[1]/*[1]");
	    
		
	}
}
	

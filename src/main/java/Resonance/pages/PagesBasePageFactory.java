package Resonance.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import Resonance.Utility.ResonanceBeforeAndAfterMenthod;

public class PagesBasePageFactory {
	
	public RemoteWebDriver driver;
	
public PagesBasePageFactory() {
	
	this.driver=ResonanceBeforeAndAfterMenthod.driver;
	
}
	

}

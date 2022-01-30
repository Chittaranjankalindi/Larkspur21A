package Resonance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinMeetingPage extends PagesBasePageFactory {
	
	@FindBy(css="a[href^=\"https://ijmeet.com/app\"]")
	public WebElement quickjoinMeetingtxt;
	
	public JoinMeetingPage() {
		PageFactory.initElements(driver,this);
		
	}

	
	/*
	 * This method will return Quick Join Meeting " If quick join page load Successfully
	 */
	public String getPageHeading() {
		
		return quickjoinMeetingtxt.getText();
		
	}
}

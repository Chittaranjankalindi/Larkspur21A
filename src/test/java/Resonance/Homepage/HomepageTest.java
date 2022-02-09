package Resonance.Homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resonance.Utility.KeywordResonance;
import Resonance.Utility.ResonanceBeforeAndAfterMenthod;
import Resonance.pages.HomePage;
import Resonance.pages.JoinMeetingPage;

public class HomepageTest extends ResonanceBeforeAndAfterMenthod{
	
	@Test
	public void ClickOnJoinMeetingforVerify() throws InterruptedException {
		
		HomePage home=new HomePage();
		Thread.sleep(2000);
		home.ClickOnJoinMeeting();
		KeywordResonance.WaitFor(2000);
		//Page Factory used to Initiate the page element which are annoted by @FindBY
		JoinMeetingPage JoinMeeting=new JoinMeetingPage();
		String actual= JoinMeeting.getPageHeading();
		Assert.assertEquals(actual, "Join Meeting");
		
		
		
		
	}

}

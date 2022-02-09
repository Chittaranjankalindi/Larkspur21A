package Resonance.pages;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends PagesBasePageFactory {
	
	private static final Logger LOG=Logger.getLogger(HomePage.class);
	
	@FindBy(xpath="//a[contains(text(),'Join Meeting')]")
	public WebElement JoinMeeting;
	
	@FindBy(css="span.mvlogo-size-app1 img[alt='ijmeetimage']")
	public WebElement logo;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnJoinMeeting() {
		
		JoinMeeting.click();
		LOG.info("Clicked on Join Meeting Link");
	}
	


}

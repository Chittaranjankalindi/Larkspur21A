package Resonance.Utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static Resonance.Utility.KeywordResonance.*;

public class ResonanceBeforeAndAfterMenthod {
	
@BeforeMethod
	public void setup() {
	
		KeywordResonance.OpenBrowser("chrome");
	
			
	}
	@AfterMethod
	public void Teardown() {
		
		KeywordResonance.CloseBrowser();
	}


}

package Resonance.pages;

import java.io.FileInputStream;

import Resonance.Utility.ResonanaceProperties;

public class ResonancePageConfigProperties {
	
	public String getAppUrl() {
		
		
		return GetProperty("app.url");
		
	}
	public String getBrowserName() {
		return GetProperty("app.BrowserName");
		
		
	}
	
public String GetProperty(String property ) {
		
		ResonanaceProperties prop=new ResonanaceProperties();
		
		String dir=System.getProperty("user.dir");
		return prop.getValue(dir+"src/main/resources/Application.properties", property);
	

}
}

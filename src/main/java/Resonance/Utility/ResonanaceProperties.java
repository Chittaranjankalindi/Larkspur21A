package Resonance.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ResonanaceProperties {
	
	public String getValue(String path, String key) {
	
	FileInputStream fis=null;
			
    try {
		fis=new FileInputStream(path);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	Properties prop=new Properties();
	String value=null;
	try {
		prop.load(fis);
		value=prop.getProperty(key);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return value;
}
	
	public String[] getlocater(String key) {
		
		String dir=System.getProperty("user.dir")+"/src/main.resources/ObjectResonanceResonanace.properties";
		String locater=getValue(dir,key);
		String[] parts=locater.split("##");
		return parts;
		
		
		
	}
	
}

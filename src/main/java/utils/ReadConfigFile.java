package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ReadConfigFile {
	protected InputStream input = null;
	protected Properties prop = null;
	
	public ReadConfigFile() {
		try {
			input = ReadConfigFile.class.getClassLoader().getResourceAsStream(Constant.CONFIG_PROPERTIES_DRECTORY);
			prop = new Properties();
			prop.load(input); 
			
		} catch (IOException e){
			e.printStackTrace();
		} 
	}
	
	public String getBrowser(){
		if(prop.getProperty("browser") == null)
			return "";
		return prop.getProperty("browser");
	}
	
	

}

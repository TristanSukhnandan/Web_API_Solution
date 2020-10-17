package SeleniumAssessment;

import java.io.InputStream;
import java.util.List;

import utils.DriverFactory;

public class test extends DriverFactory{
	
	protected static InputStream input = null;
	public static String CSV_DIRECTORY = System.getProperty("user.dir") + "\\src\\test\\java\\resources\\other\\testdata.csv";
	String name_p;
	String email_p;

	public static void main(String[] args) {
		readCSV();		
	}

	public static void readCSV(){

		List <String[]> records = utils.CSV.getCSV(CSV_DIRECTORY);
		
		for (String[] record : records){
			for(String field : record){
				System.out.println(field);
			}
		}
	}
	
	public test (String name, String email){
		
		this.name_p = name;
		this.email_p = email;
		
	}
	
	
	
}

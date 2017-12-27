package Utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class ReadProperties {
	 private static ResourceBundle rb;  
	 private static BufferedInputStream inputStream;  
	 static {   
		 String proFilePath = System.getProperty("user.dir") +"\\PropertiesFolder\\config.properties";  
		 try {  
	        inputStream = new BufferedInputStream(new FileInputStream(proFilePath));  
	            rb = new PropertyResourceBundle(inputStream);  
	            inputStream.close();  
	        } catch (FileNotFoundException
	        		e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        } catch (IOException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	 }
	 public final static String ChromeDriver = rb.getString("chromedriver");
	 public final static String KillChromeDriver = rb.getString("killchrome");
	 public final static String ChromeProperty = rb.getString("chromeProperty");
	 public final static String ClassBytype = rb.getString("Bytype");
}

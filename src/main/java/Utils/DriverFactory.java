package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	public static WebDriver driver;
	static Runtime runTime = Runtime.getRuntime();
	private DriverFactory(){}
	public static void getChromeDriver(){
		//杀死进程
		try{
			String comment = ReadProperties.KillChromeDriver;
			runTime.exec(comment);
		}catch(IOException e){
			e.printStackTrace();
		}
		System.setProperty(ReadProperties.ChromeProperty, ReadProperties.ChromeDriver);
		driver = new ChromeDriver();
	}
}

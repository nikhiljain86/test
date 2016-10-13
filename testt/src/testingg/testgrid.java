package testingg;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class testgrid {
	public RemoteWebDriver driver;
	@Test
	public void gridd() throws MalformedURLException{
		
		
		DesiredCapabilities cp = DesiredCapabilities.firefox();
		cp.setCapability(FirefoxDriver.BINARY, new File ("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
	//	cp.setJavascriptEnabled(true);
		driver = new RemoteWebDriver(new URL("http://10.32.5.119:5555/wd/hub"),cp);
	    driver.get("http://facebook.com");
	
	
	}
}

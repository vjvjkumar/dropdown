package Pack2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class SingleBrowserVJ {

	static Selenium selenium;
	
	@BeforeClass
	public static void OpenBrowser(){
		selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://google.co.uk");
		selenium.start();
		selenium.windowMaximize();
		selenium.setSpeed("3000");
	}	
		
	@AfterClass
	public static void CloseBrowser(){
		selenium.stop();
	}
	
	@Test
	public void nhs(){
		selenium.open("http://nhs.uk");
	}
	
	@Test
	public void amazon(){
		selenium.open("http://amazon.co.uk");
	}
	
	@Ignore
	public void ourlounge(){
		selenium.open("http://ourlounge.co.uk");
	}
	
	@Test
	public void sainsburys(){
		selenium.open("http://sainsburys.co.uk");
	}
	
	
}

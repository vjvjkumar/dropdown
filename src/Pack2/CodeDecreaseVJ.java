package Pack2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class CodeDecreaseVJ {

	Selenium selenium;
	
	@Before
	public void OpenBrowser(){
		selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://google.co.uk");
		selenium.start();
		selenium.windowMaximize();
		selenium.setSpeed("3000");
	}
	
	@After
	public void CloseBrowser(){
		selenium.stop();
	}
	
	@Test
	public void quikr(){
		selenium.open("http://quikr.com");
	}	
	
	@Test
	public void ebay(){
		selenium.open("http://ebay.co.uk");
	}
	
	@Test
	public void amazon(){
		selenium.open("http://amazon.co.uk");
		
	}
	
	@Test
	public void samsung(){
		selenium.open("http://samsung.co.uk");
	}	
		
}	
	

	


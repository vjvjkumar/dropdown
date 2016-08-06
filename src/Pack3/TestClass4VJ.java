package Pack3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class TestClass4VJ {
	Selenium selenium;
	
	@Before
	public void OpenBrowswer(){
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
	public void google(){
		selenium.open("http://google.co.uk");
	}
}

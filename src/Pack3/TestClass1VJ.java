package Pack3;

import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class TestClass1VJ {
	
	
	
	@Test
	public void nhs(){
		Selenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://google.co.uk");
		selenium.start();
		selenium.windowMaximize();
		selenium.setSpeed("3000");
		selenium.open("http://nhs.uk");
		selenium.stop();
	}
}

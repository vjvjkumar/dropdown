package Pack3;

import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class TestClass3VJ {
	
	@Test
	public void amazon(){
		Selenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://google.co.uk");
		selenium.start();
		selenium.windowMaximize();
		selenium.setSpeed("3000");
		selenium.open("http://amazon.co.uk/");
		selenium.stop();
	}

	@Test
		public void ebay(){
			Selenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://google.co.uk");
			selenium.start();
			selenium.windowMaximize();
			selenium.setSpeed("3000");
			selenium.open("http://ebay.co.uk/");
			selenium.stop();
}

}
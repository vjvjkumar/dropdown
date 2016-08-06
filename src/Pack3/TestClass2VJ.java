package Pack3;

import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class TestClass2VJ {
	
	@Test
	public void ourlounge(){
		Selenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://google.co.uk");
		selenium.start();
		selenium.windowMaximize();
		selenium.setSpeed("3000");
		selenium.open("http://ourlounge.co.uk/");
		selenium.stop();
	}

}

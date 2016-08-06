package Pack1;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class DropdownBoxHandlingVJ {
	public static void main(String[] args){
		Selenium selenium=new DefaultSelenium("LocalHost", 4444, "*firefox", "http://google.co.uk");
		selenium.start();
		selenium.windowMaximize();
		selenium.setSpeed("3000");
		selenium.open("http://ebay.co.uk/");
		selenium.select("//*[@id='gh-cat']", "Antiques");
		selenium.click("btn=Search");
		
		
	}

}

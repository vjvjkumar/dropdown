package Pack1;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class Extractdropdownbox_OptionsVJ {
	
	public static void main(String[] args){
	
		Selenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://google.co.uk");
		selenium.start();
		selenium.windowMaximize();
		selenium.setSpeed("2000");
		selenium.open("http://ebay.co.uk/");
		selenium.select("//*[@id='gh-cat']", "Antiques");
		String [] options=selenium.getSelectOptions("//*[@id='gh-cat']");
		for (int i=0; i<=options.length-1; i++){
			System.out.println(options[i]);
	}
}
}
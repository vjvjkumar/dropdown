package Pack1;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class MultipleCheckboxesVJ {
	public static void main(String[] args){
		Selenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://google.co.uk");
		selenium.start();
		selenium.windowMaximize();
		selenium.setSpeed("3000");
		selenium.open("http://tizag.com");
		selenium.click("link=HTML Tutorial");
		selenium.click("link=HTML - Checkboxes");
		for (int i=1; i<=4; i++){
		selenium.check("//html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input["+i+"]");
			}
	}
}

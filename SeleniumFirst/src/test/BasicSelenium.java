package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium extends Base{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicSelenium obj = new BasicSelenium();
		obj.setupBrowser("chrome", "https://www.facebook.com");

	}
}
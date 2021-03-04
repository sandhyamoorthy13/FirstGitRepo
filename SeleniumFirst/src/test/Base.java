package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
		public void setupBrowser(String browser, String url) {
			String currentDriver = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", currentDriver + "\\drivers\\chromedriver.exe");

			 driver = new ChromeDriver();


			driver.manage().window().maximize();
			if (url == "")
				driver.get("about:blank");
			else
				driver.get(url);

		

	}
		
		public void quitBrowser() {
			driver.quit();
		}
		
		public void closeTab() {
			driver.close();
		}
		

}

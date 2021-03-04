package test;

import org.openqa.selenium.By;

public class LocatorExample extends Base {

	public void locator() {
		driver.findElement(By.id("email")).sendKeys("sandy.pappu@gmail.com");
		//tried
		//driver.findElement(By.className("inputtext")).sendKeys("from class 1");
		//driver.findElement(By.linkText("Log In")).click();
		//when there is space , dynamic value and value is big
		//driver.findElement(By.partialLinkText("Sign Up")).click();
		
		
		//xpath
		
	}

	public static void main(String[] args) {
		LocatorExample obj = new LocatorExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.locator();
	}

}

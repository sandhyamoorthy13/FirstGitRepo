package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BNWCommands extends Base {
	
	public void navCommands()  {
		System.out.println("navigated from fb to gmail");
		
		driver.navigate().to("https://www.gmail.com");
		
		System.out.println("back to fb");
		driver.navigate().back();
		
		System.out.println("fwd to gmail");
		driver.navigate().forward();
		
		System.out.println("gmail gets refreshed");
		driver.navigate().refresh();
	}
	
	public void webElementsState() {
		WebElement maleRadioBtn = driver.findElement(By.xpath(("//input[@id='u_0_5' or @id='u_0_7']")));
		System.out.println("isDisplayed===="+ maleRadioBtn.isDisplayed());
	     System.out.println("isEnabled======" + maleRadioBtn.isEnabled());
	     
	     System.out.println("isClicked before state===" + maleRadioBtn.isSelected());
	     maleRadioBtn.click();
	     System.out.println("isClicked after state===" + maleRadioBtn.isSelected());
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
BNWCommands obj = new BNWCommands();
obj.setupBrowser("chrome", "https://www.facebook.com/r.php");
//obj.navCommands();
obj.webElementsState();
	}

}

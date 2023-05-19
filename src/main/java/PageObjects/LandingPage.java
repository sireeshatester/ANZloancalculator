package PageObjects;

import org.openqa.selenium.WebDriver;

import TestComponents.BaseTest;

public class LandingPage extends BaseTest {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	
	public void goTo() {
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		
	}

}

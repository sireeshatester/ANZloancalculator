package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartOverDetails  {
	
	WebDriver driver;
	
	public StartOverDetails(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[@class=\"start-over\"]")
	WebElement startoverbtn;
	
	
	
	public void ClkStartoverBtn() {
		startoverbtn.click();
	}
	
	
	

}

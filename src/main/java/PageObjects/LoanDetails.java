package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoanDetails {

	WebDriver driver;
	public LoanDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//input[@id='application_type_single']")
	WebElement ApplicationType;
	
	@FindBy(xpath="//select[@title=\"Number of dependants\"]")
	WebElement dependentElement;
	
	@FindBy(xpath="//label[@for='borrow_type_home']")
	WebElement BarrowerType;
	
	@FindBy(xpath="//input[@aria-labelledby=\"q2q1\"]")
	WebElement EarningsIncome;
	
	@FindBy(xpath="//input[@aria-labelledby=\"q2q2\"]")
	WebElement OtherIncome;
	
	@FindBy(xpath="//input[@aria-labelledby=\"q3q1\"]")
	WebElement LivingExpenses;
	
	@FindBy(xpath="//input[@aria-labelledby=\"q3q2\"]")
	WebElement HomeLoanRepayments;
	
	@FindBy(xpath="//input[@aria-labelledby=\"q3q3\"]")
	WebElement OtheroanRepayments;
	
	@FindBy(xpath="//input[@aria-labelledby=\"q3q4\"]")
	WebElement OtherCommittments;
	
	@FindBy(xpath="//input[@aria-labelledby=\"q3q5\"]")
	WebElement CreditCard;
	
	@FindBy(xpath="//button[contains(., 'Work out how much I could borrow')]")
	WebElement CalculateBtn;
	
	
	

	
	public void addApplicationType() {
		ApplicationType.click();
	}
	
	public void  addDependents() {Select dependentDropdown=new Select(dependentElement);
	List<WebElement> DropdownOptions=dependentDropdown.getOptions();
	for(WebElement Options:DropdownOptions) {
		System.out.println(Options.getText());
	}
	dependentDropdown.selectByVisibleText("0");	
	}
	
	
	public void addBarrowerType() {
		BarrowerType.click();
	}
	
	public void addEarningsIncome() {
		EarningsIncome.sendKeys("80000");
	}
	
	public void addOtherIncome() {
		OtherIncome.sendKeys("10000");
	}
	
	public void addLivingExpenses() {
		LivingExpenses.sendKeys("500");
	}
	
	public void addHomeLoanRepayments() {
		HomeLoanRepayments.sendKeys("0");
	}
	
	public void addOtherLoanRepayments() {
		OtheroanRepayments.sendKeys("100");
	}
	
	public void addOtherCommittments() {
		OtherCommittments.sendKeys("0");
	}
	
	public void addCreditCard() {
		CreditCard.sendKeys("10000");
	}
	
	public void SubmitBtn() {
		CalculateBtn.click();
		
	}
	
	
}

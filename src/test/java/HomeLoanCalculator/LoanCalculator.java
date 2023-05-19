package HomeLoanCalculator;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoanDetails;
import PageObjects.StartOverDetails;
import TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoanCalculator extends BaseTest   {

	
	@Test
	public void loancalaculator() throws InterruptedException, IOException {
    	LandingPage landingpage = launchapplication();
		LoanDetails loandetails=new LoanDetails(driver);
		loandetails.addDependents();
		loandetails.addBarrowerType();
		loandetails.addEarningsIncome();
		loandetails.addOtherIncome();
		loandetails.addLivingExpenses();
		loandetails.addHomeLoanRepayments();
		loandetails.addOtherLoanRepayments();
		loandetails.addOtherCommittments();
		loandetails.addCreditCard();
		loandetails.SubmitBtn();
		StartOverDetails startover=new StartOverDetails(driver);
		startover.ClkStartoverBtn();
		
	}
	

}

package StepDefintions;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import PageObjects.LandingPage;
import PageObjects.LoanDetails;
import PageObjects.StartOverDetails;
import TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintionImp extends BaseTest {

	
	public LandingPage landingpage;
	public LoanDetails loandetails;
	public StartOverDetails startover;
	

	@Given("I want use this URL and open the application")
	public void i_want_use_this_url_and_open_the_application() throws IOException {
		landingpage = launchapplication();
		
	}

	@When("I want to click the details of applicationtype")
	public void i_want_to_click_the_details_of_applicationtype() {
		loandetails=new LoanDetails(driver);
		loandetails.addApplicationType();
		
	}

	@When("enter the number of depenedents")
	public void enter_the_number_of_depenedents() {
		loandetails.addDependents();   
	}

	@When("select the type of Home BarrowType")
	public void select_the_type_of_home_barrow_type() {
		loandetails.addBarrowerType(); 
	}

	@When("enter the earnings of annaulIncome and OtherIncome")
	public void enter_the_earnings_of_annaul_income_and_other_income() {
		loandetails.addEarningsIncome();
		loandetails.addOtherIncome();
	}

	@When("enter the expenses of LivingExpenses and HomeLoanRepayments and OtherLoanRepayments")
	public void enter_the_expenses_of_living_expenses_and_home_loan_repayments_and_other_loan_repayments() {
		loandetails.addLivingExpenses();
		loandetails.addHomeLoanRepayments();
		loandetails.addOtherLoanRepayments();
	}

	@When("enter the expenses of MonthlyCommitments and CreditCard")
	public void enter_the_expenses_of_monthly_commitments_and_credit_card() {
		loandetails.addOtherCommittments();
		loandetails.addCreditCard();
	}

	@Then("I click the barrow button")
	public void i_click_the_barrow_button() {
		loandetails.SubmitBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	}

	@Then("I click on the startover button")
	public void i_click_on_the_startover_button() {
		startover=new StartOverDetails(driver);
		startover.ClkStartoverBtn();
		driver.close();
	}
}

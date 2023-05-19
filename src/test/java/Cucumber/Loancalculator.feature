
Feature:  Verify the working of Barrower Calculator
  I want to use this template for my feature file

  
  Scenario: verification of working of Barrow Calculator
    Given I want use this URL and open the application
    When  I want to click the details of applicationtype
    And   enter the number of depenedents
    And select the type of Home BarrowType
    And enter the earnings of annaulIncome and OtherIncome
    And enter the expenses of LivingExpenses and HomeLoanRepayments and OtherLoanRepayments
    And enter the expenses of MonthlyCommitments and CreditCard
    Then I click the barrow button
    Then I click on the startover button 

 

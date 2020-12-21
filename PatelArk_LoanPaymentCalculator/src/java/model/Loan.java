/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.NumberFormat;

/**
 *
 * @author ARK PATEL
 */
public class Loan
{
      private double annualInterestRate;  
      private int numberOfYears;
      private double loanAmount;
      
      /** Default constructor */
      public Loan()
      {
      }
      
      /** Construct a loan with specified annual interest rate,     
       * number of years, and loan amount    */
      public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
      {
          this.annualInterestRate = annualInterestRate;
          this.numberOfYears = numberOfYears;
          this.loanAmount = loanAmount;
      }
      
      /** Return annualInterestRate */
      public double getAnnualInterestRate()
      {
          return annualInterestRate;
      }
      
      /** Set a new annualInterestRate */
      public void setAnnualInterestRate(double annualInterestRate)
      {
        this.annualInterestRate = annualInterestRate;
      }
      
      /** Return numberOfYears */
      public int getNumberOfYears()
      {
          return numberOfYears; 
      }
      
      /** Set a new numberOfYears */
      public void setNumberOfYears(int numberOfYears) 
      {
          this.numberOfYears = numberOfYears;
      }
      
      /** Return loanAmount */
      public double getLoanAmount()
      {
          return loanAmount; 
      }
      
      /** Set a newloanAmount */
      public void setLoanAmount(double loanAmount) 
      {
          this.loanAmount = loanAmount; 
      }
      
      /** Find monthly payment */ 
      public double getMonthlyPayment()
      {
          double monthlyInterestRate = annualInterestRate / 12; 
          double monthlyPayment = loanAmount * monthlyInterestRate / (1 -      (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));    
          return monthlyPayment;
      }
      
      /** Find total payment */
      public double getTotalPayment()
      {
          double totalPayment = getMonthlyPayment() * (numberOfYears * 12);    return totalPayment;  
      }
      
      /* Method to convert any double/float value to currency format    
      as a String */ 
      public String currencyFormat(double x)
      {
          NumberFormat currency = NumberFormat.getCurrencyInstance(); 
          return currency.format(x);
      }
}

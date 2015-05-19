// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.util.Date;

 
public class ProjectAccount {
	public static void main(String[] args) {
//create an instance  object of class Stock
		Account myAccount = new Account(1122, 20000.00, 0.045);
		myAccount.withdraw(2500.00);
		myAccount.deposit(3000.00);
//display balance, monthly interest and date of account
		System.out.println("Balance: $" + myAccount.balance);
		System.out.println("Monthly Interest: " + myAccount.getMonthlyInterestRate() +"%");
		//System.out.println("Account created on: " + myAccount.dateCreated);
		java.util.Date dateCreated = new java.util.Date();
		System.out.println("Account created on: " + dateCreated.toString());
	}
}
 
class Account {
	//define var1, var2
	int id;
	double balance;
	double annualInterestRate;
	Date dateCreated;
	//no arg constructer
	Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}
	//constructor with specific id and initial balance
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	Account(int newId, double newBalance, double newAnnualInterestRate) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}
	//accessor/mutator methods for id, balance, and annualInterestRate
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int newId) {
		id = newId;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	//accessor method for dateCreated
	public void setDateCreated(Date newDateCreated) {
		dateCreated = newDateCreated;
	}
	//define method getMonthlyInterestRate
	double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	//define method withdraw
	double withdraw(double amount) {
		return balance -= amount;
	}	
	//define method deposit
	double deposit(double amount) {
		return balance += amount;
	}
}
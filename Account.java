//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 4; Account
// Balance variable never becomes negative
//02-25-2014

public class Account {
  // Instance variables
  private double balance;

  // Constructors
  public Account(double initialBalance) {
	  if(initialBalance>0){
		  balance=0;
	  }else
    balance = initialBalance;
  }

  public Account() {
    balance = 0.0;
  }
// Instance methods
  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
	  if(amount>balance){
		  balance=0;
	  }else{
    balance -= amount;
	  }
  }

  public double getBalance() {
    return balance;
  }

  public void close() {
    balance = 0.0;
  }
}

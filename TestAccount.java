//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 4; Account
// Balance variable never becomes negative
//02-25-2014


public class TestAccount {
  public static void main(String[] args) {
    Account acct1 = new Account(700.00);
    System.out.println("Balance in account 1: " +
                       acct1.getBalance());
    acct1.deposit(100.00);
    System.out.println("Balance in account 1: " +
                       acct1.getBalance());
    acct1.withdraw(900);
    System.out.println("Balance in account 1: " +
                       acct1.getBalance());
acct1.close();
    System.out.println("Balance in account 1: " +
                       acct1.getBalance());
	
    Account acct2 = new Account();
    System.out.println("Balance in account 2: " +
                       acct2.getBalance());
    acct2.deposit(500.00);
    System.out.println("Balance in account 2: " +
                       acct2.getBalance());
    acct2.withdraw(350.00);
    System.out.println("Balance in account 2: " +
                       acct2.getBalance());
    acct2.close();
    System.out.println("Balance in account 2: " +
                       acct2.getBalance());
  }
}


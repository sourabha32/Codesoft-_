package tasks3;
import java.util.Scanner;
public class BankAccount {
	 private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public boolean deposit(double amount) {
	        if (amount > 0) {
	            this.balance += amount;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public boolean withdraw(double amount) {
	        if (amount > 0 && amount <= this.balance) {
	            this.balance -= amount;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public double checkBalance() {
	        return this.balance;
	    }
	}
 
package tasks3;
import java.util.Scanner;
public class ATM {
	 private BankAccount userAccount;

	    public ATM(BankAccount account) {
	        this.userAccount = account;
	    }

	    public void withdraw(double amount) {
	        if (userAccount.withdraw(amount)) {
	            System.out.println("Withdrawal of $" + amount + " successful.");
	        } else {
	            System.out.println("Insufficient funds or invalid amount for withdrawal.");
	        }
	    }

	    public void deposit(double amount) {
	        if (userAccount.deposit(amount)) {
	            System.out.println("Deposit of $" + amount + " successful.");
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void checkBalance() {
	        System.out.println("Your account balance is $" + userAccount.checkBalance());
	    }
	

	
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000);
	        ATM atm = new ATM(account);
	        Scanner scanner = new Scanner(System.in);

	        boolean flag = true;

	        while (flag) {
	            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    atm.checkBalance();
	                    break;
	                case 2:
	                    System.out.print("Enter deposit amount: $");
	                    double depositAmount = scanner.nextDouble();
	                    atm.deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter withdrawal amount: $");
	                    double withdrawAmount = scanner.nextDouble();
	                    atm.withdraw(withdrawAmount);
	                    break;
	                case 4:
	                    flag = false;
	                    System.out.println("Exiting the ATM. Thank you!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }
	        scanner.close();
	    }
	}
		




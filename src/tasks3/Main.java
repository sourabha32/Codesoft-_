package tasks3;

public class Main  {
	  public static void main(String[] args) {
	        // Create a bank account with an initial balance of $1000
	        BankAccount userAccount = new BankAccount(1000);

	        // Create an ATM linked to the user's bank account
	        ATM atm = new ATM(userAccount);

	        // Create a scanner for user input
	        Scanner scanner = new Scanner(System.in);

	        // Display the ATM menu
	        while (true) {
	            System.out.println("\nATM Menu:");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");

	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter withdrawal amount: $");
	                    double withdrawAmount = scanner.nextDouble();
	                    atm.withdraw(withdrawAmount);
	                    break;

	                case 2:
	                    System.out.print("Enter deposit amount: $");
	                    double depositAmount = scanner.nextDouble();
	                    atm.deposit(depositAmount);
	                    break;

	                case 3:
	                    atm.checkBalance();
	                    break;

	                case 4:
	                    System.out.println("Exiting. Thank you!");
	                    scanner.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

}

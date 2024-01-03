package tasks;
import java.util.Random;
import java.util.Scanner;

public class task2 {
	private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Random random = new Random();
        int targetNumber = random.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;

        
        System.out.println("Welcome to the number guessing game!");

        
        while (true) {
            System.out.print("Guess the number (1-" + MAX_RANGE + "): ");
            int userGuess = scanner.nextInt();

            
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the number!");
            } else if (userGuess < targetNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }
    }

}

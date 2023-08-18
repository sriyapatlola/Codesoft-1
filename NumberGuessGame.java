import java.util.Scanner;
public class NumberGuessGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int maxAttempts = 5;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Rules:");
        System.out.println("- You need to guess a number between 1 and 100.");
        System.out.println("- You have " + maxAttempts + " attempts to guess.");
        while (attempts < maxAttempts) {
            attempts++;
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number!");
                System.out.println("You've won a cash reward!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low. Try a higher number.");
            } else {
                System.out.println("Your guess is too high. Try a lower number.");
            }
            if (attempts < maxAttempts) {
                System.out.println("You have " + (maxAttempts - attempts) + " attempts left.");
            }
        }
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've used all your attempts.");
            System.out.println("The correct number was: " + randomNumber);
        }
        System.out.println("Thank you for playing the Number Guessing Game!");
        scanner.close();
    }
}
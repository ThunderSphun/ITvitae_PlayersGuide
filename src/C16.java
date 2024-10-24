import java.util.Scanner;

public class C16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numberToGuess = -1;

		while (numberToGuess < 0 || numberToGuess > 100) {
			System.out.print("enter a number between 0 and 100:");
			numberToGuess = input.nextInt();
		}

		for (int i = 0; i < 50; i++) {
			System.out.println();
		}

		System.out.println("Guess the number.");
		while (true) {
			System.out.print("What is your next guess?");
			int guess = input.nextInt();
			if (guess > numberToGuess) {
				System.out.printf("%d is too high.%n", guess);
			} else if (guess < numberToGuess) {
				System.out.printf("%d is too low.%n", guess);
			} else {
				System.out.println("You guessed the number!");
				break;
			}
		}
	}
}

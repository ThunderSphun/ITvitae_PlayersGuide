import java.util.Scanner;

public class C22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("\u001B[30m\u001B[41mPlayer 1:\u001B[0m how far away from the city do you want to station the Manticore? ");
		int distance = input.nextInt();
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}

		System.out.println("\u001B[30m\u001B[102mPlayer 2:\u001B[0m it is your turn.");

		int cityHealth = 15;
		int manticoreHealth = 10;
		int round = 1;

		while (cityHealth > 0 && manticoreHealth > 0) {
			System.out.println("\u001B[90m-----------------------------------------------------------\u001B[0m");
			System.out.printf("\u001B[35mSTATUS:\u001B[0m \u001B[34mRound: %d\u001B[0m \u001B[32mCity: %d/15\u001B[0m \u001B[31mManticore %d/10\u001B[0m%n", round, cityHealth, manticoreHealth);

			int possibleDamage;
			String damageColor = "\u001B[1m\u001B[4m";
			if (round % 5 == 0 && round % 3 == 0) {
				possibleDamage = 10;
				damageColor += "\u001B[94m";
			} else if (round % 5 == 0) {
				possibleDamage = 3;
				damageColor += "\u001B[93m";
			} else if (round % 3 == 0) {
				possibleDamage = 3;
				damageColor += "\u001B[91m";
			} else {
				possibleDamage = 1;
				damageColor += "\u001B[97m";
			}
			System.out.printf("The cannon is expected to deal %s%d\u001B[0m damage this round.%n", damageColor, possibleDamage);

			System.out.print("Enter desired cannon range: ");
			int shotDistance = input.nextInt();
			if (shotDistance == distance) {
				System.out.println("That round was a \u001B[4mDIRECT HIT\u001B[0m.");
				manticoreHealth -= possibleDamage;
			} else if (shotDistance > distance) {
				System.out.println("That round \u001B[4mOVERSHOT\u001B[0m the target.");
			} else {
				System.out.println("That round \u001B[4mFELL SHORT\u001B[0m of the target.");
			}
			round++;
			if (manticoreHealth > 0) {
				cityHealth--;
			}
		}

		if (cityHealth > 0) {
			System.out.println("\u001B[32m\u001B[1mThe Manticore has been destroyed! The city of Consolas has been saved!\u001B[0m");
		} else {
			System.out.println("\u001B[31m\u001B[1mThe Manticore has destroyed the city!\nYOU\nHAVE\nLOST\u001B[0m");
		}
	}
}

import java.util.Scanner;

public class C9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many eggs are found");
		int totalEggs = Integer.parseInt(input.next());

		int eggsPerSister = totalEggs / 4;
		int eggsForDuckBear = totalEggs % 4;

		System.out.printf("The sisters each get %d, and the DuckBear gets %d%n", eggsPerSister, eggsForDuckBear);
	}
}

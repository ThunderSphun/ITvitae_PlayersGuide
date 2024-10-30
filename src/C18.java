import java.util.Scanner;

public class C18 {
	public static void main(String[] args) {
		int[] initial = new int[5];

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < initial.length; i++) {
			System.out.print("Give a number: ");
			initial[i] = input.nextInt();
		}

		int[] copy = new int[initial.length];

		System.out.println("The numbers are getting copied now");
		for (int i = 0; i < initial.length; i++) {
			copy[i] = initial[i];
		}

		System.out.println("The numbers are now");
		for (int i = 0; i < initial.length; i++) {
			System.out.printf("%d, %d%n", initial[i], copy[i]);
		}
	}
}

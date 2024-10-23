import java.util.Scanner;

public class C12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number");
		int i = input.nextInt();

		System.out.println((i & 1) == 1 ? "Tock" : "Tick");
	}
}

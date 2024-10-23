import java.util.Scanner;

public class C10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("how many provinces are there? ");
		int province = input.nextInt();
		System.out.print("how many duchies are there? ");
		int duchy = input.nextInt();
		System.out.print("how many estates are there? ");
		int estate = input.nextInt();

		System.out.println("The worth of this kingdom is: " + (province * 6 + duchy * 3 + estate * 1));
	}
}

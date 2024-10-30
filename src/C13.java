import java.util.Scanner;

public class C13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("There is an enemy");
		System.out.print("What is its x?");
		int xPos = input.nextInt();
		System.out.print("What is its y?");
		int yPos = input.nextInt();

		if (xPos == 0 && yPos == 0) {
			System.out.println("The enemy is here!");
		} else if (xPos == 0) {
			System.out.println("The enemy is to the " + ((yPos > 0) ? "north" : "south") + '!');
		} else if (yPos == 0) {
			System.out.println("The enemy is to the " + ((xPos > 0) ? "east" : "west") + '!');
		} else {
			System.out.println("The enemy is to the " + ((yPos > 0) ? "north" : "south") + ((xPos > 0) ? "east" : "west") + '!');
		}
	}
}

import java.awt.Toolkit;
import java.util.Scanner;

public class C11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Target Row?");
		int rowIndex = input.nextInt();
		System.out.print("Target Column?");
		int columnIndex = input.nextInt();

		System.out.println("Deploy to:");
		System.out.printf("(%d, %d)%n", rowIndex, columnIndex - 1);
		System.out.printf("(%d, %d)%n", rowIndex - 1, columnIndex);
		System.out.printf("(%d, %d)%n", rowIndex, columnIndex + 1);
		System.out.printf("(%d, %d)%n", rowIndex + 1, columnIndex);

		Toolkit.getDefaultToolkit().beep();
	}
}

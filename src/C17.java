public class C17 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.printf("%d: ", i);

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("\u001B[34mElectric and Fire");
			} else if (i % 5 == 0) {
				System.out.print("\u001B[33mElectric");
			} else if (i % 3 == 0) {
				System.out.print("\u001B[31mFire");
			} else {
				System.out.print("Normal");
			}

			System.out.println("\u001B[0m");
		}
	}
}

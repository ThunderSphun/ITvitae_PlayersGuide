import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		List<Item> items = new ArrayList<>();
		items.add(new Item("Rope", 10));
		items.add(new Item("Torches", 15));
		items.add(new Item("Climbing Equipment", 25));
		items.add(new Item("Clean Water", 1));
		items.add(new Item("Machete", 20));
		items.add(new Item("Canoe", 200));
		items.add(new Item("Food Supplies", 1));

		System.out.print("What is your name?");
		String name = input.next();

		System.out.println("Hello " + name + ". The following items are available:\n");
		for (int i = 0; i < items.size(); i++) {
			System.out.printf("\t%d. %s%n", i + 1, items.get(i).name);
		}

		System.out.println();
		System.out.print("What number do you want to see the price of?");
		int selectedItem = input.nextInt() - 1;
		if (selectedItem >= 0 && selectedItem < items.size()) {
			System.out.printf("%s cost %d gold.%n", items.get(selectedItem).name, items.get(selectedItem).cost / (name.equals("Thunder") ? 2 : 1));
		} else {
			System.out.println("That is not a valid number");
		}
	}

	public record Item(String name, int cost) {
	}
}

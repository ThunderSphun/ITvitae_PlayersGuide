import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		List<Item> items = new ArrayList<>();
		items.add(new Item("Rope",				10));
		items.add(new Item("Torches",			15));
		items.add(new Item("Climbing Equipment",	25));
		items.add(new Item("Clean Water",		1));
		items.add(new Item("Machete",			20));
		items.add(new Item("Canoe",				200));
		items.add(new Item("Food Supplies",		1));

		System.out.println("The following items are available:\n");
		for (int i = 0; i < items.size(); i++) {
			System.out.printf("\t%d. %s%n", i + 1, items.get(i).name);
		}

		System.out.println();
		switch (askForNumberInRange("What number do you want to see the price of?", 0, 8)) {
			case 1: {
				var item = items.getFirst();
				System.out.printf("%s cost %d gold.%n", item.name, item.cost);
				break;
			}
			case 2: {
				var item = items.get(1);
				System.out.printf("%s cost %d gold.%n", item.name, item.cost);
				break;
			}
			case 3: {
				var item = items.get(2);
				System.out.printf("%s cost %d gold.%n", item.name, item.cost);
				break;
			}
			case 4: {
				var item = items.get(3);
				System.out.printf("%s cost %d gold.%n", item.name, item.cost);
				break;
			}
			case 5: {
				var item = items.get(4);
				System.out.printf("%s cost %d gold.%n", item.name, item.cost);
				break;
			}
			case 6: {
				var item = items.get(5);
				System.out.printf("%s cost %d gold.%n", item.name, item.cost);
				break;
			}
			case 7: {
				var item = items.get(6);
				System.out.printf("%s cost %d gold.%n", item.name, item.cost);
				break;
			}
			default: {
				System.out.println("That is not a valid number");
			}
		}
	}

	public record Item(String name, int cost) {
	}

	public static int askForNumber(String text) {
		Scanner input = new Scanner(System.in);

		System.out.println(text);
		return input.nextInt();
	}

	public static int askForNumberInRange(String text, int min, int max) {
		while (true) {
			int result = askForNumber(text);
			if (result > min && result < max) {
				return result;
			}
		}
	}
}

public class C21 {
	public static void main(String[] args) {
		loop(10, 1);
	}

	public static void loop(int i, int limit) {
		System.out.println(i);
		if (i > limit) {
			loop(i - 1, limit);
		}
	}
}

import java.util.ArrayList;

public class Runner {

	static int[] numberArray;
	static ArrayList<Integer> numberArray2 = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// addToArray(100);
		// for (int i : numberArray) {
		// System.out.println(i);
		// }

		addToArrayList(100, 999);

		// for (int i : numberArray2) {
		// System.out.println(i);
		// }

		timesByTen();
		System.out.println(numberArray2.size());
		for (int i : numberArray2) {
			System.out.println(i);
		}
	}

	private static int[] addToArray(int range) {

		numberArray = new int[range];
		for (int i = 0; i < range; i++) {
			numberArray[i] = (i + 1);
		}
		return numberArray;
	}

	private static void addToArrayList(int lower, int upper) {

		for (int i = lower; i <= upper; i++) {
			numberArray2.add(i);
		}
	}

	private static void timesByTen() {
		for (int i : numberArray2) {
			i = i * 10;
		}
	}

}

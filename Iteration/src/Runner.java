
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print1To100();
		// print100To999();
		// print1To10Words();
		print1To100Words();
	}

	private static void print1To100() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}

	private static void print100To999() {
		for (int i = 100; i < 1000; i++) {
			System.out.println(i);
		}
	}

	static String[] units = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	static String[] teens = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };
	static String[] tens = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	static String[] hundreds = { "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
			"six hundred", "seven hundred", "eight hundred", "nine hundred", "one thousand" };

	private static void print1To10Words() {
		for (int i = 1; i < units.length; i++) {
			System.out.println(units[i]);
		}
		System.out.println("ten");
	}

	private static void print11To19Words() {
		for (int k = 0; k < teens.length; k++) {
			System.out.println(teens[k]);
		}
	}

	private static void print1To100Words() {
		print1To10Words();
		print11To19Words();
		for (int i = 0; i < tens.length; i++) {
			for (int j = 0; j < units.length; j++) {
				if (units[j] == "zero")
					System.out.println(tens[i]);
				else
					System.out.println(tens[i] + " " + units[j]);
			}
		}
		System.out.println(hundreds[0]);
	}

	private static void print1To1000Words() {
		print1To100Words();
		for (int i = 0; i < hundreds.length; i++) {
			System.out.println(hundreds[i]);
		}
	}
}

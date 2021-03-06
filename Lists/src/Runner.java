import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	static List<Integer> numberList = new ArrayList<>();
	static List<String> stringList = new ArrayList<>();
	static List<Integer> multiplesList = new ArrayList<>();

	public static void main(String[] args) {
		fillIntList(10);
		/*
		 * System.out.println(searchIntList(11)); fillStringList();
		 * System.out.println(searchStringList("boo")); multiplyBy10(numberList);
		 * System.out.println(multiplesList);
		 * System.out.println(numberOfOccurences(stringList, "foo"));
		 * System.out.println(sumOfList(numberList));
		 * System.out.println(largestValue(numberList)); removeOddValues(numberList);
		 * System.out.println(numberList);
		 * 
		 * List<Integer> unorderedList = new ArrayList<>(); unorderedList.add(5);
		 * unorderedList.add(2); unorderedList.add(8); unorderedList.add(10);
		 * unorderedList.add(1); orderAList(unorderedList);
		 * System.out.println(unorderedList);
		 */

		System.out.println(numberList);

		System.out.println(sumOfListStream(numberList));
		System.out.println(largestValueStream(numberList));
		System.out.println(removeOddValuesStream(numberList));
		System.out.println(multiplesOf5Stream(numberList));
		System.out.println(numberList);
	}

	// list with numbers 0 -10
	private static void fillIntList(int range) {
		for (int i = 0; i < range; i++) {
			numberList.add(i + 1);
		}
	}

	// method that looks through list of numbers and check for a specific number
	private static boolean searchIntList(int value) {
		return numberList.contains(value);
	}

	// as above with strings
	private static void fillStringList() {
		stringList.add("foo");
		stringList.add("foo");
		stringList.add("foo");
		stringList.add("boo");

	}

	private static boolean searchStringList(String value) {
		return stringList.contains(value);
	}

	// method multiples each number divisible by 5 by 10 in a list of numbers
	private static List<Integer> multiplyBy10(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 5 == 0)
				multiplesList.add(list.get(i) * 10);
			else
				multiplesList.add(list.get(i));
		}
		return multiplesList;
	}

	private static List<Integer> multiplesOf5(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 5 == 0)
				list.set(i, (list.get(i) * 10));
		}
		return list;
	}

	private static List<Integer> multiplesOf5Stream(List<Integer> list) {
		return list.stream().map(i -> i *= i % 5 == 0 ? 10 : 1).collect(Collectors.toList());
	}

	// method checks for specific word in a list of strings and returns number of
	// times it occurs
	private static int numberOfOccurences(List<String> list, String word) {
		int count = 0;
		for (String i : list) {
			if (i == word)
				count++;
		}

		return count;
	}

	private static int numberOfOccurencesStream(List<String> list, String word) {
		return (int) list.stream().filter(s -> s.equals(word)).count();
	}

	// method that goes through list of numbers and sums the values
	private static int sumOfList(List<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		return sum;
	}

	private static int sumOfListStream(List<Integer> list) {
		return list.stream().reduce(0, Integer::sum);
	}

	// method that checks a list of numbers and returns the larges value
	private static int largestValue(List<Integer> list) {
		int largestValue = 0;
		for (int i : list) {
			if (i > largestValue)
				largestValue = i;
		}

		return largestValue;
	}

	private static int largestValueStream(List<Integer> list) {
		return list.stream().max(Integer::compare).orElse(0);
	}

	// method that removes all the odd values from a list of numbers
	private static List<Integer> removeOddValues(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 1)
				list.remove(i);
		}

		return list;
	}

	private static List<Integer> removeOddValuesStream(List<Integer> list) {
		return list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
	}

	// method that takes a list of numbers and sorts them in incremental order

	private static void orderAList(List<Integer> list) {
		Collections.sort(list);

	}

	private static List<Integer> orderAListStream(List<Integer> list) {
		return list.stream().sorted().collect(Collectors.toList());
	}

}

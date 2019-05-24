
public class Calculator {

	private int numberA;
	private int numberB;

	public Calculator(int numA, int numB) {
		this.numberA = numA;
		this.numberB = numB;
	}

	private int addTwoNumbers() {
		return numberA + numberB;
	}

	private int subtractTwoNumbers() {
		return numberA - numberB;
	}

	private int divideTwoNumbers() {
		return numberA / numberB;
	}

	private int multiplyTwoNumbers() {
		return numberA * numberB;
	}

	public int calculate(char operator) {

		switch (operator) {

		case '-':
			return subtractTwoNumbers();
		case '/':
			return divideTwoNumbers();
		case '*':
			return multiplyTwoNumbers();
		default:
			return addTwoNumbers();
		}

	}
}

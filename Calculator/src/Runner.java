import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int firstNumber = sc.nextInt();

		System.out.println("Enter another number:");
		int secondNumber = sc.nextInt();

		sc.close();

		Calculator calc = new Calculator(firstNumber, secondNumber);
		System.out.println(calc.calculate('+'));
		System.out.println(calc.calculate('-'));
		System.out.println(calc.calculate('/'));
		System.out.println(calc.calculate('*'));

	}

}

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void multiplyByZeroIntegerReturnsZero() {

		Calculator calc1 = new Calculator(0, 5);
		assertEquals("0 * 5 must be 0", 0, calc1.calculate('*'));

		Calculator calc2 = new Calculator(0, 0);
		assertEquals("0 * 0 must be 0", 0, calc2.calculate('*'));

		Calculator calc3 = new Calculator(10, 0);
		assertEquals("10 * 0 must be 0", 0, calc3.calculate('*'));

	}

	@Test
	public void multiplyByNegativeReturnsNegative() {

		Calculator calc1 = new Calculator(-1, 9);
		assertEquals("-1 * 9 must be -9", -9, calc1.calculate('*'));

		Calculator calc2 = new Calculator(8, -1);
		assertEquals("8 * -1 must be 0", -8, calc2.calculate('*'));
	}

	@Test
	public void calculateReturnsCorrectArithmetic() {

		Calculator calc = new Calculator(6, 2);

		assertEquals("6 + 2 must be 8", 8, calc.calculate('x'));
		assertEquals("6 - 2 must be 4", 4, calc.calculate('-'));
		assertEquals("6 / 2 must be 3", 3, calc.calculate('/'));
		assertEquals("6 * 2 must be 12", 12, calc.calculate('*'));
	}

}

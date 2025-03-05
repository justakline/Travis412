package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(1, 1), 0);
	}

	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(2, 3), 6);
	}

	@Test
	public void testMultiplyByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(0, 3), 0);
	}

	@Test
	public void testMultiplyByOne() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(1, 3), 1);
	}

	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(5, 2), 2);
	}

	@Test
	public void testDivideByLargerNumber() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(2,5), 0);
	}

	@Test(expected = NullPointerException.class)
	public void testDivideByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.divide(5, 0);
	}


}

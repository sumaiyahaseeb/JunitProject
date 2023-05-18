package junits;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import code.Calculator;

public class CalculatorTest {

	// @Disabled
	@DisplayName("two positive num test")
	@Test
	public void test1() {
		int result = Calculator.add(4, 5);
		Assertions.assertEquals(9, result);

	}

	@Tag("Sanity")
	@DisplayName("one positive one negative num test")
	@Test
	public void test2() {
		int result = Calculator.add(-4, 5);
		Assertions.assertEquals(1, result);

	}

	// @RepeatedTest(3)
	@DisplayName("two positive no test where result is not matching")
	@Test
	public void test3() {
		int result = Calculator.add(4, 5);
		Assertions.assertNotEquals(10, result);

	}

	@CustomAnnotation
	public void test4() {
		int result = Calculator.add(4, 5);
		Assertions.assertEquals(9, result);
		System.out.println("running the test as custom annotation");

	}

}

package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import code.StringFunctions;

public class StringFunctionsTest {
	@Tag("Sanity")
	@Test
	public void test1() {
		boolean result = StringFunctions.ispalindrome("sumaiya");
		Assertions.assertFalse(result);

	}

	@Tag("Regression")
	@Test
	public void test2() {
		boolean result = StringFunctions.ispalindrome("afeefa");
		Assertions.assertTrue(result);

	}

}

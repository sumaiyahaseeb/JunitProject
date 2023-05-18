package junits;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssetionsExample {

	@Test
	public void test1() {

		String s1 = "simplilearn";
		String s2 = "simplilearn";
		String s3 = "simplilearn1";
		String s4 = null;
		boolean flag = true;
		boolean flag1 = false;

		int i = 5;
		int j = 10;

		String[] expectedarray = { "1", "2", "3" };
		String[] resultarray = { "1", "2", "3" };

		ArrayList<String> list = new ArrayList<>();
		list.add("sumaiya");
		list.add("fathima");
		list.add("haseeb");
		list.add("ayaz");

		Assertions.assertEquals(s1, s2);
		Assertions.assertNotEquals(s1, s3);
		Assertions.assertNull(s4);
		Assertions.assertTrue(flag);
		Assertions.assertFalse(flag1);

		Assertions.assertTrue(i < j);
		Assertions.assertFalse(i > j);

		Assertions.assertArrayEquals(expectedarray, resultarray);
		Assertions.assertFalse(list.contains("nadeem"));
		Assertions.assertEquals(4, list.size());

	}

}

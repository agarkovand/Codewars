package algo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JosephusSurvivorTest {

	@Test
	public void oneNumberShouldReturnThisNumber() {
		josephusTest(1, 3, 1);
	}

	@Test
	public void threeNumbersArrayThirdNumberOut() {
		josephusTest(3, 3, 2);
	}

	@Test
	public void twoNumbersArraySecondNumberOut() {
		josephusTest(2, 2, 1);
	}

	@Test
	public void twoNumbersArrayFirstNumberOut() {
		josephusTest(2, 1, 2);
	}

	@Test
	public void test1() {
		josephusTest(7, 3, 4);
	}

	@Test
	public void test2() {
		josephusTest(11, 19, 10);
	}

	@Test
	public void test3() {
		josephusTest(40, 3, 28);
	}

	@Test
	public void test4() {
		josephusTest(14, 2, 13);
	}

	@Test
	public void test5() {
		josephusTest(100, 1, 100);
	}

	private void josephusTest(final int n, final int k, final int result) {
		String testDescription = String
				.format("Testing where n = %d and k = %d", n, k);
		assertEquals(testDescription, result,
				JosephusSurvivor.josephusSurvivor(n, k));
	}

}

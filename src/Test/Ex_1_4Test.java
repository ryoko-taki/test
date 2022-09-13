package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_1_4Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	Ex_1_4 ex14 = new Ex_1_4();
	@Test
	@DisplayName("0m -> エラー")
	void test0() {
		try {
			ex14.calcClothPrice(0);
			fail("期待値と結果が違います");
		} catch (IllegalArgumentException e) {
			assertEquals("長さは0.1m以上100.0m以下を入力してください", e.getMessage());
		}
	}
	
	@Test
	@DisplayName("0.1m -> 40円")
	void test0_1() {
		int resultPrice = ex14.calcClothPrice(0.1);
		assertEquals(40,Math.round(resultPrice));
	}
	
	@Test
	@DisplayName("1m -> 400円")
	void test1() {
		int resultPrice = ex14.calcClothPrice(1);
		assertEquals(400,Math.round(resultPrice));
	}
	
	@Test
	@DisplayName("2.9m -> 1160円")
	void test2_9() {
		int resultPrice = ex14.calcClothPrice(2.9);
		assertEquals(1160,Math.round(resultPrice));
	}
	
	@Test
	@DisplayName("3m -> 1200円")
	void test3() {
		int resultPrice = ex14.calcClothPrice(3);
		assertEquals(1200,Math.round(resultPrice));
	}
	
	@Test
	@DisplayName("3.1m -> 1085円")
	void test3_1() {
		int resultPrice = ex14.calcClothPrice(3.1);
		assertEquals(1085,Math.round(resultPrice));
	}
	
	@Test
	@DisplayName("99.9m -> 34965円")
	void test99_9() {
		int resultPrice = ex14.calcClothPrice(99.9);
		assertEquals(34965,Math.round(resultPrice));
	}
	
	@Test
	@DisplayName("100m -> 35000円")
	void test100() {
		int resultPrice = ex14.calcClothPrice(100);
		assertEquals(35000,Math.round(resultPrice));
	}
	
	@Test
	@DisplayName("100.1m -> エラー")
	void test100_1() {
		try {
			ex14.calcClothPrice(100.1);
			fail("期待値と結果が違います");
		} catch (IllegalArgumentException e) {
			assertEquals("長さは0.1m以上100.0m以下を入力してください", e.getMessage());
		}
	}

}

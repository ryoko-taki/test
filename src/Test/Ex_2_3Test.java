package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class Ex_2_3Test {

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

	Ex_2_3 ex23 = new Ex_2_3();
	@Test
	@DisplayName("7点購入 + ワイシャツ + ネクタイ")
	void test1() {
		assertEquals(12, ex23.suit(7, true, true));
	}
	
	@Test
	@DisplayName("7点購入 + ワイシャツ")
	void test2() {
		assertEquals(7, ex23.suit(7, true, false));
	}
	
	@Test
	@DisplayName("7点購入 + ネクタイ")
	void test3() {
		assertEquals(7, ex23.suit(7, false, true));
	}
	
	@Test
	@DisplayName("6点購入 + ワイシャツ + ネクタイ")
	void test4() {
		assertEquals(5, ex23.suit(6, true, true));
	}
	
	@Test
	@DisplayName("6点購入 + ワイシャツ")
	void test5() {
		assertEquals(0, ex23.suit(6, true, false));
	}
	
	@Test
	@DisplayName("6点購入 + ワイシャツ")
	void test6() {
		assertEquals(0, ex23.suit(6, false, true));
	}
	
	@Test
	@DisplayName("6点購入")
	void test7() {
		assertEquals(0, ex23.suit(6, false, false));
	}
	
	@Test
	@DisplayName("7点購入")
	void test8() {
		assertEquals(7, ex23.suit(7, false, false));
	}

}

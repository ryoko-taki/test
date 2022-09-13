package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_1_2Test {

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
	
	Ex_1_2 ex12 = new Ex_1_2();
	@Test
	@DisplayName("−1gでエラー")
	void test_1() {
		try {
			ex12.scale(-1);
			fail("期待値と結果が違います");
		} catch (IllegalArgumentException e) {
			assertEquals("EEEE", e.getMessage());
		}
	}
	
	@Test
	@DisplayName("0gで正常起動")
	void test0() {
		int resultWeight = ex12.scale(0);
		assertEquals(0,resultWeight);
	}
	
	@Test
	@DisplayName("1gで正常起動")
	void test1() {
		int resultWeight = ex12.scale(1);
		assertEquals(1,resultWeight);
	}
	
	@Test
	@DisplayName("1999gで正常起動")
	void test1999() {
		int resultWeight = ex12.scale(1999);
		assertEquals(1999,resultWeight);
	}
	
	@Test
	@DisplayName("2000gで正常起動")
	void test2000() {
		int resultWeight = ex12.scale(2000);
		assertEquals(2000,resultWeight);
	}
	
	@Test
	@DisplayName("2001gでエラー")
	void test2001() {
		try {
			ex12.scale(2001);
			fail("期待値と結果が違います");
		} catch (IllegalArgumentException e) {
			assertEquals("EEEE", e.getMessage());
		}
	}

}

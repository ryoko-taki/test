package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_1_3Test {

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
	Ex_1_3 ex13 = new Ex_1_3();
//	@Test
//	@DisplayName("入力値：−129")
//	void test_129() {
//		
//	}
	@Test
	@DisplayName("入力値：−128")
	void test_128() {
		try {
			ex13.convertTatamiNumToSquareMeter((byte) -128);
			fail("期待値と結果が違います");
		} catch (IllegalArgumentException e) {
			assertEquals("畳数は1以上を入力してください", e.getMessage());
		}
	}
	@Test
	@DisplayName("入力値：−127")
	//-127 * 1.65がコンピューター上の計算と合わない可能性がある
	void test_127() {
		try {
			ex13.convertTatamiNumToSquareMeter((byte) -127);
			fail("期待値と結果が違います");
		} catch (IllegalArgumentException e) {
			assertEquals("畳数は1以上を入力してください", e.getMessage());
		}
	}
	@Test
	@DisplayName("入力値：−1")
	void test_1() {
		try {
			ex13.convertTatamiNumToSquareMeter((byte) -1);
			fail("期待値と結果が違います");
		} catch (IllegalArgumentException e) {
			assertEquals("畳数は1以上を入力してください", e.getMessage());
		}
	}
	@Test
	@DisplayName("入力値：0")
	void test0() {
		try {
			ex13.convertTatamiNumToSquareMeter((byte) 0);
			fail("期待値と結果が違います");
		} catch (IllegalArgumentException e) {
			assertEquals("畳数は1以上を入力してください", e.getMessage());
		}
	}
	@Test
	@DisplayName("入力値：1")
	void test1() {
		double resultSquare = ex13.convertTatamiNumToSquareMeter((byte) 1);
		assertEquals(1.65, resultSquare);
	}
	
	@Test
	@DisplayName("入力値：7")
	void test7() {
		double resultSquare = ex13.convertTatamiNumToSquareMeter((byte) 7);
		assertEquals(11.55, Math.floor(resultSquare * 100) / 100);
	}

}

package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_2_2Test {

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

	Ex_2_2 ex22 = new Ex_2_2();
	Calendar cal = Calendar.getInstance();
	//特別会員ではない
	//手数料無料時間：12:00
	//手数料有料時間：21:00
	//平日：水曜日(4)
	@Test
	@DisplayName("平日 && 12:00")
	void test1() {
		int result = ex22.commission(true, "12:00", false);
		assertEquals(0,result);
	}
	@Test
	@DisplayName("土日 && 12:00")
	void test2() {
		int result = ex22.commission(false, "12:00", false);
		assertEquals(110,result);
	}
	@Test
	@DisplayName("平日 && 21:00")
	void test3() {
		int result = ex22.commission(true, "21:00", false);
		assertEquals(110,result);
	}
	@Test
	@DisplayName("土日 && 21:00")
	void test4() {
		int result = ex22.commission(false, "21:00", false);
		assertEquals(110,result);
	}

	//特別会員
	@Test
	@DisplayName("平日 && 12:00")
	void test5() {
		int result = ex22.commission(true, "12:00", true);
		assertEquals(0,result);
	}
	@Test
	@DisplayName("土日 && 12:00")
	void test6() {
		int result = ex22.commission(false, "12:00", true);
		assertEquals(0,result);
	}
	@Test
	@DisplayName("平日 && 21:00")
	void test7() {
		int result = ex22.commission(true, "21:00", true);
		assertEquals(0,result);
	}
	@Test
	@DisplayName("土日 && 21:00")
	void test8() {
		int result = ex22.commission(false, "21:00", true);
		assertEquals(0,result);
	}
}

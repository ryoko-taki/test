package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_1_8Test {

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

	Ex_1_8 ex18 = new Ex_1_8();
	@Test
	@DisplayName("1日")
	void testDay1() {
		int result = ex18.getDiscountRate1(1);
		assertEquals(20, result);
	}
	
	@Test
	@DisplayName("3日")
	void testDay3() {
		int result = ex18.getDiscountRate1(3);
		assertEquals(20, result);
	}
	
	@Test
	@DisplayName("5日")
	void testDay5() {
		int result = ex18.getDiscountRate1(5);
		assertEquals(20, result);
	}
	
	@Test
	@DisplayName("28日")
	void testDay28() {
		int result = ex18.getDiscountRate1(28);
		assertEquals(20, result);
	}
	
	@Test
	@DisplayName("29日")
	void testDay29() {
		int result = ex18.getDiscountRate1(29);
		assertEquals(20, result);
	}
	
	@Test
	@DisplayName("30日")
	void testDay30() {
		int result = ex18.getDiscountRate1(30);
		assertEquals(20, result);
	}

	@Test
	@DisplayName("15日")
	void testDay15() {
		int result = ex18.getDiscountRate1(15);
		assertEquals(0, result);
	}
	
	@Test
	@DisplayName("31日")
	void testDay31() {
		int result = ex18.getDiscountRate1(31);
		assertEquals(0, result);
	}
}

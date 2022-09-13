package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_2_1Test {

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

	Ex_2_1 ex21 = new Ex_2_1();
	//ハッピーアワー代表値　=>　17:00
	//通常代表値　=>　19:00
	@Test
	@DisplayName("H＆C：1杯目")
	void test1() {
		assertEquals(100,ex21.beerPrice(true,1,17,00));
	}
	
	@Test
	@DisplayName("H：1杯目")
	void test2() {
		assertEquals(290,ex21.beerPrice(false,1,17,00));
	}
	
	@Test
	@DisplayName("C：1杯目")
	void test3() {
		assertEquals(100,ex21.beerPrice(true,1,19,00));
	}
	
	@Test
	@DisplayName("1杯目")
	void test4() {
		assertEquals(490,ex21.beerPrice(false,1,19,00));
	}
	
	@Test
	@DisplayName("H：3杯目")
	void test5() {
		assertEquals(290,ex21.beerPrice(false,3,17,00));
	}
	
	@Test
	@DisplayName("3杯目")
	void test6() {
		assertEquals(490,ex21.beerPrice(false,3,19,00));
	}
	
	@Test
	@DisplayName("H&C：3杯目")
	void test13() {
		assertEquals(290,ex21.beerPrice(true,3,17,00));
	}
	
	@Test
	@DisplayName("C：3杯目")
	void test14() {
		assertEquals(490,ex21.beerPrice(true,3,19,00));
	}
	
	//境界値テスト(2杯目)
//	@Test
//	@DisplayName("15:59")
//	void test7() {
//		assertEquals(490,ex21.beerPrice(15,59));
//	}
//	
//	@Test
//	@DisplayName("16:00")
//	void test8() {
//		assertEquals(290,ex21.beerPrice(16,00));
//	}
//	
//	@Test
//	@DisplayName("17:00")
//	void test9() {
//		assertEquals(290,ex21.beerPrice(17,00));
//	}
//	
//	@Test
//	@DisplayName("15:59")
//	void test10() {
//		assertEquals(490,ex21.beerPrice(15,59));
//	}
//	
//	@Test
//	@DisplayName("17:59")
//	void test11() {
//		assertEquals(290,ex21.beerPrice(17,59));
//	}
//	
//	@Test
//	@DisplayName("18:00")
//	void test12() {
//		assertEquals(490,ex21.beerPrice(18,00));
//	}
	

}

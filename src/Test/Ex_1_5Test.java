package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_1_5Test {

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

	Ex_1_5 ex15 = new Ex_1_5();
	@Test
	@DisplayName("0歳")
	void test0() {
		int resultPrice = ex15.entranceFee(0);
		assertEquals(0,resultPrice);
	}
	
	@Test
	@DisplayName("5歳")
	void test5() {
		int resultPrice = ex15.entranceFee(5);
		assertEquals(0,resultPrice);
	}
	
	@Test
	@DisplayName("6歳")
	void test6() {
		int resultPrice = ex15.entranceFee(6);
		assertEquals(500,resultPrice);
	}
		
	@Test
	@DisplayName("7歳")
	void tes7() {
		int resultPrice = ex15.entranceFee(7);
		assertEquals(500,resultPrice);
	}
	
	@Test
	@DisplayName("12歳")
	void tes12() {
		int resultPrice = ex15.entranceFee(12);
		assertEquals(500,resultPrice);
	}
	
	@Test
	@DisplayName("13歳")
	void test13() {
		int resultPrice = ex15.entranceFee(13);
		assertEquals(1000,resultPrice);
	}
	
	@Test
	@DisplayName("17歳")
	void test17() {
		int resultPrice = ex15.entranceFee(17);
		assertEquals(1000,resultPrice);
	}
	
	@Test
	@DisplayName("18歳")
	void test18() {
		int resultPrice = ex15.entranceFee(18);
		assertEquals(1500,resultPrice);
	}
	
	@Test
	@DisplayName("19歳")
	void test19() {
		int resultPrice = ex15.entranceFee(19);
		assertEquals(1500,resultPrice);
	}
	
	@Test
	@DisplayName("119歳")
	void test119() {
		int resultPrice = ex15.entranceFee(119);
		assertEquals(1500,resultPrice);
	}
	
	@Test
	@DisplayName("120歳")
	void test120() {
		int resultPrice = ex15.entranceFee(120);
		assertEquals(1500,resultPrice);
	}
	
	@Test
	@DisplayName("121歳")
	void test() {
		try {
			ex15.entranceFee(0);
		}catch(IllegalArgumentException e){
			assertEquals("年齢は0歳以上120歳以下を入力してください",e.getMessage());
		}
	}
}

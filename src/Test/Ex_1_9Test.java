package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_1_9Test {

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
	
	
	Ex_1_9 ex19 = new Ex_1_9();
	@Test
	@DisplayName("3日")
	void testDay3() {
		int result = ex19.getDiscountRate2(3);
		assertEquals(20, result);
	}
	
	@Test
	@DisplayName("29日")
	void testDay29() {
		int result = ex19.getDiscountRate2(29);
		assertEquals(20, result);
	}
	
	@Test
	@DisplayName("15日")
	void testDay15() {
		int result = ex19.getDiscountRate2(29);
		assertEquals(20, result);
	}

}

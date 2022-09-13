package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_1_1Test {

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
	
	Ex_1_1 ex11 = new Ex_1_1();
	@Test
	@DisplayName("気温23.9度")
	void test23_9() {
		String result = ex11.checkTemperature(23.9);
		assertEquals("寒い",result);
	}
	
	@Test
	@DisplayName("気温24.0度")
	void test24_0() {
		String result = ex11.checkTemperature(24.0);
		assertEquals("快適",result);
	}
	
	@Test
	@DisplayName("気温24.1度")
	void test24_1() {
		String result = ex11.checkTemperature(24.1);
		assertEquals("快適",result);
	}
	
	@Test
	@DisplayName("気温25.9度")
	void test25_9() {
		String result = ex11.checkTemperature(25.9);
		assertEquals("快適",result);
	}
	
	@Test
	@DisplayName("気温26.0度")
	void test26_0() {
		String result = ex11.checkTemperature(26.0);
		assertEquals("暑い",result);
	}
	
	@Test
	@DisplayName("気温26.1度")
	void test26_1() {
		String result = ex11.checkTemperature(26.1);
		assertEquals("暑い",result);
	}
	
	@Test
	@DisplayName("気温0度")
	void test0() {
		String result = ex11.checkTemperature(0);
		assertEquals("寒い",result);
	}
	
	@Test
	@DisplayName("気温-1.0度")
	void test_1() {
		String result = ex11.checkTemperature(-1.0);
		assertEquals("寒い",result);
	}
}

package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_1_7Test {

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

	Ex_1_7 ex17 = new Ex_1_7();
	Weapon weapon = new Weapon();
	@Test
	@DisplayName("きこりの大斧 -> 強化できない")
	void testKikori() {
		weapon.setName("きこりの大斧");
		weapon.setCanEnhance(false);
		String result = ex17.enhance(weapon);
		assertEquals("武器の強化に失敗しました",result);
	}
	
	@Test
	@DisplayName("龍の槍 -> 強化済み(失敗)")
	void testRyu() {
		weapon.setName("龍の槍");
		weapon.setAttackPoint(60);
		weapon.setEnhanced(false);
		weapon.setCanEnhance(true);
		String result = ex17.enhance(weapon);
		assertEquals("これ以上この武器の強化はできません",result);
	}
	
	@Test
	@DisplayName("草薙の剣 -> 強化成功(攻撃力+10)")
	void testKusanagi() {
		weapon.setName("草薙の剣");
		weapon.setAttackPoint(90);
		weapon.setEnhanced(true);
		weapon.setCanEnhance(false);
		String result = ex17.enhance(weapon);
		assertEquals("武器の攻撃力が上がりました",result);
	}

}

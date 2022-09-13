package Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ex_1_6Test {

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

	Ex_1_6 ex16 = new Ex_1_6();
	Weapon weapon = new Weapon();
	@Test
	@DisplayName("龍の槍")
	void testRyu() throws Exception{
		weapon.setName("龍の槍");
		weapon.setType("両手持ち");
		IllegalArgumentException e =
		assertThrows(IllegalArgumentException.class, () -> ex16.equip(weapon));
		assertTrue(e.getMessage().contains("装備できません"));
	}
	
	@Test
	@DisplayName("草薙の剣")
	void testKusanagi() {
		weapon.setName("草薙の剣");
		weapon.setType("片手持ち");
		ex16.equip(weapon);
		assertEquals("草薙の剣",ex16.setWeapon.getName());
	}
}

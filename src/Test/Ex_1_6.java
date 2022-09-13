package Test;

public class Ex_1_6 {
	Weapon setWeapon;
	public void equip(Weapon weapon) {
		//入力値：武器(武器オブジェクト)
		//戻り値：なし
		if("片手持ち".equals(weapon.getType())) {
			setWeapon = weapon;
		}else {
			throw new IllegalArgumentException("装備できません");
		}
	}
}

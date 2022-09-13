package Test;

public class Ex_1_7 {
	Weapon weapon;
	public String enhance(Weapon weapon) {
		if(weapon.canEnhance || weapon.isEnhanced) {
			if(weapon.name.equals("けやきのぼう") && weapon.attackPoint == 15) {
				return "これ以上この武器の強化はできません";
			}else if(weapon.name.equals("ニンジンの短剣") && weapon.attackPoint == 30) {
				return "これ以上この武器の強化はできません";
			}else if(weapon.name.equals("きこりの大斧") && weapon.attackPoint == 35) {
				return "これ以上この武器の強化はできません";
			}else if(weapon.name.equals("龍の槍") && weapon.attackPoint == 60) {
				return "これ以上この武器の強化はできません";
			}else if(weapon.name.equals("草薙の剣") && weapon.attackPoint == 100) {
				return "これ以上この武器の強化はできません";
			}else {
				weapon.attackPoint = weapon.getAttackPoint() + 10;
				return "武器の攻撃力が上がりました";
			}
		}
		return "武器の強化に失敗しました";
	}
	
	public String enhance2(Weapon weapon) {
		if(weapon.canEnhance) {
			weapon.attackPoint += 10;
			return "武器の攻撃力が上がりました";
		}else {
			return "武器の強化に失敗しました";
		}
		
	}
}

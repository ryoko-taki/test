package Test;

public class Weapon {
	String name;
	String type;
	int attackPoint;
	boolean canEnhance;
	boolean isEnhanced;
	
	public int getAttackPoint() {
		return attackPoint;
	}
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	public boolean isCanEnhance() {
		return canEnhance;
	}
	public void setCanEnhance(boolean canEnhance) {
		this.canEnhance = canEnhance;
	}
	public boolean isEnhanced() {
		return isEnhanced;
	}
	public void setEnhanced(boolean isEnhanced) {
		this.isEnhanced = isEnhanced;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}

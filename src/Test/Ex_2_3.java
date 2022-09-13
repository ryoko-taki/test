package Test;

public class Ex_2_3 {
	public int suit(int itemQuantity, boolean shirt, boolean tie) {	
		if(itemQuantity >= 7) {
			if(shirt && tie) {
				return 12;
			}
			return 7;
		}else if(shirt && tie){
			return 5;
		}
		return 0;
	}
}

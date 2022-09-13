package Test;

public class Ex_1_2 {
	public int scale(int weight) {
		//入力値：材料の重さ
		//戻り値：材料の重さ
		if(weight < 0 && weight > 2000) {
			throw new IllegalArgumentException("EEEE");
		}else if(weight >= 0 && weight <= 2000) {
			return weight;
		}else{
			throw new IllegalArgumentException("EEEE");
		}
	}
}

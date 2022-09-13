package Test;

public class Ex_1_5 {
	public int entranceFee(int age) {
		//入力値：年齢
		//戻り値：入園料
		if(0 <= age && age < 6) {
			return 0;
		}else if(6 <= age && age < 13) {
			return 500;
		}else if(13 <= age && age < 18) {
			return 1000;
		}else if(18 <= age && age <= 120) {
			return 1500;
		}else {
			throw new IllegalArgumentException("年齢は0歳以上120歳以下を入力してください");
		}
	}
}

package Test;

public class Ex_1_4 {
	public int calcClothPrice(double clothLength) {
		//入力値：生地の長さ(m)
		//戻り値：生地の価格(円)
		if(clothLength >= 0.1 && clothLength <= 3) {
			return (int) (clothLength * 400);
		}else if(clothLength > 3 && clothLength <= 100) {
			return (int) (clothLength * 350);
		}else {
			throw new IllegalArgumentException("長さは0.1m以上100.0m以下を入力してください");
		}
	}
}

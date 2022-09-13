package Test;

public class Ex_1_1 {
	public String checkTemperature(double temperature) {
		//入力値：室温   
		//戻り値：表示メッセージ
		if(temperature < 24) {
			return "寒い";
		}else if(temperature >= 24 && temperature < 26) {
			return "快適";
		}else {
			return "暑い";
		}
	}
}

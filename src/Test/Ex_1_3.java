package Test;

public class Ex_1_3 {
	public double convertTatamiNumToSquareMeter(byte tatamiNum) {
		//入力値：畳数
	    //戻り値：面積(平方メートル)
		if(tatamiNum <= 0 && tatamiNum >= -128) {
			throw new IllegalArgumentException("畳数は1以上を入力してください");
		}else {
			return tatamiNum * 1.65;
		}
	}

}

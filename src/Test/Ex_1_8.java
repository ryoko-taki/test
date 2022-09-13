package Test;

public class Ex_1_8 {
	//1日～5日、28日～30日は20%割引
	//それ以外の日は割引なし
//	public class DiscountPolicy {
		public int getDiscountRate1(int day) {
			  if (day >= 1 && day <= 5) {
				  return 20;
		      } else if (day >= 28 && day <= 30) {
		       return 20;
		      } else {
		        return 0;
		      }
		}
//	 }
}

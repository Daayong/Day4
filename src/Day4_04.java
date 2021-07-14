
public class Day4_04 {
	public static void main(String [] args) {
		System.out.println("===Test4 Start===");

		//이중 fpr - for문 안의 for
		
		for(int dan=2; dan<10; dan++) {
			 System.out.println(dan+"단");
		
			 for(int num=1; num<10; num++) {
				 System.out.println(dan+"*"+num+"="+dan*num);
			 }
		
			 System.out.println("===================");
		}
		
		System.out.println("===Test4 Finish===");
	}
}

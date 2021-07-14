import java.util.Scanner;

public class Day4_06 {
	public static void main(String [] args) {
		System.out.println("===Test6 Start===");
		
		//FPS
		//탄창 3개
		//한 탄창에 30발
		//단발모드 1발, 점사모드 3발
		//1.단발? 점사?
		//1-탕 (30번)
		//2- 타타탕 (10번)
		
		Scanner sc = new Scanner(System.in);
	
		/*
		for(int tan=0; tan<3; tan++) {
			System.out.println("1.단발 모드/ 2.점사 모드");
			int pick=sc.nextInt();
			if(pick==1) {
				for(int i=0; i<30; i++) {
					System.out.println("탕");
				}
			}else {
				for(int i=0; i<10; i++) {
					System.out.println("타타탕");
				}
			}
		}//가장큰 for문
		*/

		for(int tan=0; tan<3; tan++) {
			System.out.println("1.단발 모드/ 2.점사 모드");
			int pick=sc.nextInt();
			String sound ="탕";
			int count = 30;
			if(pick !=1) {
				sound="타타탕";
				count=10;
			}
					
			for(int i=0; i<count; i++) {
				System.out.println(sound);
			}
			
			
		}//가장큰 for문
		
		
		
		System.out.println("===Test6 Finish===");
	}
	
}

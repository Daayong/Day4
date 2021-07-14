import java.util.Scanner;

public class Day4_05 {
	public static void main(String[] args) {
		System.out.println("===Test5 Start===");
		//분 초 출력
		//0분 0초 
		//0분 1초
		//0분 2초
		//.......
		//0분 59초
		//1분 0초
		//1분 1초
		//...
		//59분 59초
		//분,초를 입력하고. 내가 입력한 분 초 에 맞춰 멈추기
		
		Scanner sc = new Scanner(System.in);
		int min=0; int sec=0;
		
		System.out.println("분을 입력하세요");
		int boon=sc.nextInt();
		System.out.println("초를 입력하세요");
		int cho=sc.nextInt();
		boolean flag=false;
		
		for(min=0; min<60; min++) {
			for(sec=0; sec<60; sec++) {
				System.out.println(min+"분"+sec+"초");
				if(boon==min && cho==sec) {
					System.out.println("종료");
					flag=true;
					break; 
				}
			}
			if(flag) {
				break;
			}
			System.out.println("=============");
		}
		
		
		
		System.out.println("===Test5 Finish===");
	}
}

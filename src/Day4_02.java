import java.util.Scanner;

public class Day4_02 {
	public static void main(String[] args) {
		
		System.out.println("===Test2 Starrt===");
		Scanner sc = new Scanner(System.in);
		//과목 수 입력
		System.out.println("과목수를 입력하세요");
		int sub=sc.nextInt();
		
		//과목 수 만큼 점수 입력
		int total = 0;
		
		for(int i=1; i<=sub; i++ ) {	
			System.out.println(i+"번째 점수를 입력하세요");
			int score = sc.nextInt();
			total = total+score;
		}
		
		//총점 ,평균 계산 후 출력
		
		System.out.println("총점 : "+total);
		
		double avg = total/(double)sub;
		
		System.out.println("평균 : "+avg);
		
		
		
		
		System.out.println("===Test2 Finish===");
	}
}

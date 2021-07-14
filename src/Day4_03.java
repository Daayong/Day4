import java.util.Scanner;

public class Day4_03 {
	public static void main(String [] args) {
		System.out.println("===Test3 Start===");
		//회원가입시 입력한 ID
		int id = 1234;
		//회원가입시 입력한 PW
		int pw = 5678;
		
		//최대 5번 기회
		//1.최대 5번 로그인 시도
		
		Scanner sc=new Scanner(System.in);

		/*
		for(int i=0; i<5; i++) {
			
			System.out.println("ID를 입력하세요");
			int id2 = sc.nextInt();
			System.out.println("PW를 입력하세요");
			int pw2 = sc.nextInt();
			
			if(id==id2 && pw==pw2) {
				System.out.println("로그인 성공입니다.");
				break;
			}
			System.out.println(i+1+"번째 로그인 실패입니다");	
		}//for문의 끝
		*/
		
			boolean flag = false;
		
		for(int i=0; i<5; i++) {
			
			System.out.println("ID를 입력하세요");
			int id2 = sc.nextInt();
			System.out.println("PW를 입력하세요");
			int pw2 = sc.nextInt();
			
			if(id==id2 && pw==pw2) {
				flag=!flag;
				break;
			}
			System.out.println(i+1+"번째 로그인 실패입니다");	
		}//for문의 끝
		
		//for 종료 조건 로그인 성공과 5번 모두 실패
	
		if(flag) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패 은행에 방문");
		}
		
		
		System.out.println("===Test3 Finish===");
	}
}

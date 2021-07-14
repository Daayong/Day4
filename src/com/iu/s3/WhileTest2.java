package com.iu.s3;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		System.out.println("===WhileTest2 Start===");
		
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw=5678;
		
		boolean check = true;
		
		while(check) {
			System.out.println("1.로그인 / 2. 종료");
			int pick=sc.nextInt();
			
			if(pick==1) {
				System.out.println("ID를 입력하세요");
				int yId=sc.nextInt();
				System.out.println("PW를 입력하세요");
				int yPw=sc.nextInt();
			
				if(id==yId && pw==yPw ) {
					System.out.println("로그인 성공!");
				}
				
			}else {
				check=!check;
			}
		}//while문 종료
		
		//1.로그인
		// - id, pw 입력
		// - 로그인 판단
		//틀렸으면 다시 초기화면
		//2.종료
		
		System.out.println("===WhileTest2 Finish===");
	}
	
}

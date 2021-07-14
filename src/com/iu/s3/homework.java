package com.iu.s3;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
	
		//while test2 에 추가하기
		//로그인이 성공했으면 게임을 시작
		//로그인 판단 유무 끝난 후에 게임 코딩 시작
		//rpg게임 
		//최초 레벨은 1, 만랩 15
		//최초 gold 0
		//레벨 5를 달성시 1000gold 지급
		//레벨 10을 달성시 2000gold 지급
		//레벨 15를 달성시 3000gold 지급
		//모든 몬스터의 경험치는 동일
		//1레벨에서 2 : 3마리 잡아야됨
		//한마리 잡을때마다 몬스터 1마리 사냥 출력
		//몬스터 2마리 사냥
		//몬스터 3마리 사냥 
		//레벨업
		//2 -> 3 : 6마리
		//3-> 4 : 9마리
		//4->5 : 12마리
		//5->6 : 15마리
		//...
		//14 ->15 : 42마리
		//최종 레벨 출력
		//최종 Gold 출력
		
		Scanner sc = new Scanner(System.in);
		//아이디 선언
		int id = 1234;
		//비밀번호 선언
		int pw = 5678;
		//로그인 성공 유무 선언
		boolean login = true;
		//로그인,종료 선택 선언
		int pick = 0;
		//로그인 확인 변수 선언
		boolean flag = true;
		
		//로그인 작업
		while(login) {
			System.out.println("1.로그인 / 2.종료");
			pick=sc.nextInt();
			if(pick==1) {
				System.out.println("ID를 입력하세요");
				int yId = sc.nextInt();
				System.out.println("PW를 입력하세요");
				int yPw = sc.nextInt();
					//아이디,패스워드 확인
					if(yId==id && yPw==pw) {
						System.out.println("로그인 성공! 게임 시작");
						flag=!flag;
						login=!login;
					}else {
						System.out.println("로그인 실패!");
					}
			}else{
				System.out.println("로그인 종료");
				login=!login;
			}
		}//while 종료,로그인 작업 완료
		
		
		//게임 시작
		//보유 골드 선언
		int gold=0;
		int lev=1;
		
		
		if(!flag) {
			System.out.println("====GAME START====");
		
			//레벨 작업
			for(lev=1; lev<15; lev++) {
				
				
				System.out.println(lev+"레벨 시작!");
				
				//몬스터 사냥
				boolean hunt=true;
				while(hunt) {
					int mon=3*lev;
					for(int i=1; i<=mon; i++){
						System.out.println("몬스터 "+i+"마리 사냥");
					}//for문 종료
					hunt=!hunt;
				}//while문 종료
				
				//레벨업 축하
				if(lev != 15) {
				System.out.println(lev+1+"레벨로 레벨업!");
				}
				//골드 보상
				if((lev+1)%5==0) {
					gold=gold+1000;
					System.out.println("보상!"+gold+"골드 획득");
				}
				if(lev !=14) {
				System.out.println("==============");
				}
			}
			
			System.out.println("===GAME FINISH===");
			System.out.println("최종 "+lev+" 레벨 달성!");
			System.out.println("최종 획득 Gold : " +gold );
		}//if문 종료
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
}

package Day06;

import java.util.Scanner;

public class Day06_3 {
	public static void main(String[] args) {
		
		// 회원제 방문록 [ 클래스 버전]
		
			// 0. 회원 설계 => 회원 클래스 만들기
				// 1. 필드
					// 1. 아이디 2.비밀번호 3.이름 4.전화번호
			// 1. 초기메뉴 [ 1. 회원가입	2.로그인 3.아이디찾기 4.비밀번호찾기]
				// 1. 회원가입시 입력받아 저장
				// 2. 로그인시 아이디와 비밀번호가 동일하면 로그인 처리
				// 3. 아이디찾기는 이름과 전화번로가 동일하면 아이디 출력
				// 4. 아이디와 전화번호가 동일하면 비빈번호 호출
		
		//자바에서 메모리를 사용하는 방법
		// 1. 변수 : 메모리 1개 할당
				//int 변수명 = 값
		// 2.배열 : 선안한 길이만큼 할당 
				//int[] 베열명 = new int[100];
		// 3.객체 : 개ㄱ체 내 먿,ㄴ 필드만큼 메모리 할당
				//클래스 기반으로 메모리 할당
				//클래스 
					//서로다른 메모리 설계
					//지려향(크기)가 달라도 됨
		//
		Scanner scanner = new Scanner(System.in);
		Member[] memberList = new Member[100];
		
		
		while(true) { // 프로그램 실행 무한루프 [ 종료조건 5번 ]
			System.out.println("----------------회원제 방문록-----------------");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호 찾기5.종료");
			System.out.println("------------------------------------------");
			int work1 = scanner.nextInt();
			
			
			if(work1 == 1) {//if_1_1 s

				// 1, id, password, name, phone 입력받기 => 변수4개
				System.out.println("------------회원가입-------------");
				System.out.println("사용할 아이디  입력 :");
				String id2 = scanner.next();
				System.out.println("사용할 비밀번호 입력 :");
				String pw2 = scanner.next();
				System.out.println("이름 입력 : ");
				String name2 = scanner.next();
				System.out.println("전화번호 입력(\"-\" 포함) : ");
				String phone2 = scanner.next();
				boolean idCheck = true;
				
				// 2. 객체 생성
				Member member = new Member();
				// 3. 입력받은 변수 4개를 객체내 필드에 저장
				member.id = id2;
				member.password = pw2;
				member.name = name2;
				member.phone = phone2;
				
				//중복확인
				/*
				for(Member temp :memberList) {
					if(temp != null && id2.equals(memberList[temp])) {
						System.err.println("알림)) 이미 존재하는 회원입니다.");
						idCheck = false;
					}
				}
				*/
				
				// 4. 여러개 객체를 저장하는 배열에 저장
					// 1. 공백 인덱스 찾기 [ 공백이 아니면 기존 회원 존재]
				int i = 0; // 인데스 위치 변수
				for(Member temp :memberList){
					// * memberlsit 배열내 member 객체 하나씩 꺼내와서 temp 저장 반복
					// 2. 공백에 인덱스에 객체 저장
					if(idCheck == true && temp == null) { // 만약에 해당 객체가 공백이면
						memberList[i] = member;
						System.err.println("알림)) 회원가입이 완료되었습니다.");
						break;
					}
					i++;
				}
				
			}//if_1_1 e
			else if(work1 == 2) {//if_1_2 s
				
				System.out.println("------------ 로그인 -------------");
				System.out.println("아이디  입력 :");
				String id2 = scanner.next();
				System.out.println("비밀번호 입력 :");
				String pw2 = scanner.next();
				
				boolean loginCheck = false;
				
				
			}//if_1_2 e
			else if(work1 == 3) {//if_1_3 s
				
			}//if_1_3 e
			else if(work1 == 4) {//if_1_4 s
				
			}//if_1_4 e
			else if(work1 == 5) {//if_1_5 s
				System.err.println("프로그램을 종료합니다");
				break;
			}//if_1_5 e
			else {//if_1 e
				System.out.println("------------------------------------------");
				System.err.println("알림)) 존재하지 않는 메뉴 입니다.");
				System.out.println("------------------------------------------");
			}//if_1 e
		}//w e
	}//m e
}//c e

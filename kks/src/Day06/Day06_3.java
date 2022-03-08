package Day06;

import java.util.Random;
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
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호 찾기 5.종료");
			System.out.println("------------------------------------------");
			int work1 = scanner.nextInt();
			
			
			if(work1 == 1) {//if_1_1 s [ 회원가입 ]

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
				
				// * 아이디 중복체크
					// 1. 배열내 객체중 입력한 아이디와 동일한 아이디 찾기
				
				for(Member temp :memberList) {
					if(temp != null && temp.id.equals(id2)) {
						System.err.println("알림)) 이미 사용중인 아이디 입니다.");
						idCheck = false;
					}
				}
				 
				// 4. 여러개 객체를 저장하는 배열에 저장
					// 1. 공백 인덱스 찾기 [ 공백이 아니면 기존 회원 존재]
				int i = 0; // 인데스 위치 변수
				for(Member temp :memberList){
					// * memberlsit 배열내 member 객체 하나씩 꺼내와서 temp 저장 반복
					// 2. 공백에 인덱스에 객체 저장
					if(idCheck == true && temp == null) { // 만약에 해당 객체가 공백이면
						memberList[i] = member;
						System.err.println("알림)) 회원가입이 완료되었습니다.");
						idCheck = true;
						break;
					}
					i++;
				}
				
			}//if_1_1 e [ 회원가입 ]
			else if(work1 == 2) {//if_1_2 s [ 로그인 ]
				
				// 1. 입력을 받는다
				System.out.println("------------ 로그인 -------------");
				System.out.println("아이디  입력 :");
				String loginId2 = scanner.next();
				System.out.println("비밀번호 입력 :");
				String loginPw2 = scanner.next();
				byte loginCheck = 0;
				
				// 2. 기존배열 [회원리스트] 내 입력받은 값과 비교
				int i = 0;
				for(Member temp : memberList) {
					if(temp != null && temp.id.equals(loginId2) && temp.password.equals(loginPw2)) {
						System.err.println("알림)) 로그인이 완료 되었습니다.");
						loginCheck = 1;
						break;
					}
					i++;
				}
				int j = 0;
				for(Member temp : memberList) {
					if(temp != null && temp.id.equals(loginId2)) {
						loginCheck = 2;
						break;
					}
					j++;
				}
				int h = 0;
				for(Member temp : memberList) {
					if(temp != null && temp.password.equals(loginPw2)) {
						loginCheck = 3;
						break;
					}
					h++;
				}
				
				// 3. 로그인 성공 유무
				if(loginCheck == 0) {
					System.out.println();
					System.err.println("알림)) 존재하지 않은 회원입니다.");
				}
				else if(loginCheck == 2) {
					System.out.println();
					System.err.println("알림)) 비밀번호가 틀렸습니다.");
				}
				else if(loginCheck == 3) {
					System.out.println();
					System.err.println("알림)) 아이디가가 틀렸습니다.");
				}
				else if(loginCheck == 1) { // 방문록 시작
					
					while(true) {
						System.out.println("----------------회원제 방문록-----------------");
						
						
						System.out.println("------------------ 메뉴 --------------------");
						System.out.println(" [1.방문록작성][2.방문록수정][3.방문록삭제][4.로그아웃]");
						System.out.println("------------------------------------------");
						
						int work2 = scanner.nextInt();
						
						if (work2 == 1) {//방문록 작성
							
							
							
						}//방문록 작성
						else if (work2 == 2) {//방문록 수정
							
							
							
						}// 방문록 수정
						else if (work2 == 3) { // 방문록 삭제
							
							
							
						}// 방문록 삭제
						else if (work2 == 4) { //로그아웃
							System.out.println("알림)) 로그아웃 하셨습니다. 메인메뉴로 돌아갑니다.");
							loginCheck = 0;
							break;
						}//로그아웃
					}
				}// 방문록 끝
				
			}//if_1_2 e [ 로그인 ]
			else if(work1 == 3) {//if_1_3 s [ 아이디 찾기 ]
				
				// 1. 이름과 연락처를 입력받는다.
				System.out.println("------------ 아이디 찾기 -------------");
				System.out.println("이름  입력 :");
				String findname1 = scanner.next();
				System.out.println("전화번호 입력 :");
				String faidphone1 = scanner.next();
				byte findCheck1 = 0;
				
				// 2. 기존배열 [회원리스트] 내 입력받은 값과 비교
				int i = 0;
				for(Member temp : memberList) {
					if(temp != null && temp.name.equals(findname1) && (temp.phone.equals(faidphone1))) {
						System.err.println("알림)) 가입하신 아이디는 ID :" + temp.id);
						findCheck1 = 2;
						break;
					}
					else if(temp != null && temp.name.equals(findname1)) {
						System.err.println("알림)) 전화번호가 잘못되었습니다");
						findCheck1 = 2;
						break;
					}
					else if(temp != null && temp.phone.equals(faidphone1)) {
						System.err.println("알림)) 아이디이 잘못되었습니다.");
						findCheck1 = 2;
						break;
					}
					else {
						findCheck1 = 0;
					}
					i++;
				}
				if (findCheck1 == 0) {
					System.err.println("알림)) 알수없는 사용자");
				}
				
			}//if_1_3 e [ 아이디 찾기 ]
			else if(work1 == 4) {//if_1_4 s [ 비밀번호 찾기 ]
				
				System.out.println("------------ 비밀변호 찾기 -------------");
				System.out.println("아이디  입력 :");
				String findname2 = scanner.next();
				System.out.println("전화번호 입력 :");
				String faidphone2 = scanner.next();
				byte findCheck2 = 0;
				Random random = new Random();
				
				// 2. 기존배열 [회원리스트] 내 입력받은 값과 비교
				int i = 0;
				for(Member temp : memberList) {
					if(temp != null && temp.id.equals(findname2) && temp.phone.equals(faidphone2)) {
						System.err.println("알림)) 가입하신 비밀번호는 PassWord :" + temp.password);
						findCheck2 = 2;
						break;
					}
					else if(temp != null && temp.phone.equals(faidphone2)) {
						System.err.println("알림)) 가입된 이름이 없습니다.");
						findCheck2 = 2;
						break;
					}
					else if(temp != null && temp.id.equals(findname2)) {
						System.err.println("알림)) 전화번호가 잘못되었습니다.");
						findCheck2 = 2;
						break;
					}
					else{
						findCheck2 = 0;
					}
					i++;
				}
				if (findCheck2 == 0) {
					System.err.println("알림)) 알수없는 사용자");
				}
				
			}//if_1_4 e [ 비밀번호 찾기 ]
			else if(work1 == 6) {//if_1_5 s [탈퇴 ]

				System.out.println("------------회원탈퇴-------------");
				System.out.println("탈퇴할 아이디  입력 :");
				String outId = scanner.next();
				System.out.println("비밀번호 입력 :");
				String outPw = scanner.next();
				byte idcheck = 0;
				
				int i = 0;
				for(Member temp : memberList) {
					if(temp != null && temp.id.equals(outId) && temp.password.equals(outPw)) {
						System.err.println("알림))"+outId+"의 탈퇴가 완료되었습니다.");
						idcheck = 0;
						temp.id = null;
						temp.password = null;
						temp.name = null;
						temp.phone = null;
						break;
					}
					if(temp != null && temp.password.equals(outPw)) {
						System.err.println("알림)) 비밀번호가 잘못됐습니다.");
						idcheck = 0;
						break;
					}
					if(temp != null && temp.id.equals(outId)) {
						System.err.println("알림)) 아이디가 잘못됐습니다.");
						idcheck = 0;
						break;
					}
					else {
						idcheck = 2;
					}
					i++;
				}
				if (idcheck == 2) {
					System.err.println("알림)) 알수없는 사용자");
				}
				
			}//탈퇴
			else if(work1 == 5) {//if_1_5 s [종료]
				System.err.println("프로그램을 종료합니다");
				break;
			}//if_1_5 e [ 종료 끝]
			else {//if_1 e
				System.out.println("------------------------------------------");
				System.err.println("알림)) 존재하지 않는 메뉴 입니다.");
				System.out.println("------------------------------------------");
			}//if_1 e
		}//w e
	}//m e
}//c e

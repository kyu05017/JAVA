package Day01_to_Day21.Day05;

import java.util.Scanner;

public class Day05_2_방문록_성공 {// c s
	
	//회원제 방문록 프로그램
		// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 ]
			//1. 회원가입 [ 아이디, 비밀번호, 이름]
			//2. 로그인 [ 아이디, 비밀번호 동일하면 로그인 처리]
		// 2. 로그인시 메뉴 [ 1.방문록 쓰기, 2. 로그아웃]
			// 1. 방문록 쓰기[ 1.방문록쓰기 , 아이디기록
			// 2. 로그아웃 [ 초기메뉴 돌아가기

	public static void main(String[] args) {// m s
		
		Scanner scanner = new Scanner(System.in);
		//배열
		String[][] memberLsit = new String[100][3];
		// 회원 100명 [id,pw,name] 저장하는배열
		//100행 3열 1행 회원당 [1열 = id] [ 2열 = pw][3열 = name]
		
		String[][] boardList = new String[100][3]; 
		//방문록 100개 [title, contants, writer] //저장하는 배열
		
		while(true) { //무한루프 반복조건x //w s
			System.out.println("----------회원제 방문록-----------");
			System.out.println("1.회원가입                 2.로그인");
			System.out.println("------------------------------");
			
			int ch = scanner.nextInt();
			
			//회원가입
			if(ch == 1) { // 1 if s
				System.out.println("------------회원가입-------------");
				System.out.println("사용할 아이디  입력 :");
				String id = scanner.next();
				System.out.println("사용할 비밀번호 입력 :");
				String pw = scanner.next();
				System.out.println("이름 입력 : ");
				String name = scanner.next();
				//String 3개의 변수를 입력받아 맴버리스트에 2차원 배열에 저장
					//1. 빈공간[정수 = 0, 실수 = 0.0 , 문자열 = null]을 찾아서 저장 [ 만약에 빈공간이 없으면 회원가입 불가]
					//2. 아이디 중복체크
			
				
				//회원 중복체크
				boolean idCheck = true;//아이디 중복체크
				for(int i = 0; i < memberLsit.length; i ++) {
					if(memberLsit[i][0] != null && memberLsit[i][0].equals(id)) {
						// ==null : 회원이 없다. !=null : 회원이 존재한다
						System.err.println("알림) 이미 존재하는 회원입니다.");
						idCheck = false;
						break;
					}
				}
				
				//회원 한계적용
				if(idCheck == true) {
					for(int i = 0; i < memberLsit.length; i++) {
							if(memberLsit[i][0] == null) {
							//i 번째 행에 id가 공백이면 저장가능 
							memberLsit[i][0] = id;
							memberLsit[i][1] = pw;
							memberLsit[i][2] = name;
							//i번째 각 열에 데이터 저장
							
							System.err.println("알림) 회원가입 완료");
						
							break; // 저장이 됐다면 끝
						}
					}
				}
			}
			//회원가입 종료
			
			//로그인
			else if(ch == 2) {
				System.out.println("------------ 로그인 -------------");
				System.out.println("아이디  입력 :");
				String id = scanner.next();
				System.out.println("비밀번호 입력 :");
				String pw = scanner.next();
				boolean loginCheck = false;
				
				//배열내에 입력받은 id와 pw가 동일하면 로그인 완료
				for(int i = 0; i < memberLsit.length; i++) {//1 for s
					
					if(memberLsit[i][0] != null && 
						memberLsit[i][0].equals(id) && 
						memberLsit[i][1].equals(pw)) {
						//i번째 행에 id와 pw가 같을경우
							//null은 .equals을 사용불가 [==] 비교연산자는 가능 
						
						System.err.println("알림) 로그인 성공");
						loginCheck = true;
						System.out.println();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						while(true) {
							
							System.out.println("----------회원제 방문록-----------");
							System.out.println("번호\t작성자\t제목\t내용");
								//모든 방명록 출력
							for(int j = 0; j < boardList.length; j++) {
								
								if(boardList[j][0] != null) {
									
									System.out.printf("%d\t%s\t%s\t%s \n",
														j,
														boardList[j][2],
														boardList[j][0],
														boardList[j][1]);
								}
							}
							
							System.out.println("1.방문록                 2.로그아웃");
							System.out.println("------------------------------");
							int ch2 = scanner.nextInt();
							if(ch2 == 1) {
								System.out.println("----------글쓰기-----------");
								System.out.println("제목 :");String title = scanner.next();
								System.out.println("내용 :");String contents = scanner.next();
								//공백을 찾아가서 저장
								for(int j = 0;j < boardList.length; j++) {
									if(boardList[j][0] == null) {
										boardList[j][0] = title;
										boardList[j][1] = contents;
										boardList[j][2] = id;//로그인시 사용된 아이디 이용
										System.out.println("알림) 저장이 완료되었습니다.");
										break;
									}
								}
							}
							else if(ch2 == 2) {
								System.err.println("로그아웃이 완료되었습니다.");
								break;
							}
							else {System.err.println("알림) 잘못된 입력입니다.");}
						}
						
					}
				}//1 for e
			
				if(loginCheck == false)System.out.println("알림) 로그인에 실패했습니다.");
			}//로그인 끝
			else {System.err.println("알림) 잘못된 입력입니다.");}//1 if 끝
		}//w e
	}//m e
}//c e
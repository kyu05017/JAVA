package Day05;

import java.util.Scanner;

public class Day05_4_과제 {//c s
	/*	1.입출력 2.변수/자료형/연산 3.제어/반복문 4.제어/반복문 5.배열
	 * 
	 *  도서 대여 console 프로그램
	 * 	1. 배열
	 *  	1.회원[아이디(중복x), 비밀번호]
	 *  	2.도서[도서명(중복x), 대여여부, 대여인]
	 *  
	 * 	2. 초기메뉴
	 * 		1.회원가입 2.로그인
	 * 				1.회원가입시 아이디 중복체크
	 * 
	 *  3.로그인시 메뉴
	 * 		1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃
	 * 			1.도서검색시 도서명이 일치하면 도서명과 대여여부 출력
	 * 			2.도서목록시 모든 모서명 출력
	 * 			3.도서대여시 도서대여여부 가능할때 도서대여
	 * 			4.도섭반납시 본인이 대여한 도서만 반납 처리
	 * 			5.로그아웃
	 * 
	 * 	4.로그인시 아이디가 admin이면 관리자메뉴 이동
	 * 		1.관리자메뉴
	 * 			1.도서등록 2.도서목록 3.도서삭제 4.로그아웃
	 * 				1.도서 등록시 도서명을 입력받아 도서 등록
	 * 				2.도서 목록시 모든 도서명 출력
	 * 				3.도서삭제시 삭제할 도서명을 입력받아 동일한 도서명 삭제 [ null]
	 * 				4.로그아웃시 초기메뉴
	 * */
	public static void main(String[] args) {// m s
		
		Scanner scanner = new Scanner(System.in);
		String[][] memberlist = new String[100][2];
		String[][] book = new String[100][3];
		String adminId = "admin";
		int adminPw = 0;
		adminPw = 1234;
		while(true) {//와일 시작
			System.out.println("-------------도서대여시스템--------------");
			System.out.println("1.회원가입         2.로그인         3.종료 ");
			System.out.println("------------------------------------");
			
			String work1 = scanner.next();
			if(work1.equals("회원가입") || work1.equals("1")) {//회원가입 시작
				System.out.println("-------------회원가입--------------");
				System.out.println("아이디  입력"); String id = scanner.next();
				System.out.println("비밀번호 입력"); String pw = scanner.next();
				System.out.println("---------------------------------");
				
				//중복체크
				boolean idCheck = true;
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.out.println("알림) 이미 존재하는 회원입니다.");
						idCheck = false;
						break;
					}
				}
				//회원생성 및 한계적용
				if(idCheck == true) {
					for(int i = 0; i < memberlist.length; i++) {
						if(memberlist[i][0] == null) {
							memberlist[i][0] = id;
							memberlist[i][1] = pw;
							System.out.println("알림) 아이디 생성이 완료되었습니다.");
							break;
						}
					}
				}
				
			}//회원가입 종료
			else if(work1.equals("로그인") || work1.equals("2")) {//로그인 메뉴 시작
				System.out.println("-------------로그인--------------");
				System.out.println("아이디  입력"); String id = scanner.next();
				System.out.println("비밀번호 입력"); int pw = scanner.nextInt();
				System.out.println("---------------------------------");
				
				boolean loginCheck = false;
				boolean adminCheck = false;
				boolean login = false;
				for(int i = 0; i < memberlist.length; i++) {//로그인 for
					if((memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) || (id.equals("admin") && pw == adminPw)) {//id if 시작
						if(id.equals("admin") && pw == adminPw) {
							//System.out.println("알림)관리자 로그인이 완료 되었습니다.");
							adminCheck = true;
							login = true;
						}
						else if((memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw))){
							//System.out.println("알림)로그인이 완료 되었습니다.");
							loginCheck = true;
							login = true;
						}
					}
				}
				if((login == false)) {
					System.out.println("로그인에 실패하였습니다.");
				}
				else if((login == true)) {
					System.out.print((adminCheck == true) ? "알림)관리자 로그인이 완료 되었습니다.\n" : "알림)로그인이 완료 되었습니다.\n");
				while(true) {
					
					System.out.println("---------------도서대여시스템-----------------");
					System.out.print((adminCheck == true) ? "1.도서등록 2.도서목룍 3.도서삭제 4.관리자암호변경 5.로그아웃\n" : "1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃\n");
					System.out.println("-----------------------------------------");
					String work2 = scanner.next();
					if(loginCheck == true && adminCheck == false) {//일반 로그인후 메뉴
							
						if(work2.equals("도서검색") || work2.equals("1")) {
							System.out.println("-----------------------------------------");
							System.out.println("검색할 책이름을 입력 :");
							System.out.println("-----------------------------------------");
							String bookSearch = scanner.next();
							for(int bs = 0; bs < book.length; bs++) {
								if(book[bs][0] != null && book[bs][0].equals(bookSearch)) {
									System.out.println("책이름\t대여여부\t대여자\n");
									System.out.printf("%s\t%s\t%s \n",book[bs][0], book[bs][1], book[bs][2]);
									if(book[bs][1] == null) {
										System.out.println(bookSearch+"대여 가능합니다");
									}
								}
							}
							System.out.println("-----------------------------------------");
							}
							else if(work2.equals("도서목록") || work2.equals("2")) {
								System.out.println("-----------------------------------------");
								System.out.println("책이름\t대여여부\t대여자\n");
								for(int bl = 0; bl < book.length; bl++) {
									if(book[bl][0] != null) {
										System.out.printf("%s\t%s\t%s \n",book[bl][0], book[bl][1], book[bl][2]);
									}
								}
								System.out.println("-----------------------------------------");
							}
							else if(work2.equals("도서대여") || work2.equals("3")) {
								System.out.println("-----------------------------------------");
								System.out.println("대여할 책이름 입력 :");
								String bookname1 = scanner.next();
								boolean bookRant = false;
								for(int bs = 0; bs < book.length; bs++) {
									if(book[bs][0] != null && book[bs][0].equals(bookname1)) {
										book[bs][0] = bookname1;
										book[bs][1] = "대여중";
										book[bs][2] = id;
										bookRant = true;
									}
									else {
										bookRant = false;
									}
									if(bookRant == true) {
									System.out.println(bookname1+"을 대여했습니다.");
									}	
								}					
								System.out.println("-----------------------------------------");
							}
							else if(work2.equals("도서반납") || work2.equals("4")) {
								System.out.println("-----------------------------------------");
								System.out.println("반납할 책이름 입력 :");
								String bookname1 = scanner.next();
								boolean bookRant = false;
								for(int bs = 0; bs < book.length; bs++) {
									if(book[bs][0] != null && book[bs][0].equals(bookname1)) {
										book[bs][0] = bookname1;
										book[bs][1] = "대여가능";
										book[bs][2] = "";
										bookRant = true;
									}
									else {
										bookRant = false;
									}
									if(bookRant == true) {
									System.out.println(bookname1+"을 반납했습니다.");
									}	
								}					
								System.out.println("-----------------------------------------");
							}
							else if(work2.equals("로그아웃") || work2.equals("5")) {
								System.out.println("-----------------------------------------");
								System.out.println("알림) 로그아웃 하셨습니다.");
								System.out.println("-----------------------------------------");
					
								break;
							}
							else {
								System.out.println("알림) 잘못된 입력입니다.");
							}
						}//일반메뉴 끝
						else if(adminCheck == true && loginCheck == false) {//관리자 로그인후 메뉴
							boolean bookCheak = true;
							for(int i = 0; i < memberlist.length; i++) {
								if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
									System.out.println("알림) 이미 존재하는 책입니다.");
									bookCheak = false;
									break;
								}
							}
							if(work2.equals("도서등록") || work2.equals("1")) {
								System.out.println("-----------------------------------------");
								System.out.println("등록할 책 이름을 입력하세요.");
								System.out.println("-----------------------------------------");
								String bookname3 = scanner.next();
								boolean bookCk = true;
								for(int i = 0; i < book.length; i++) {
									if(book[i][0] != null && book[i][0].equals(bookname3)) {
										System.out.println("알림) 이미 존재하는 책입니다.");
										bookCk = false;
										break;
									}
								}
								
								for(int j = 0;j < book.length; j++) {
									if(bookCk == true) {
										if(book[j][0] == null) {
											book[j][0] = bookname3;
											book[j][1] = "대여가능";
											book[j][2] = "";
											System.out.println("알림) 저장이 완료되었습니다.");
											break;
										}
									}
								}	
							}
							else if(work2.equals("도서목록") || work2.equals("2")) {
								System.out.println("-----------------------------------------");
								System.out.println("책이름\t대여가능여부\t대여자\n");
								for(int bl = 0; bl < book.length; bl++) {
									if(book[bl][0] != null) {
										System.out.printf("%s\t%s\t%s \n",book[bl][0], book[bl][1], book[bl][2]);
									}
								}
							System.out.println("-----------------------------------------");
						}
						else if(work2.equals("도서삭제") || work2.equals("3")) {
							System.out.println("-----------------------------------------");
							System.out.println("삭제할 책 이름을 입력하세요.");
							System.out.println("-----------------------------------------");
							String bookname3 = scanner.next();
							
							
							for(int b2 = 0; b2 < book.length; b2++) {
								if(book[b2][0].equals(bookname3)) {
									book[b2][0] = null;
									System.err.println("알림) 책삭제 완료");
									break; 
								}
							}
						}	
						else if(work2.equals("관리자비밀번호") || work2.equals("4")) {
							System.out.println("관리자 비밀번호를 변경합니다");
							int pw2 = scanner.nextInt();
							adminPw = pw2;
							break;
						}	
						else if(work2.equals("로그아웃") || work2.equals("5")) {
							System.out.println("-----------------------------------------");
							System.out.println("알림) 로그아웃 하셨습니다.");
							System.out.println("-----------------------------------------");
							break;
								
						}
						else {
							System.out.println("알림) 잘못된 입력입니다.");
						}
					}//관리자 메뉴끝
				}
			}
			} 
			else if(work1.equals("종료") || work1.equals("3")) {
				System.err.println("알림) 프로그램을 종료합니다.");
				break;
			}
			else {//로그인 메뉴 종료
				System.err.println("알림) 없는메뉴 입니다.");
			}
		}//와일 종료
	}//m e
}//c s

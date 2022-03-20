package 개인과제_9번째_도서대출;

import java.util.Scanner;

public class 다섯번째 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// 2차원 배열 선언 100행에 3열
		String[][] members = new String[100][3];
		String[][] books = new String[100][3];
		
		//무한 반복 - 종료조건 없음
		while(true) {
			System.out.println("메인)");
			System.out.println("1.회원가입 2.로그인");
			int ch = scanner.nextInt();
			
			if(ch == 1) { // 입력받은수가 1일 경우
				System.out.println("회원가입)");
				System.out.println("ID:");
				String id= scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				boolean pass = true;
				
				// 맴버 행 길이만큼 증가하며 맴버의 저장된 아이디와 입력받은 아이디가 있으면 출력
				for(int i = 0; i < members.length;i++) {
					if(members[i][0] != null && members[i][0].equals(id)) {
						System.out.println("이미 존재하는 아이디 입니다.");
						pass = false;
						break;
					}
				}
				// 맴버 행 길이 만큼 증가 반복 하며 맴버가 비어있으면 빈곳에 저장
				if(pass) {
					for(int i = 0; i < members.length;i++) {
						if(members[i][0] == null) {
							members[i][0] = id;
							members[i][1] = pw;
							System.out.println("회원가입이 완료 되었습니다.");
							break;
						}
					}
				}
			}
			else if (ch == 2) {
				System.out.println("로그인");
				System.out.println("ID :");
				String id =scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				int login = 0;
				// 맴버 길이만큼 반복하며 저장된 배열에 어드민과 비밀번호가 일치할경우 로그인에 2를 대입
				for(int i = 0; i < members.length;i++) {
					if(members[i][0] != null && members[i][0].equals("admin") && members[i][1].equals(pw)){
						System.out.println("관리자로 로그인 했습니다.");
						login = 2;
						break;
					}
					// 맴버 길이만큼 반복하며 저장된 배열에 아이디와 비밀번호가 일치할경우 로그인에 1를 대입
					else if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
						System.out.println(id+ "님 환영합니다.");
						login = 1;
						break;
					}
				}
				//메뉴 변수 선언
				int menu = 0;
				int admune = 0;
				
				//무한 반복 종료조건 로그아웃
				while(true) {
					//운영자 메뉴 위에 로그인에서 2를 받았을 경우
					if(login == 2) {
						System.out.println("관리자 메뉴");
						System.out.println("1등록 2목록 3삭제 4로그아윳");
						int ch2 = scanner.nextInt();
						
						//입력받아서 각 메뉴로 이동
						if(ch2 == 1) {
							admune = 1;
						}
						else if (ch2 == 2) {
							admune = 2;
						}
						else if(ch2 == 3) {
							admune = 3;
						}
						else if(ch2 == 4) {
							admune =4;
						}
					}
					// 일반회원 메뉴 위에 로그인 에서 1을 받았을 경우
					else if(login == 1){
						System.out.println("메뉴");
						System.out.println("1검색 2목록 3대여 4반납 5로그아웃");
						int ch2 = scanner.nextInt();
						
						//입력받아 각 메뉴로 이동
						if(ch2 == 1) {
							menu = 1;
						}
						else if (ch2 == 2) {
							menu =  2;
						}
						else if(ch2 == 3) {
							menu = 3;
						}
						else if(ch2 == 4) {
							menu =4;
						}
						else if ( ch2 == 5) {
							menu =5;
						}
					}
					
					if(menu == 1) {
						//책이름을 입력받아 그 책의 저장된 열의 2번 값이 대여중일경우를 확인 하여 대여 여부를 알려줌
						System.out.println("검색할 책이름 입력");
						String name = scanner.next();
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								if(books[i][2].equals("대여중")) {
									System.out.println("입력하신 책은 현재 대여중입니다.");
									break;
								}
								else {
									System.out.println("입력하신 책은 대여 가능합니다.");
									break;
								}
							}
						}
					}
					//배열길이 만큼 반복하여 저장된 책이 있으면 등록된 책들의수만큼 목록을 보여줌
					else if(menu == 2 || admune == 2) {
						System.out.println("제목\t대여여브\t대여자");
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] != null) {
								System.out.printf("%s\t%s\t%s\n",books[i][0],books[i][1],books[i][2]);
							}
						}
					}
					//책의 이름을 입력받아 그 책에 자신의 아이디와 대여여부를 대여중으로 바꿔줌
					else if(menu == 3) {
						System.out.println("대여할 책이름 입력 : ");
						String name = scanner.next();
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println("해당 책을 대여 합니다.");
								books[i][1] = "대여중";
								books[i][2] = id;
								break;
							}
						}
					}
					// 책의 이름을 입력 받아 그 책의 대여여부와 아이디를 빈공간으로 바꿔 대여여부를 비워줌
					else if(menu == 4) {
						System.out.println("반납할 책이름 입력 : ");
						String name = scanner.next();
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println("해당 책을 대여 합니다.");
								books[i][1] = "";
								books[i][2] = "";
								break;
							}
						}
					}
					//브레이크를 걸어서 가장 가까운 반복문인 while을 탈출시킴
					else if(menu == 5 || admune ==4) {
						System.out.println("로그아운 했습니다.");
						break;
					}
					//로그인과 비슷하게 책을 등록
					else if(admune == 1) {
						System.out.println("등록할 책이름 입력 : ");
						String name = scanner.next();
						//입력받은 이름이 배열안에 저장되어있는지 배열만큼 반복 검사하여 존재 할경우 뜨게함
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println(" 이미 등록된 책입니다.");
							}
						}
						// 존재 하지 않는 다면 빈공간을 찾아서 이름을 저장하고 대여여부와 대여인을 빈공간 처리함
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] == null) {
								System.out.println("해당 책을 등록 합니다.");
								books[i][0] = name;
								books[i][1] = "";
								books[i][2] = "";
								break;
							}
						}
					}
					// 이름을 입력받아 그 책이 존재 할경우 그 배열의 모든 열들에게 null값을 넣어 그 배열을 비워줌
					else if(admune == 3) {
						System.out.println("삭제할 책이름 입력 : ");
						String name = scanner.next();
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println("해당 책을 삭제 합니다.");
								books[i][0] = null;
								books[i][1] = null;
								books[i][2] = null;
								break;
							}
						}

					}
				}
				
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

}

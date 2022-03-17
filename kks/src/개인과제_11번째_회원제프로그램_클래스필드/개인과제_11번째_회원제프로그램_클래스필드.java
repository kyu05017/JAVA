package 개인과제_11번째_회원제프로그램_클래스필드;

import java.util.Scanner;

public class 개인과제_11번째_회원제프로그램_클래스필드 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Member[] memberlsit = new Member[100];
		
		
		
		while(true) {
			try {
				System.out.println("----------------회원제 방문록-----------------");
				System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호 찾기 5.종료");
				System.out.println("------------------------------------------");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("회원가입))");
					System.out.println("ID : ");
					String id = scanner.next();
					System.out.println("PW : ");
					String pw = scanner.next();
					System.out.println("Name : ");
					String name = scanner.next();
					System.out.println("Phone : ");
					String phone = scanner.next();
					boolean pass = true;
					
					Member mem = new Member();
					
					mem.id = id;
					mem.password = pw;
					mem.name = name;
					mem.phone = phone;
					
					for(Member temp : memberlsit) {
						if(temp != null && temp.id.equals(id)) {
							System.out.println("메세지)) 현재 사용중인 아이디 입니다.");
							pass = false;
						}
					}
					
					for(int i = 0; i <memberlsit.length; i++ ) {
						if(memberlsit[i] == null) {
							memberlsit[i] = mem;
							break;
						}
					}
				}
				else if(ch == 2) {
					System.out.println("로그인))");
					System.out.println("ID : ");
					String id = scanner.next();
					System.out.println("PW : ");
					String pw = scanner.next();
					boolean pass = false;
					
					for(int i = 0; i <memberlsit.length; i++) {
						if(memberlsit[i] != null && memberlsit[i].id.equals(id) && memberlsit[i].password.equals(pw)) {
							System.out.printf("로그인이 완료 되었습니다. %s님 환영합니다.\n",memberlsit[i].id);
							pass = true;
						}
					}
					if(pass == false) {
						System.out.println("메세지)) 로그인에 실패했습니다.");
					}
					
					else if(pass) {
						while(true) {//회원메뉴
							
							
						}
					}
				}
				else if(ch == 3) {
					System.out.println("아이디 찾기))");
					System.out.println("Name : ");
					String name = scanner.next();
					System.out.println("Phone");
					String phone = scanner.next();
					boolean pass = false;
					
					for(int i = 0; i<memberlsit.length; i++) {
						if(memberlsit[i] != null && memberlsit[i].name.equals(name) && memberlsit[i].phone.equals(phone)){
							System.out.printf("회원님의 아이디는 : %s 입니다.\n",memberlsit[i].id);
							pass = true;
						}
					}
					if(pass == false) {
						System.out.println("메세지)) 아이디를 찾을수 없습니다.");
					}
					
				}
				else if(ch == 4) {
					System.out.println("비밀번호 찾기))");
					System.out.println("ID : ");
					String id = scanner.next();
					System.out.println("Phone");
					String phone = scanner.next();
					boolean pass = false;
					
					for(int i = 0; i<memberlsit.length; i++) {
						if(memberlsit[i] != null && memberlsit[i].id.equals(id) && memberlsit[i].phone.equals(phone)){
							System.out.printf("회원님의 아이디는 : %s 입니다.\n",memberlsit[i].password);
							pass = true;
						}
					}
					if(pass == false) {
						System.out.println("메세지)) 비밀번호를 찾을수 없습니다.");
					}
					
				}
				else if(ch == 5) {
					System.out.println("메세지))프로그램을 종료합니다.");
					break;
				}
				else {
					System.out.println("메세지))존재하지 않는 메뉴 입니다.");
				}
			}
			catch(Exception e) {
				System.out.println("메세지)) 숫자만 입력 가능합니다.");
				scanner = new Scanner(System.in);
			}
		}
		
	}
	
}

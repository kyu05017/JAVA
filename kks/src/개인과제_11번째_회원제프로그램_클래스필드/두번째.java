package 개인과제_11번째_회원제프로그램_클래스필드;

import java.util.Scanner;

public class 두번째 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100];		
		
		while(true) {
			try {
				System.out.println("회원제 로그인))");
				System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 5.종료");
				int ch = scanner.nextInt();
				
				
				if(ch == 1) {
					System.out.println("회원가입))");
					System.out.println("ID : ");
					String id= scanner.next();
					System.out.println("PW : ");
					String pw = scanner.next();
					System.out.println("Name : ");
					String name = scanner.next();
					System.out.println("Phone : ");
					String phone = scanner.next();
					boolean pass = true;
					
					for(int i = 0; i < memberlist.length; i++) {
						if(memberlist[i] != null && memberlist[i].id.equals(id)) {
							System.out.println("이미 존재하는 아이디 입니다.");
							pass = false;
						}
					}
					if(pass) {
						Member mem = new Member();
						
						mem.id = id;
						mem.password = pw;
						mem.name = name;
						mem.phone = phone;
						
						for(Member temp : memberlist) {
							if(temp != null && temp.id.equals(id)) {
								System.out.println("메세지)) 현재 사용중인 아이디 입니다.");
								pass = false;
							}
						}
						
						for(int i = 0; i <memberlist.length; i++ ) {
							if(memberlist[i] == null) {
								memberlist[i] = mem;
								break;
							}
						}
					}
				}
				else if(ch == 2) {
					System.out.println("로그인 페이지))");
					System.out.println("ID : ");
					String id= scanner.next();
					System.out.println("PW : ");
					String pw = scanner.next();
					boolean pass = false;
					
					for(int i = 0; i <memberlist.length;i++) {
						if(memberlist[i] != null && memberlist[i].id.equals(id) && memberlist[i].password.equals(pw)) {
							System.out.println("로그인이 완료 되었습니다.");
							pass = true;
							break;
						}
					}
					if(pass == false) {
						System.out.println("로그인에 실패 했습니다.");
					}
				}
				else if(ch == 3) {
					System.out.println("아이디찾기))");
					System.out.println("Name : ");
					String name= scanner.next();
					System.out.println("Phone : ");
					String Phone = scanner.next();
					
					for(int i = 0; i < memberlist.length; i++) {
						if(memberlist[i] != null && memberlist[i].name.equals(name) && memberlist[i].phone.equals(Phone)) {
							System.out.println("회원님의 아이디는 " + memberlist[i].id+ "입니다.");

						}
					}
				}
				else if(ch == 4) {
					System.out.println("비밀번호찾기))");
					System.out.println("ID : ");
					String id= scanner.next();
					System.out.println("Phone : ");
					String Phone = scanner.next();
					
					for(int i = 0; i < memberlist.length; i++) {
						if(memberlist[i] != null && memberlist[i].id.equals(id) && memberlist[i].phone.equals(Phone)) {
							System.out.println("회원님의 아이디는 " + memberlist[i].password+ "입니다.");

						}
					}
				}
				else if(ch == 5) {
					System.out.println("프로그램을 종료 합니다.");
					break;
				}
				
			}
			catch(Exception e) {
				System.out.println(e);
				scanner = new Scanner(System.in);
			}
			
		}
	}
}


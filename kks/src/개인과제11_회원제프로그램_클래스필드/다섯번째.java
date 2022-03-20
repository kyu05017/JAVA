package 개인과제11_회원제프로그램_클래스필드;

import java.util.Scanner;

public class 다섯번째 {
	public static void main(String[] args) {
		
		// 입력 객체
		Scanner scanner= new Scanner(System.in);
		// 클래스를 배열로 만든 한계는 100개
		Member[] memberlist = new Member[100];
		
		while(true) {//무한 반복
			try {//예외처리
				System.out.println("로그인 시스템");
				System.out.println("1.회원가입 2.로그인 3.아이디찾기 3.비밀번호찾기");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("회원가입)");
					System.out.println("아이디 :");
					String id = scanner.next();
					System.out.println("비밀번호 :");
					String pw = scanner.next();
					System.out.println("이름 : ");
					String name = scanner.next();
					System.out.println("전화번호 : ");
					String phone = scanner.next();
					Boolean pass = true;
					
					//클래스를 객체화 시켜 필드를 불러옴
					Member mem = new Member();
					
					mem.id = id;		//클래스의 아이디 필드에 입력받은 아이디를 대입
					mem.password = pw;	//클래스의 비밀번호 필드에 입력받은 비밀번호 대입
					mem.name = name;	//클래스의 이름 필드에 입력받은 이름 대입
					mem.phone = phone;	//클래스의 전화번호 필드에 입력받은 전화번호를 대입
					
					//중복확인
					for(Member temp : memberlist) {
						if(temp != null && temp.id.equals(id)) {
							System.out.println("이미 존재하는 아이디 입니다.");
							pass = false;
						}
					}
					//boolean 값이 참이라면 배열의 빈공간을 찾아 객체화 시킨 배열을 저장
					if(pass) {
						for(int i = 0; i < memberlist.length; i++) {
							if(memberlist[i] == null) {
								memberlist[i] =mem;
								System.out.println("회원가입이 완료 되었습니다.");
								break;
							}
						}
					}
				}
				else if(ch == 2) {
					System.out.println("로그인 페이지");
					System.out.println("아이디 :");
					String id = scanner.next();
					System.out.println("비밀번호 :");
					String pw = scanner.next();
					boolean pass = false;
					//배열을 반복문으로 돌려서 빈공간이 아니며 입력받은 아이디와 필드의 아이디가 같고 비밀번호또한 같으면 로그인값을 줌
					for(int i = 0; i <memberlist.length; i++) {
						if(memberlist[i] != null && memberlist[i].id.equals(id) && memberlist[i].password.equals(pw)) {
							System.out.println("로그인이 완료 되었습니다.");
							pass = true;
						}
					}
					//만약 로그인을 통과하지 못해 false 값이 유지된다면 오류 메세지를 의어줌
					if(pass == false) {
						System.out.println("로그인에 실패 했습니다.");
					}
				}
				else if(ch == 3) {
					System.out.println("아이디 찾기");
					System.out.println("이름 :");
					String name = scanner.next();
					System.out.println("전화번호 :");
					String phone = scanner.next();
					
					//배열을 반복문으로 찾아 빈공간이 아니고 이름과 전화번호를 입력받아 배열 필드 안에 저장된값이랑 동일하다면 아이디를 보여줌
					for(int i = 0; i <memberlist.length; i++) {
						if(memberlist[i] != null && memberlist[i].name.equals(name) && memberlist[i].phone.equals(phone)) {
							System.out.println("회원님의 아이디는 "+ memberlist[i].id + "입니다.");

						}
						else {//아니라면 잘못되었다고 알려줌
							System.out.println("존재하지 않는 회원입니다.");
						}
					}
					
				}
				else if(ch == 4) {
					System.out.println("비밀번호 찾기");
					System.out.println("아이디 :");
					String id = scanner.next();
					System.out.println("전화번호 :");
					String phone = scanner.next();
					//입력받은 아이디와 전화번호가 저장된 값과 동일하다면 결과값을 보여줌
					for(int i = 0; i <memberlist.length; i++) {
						if(memberlist[i] != null && memberlist[i].id.equals(id) && memberlist[i].phone.equals(phone)) {
							System.out.println("회원님의 비밀번호는 "+ memberlist[i].password + "입니다.");

						}
						else { // 아니라면 띄어주는 메세지
							System.out.println("존재하지 않는 회원입니다.");
						}
					}
				}
				else { // 잘못된 메뉴를 입력했을경우
					System.out.println("존재하지 않는 메뉴 입니다.");
				}
			}
			catch(Exception e) { // 정수형 입력을 받는 메뉴의 문자 또는 문자를 입력했을경우 예외처리로 프로그램이 꺼지지 않게 해줌
				System.out.println(e);
				scanner = new Scanner(System.in);
			}
		}
	}
}
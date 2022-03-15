package 개인과제_9번째_도서대출;

import java.util.Scanner;

public class 모범코드정리 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] members = new String[100][3];
		String[][] book = new String[100][3];
		
		while(true) {
			System.out.println("메인메뉴))");
			System.out.println("1)회원가입 2)로그인 3)종료");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				
			}
			else if(ch == 2) {
				//회원 메뉴
				
				//운영자 메뉴
				
			}
			else if(ch == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("알림)) 존재하지 않는 메뉴 입니다.");
			}
		}
	}
}

package 개인과제._27_스레드응용프로그램;

public class Main {
	
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("책 읽어주기 프로그램");
			
			System.out.println("1) 실행 2) 종료");
			String work = Control.scanner.next();
			
			if(work.equals("1")) {
				
			}
			else if(work.equals("2")) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}

package 개인과제._27_스레드응용프로그램;

public class Main {
	
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("가사 리딩 프로그램");
			
			System.out.println("1) 실행 2) 종료");
			String work = Control.scanner.next();
			
			if(work.equals("1")) {
				System.out.println("1. 아이유 Blueming");
				System.out.println("2. ");
				System.out.println("3.");
				System.out.println("4.");
				
				try {
					int ch = Control.scanner.nextInt();
					if(ch > 4) {
						System.out.println("메세지)) 존재하지 않는 곡입니다.");
					}
					else {
						System.out.println("메세지)) "+ch + "번 곡을 재생합니다.");
						if(ch == 1) {
							Control.song1();
						}
						if(ch == 2) {
							
						}
						if(ch == 3) {
							
						}
						if(ch == 4) {
							
						}
					}
				}
				catch(Exception e) {
					System.out.println("메세지)) 숫자 만 입력 가능합니다.");
				}
			}
			else if(work.equals("2")) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}

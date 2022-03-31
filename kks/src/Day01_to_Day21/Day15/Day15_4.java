package Day01_to_Day21.Day15;

public class Day15_4 {
	
	
	public static void main(String[] args) {
		 
		// 12장  : 스레드 : 코드를 읽어주는 역할
			// 코드 -> 파일 -> 프로세스 [ 프로그램 ]
			// 목적 : 병열처리
				// main메소드에 main 스레드 포함
		
		// 사용방법 
			// 1. Thread 클래스
			// 2 .Runnalbe 클래스
		// run 메소드 : 멀티스레드의 실행코드
		
		// 예 1 ) Thread클래스를 상속받아 만드는 방법
		
		Thread mi = new Music();
		
		mi.start(); // run  메소드 실행
		
		// 예 2 ) Runnable 로 만드는 방법
		Chatting c1 = new Chatting();
		Thread r1 = new Thread(c1);
		
		r1.start();
		
		
		while(true) { // main 메소드 실행중
			System.out.println("프로그램 작동중");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		// p 591 동기화
			// 멀티 스리드 사용시 동기화 선택
		
		
	}
}

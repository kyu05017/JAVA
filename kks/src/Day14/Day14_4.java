package Day14;

import java.awt.*;

public class Day14_4 {
	
	public static void main(String[] args) {
		
		// p .576
			// 프로세스 : 운영체제에서는 실행 중인 하나의 애플리케이션 
			// 운영체제가 프로세스 필요한 메모리 할당 [ 자바 메모리 관리x 운영체제가 관리]
		
			// 싱글 스레드 : 코드의 읽어주는 흐름이 1개 [ 메인 메소드 ] 
			// 멀티 스레드 : 코드를 읽어주는 흐름 여러개 = [ 메인메소드 외 여러개 ]
		
			// 병렬 : 설계상 흐름이지만 / 스레드가 하나씩 순차적( 운영체제가 할당) 처리
				// 실행순서 : 코드 1 -> 코드2 -> 코드3 -> 코드4 -> 코드5
			//Thread 클래스 ( 새로운 스레드 ) VS Main 메소드 ( 메인 쓰레드가 내장 )
		/*
		 *		코드1
		 * 		>		
		 * 		코드2		코드3	
		 * 
		 * 		코드4 	코드5
		 * 
		 */
		// p. 581 예제1)
			// 싱글스레드
			// 0.5초 간격으로 소리 실행
			// 0.5 초 간격으로 띵 출력
		
		Toolkit toolkit = new Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i++) {
			toolkit.beep();//소리 메소드
			try { 
				Thread.sleep(500);
			}
			catch (Exception e) {
			}
		}
		for(int i = 0; i<5; i ++) {
			System.out.println("띵");
		}
		try {
			Thread.sleep(500);
		}
		catch(Exception e){
			
		}
		
	}
	
}

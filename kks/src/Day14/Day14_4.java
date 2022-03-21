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
				// 1. Thread 클래스 [ 상속 1 개 ]
					// 1. 임의 클래스 extends Thread 
					// 2. run() 메소드 오러라이딩 [ 재정의 ]
					// 3. 객체 생성
					// 4. 객체 .start();
					// * start() 메소드 호출시 run 메소드 실행
				// 2. Runnalbe 인터페이스 
					// 1. 임의 클래스에 implements  Runnalbe
					// 2. 런이라는 메소드를 구현 @overrride
					// 3. 외부에서 구현 객체를 생성한다
					// 4. thread 라는 객체 생성시 생성자에 구현객체를 넣어준다
					// 5. thread 클래스 객체 내 start() 메소드 실행 
					// * start 메소드는 run 메소드가 멀티 스래드로 작동 된다.
					// run() 메인 메소드는 main 메소드를 제외산 새로운 스레드 만들기
				// 3. 익명객체 [ 인터페이스내 직접 구현 [ 
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

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		System.out.println("단일 스래드-------------------------");

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
		
		System.out.println("멀티스래드 인터페이스-------------------------");
			// p. 852 예제2 
				// * 멀티 스레드 ( main  스레드, beeptesk 객체 )
		// 1. 인터페이스에 구현 객체
		Runnable beepTesk = new BeepTesk();
		// 2. Thread 클래스 객체 생성시 생성자에 구현객체 넣기
		Thread thread = new Thread(beepTesk);
		// thread 객체 내 start() 메소드 호출
		thread.start();
		
		// 츨력
		for(int i = 0; i < 5 ;i++) {
			System.out.println("딩");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
		System.out.println("몰티스래드 상속-------------------------");
		// p. 854 예제3
			// 1. 스레드 객체 생성 
		Thread thread2 = new BeepThread();
		// 슈퍼클래스 = 서브클래스의 생성자 [ 다형성 ]
				//부모 <== 자식 [ 자동 형변환 ]
				//부모 ==> 자식 [ 강제 형변환 ]
		
		// 2. 스해드 객체내 start 
			 // run 메소드 호출 역할 [ 멀티스레드 실행 ]
		thread2.start();
		
		// 출력
		for(int i = 0; i < 5; i++) {
			System.out.println("뒝");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
		System.out.println("멀티스래드 익명객체-------------------------");
		
			// 인터페이스는 사용방법
				// 1. 클래스에게 implements를 한 후에 구현  ===> 구현 객체
				// 2. 인터페이스에 new 연산자를 통한 추상메소드 구현 ==> 익명 객체 [ 클래스 관련 x ]
		
			// * 익명 스레드 객체
			Runnable runnable = new Runnable() {
							// 인터페이스에 new( 메모리 할당 )
							// * 메모리 할당하기 위해서 추상메소드를 먼저 구현!!!!!
							// * 추상메소드를 구현 안할시에 익명객체 선언 불가 !!
				
				
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++ ) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

					}
				}
			}
		}; 
		
		Thread thread3 = new Thread(runnable);
		thread3.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("동");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

		System.out.println("각 스래드의 이름--------------------------------");
		
		System.out.println("main 메소드 안에 있는 스레드 이름 " + Thread.currentThread().getName()); //  커런트 쓰래드는 현재 쓰래드;
												// Thread.currentThread() : 현 코드를 읽어주는 스레드 호출
												//.getName() : 스래드 이름 호출 
												//.setNmae() : 스래드 이름 변경
		System.out.println("스래드1 이름 "+thread.getName());
		System.out.println("스래드1 이름 "+thread2.getName());
		System.out.println("스래드1 이름 "+thread3.getName());
		
		System.out.println("스래드의 우선순위--------------------------------");
		
		// p. 590
		
		for(int i = 1; i <= 10; i++) {
						// 10회 반복처리
			// i가 1일떼 가장먼저 스레드 댇체 생성 = thread 4
			//  * 먼저 생성되어도 순환할당 [ 운영체데 => 스케줄링 ] 
			// 이므로 가장 먼저 종료 x
			Thread thread4 = new CalcThread("thread" +i);
			
			// 우선순위
			if(i != 10) { // 10 이 아니면 우선순위를 낮춤
				thread4.setPriority(Thread.MIN_PRIORITY);
			}
			else { // 아니라면 우선 순위를 높힘
				thread4.setPriority(Thread.MAX_PRIORITY);
			}
			thread4.start();
		}
	}
	
}

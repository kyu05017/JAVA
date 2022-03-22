package Day15;

import java.awt.Toolkit;

public class Day15_7 {
	
	public static void main(String[] args) {
		/*
		// p. 601 : 스레드 제어
			// 1. sleep() : 주어진 시간동안 일시정지
				// 시간 당위 : 밀리초 ( 1000 / 1초 )
				// 일반 예외 발생 : 일시정지 상태에서 주어진 시간이 되기전에 실행대기 [ 종료 ] 로 된다면 처리코드를 미리 넣어라
			// 2. yield() : 양보  : 다른 스레드에게 실행 양보 [ 대기 상태 ]
			// 3. join() : 다른스레드의 종료를 기다림 
		
		// p. 602 . Thread.sleep(빌리초) 예제
				// 시간 당위 : 밀리초 ( 1000 / 1초 )
				// 일반 예외 발생 : 일시정지 상태에서 주어진 시간이 되기전에 실행대기 [ 종료 ] 로 된다면 처리코드를 미리 넣어라
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10; i++) {
			toolkit.beep();
			System.out.println("비프");
			try {Thread.sleep(50);} catch (Exception e) {} // 현스레드 3초간 정지 
		}
		
		// p. 604 ~ 606 yield()
		
		// 1. 객체 생성 
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		// 2. 스래드 시작
		a.start();
		b.start();
		// 3. 스레드를 3초간 일시정지
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		// 4. 스레드 A에 work값 변경
		a.work = false; // -> Thread.yeild();
		// 5. 스레드를 3초간 일시정지
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		// 6. 스레드 A에 work값 변경 
		b.work = true; // 다시 실행
		// 7. 스레드를 3초간 일시정지
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		// 8. 둘다 멈춤
		a.stop = true;
		b.stop = true;
		// 9.  a.stop(); // 권장하지 않는 메소드 [ 스레드의 안정성이 없다 ] 
		*/
		// p. 607 join();
		// 객체 생성
		SumThread sumThread = new SumThread();
		// 갱페 실행
		sumThread.start();
		// 스레드.join()  = main 스레드와 sum스레드 join = 하나의 스레드
		try {
			sumThread.join();
		}
		catch(Exception e) {
			
		}
		System.out.println(" 1~ 100 합 : "+ sumThread.getSum());
		// * main 스레드가 join  안했을때 : 0
			// sumthread가 더하기를 끝나기 전에 main 스레드 sum 출력
		// * main 스레드가 join 했을때 : 5050
	}
}

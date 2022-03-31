package 개인과제._15_상속응용;

import java.util.Scanner;

public class newCpu extends Cpu{
// 			클래스명 상속 부모 클래스
	
	// 빈생성자
	public newCpu() {
		
	}

	// 풀생성자
	public newCpu(int temperature) {
		super(temperature);
	}

	// 메소드를 재정의
	@Override
	//메소드 인수 o 반환 o 예외처리
	public boolean cpuRun(int work) throws InterruptedException {
		System.out.println("newCpu 정상 작동중 1)실행 5)다른작업 [냉각성능 10]");
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.next();
		// 무한 반복 - 종료 조건 cpu 고장
		while(true) {
			// 온도정수가 1000이상이면 종료
			if(temperature > 1000) {
				System.out.println("Cpu 고장");
				return false;
			}
			if(work == 1) {
				// 1초마다 5씩 증가
				temperature += 5;
				Thread.sleep(1000);
			}
			else if(work == 2) {
				// 1초마다 5씩 증가
				temperature += 5;
				Thread.sleep(1000);
			}
			else if(work == 3) {
				// 1초마다 20씩 증가
				temperature += 20;
				Thread.sleep(1000);
				System.out.println("온도상승");
			}
			if(ch.equals("5")) {
				System.out.println("바탕화면으로 돌아갑니다.");
				return true;
			}
			// 나름의 쿨링 0.8초 마다 10씩 -해서 고장나지 않게함
			temperature -= 10;
			Thread.sleep(800);
		}
	}
}

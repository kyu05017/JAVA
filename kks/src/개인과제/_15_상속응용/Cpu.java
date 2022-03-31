package 개인과제._15_상속응용;

import java.util.Scanner;

public class Cpu {
	// 필드 = 온도
	public int temperature;
	
	//생성자 - 깡통
	public Cpu() {
		
	}

	//생성자 - 풀생성자
	public Cpu(int temperature) {
		this.temperature = temperature;
	}
	
	//메소드 인수 o 반환 o 예외처리
	public boolean cpuRun(int work) throws InterruptedException {
		
		System.out.println("Cpu 정상 작동중 1)실행 5)다른작업 [냉각성능 0]");
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.next();
		// 무한 반복 - 종료 조건 cpu 고장
		while(true) {
			// 온도가 100이 되면 고장 반복문 종료
			if(temperature > 100) {
				System.out.println("Cpu 고장");
				return false;
			}
			if(work == 1) {
				// 1초마다 5씩 증가
				temperature += 5;
				Thread.sleep(1000);
				System.out.println("cpu 온도상승 +5도");
			}
			else if(work == 2) {
				// 1초마다 5씩 증가
				temperature += 5;
				Thread.sleep(1000);
				System.out.println("cpu 온도상승 +5도");
			}
			else if(work == 3) {
				// 1초마다 20씩 증가
				temperature += 20;
				Thread.sleep(1000);
				System.out.println("cpu 온도상승 +20도");
			}
			if(ch.equals("5")) {
				System.out.println("바탕화면으로 돌아갑니다.");
				return true;
			}
			// 1초간 쓰레드 멈춤
			Thread.sleep(1000);
		}
	}
}

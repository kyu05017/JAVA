package 개인과제15_상속;

import java.util.Scanner;

public class Cpu {
	
	public int temperature = 0;
	
	public Cpu() {
		
	}

	public Cpu(int temperature) {
		this.temperature = temperature;
	}
	
	public boolean cpuRun(int work) throws InterruptedException {
		
		System.out.println("Cpu 정상 작동중 1)실행 5)다른작업 [냉각성능 0]");
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.next();
		while(true) {
			if(temperature > 100) {
				System.out.println("Cpu 고장");
				return false;
			}
			if(work == 1) {
				temperature += 5;
				Thread.sleep(1000);
				System.out.println("cpu 온도상승 +5도");
			}
			else if(work == 2) {
				temperature += 5;
				Thread.sleep(1000);
				System.out.println("cpu 온도상승 +5도");
			}
			else if(work == 3) {
				temperature += 20;
				Thread.sleep(1000);
				System.out.println("cpu 온도상승 +20도");
			}
			if(ch.equals("5")) {
				System.out.println("바탕화면으로 돌아갑니다.");
				return true;
			}
			//temperature -= 10;
			Thread.sleep(1000);
		}
	}
}

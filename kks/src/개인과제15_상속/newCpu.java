package 개인과제15_상속;

import java.util.Scanner;

public class newCpu extends Cpu{

	public newCpu() {
		
	}

	public newCpu(int temperature) {
		super(temperature);
	}

	@Override
	public boolean cpuRun(int work) throws InterruptedException {
		System.out.println("newCpu 정상 작동중 1)실행 5)다른작업 [냉각성능 10]");
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.next();
		while(true) {
			if(temperature > 1000) {
				System.out.println("Cpu 고장");
				return false;
			}
			if(work == 1) {
				temperature += 5;
				Thread.sleep(1000);
			}
			else if(work == 2) {
				temperature += 5;
				Thread.sleep(1000);
			}
			else if(work == 3) {
				temperature += 20;
				Thread.sleep(1000);
				System.out.println("온도상승");
			}
			if(ch.equals("5")) {
				System.out.println("바탕화면으로 돌아갑니다.");
				return true;
			}
			temperature -= 10;
			Thread.sleep(1000);
		}
	}
}

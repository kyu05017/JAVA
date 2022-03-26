package 개인과제15_상속;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Cpu myCpu = new Cpu();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("컴퓨터 사용중");
			System.out.println("1)인터넷 서핑 2)문서작업 3)게임");
			String work = scanner.next();
			
			if(work.equals("1") || work.equals("인터넷")) {
				boolean result = myCpu.cpuRun(1);
				
				if(result == false) {
					System.out.println("Cpu를 교체합니다.");
					myCpu = new newCpu();
					System.out.println("교체완료");
				}
			}
			else if(work.equals("2") || work.equals("문서")) {
				boolean result = myCpu.cpuRun(2);
				if(result == false) {
					System.out.println("Cpu를 교체합니다.");
					myCpu = new newCpu();
					System.out.println("교체완료");
				}
			}
			else if(work.equals("3") || work.equals("게임")) {
				boolean result = myCpu.cpuRun(3);
				if(result == false) {
					System.out.println("Cpu를 교체합니다.");
					myCpu = new newCpu();
					System.out.println("교체완료");
				}
			}
			else {
				System.out.println("컴퓨터 종료");
				break;
			}
		}
	}
}

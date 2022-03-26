package 개인과제15_상속;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		// cpu 객체 생성
		Cpu myCpu = new Cpu();
		// 입력객체 생성
		Scanner scanner = new Scanner(System.in);
		// 무한반복 [ 종료 조건 메뉴외 입력 ]
		while(true) {
			System.out.println("컴퓨터 사용중");
			System.out.println("1)인터넷 서핑 2)문서작업 3)게임");
			String work = scanner.next();
			
			if(work.equals("1") || work.equals("인터넷")) {
				// cpu클래스에 1을 인수로 보내고 변환값을 boolean
				boolean result = myCpu.cpuRun(1);
				// 결과값이 거짓 이라면 상속된 new cpu로 교채
				if(result == false) {
					System.out.println("Cpu를 교체합니다.");
					myCpu = new newCpu();
					System.out.println("교체완료");
				}
			}
			else if(work.equals("2") || work.equals("문서")) {
				// cpu클래스에 2을 인수로 보내고 변환값을 boolean
				boolean result = myCpu.cpuRun(2);
				// 결과값이 거짓 이라면 상속된 new cpu로 교채
				if(result == false) {
					System.out.println("Cpu를 교체합니다.");
					myCpu = new newCpu();
					System.out.println("교체완료");
				}
			}
			else if(work.equals("3") || work.equals("게임")) {
				// cpu클래스에 3을 인수로 보내고 변환값을 boolean
				boolean result = myCpu.cpuRun(3);
				// 결과값이 거짓 이라면 상속된 new cpu로 교채
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

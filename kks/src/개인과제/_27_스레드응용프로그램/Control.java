package 개인과제._27_스레드응용프로그램;

import java.util.Scanner;

public class Control {
	
	
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void song1() {
		System.out.println("가사");
		String work = scanner.next();
		if (work.equals("e")) {
			System.out.println("메세지)) 음악을 종료합니다.");
		}
		else {
			System.out.println("메세");
		}
	}
	
	public static void song2() {
		System.out.println("가사");
		String work = scanner.next();
		if (work.equals("e")) {
			System.out.println("메세지)) 음악을 종료합니다.");
		}
	}

	public static void song3() {
		System.out.println("가사");
		String work = scanner.next();
		if (work.equals("e")) {
			System.out.println("메세지)) 음악을 종료합니다.");
		}
	}

	public static void song4() {
		System.out.println("가사");
		String work = scanner.next();
		if (work.equals("e")) {
			System.out.println("메세지)) 음악을 종료합니다.");
		}
	}

}

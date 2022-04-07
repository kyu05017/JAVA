package 개인과제._27_스레드응용프로그램;

import java.util.Scanner;

public class Control{
	
	
	static Scanner scanner = new Scanner(System.in);
	
	static boolean song1 = true;
	static boolean song2 = true;
	static boolean song3 = true;
	static boolean song4 = true;
	
	public static void song1() {
		
		while(true) {
			System.out.println("아이유 Blueming 가사");
			System.out.println("1)재생 / 일시정지 2)돌아가기");
			String work = scanner.next();
			Song1 song = new Song1();
			if (work.equals("1")) {
				
				if(song1) {
					song.Song1_stop(true); 
					song.start();		
					song1 = false;
				}
				else {
					song.Song1_stop(false);
					song1 = true;
				}
			}
			else if (work.equals("2")) {
				System.out.println("메인메뉴로 돌아갑니다.");
				song.Song1_stop(false);
				break;
			}
		}
	}
	
	public static void song2() {

		while(true) {
			System.out.println("BTS Dynamite 가사");
			System.out.println("1)재생 / 일시정지 2)돌아가기");
			String work = scanner.next();
			Song2 song = new Song2();
			if (work.equals("1")) {
				
				if(song2) {
					song.Song2_stop(true); 
					song.start();		
					song2 = false;
				}
				else {
					song.Song2_stop(false);
					song2 = true;
				}
			}
			else if (work.equals("2")) {
				System.out.println("메인메뉴로 돌아갑니다.");
				song.Song2_stop(false);
				break;
			}
		}
	}

	public static void song3() {
		
		while(true) {
			System.out.println("버스커 버스커 벚꽃 엔딩 가사");
			System.out.println("1)재생 / 일시정지 2)돌아가기");
			String work = scanner.next();
			Song3 song = new Song3();
			if (work.equals("1")) {
				
				if(song3) {
					song.Song3_stop(true); 
					song.start();		
					song3 = false;
				}
				else {
					song.Song3_stop(false);
					song3 = true;
				}
			}
			else if (work.equals("2")) {
				System.out.println("메인메뉴로 돌아갑니다.");
				song.Song3_stop(false);
				break;
			}
		}
	}

	public static void song4() {
		
		while(true) {
			System.out.println("아이유 Blueming 가사");
			System.out.println("1)재생 / 일시정지 2)돌아가기");
			String work = scanner.next();
			Song1 song = new Song1();
			if (work.equals("1")) {
				
				if(song1) {
					song.Song1_stop(true); 
					song.start();		
					song1 = false;
				}
				else {
					song.Song1_stop(false);
					song1 = true;
				}
			}
			else if (work.equals("2")) {
				System.out.println("메인메뉴로 돌아갑니다.");
				song.Song1_stop(false);
				break;
			}
		}
	}

}

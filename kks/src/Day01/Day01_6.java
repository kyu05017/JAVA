package Day01;

import java.util.Scanner;

public class Day01_6 { // c s
	/*
	문제2 : 하나의 방문록 
	[입력변수]
		1. 작성자 , 내용 , 날짜 
	[출력 예]
		 *  --------------방문록--------------------
		 *  | 순번 | 작성자 | 	내용 	  | 날짜  |
		 *  |  1    | 강호동 | 안녕하세요  | 09-28 |
		 *  ----------------------------------------
	*/
	public static void main(String[] args) { // m s 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------- 방명록 ---------");
		System.out.println("작성자 이름을 입력하세요.");
		System.out.println("입력 : ");
		String name = scanner.nextLine();
		System.out.println("내용을 입력하세요.");
		System.out.println("입력 : ");
		String write = scanner.nextLine();
		System.out.println("날짜를 입력하세요. ( 월 / 일 )"); 
		String month = scanner.nextLine();
		String day = scanner.nextLine();
		System.out.println();
		System.out.println("----------------방문록--------------------");
		System.out.println("| 순번 |  작성자  |		내용		 |  날짜  |");
		System.out.println("|  1  | "+name+" | "+write+ " | "+ month + " - " + day);
		System.out.println("----------------------------------------");
		
	} // m e
}//c e
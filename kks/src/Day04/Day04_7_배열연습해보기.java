package Day04;

import java.util.Scanner;

public class Day04_7_배열연습해보기 {

	public static void main(String[] args) {
		
		String[] 과일 = {"사과","바나나","복숭아","포도"};
		int[] 번호 = {1,2,3,4,5,6,7,8,9,10};
		
		int[] 숫자배열 = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력1");
		int 저장1 = scanner.nextInt();
		System.out.println("입력2");
		int 저장2 = scanner.nextInt();
		System.out.println("입력3");
		int 저장3 = scanner.nextInt();
		
		숫자배열[0] = 저장1;
		숫자배열[1] = 저장2;
		숫자배열[2] = 저장3;
		
		System.out.println("출력?");
		System.out.println("1. 과일 2.번호표 3.입력된숫자");
		int input = scanner.nextInt();
		
		if(input == 1) {
			System.out.println(과일[0]);
			System.out.println(과일[1]);
			System.out.println(과일[2]);
			System.out.println(과일[3]);
		}
		else if( input == 2) {
			System.out.println(번호[0]);
			System.out.println(번호[1]);
			System.out.println(번호[2]);
			System.out.println(번호[3]);
			System.out.println(번호[4]);
			System.out.println(번호[5]);
			System.out.println(번호[6]);
			System.out.println(번호[7]);
			System.out.println(번호[8]);
			System.out.println(번호[9]);			
		}
		else if(input == 3) {
			System.out.println(숫자배열[0]);
			System.out.println(숫자배열[1]);
			System.out.println(숫자배열[2]);
		}
	}

}

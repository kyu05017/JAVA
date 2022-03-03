package Day03;

import java.util.Scanner;

public class Day03_6 {//c s

	public static void main(String[] args) {//m s
		
		Scanner scanner = new Scanner(System.in);
		/*
		// 별문제 1 : 입력받은 수 만큼 * 출력
		System.out.println(" 문제 1) 별개수 : " ); int s1 = scanner.nextInt();
		for(int i = 1 ; i <= s1; i ++) {
			System.out.print("*");
		}
		*/
		System.out.println("-----------------------------------------------");
		/*
		// 별문제 2 : 입력받은 수 만큼 8 출력 [5개 마다 줄바꿈 처리]
		System.out.println(" 문제 2) 별개수 : " ); int s2 = scanner.nextInt();		
		for(int i = 1; i <= s2; i++) {
			System.out.print("*");
			if (i % 5 ==0) {
				System.out.println();
			}
		}
		*/
		System.out.println("-----------------------------------------------");
		//별문제3 : 입력받은 줄수 만큼출력
		/*
		System.out.println(" 문제3) 별개수 : " ); int line3 = scanner.nextInt();
		
		for(int i = 1; i <= line3; i++) {
			//i는 1부터 입력핟은 줄 수까지 1씩 증가
			
			// 1. 별찍기
			for(int j = 1;j <= i; j++) {
				System.out.print("*");
			}
			// 2. 줄바꿈
			System.out.println("");
		}
		*/
		//순서도 
			//사용자가 3울 입력했을때 
			//i = 1 i <=3 [True]
				//s = 1  s <= 1 [true] -> * -> s++
				//s = 2  s <= 1 [false]-> 반복문 종료
			//줄바꿈
			//i = 2 i <=3 [true]
				//s = 1  s <= 2 [true] -> * => s++
				//s = 2  s <= 2 [true] -> * => s++
				//s = 3  s <= 2 [false]-> 반복문 종료
			//줄바꿈
			//i = 3 i <=3 [true]
				//s = 1  s <= 2 [true] -> * => s++
				//s = 2  s <= 2 [true] -> * => s++
				//s = 3  s <= 2 [true] -> * => s++
				//s = 4  s <= 2 [false]-> 반복문 종료
		
		System.out.println("-----------------------------------------------");
		//별문제4 : 입력받은 줄수 만큼출력
		/*
		System.out.println(" 문제4) 별개수 : " ); int line4 = scanner.nextInt();
		
		for(int i = line4; i >= 1; i--) {
			//i는 입력받은 수
			
			// 1. 별찍기
			for(int j = 1;j <= i; j++) {
				System.out.print("*");
			}
			// 2. 줄바꿈
			System.out.println("");
		}
		*//*
		for(int i = 1; i <= line4; i++) {
			
			for(int j = 1; j <= line4 -i+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		/*
		System.out.println("-----------------------------------------------");
		//별문제5 : 입력받은 줄수 만큼출력
		
		System.out.println(" 문제5) 별개수 : " ); 
		int line5 = scanner.nextInt();
		
		for(int i = 1; i <= line5;i++) {
			
			//1.공백찍기
			for(int b=1; b <= line5-i;b++) {
				System.out.print(" ");
			}
			//2.별찍기
			for(int s = 1; s <=i; s++) {
				System.out.print("*");
			}
			
			//3.줄바꿈
			System.out.println();
		}
		
		//공백은 1부터 입력받은수 - 현재 줄수 까지 1씩 증가 [문제4 유사]
		//별은 
		*/
		
		System.out.println("-----------------------------------------------");
		//별문제6 : 입력받은 줄수 만큼출력		
		
		System.out.println(" 문제6) 별개수 : " ); 
		int line6 = scanner.nextInt();
		
		for( int i =1 ; i<=line6 ; i++ ) {
			// 1. 공백찍기
			for( int b = 1 ; b<=i-1 ; b++ ) {
				System.out.print(" ");
			}
			// 2. 별찍기 
			for( int s = 1 ; s<=line6-i+1; s++ ) {
				System.out.print("*");
			}
			// 3. 줄바꿈
			System.out.println();
		}
		
		
		System.out.println("-----------------------------------------------");
		//별문제7 : 입력받은 줄수 만큼출력		
	
		System.out.println(" 문제7) 별개수 : " ); 
		int line7 = scanner.nextInt();
		
		for(int i = 1; i <=line7; i++) {
			for (int b = 1;b <= line7-i;b++) {
				System.out.print(" ");
			}
			for (int s=1;s <=i*2-1; s++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*
		System.out.println("-----------------------------------------------");
		//별문제8 : 입력받은 줄수 만큼출력		
		
		System.out.println(" 문제8) 별개수 : " ); 
		int line8 = scanner.nextInt();
		
		for(int i = 1; i <=line8; i++) {
			//System.out.print(i);
			for (int b = 1;b <= line8-i;b++) {
				System.out.print(" ");
			}
			for (int s=1;s <=i*2-1;s++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		*/
		System.out.println("-----------------------------------------------");
		//별문제9 : 입력받은 줄수 만큼출력		
		
		System.out.println(" 문제9) 별개수 : " ); 
		int line9 = scanner.nextInt();
		
		for( int i =1 ; i<=line6 ; i++ ) {
			// 1. 공백찍기
			for( int b = 1 ; b<=i-1 ; b++ ) {
				System.out.print(" ");
			}
			// 2. 별찍기 
			for( int s = 1 ; s<=(line6-i+1)*2-1; s++ ) {
				System.out.print("*");
			}
			// 3. 줄바꿈
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------");
		//별문제10: 입력받은 줄수 만큼출력	
		
		System.out.println(" 문제10) 별개수 : " ); 
		int line10 = scanner.nextInt();		
		
		for(int i = 1; i <=line7; i++) {
			for (int b = 1;b <= line7-i;b++) {
				System.out.print(" ");
			}
			for (int s=1;s <=i*2-1; s++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for( int j =1 ; j<=line6 ; j++ ) {
			// 1. 공백찍기
			for( int b = 1 ; b<=j ; b++ ) {
				System.out.print(" ");
			}
			// 2. 별찍기 
			for( int s = 1 ; s<=(line6-j)*2-1; s++ ) {
				System.out.print("*");
			}
			// 3. 줄바꿈
			System.out.println();
		}
	}//m e
}//c e

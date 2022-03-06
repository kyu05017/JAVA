package Star_Practice;

import java.util.Scanner;

public class Stat_pratice {//c s

	public static void main(String[] args) {//m s
		/*
		 * 
		 * 별문제11 : 입력받은 줄만큼 출력 [ 입력받은 행/열 동일 ] 
		  
		  
		 	*     *		
		 	 *   *	
		 	  * *		
		 	   *		
		 	  * *		
		 	 *   *		
		 	*     *		
			
		 */
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("---------------------------------");
		int line1 = scanner.nextInt();
		for(int i = 1; i <= line1; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("-");
			}
			System.out.print("*");
			System.out.println();
		}
		
		
		System.out.println("---------------------------------");
		int line2 = scanner.nextInt();
		for(int i = 1;i <= line2; i++) {
			for(int j = 1; j <= line2 - i; j++) {
				System.out.print("-");
			}
			System.out.print("*");
			System.out.println();
		}
		*/
		System.out.println("---------------------------------");
		int line3 = scanner.nextInt();
		
		for (int i = 0; i < line3; i++) {
            for (int j = 0; j < (line3 + i); j++) {
            	System.out.print((j == (line3 - i - 1) || j == i) ? "*" : " ");
            }
            System.out.println();
		}
		System.out.println("---------------------------------");

	}//m e
}//c e

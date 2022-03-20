package MyPractice03_Star;

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
			//i가 0 일때 i는 5 미만까지 1씩 증가 하며 반복
            for (int j = 0; j < (line3 + i); j++) {
            	//j가 0 일때 j는 5(5+0) 까지 증가 반복
            	System.out.print((j == (line3 - i - 1) || j == i) ? "*" : " ");
            	//0 과 (5 - 0 - 1 )이 같거나 0과 0이 같으면 * 아니라면 [ ]
            }
            System.out.println();
		}
		//  0 1 2 3 4 
		//0 * - - - * 
		//1 - * - * -
		//2 - - * - -
		//3 - * - * -
		//4 * - - - *
		System.out.println("---------------------------------");
	

	}//m e
}//c e

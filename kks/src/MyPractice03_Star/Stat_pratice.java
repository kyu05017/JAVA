package MyPractice03_Star;

import java.util.Scanner;

public class Stat_pratice {//c s

	public static void main(String[] args) {//m s
		/*
		 * 
		 * ������11 : �Է¹��� �ٸ�ŭ ��� [ �Է¹��� ��/�� ���� ] 
		  
		  
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
			//i�� 0 �϶� i�� 5 �̸����� 1�� ���� �ϸ� �ݺ�
            for (int j = 0; j < (line3 + i); j++) {
            	//j�� 0 �϶� j�� 5(5+0) ���� ���� �ݺ�
            	System.out.print((j == (line3 - i - 1) || j == i) ? "*" : " ");
            	//0 �� (5 - 0 - 1 )�� ���ų� 0�� 0�� ������ * �ƴ϶�� [ ]
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

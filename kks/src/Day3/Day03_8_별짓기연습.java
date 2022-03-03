package Day3;

import java.util.Scanner;

public class Day03_8_별짓기연습 {//c s

	public static void main(String[] args) {//m s
		
		Scanner scanner = new Scanner(System.in);
		
		//별문제3 : 입력받은 줄 만큼 출력
		//				i = 줄    	s = 별
		//*				1			2	
		//**			2			2
		//***			3			3		
		//****			4			4	
		//***** 		5			5


		System.out.println("----------------------------");		
		System.out.println("별문제1) 별갯수 입력");
		int line1 = scanner.nextInt();
		
		for(int i = 1;i <= line1; i++) { //i는 줄
			
			for(int s = 1;s <= i;s++) { //s는 별갯수
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		//별문제4 : 입력받은 줄 만큼 출력
		//				줄		별
		//*****			1		5	
		//****			2		4
		//***			3		3	
		//**			4		2
		//*				5		1
		
		System.out.println("----------------------------");	
		System.out.println("별문제2) 별갯수 입력");
		int line2 = scanner.nextInt();
		
		for(int i = 1; i <= line2; i++) {
			
			for(int s = 1; s <= line2 - i +1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//별문제5 : 입력받은 줄 만큼 출력
	    //			줄		별		공란	
	    //    *	    1		1		4
	    //   **		2		2		3
	    //  ***		3		3		2
	    // ****		4		4		1
	    //*****		5		5		0

		
		System.out.println("----------------------------");	
		System.out.println("별문제3) 별갯수 입력");
		int line3 = scanner.nextInt();		
		
		for(int i = 1; i <= line3; i++) {
			for(int b = 1; b <= line3 - i; b++) {
				System.out.print(" ");
			}
			for(int s = 1; s <= i;s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//별문제6 : 입력받은 줄 만큼 출력
		//			줄		별		공란
		//*****	    1		5		0
		// ****		2		4		1
		//  ***		3		3		2
		//   **		4		2		3
		//    *		5		1		4
		
		System.out.println("----------------------------");	
		System.out.println("별문제4) 별갯수 입력");
		int line4 = scanner.nextInt();	
		
		for(int i = 1; i <= line4; i++) {
			for(int b = 1; b <= i-1; b++) {
				System.out.print(" ");
			}
			for(int s = 1; s <= line4-i+1;s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//		별문제7 : 입력받은 줄 만큼 출력 
		//						i줄			공란1			별 	    	공란2
		//        *				1			4			1			4
		//       ***			2			3			3			3
		//      *****			3			2			5 			2
		//     *******			4			1			7			1	
		//	  *********			5			0			9			0
		
		System.out.println("----------------------------");	
		System.out.println("별문제5) 별갯수 입력");
		int line5 = scanner.nextInt();	
		
		for(int i = 1; i <= line5; i++) {
			for(int b = 1; b <= line5 -i ;b++) {
				System.out.print(" ");
			}	
			for(int s = 1; s <= i*2-1;s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//별문제8 : 입력받은 줄만큼 출력 
		//	      1
		//       222
		//      33333
		//     4444444
		//	  555555555
		
		System.out.println("----------------------------");	
		System.out.println("별문제6) 별갯수 입력");
		int line6 = scanner.nextInt();
		
		for(int i = 1; i <= line6; i++) {
			for(int b = 1; b <= line6 -i ;b++) {
				System.out.print(" ");
			}	
			for(int s = 1; s <= i*2-1;s++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		//별문제9 : 입력받은 줄만큼 출력
		//					줄		별		공란
		//*********			1		9		0
		// *******			2		7		1	
		//  *****			3		5		2
		//   ***			4		3		3
		//    *				5		1		4
		
		System.out.println("----------------------------");	
		System.out.println("별문제7) 별갯수 입력");
		int line7= scanner.nextInt();	
		
		for(int i = 1; i <= line7; i++) {
			for(int b = 1; b <= i -1; b++) {
				System.out.print(" ");
			}
			for(int s = 1; s <= (line7*2)-(i*2-1);s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//		별문제10 : 입력받은 줄만큼 출력
		//							줄		별		공란
		//        *					1		1		4	
		//       ***				2		3		3
		//      *****				3		5		2
		//	   *******				4		7		1
		//	  *********				5		9		0
		//	   *******				6		7		1
		//	    *****				7		5		2	
		//	     ***				8		3		3
		//	      *					9		1		4
		
		System.out.println("----------------------------");	
		System.out.println("별문제8) 별갯수 입력");
		int line8= scanner.nextInt();	
		
		for(int i = 1; i <= line8; i++) {
			
			for(int b = 1; b <= line8 -i; b++) {
				System.out.print(" ");
			}
			for(int s = 1; s <= i*2-1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int j = 1; j <= line8; j++) {
			
			for(int b1 = 1; b1 <= j; b1++) {
				System.out.print(" ");
			}				
			for(int s1 = 1; s1 <= (line8-j)*2-1; s1++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}//m e
}// c e

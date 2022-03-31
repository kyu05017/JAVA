package Day01_to_Day21.Day04;

import java.util.Scanner;

public class Day04_1 { // c s

	public static void main(String[] args) { // m s
		
		// 제어문 : if , switch
		// 반복문 : for , while[무한루프]
		
			// 1. 초기값 2.조건식 3.증감식 4.실행문
			//while 형태
			//	1.초기값;
			//	while(2.조건식) {
			//	
			//	4.실행문
			//	3.중감식;
		
		// for 예1)
		for(int i = 1; i <= 10; i++) {
			//* i는 1부터 10이하 까지 1씩 증가하면서 표준출력으로 출력한다.
			System.out.print(i + " ");
		}//for 끝
		
		System.out.println();
		
		// while 예1)
		int i = 1; //1. 초기값
		while(i <= 10) { //2.조건식
			System.out.print(i + " ");//4.실행문
			 i+=1;//3.증감식
		}//while 끝
		
		System.out.println();
		
		// for 예2)
		int sum = 0;
		for(int j = 1; j <= 100; j++) {
			sum += j;
		}//for 끝
		System.out.println("for문의 100까지의 합"+sum);
		
		System.out.println();
		
		// while 예2)
		int j = 1; //1.초기값
		int sum2 = 0;
		while(j <= 100) {//2. 조건식 [ true이면 실행ㅇ 아니면 불가 ]
			sum2 +=j; // 4.실행문
			j += 1; //3.증감식
		}// while end : j가 101일때 종료
		System.out.println("while 문의 100까지 합"+sum2);
		
		System.out.println();
		
		//while 예3) 무한루프
		while(true) { //조건식이 true 실행 //true 상수 => 무한루프
			System.out.println("무한루프");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if( exit == 3) {
				break;//break 기준으로 가장 가까운 반복문을 탈출 [if는 제외]
			}
		} // while문 종료
		
		
		

	} // m e

}// c e

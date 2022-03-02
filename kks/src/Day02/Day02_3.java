package Day02;

import java.util.Scanner;

public class Day02_3 {

	public static void main(String[] args) {
		
		//문제 1 : 급여계산
		/*
		 * [입력조건]
		 * 		기본금 , 수당
		 * [ 조건  ]
		 *  	실수령액 = 기본급 + 수당 - 세급[10%]
		 * [출력조건]
		 * 		실수령액
		 * */
		
		// 1. 입력 -> 저장 -> 출력
		//1. 입력 객체를 만든다.
		Scanner scanner = new Scanner(System.in);
		
		//2. 입력받은 값을 변수에 저장한다. [입력객체는 입력받을때 마다 사라짐]
		System.out.println("기본급 입력 : "); int 기본급 = scanner.nextInt();
		System.out.println("수당 입력 : ");  int 수당   = scanner.nextInt();
					//입력객체명.nextInt : int 데이터 가져오기
					//입력객체명.next : 문자열 데이터 가져오기
		//3. 변수를 연산(계산) 한다.	
		int 세금 = (int)(기본급*0.1);
		int 실수령액 = 기본급 + 수당 - 세금;
		//출력한다/
		System.out.println("실수령액은" + 실수령액 + "원");
		
		/* 원래 입력한것
		System.out.println("기본급 입력");
		int money = scanner.nextInt();
		System.out.println("수당 입력");
		int plusMoney = scanner.nextInt();
		double total = (money + plusMoney) - 0.1 ;
		System.out.println("실수령액 " + total+"원 입니다.");
		*/
	
				

		
		//문제 2 : 지폐 세기
		/*
		 * [입력조건]
		 * 		금액
		 * [  조건 ]
		 * 		십만원 부터 백원 까지의 개수 세기
		 * [출력조건]
		 * 		예) 356789 입력시
		 * 		십만원 3장
		 * 		만원 5장
		 * 		천원 6장
		 * 		백원 7개
		 * */
		
		System.out.println("계산할 금액 입력");
		int myMoney = scanner.nextInt();
		int m1 = (int)(myMoney/100000);
		int m2 = (myMoney%100000)/10000;
		int m3 = (myMoney%10000)/1000;
		int m4 = (myMoney%1000)/100;
		
		System.out.println("십만원" + m1);
		System.out.println("만원" + m2);
		System.out.println("천원" + m3);
		System.out.println("백원" + m4);
	}

}

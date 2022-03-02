package Day02;

import java.util.Scanner;

public class Day02_5_문제2_문제14 {

	public static void main(String[] args) {
		
		//문제2
		Scanner scanner = new Scanner(System.in);
		
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
		
		//문제3
		
		System.out.println("숫자를 입력");
		int num1 = scanner.nextInt();
		num1 =
		

	}

}

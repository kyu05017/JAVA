package 개인연습.백준;

import java.util.Scanner;

public class 윤년구하기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a >= 1 && a <= 4000) {
			if((a%4)==0  &&(a%100)!=0 || (a%400)==0){
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
	}
}

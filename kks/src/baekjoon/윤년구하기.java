package baekjoon;

import java.util.Scanner;

public class À±³â±¸ÇÏ±â {

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

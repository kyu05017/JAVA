package 개인연습.백준;

import java.util.Scanner;

public class 선택적_구구단 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i = num; i == num ; i ++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
			}
			
		}
		
	}

}

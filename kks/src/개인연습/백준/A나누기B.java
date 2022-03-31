package 개인연습.백준;

import java.util.Scanner;

public class A나누기B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = a/b;
		
		if(a > 0 && b >0) System.out.printf("%.9f",c);

	}

}

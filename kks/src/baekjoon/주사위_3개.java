package baekjoon;

import java.util.Scanner;

public class 주사위_3개 {

	public static void main(String[] args) {
	
	 	Scanner scanner = new Scanner(System.in);
		
		int d1 = scanner.nextInt();
		int d2 = scanner.nextInt();
		int d3 = scanner.nextInt();
		
		
		//System.out.printf("%d %d %d \n",d1,d2,d3);
		
		if (d1==d2 && d2 == d3) {
			System.out.printf("%d",((d1*1000)+10000));
		}
		else if (d1 == d2) {
			System.out.printf("%d",((d1*100)+1000));
		}
		else if (d2 == d3) {
			System.out.printf("%d",((d2*100)+1000));
		}
		else if	(d3 == d1) {
			System.out.printf("%d",((d3*100)+1000));
		}
		else {
			if(d1 > d2 && d1 > d3) {
				System.out.printf("%d",(d1*100));
			}
			else {
				if(d2 > d3) {
					System.out.printf("%d",(d2*100));
				}
				else {
					System.out.printf("%d",(d3*100));
				}
			}
		}
		
	}

}

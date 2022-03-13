package 개인과제_6번째;

import java.util.Random;
import java.util.Scanner;

public class 로또판별기_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[] mynum = new int[6];
		int[] cumnum = new int[6];
		
		
		for(int i = 0;i<mynum.length;i++) {
			System.out.println("1~45 사이 숫자 입력 :");
			int num = scanner.nextInt();
			boolean pass = true;
			
			if(num > 1 || num <45) {
				System.out.println("유효하지 않은 숫자 입니다.");
				i--;
				pass = false;
			}
			for(int j = 0; j < mynum.length;j++) {
				if(num == mynum[i]) {
					System.out.println("이미 선택한 숫자 입니다.");
					i--;
					pass = false;
				}
			}
			if(pass == true) {
				mynum[i] = num;
			}
		}
		System.out.println("당신이 선택한 숫자는");
		for(int temp : mynum) {
			System.out.print(temp+"\t");
		}
		
		for(int i =0; i < cumnum.length; i++) {
			int cnum = random.nextInt(45)+1;
			boolean pass2 = true;
			
			for(int temp : cumnum) {
				if( temp == cnum) {
					i--;
					pass2 = false;
				}
			}
			if(pass2 == true) {
				cumnum[i] = cnum;
			}
		}
		
		int i = 0;
		
		for(int temp1 : mynum) {
			for(int temp2 : cumnum) {
				if(temp1 == temp2) {
					i++;
				}
			}
		}
		System.out.println("당첨된 숫자횟수 : "+i);
	}
}

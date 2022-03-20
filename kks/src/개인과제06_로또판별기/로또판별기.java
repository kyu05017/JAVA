package 개인과제06_로또판별기;

import java.util.Random;
import java.util.Scanner;

public class 로또판별기 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[] mynum = new int[6];
		int[] comnum = new int[6];
		
		for(int i = 0; i < mynum.length; i++) {
			System.out.println("1~45 숫자 입력");
			int num = scanner.nextInt();
			boolean pass = true;
			
			if(num < 1 || num > 45) {
				System.out.println("잘못된 숫자 선택입니다.");
				i--;
				pass = false;
			}
			for(int j = 0;j < mynum.length;j++) {
				if(num == mynum[j]) {
					System.out.println("이미 선택한 숫자 입니다.");
					i--;
					pass = false;
				}
			}
			if(pass == true) {
				mynum[i] = num;
			}
		}
		System.out.println("당신이 선택한 숫자");
		for(int temp : mynum) {
			System.out.print(temp +"\t");
		}
		
		for(int i = 0; i < comnum.length;i++) {
			int comn = random.nextInt(45)+1;
			boolean pass2 = true;
			
			for(int temp : comnum) {
				if(comn == temp) {
					i--;
					pass2 = false;
				}
			}
			if(pass2 == true) {
				comnum[i] = comn;
			}
			
		}
		int i = 0;
		for(int temp1 : mynum) {
			for(int temp2 : comnum) {
				if(temp1 == temp2) {
					i++;
				}
			}
		}
		System.out.println("당첨됫 숫자의 갯수 :" + i);
	}
}

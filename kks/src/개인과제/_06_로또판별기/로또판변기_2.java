package 개인과제._06_로또판별기;

import java.util.Random;
import java.util.Scanner;

public class 로또판변기_2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[] mynum = new int[6];
		int[] chnum = new int[6];
		
		for(int i = 0;i<6;i++) {
			System.out.println("1~45 사이에 숫자를 입력하세요>");
			int num = scanner.nextInt();
			boolean pass = true;
			
			if(num < 1 || num > 45) {
				System.out.println("유효하지 않는 숫자입니다.");
				i--;
				pass = false;
			}
			for(int j = 0; j > 6; j++) {
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
		
		System.out.println("내가 선택한 숫자 :");
		for(int temp : mynum) {
			System.out.print(temp+"\t");
		}
		
		for(int i = 0; i <6; i++) {
			int ch = random.nextInt(45)+1;
			boolean pass2 = true;
			
			for(int temp : chnum){
				if(ch == temp) {
					i--;
					pass2 = false;
				}
			}
			if(pass2 == true) {
				chnum[i] = ch;
			}
		}
		int i =0;
		for(int temp : mynum) {
			for(int temp2 : chnum) {
				if(temp == temp2) {
					i++;
				}
			}
		}
		System.out.println("동일한 숫자 개수 :"+ i);
	}
}

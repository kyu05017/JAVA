package ���ΰ���._06_�ζ��Ǻ���;

import java.util.Random;
import java.util.Scanner;

public class �ζ��Ǻ���_2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[] mynum = new int[6];
		int[] chnum = new int[6];
		
		for(int i = 0;i<6;i++) {
			System.out.println("1~45 ���̿� ���ڸ� �Է��ϼ���>");
			int num = scanner.nextInt();
			boolean pass = true;
			
			if(num < 1 || num > 45) {
				System.out.println("��ȿ���� �ʴ� �����Դϴ�.");
				i--;
				pass = false;
			}
			for(int j = 0; j > 6; j++) {
				if(num == mynum[j]) {
					System.out.println("�̹� ������ ���� �Դϴ�.");
					i--;
					pass = false;
				}
			}
			if(pass == true) {
				mynum[i] = num;
			}
		}
		
		System.out.println("���� ������ ���� :");
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
		System.out.println("������ ���� ���� :"+ i);
	}
}

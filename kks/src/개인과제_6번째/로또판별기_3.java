package ���ΰ���_6��°;

import java.util.Random;
import java.util.Scanner;

public class �ζ��Ǻ���_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[] mynum = new int[6];
		int[] cumnum = new int[6];
		
		
		for(int i = 0;i<mynum.length;i++) {
			System.out.println("1~45 ���� ���� �Է� :");
			int num = scanner.nextInt();
			boolean pass = true;
			
			if(num > 1 || num <45) {
				System.out.println("��ȿ���� ���� ���� �Դϴ�.");
				i--;
				pass = false;
			}
			for(int j = 0; j < mynum.length;j++) {
				if(num == mynum[i]) {
					System.out.println("�̹� ������ ���� �Դϴ�.");
					i--;
					pass = false;
				}
			}
			if(pass == true) {
				mynum[i] = num;
			}
		}
		System.out.println("����� ������ ���ڴ�");
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
		System.out.println("��÷�� ����Ƚ�� : "+i);
	}
}

package ���ΰ���06_�ζ��Ǻ���;

import java.util.Random;
import java.util.Scanner;

public class �ζ��Ǻ��� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[] mynum = new int[6];
		int[] comnum = new int[6];
		
		for(int i = 0; i < mynum.length; i++) {
			System.out.println("1~45 ���� �Է�");
			int num = scanner.nextInt();
			boolean pass = true;
			
			if(num < 1 || num > 45) {
				System.out.println("�߸��� ���� �����Դϴ�.");
				i--;
				pass = false;
			}
			for(int j = 0;j < mynum.length;j++) {
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
		System.out.println("����� ������ ����");
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
		System.out.println("��÷�� ������ ���� :" + i);
	}
}

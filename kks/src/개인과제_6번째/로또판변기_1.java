package ���ΰ���_6��°;

import java.util.Random;
import java.util.Scanner;

public class �ζ��Ǻ���_1 {
	public static void main(String[] args) {
		
		int[] mynum = new int[6];
		int[] chnum = new int[6];
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		for(int i = 0; i < 6; i++) {
			System.out.println("1~45 ���� �Է�");
			int num = scanner.nextInt();
			boolean pass = true;
			
			if(num < 1 || num > 45) {
				System.out.println("��ȿ���� �ʴ� ��ȣ �Դϴ�.");
				i--;
				pass = false;
			}
			
			for(int j = 0; j < 6; j++) {
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
		
		System.out.println("����ڰ� ������ ��ȣ : ");
		for(int temp : mynum) {
			System.out.print(temp+"\t");
		}
		
		for(int i = 0; i < 6; i++) {
			int choice = scanner.nextInt(45)+1;
			boolean pass2 = true;
			for(int temp : chnum) {
				if(choice == temp) {
					i--;
					pass2 = false;
				}
			}
			if(pass2 == true) {
				chnum[i] = choice;
			}
		}
		
		int index = 0;
		for(int temp1 : mynum) {
			for(int temp2 : chnum) {
				if(temp1 == temp2) {
					index++;
				}
			}
		}
		System.out.println("���� ���� ���� : "+ index);
	}
}

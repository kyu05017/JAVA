package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4 {
	
	public static void main(String[] args) {
		
		
		
		
		// ������ȣ ���� ���α׷�
		// [����]
			// 1. ���� 0000 ~9999 �� �� 10���� ����
			// 2. ��� ���� ��ȣ �迭�� ����
			// 3. ���ڸ� ��ȣ Ȧ�� ���� ���
			// 4. ���ڸ� ��ȣ ¦�� ���� ���
		
		
		Random random = new Random();
		String[] carlsit = new String[10];
		String[] evenlist = new String[10]; 
		String[] oddlist = new String[10];
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("¦������ ����");
			for(String temp : evenlist) {
				if(temp != null) {
					System.out.println(temp);
				}
			}
			System.out.println("Ȧ������ ����");
			for(String temp : oddlist) {
				if(temp != null) {
					System.out.println(temp);
				}
			}
			
			System.out.println("1.�������� 2.Ȧ��¦��Ȯ��"); int ch = scanner.nextInt();
			if(ch == 1) {
				boolean pass = false;
				int carNum = random.nextInt(10000);
				String strnum = String.format("%04d", carNum);
											// ����
						// %d : ����
												// %d���� : ���ڸ�ŭ �ڸ��� [ ���� �ش� �ڸ����� ������ ����]
												// %d0���� : ���ڸ�ŭ �ڸ��� [ ���� �ش� �ڸ����� ������ 0 ]
				
				
				for(int i = 0; i < carlsit.length; i++) {
					if(carlsit[i] != null &&carlsit[i].equals(strnum)) {
						pass = false;
					}
				}
				
				for(int i = 0; i < carlsit.length; i++) {
					if(carlsit[i] == null ) {		 
						carlsit[i] = strnum;
						pass = true;
						break;
					}
				}
				for(String temp : carlsit) {
					if(temp != null) {
						if(Integer.parseInt(temp) %2 == 0) {
							for(int i = 0; i<evenlist.length; i++) {
								if(evenlist[i] == null) {
									evenlist[i] = temp;
									break;
								}
							}
						}
						else {
							for(int i = 0; i<oddlist.length; i++) {
								if(oddlist[i] == null) {
									oddlist[i] = temp;
									break;
								}
							}
						}
					}
				}
				if(pass == false) {
					System.out.println("�����Դϴ�.");
				}
			}
			else if(ch == 2) {
				int num = 0;
				for(int i = 0; i < carlsit.length; i++) {
					if(carlsit[i] != null) {
						num = Integer.parseInt(carlsit[i].substring(3));
					}
				}
				System.out.println("1¦�� 2Ȧ��");
				int ch2 = scanner.nextInt();
				
				if(ch2 == 1) {
					for(int i = 0; i < carlsit.length; i++) {
						if(carlsit[i] != null) {
							num = Integer.parseInt(carlsit[i].substring(3));
							if(num%2==0) {
								System.out.println(num);
								
							}
						}
					}
				}
				else if(ch2 == 2) {
					for(int i = 0; i < carlsit.length; i++) {
						if(carlsit[i] != null) {
							num = Integer.parseInt(carlsit[i].substring(3));
							if(num%2!=0) {
								System.out.println(num);
								
							}
						}
					}
				}
				System.out.println("----------");
				
			}
			
		}
	}
}

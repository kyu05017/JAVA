package Day03;

import java.util.Scanner;

public class Day03_6 {//c s

	public static void main(String[] args) {//m s
		
		Scanner scanner = new Scanner(System.in);
		/*
		// ������ 1 : �Է¹��� �� ��ŭ * ���
		System.out.println(" ���� 1) ������ : " ); int s1 = scanner.nextInt();
		for(int i = 1 ; i <= s1; i ++) {
			System.out.print("*");
		}
		*/
		System.out.println("-----------------------------------------------");
		/*
		// ������ 2 : �Է¹��� �� ��ŭ 8 ��� [5�� ���� �ٹٲ� ó��]
		System.out.println(" ���� 2) ������ : " ); int s2 = scanner.nextInt();		
		for(int i = 1; i <= s2; i++) {
			System.out.print("*");
			if (i % 5 ==0) {
				System.out.println();
			}
		}
		*/
		System.out.println("-----------------------------------------------");
		//������3 : �Է¹��� �ټ� ��ŭ���
		/*
		System.out.println(" ����3) ������ : " ); int line3 = scanner.nextInt();
		
		for(int i = 1; i <= line3; i++) {
			//i�� 1���� �Է����� �� ������ 1�� ����
			
			// 1. �����
			for(int j = 1;j <= i; j++) {
				System.out.print("*");
			}
			// 2. �ٹٲ�
			System.out.println("");
		}
		*/
		//������ 
			//����ڰ� 3�� �Է������� 
			//i = 1 i <=3 [True]
				//s = 1  s <= 1 [true] -> * -> s++
				//s = 2  s <= 1 [false]-> �ݺ��� ����
			//�ٹٲ�
			//i = 2 i <=3 [true]
				//s = 1  s <= 2 [true] -> * => s++
				//s = 2  s <= 2 [true] -> * => s++
				//s = 3  s <= 2 [false]-> �ݺ��� ����
			//�ٹٲ�
			//i = 3 i <=3 [true]
				//s = 1  s <= 2 [true] -> * => s++
				//s = 2  s <= 2 [true] -> * => s++
				//s = 3  s <= 2 [true] -> * => s++
				//s = 4  s <= 2 [false]-> �ݺ��� ����
		
		System.out.println("-----------------------------------------------");
		//������4 : �Է¹��� �ټ� ��ŭ���
		/*
		System.out.println(" ����4) ������ : " ); int line4 = scanner.nextInt();
		
		for(int i = line4; i >= 1; i--) {
			//i�� �Է¹��� ��
			
			// 1. �����
			for(int j = 1;j <= i; j++) {
				System.out.print("*");
			}
			// 2. �ٹٲ�
			System.out.println("");
		}
		*//*
		for(int i = 1; i <= line4; i++) {
			
			for(int j = 1; j <= line4 -i+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		/*
		System.out.println("-----------------------------------------------");
		//������5 : �Է¹��� �ټ� ��ŭ���
		
		System.out.println(" ����5) ������ : " ); 
		int line5 = scanner.nextInt();
		
		for(int i = 1; i <= line5;i++) {
			
			//1.�������
			for(int b=1; b <= line5-i;b++) {
				System.out.print(" ");
			}
			//2.�����
			for(int s = 1; s <=i; s++) {
				System.out.print("*");
			}
			
			//3.�ٹٲ�
			System.out.println();
		}
		
		//������ 1���� �Է¹����� - ���� �ټ� ���� 1�� ���� [����4 ����]
		//���� 
		*/
		
		System.out.println("-----------------------------------------------");
		//������6 : �Է¹��� �ټ� ��ŭ���		
		
		System.out.println(" ����6) ������ : " ); 
		int line6 = scanner.nextInt();
		
		for( int i =1 ; i<=line6 ; i++ ) {
			// 1. �������
			for( int b = 1 ; b<=i-1 ; b++ ) {
				System.out.print(" ");
			}
			// 2. ����� 
			for( int s = 1 ; s<=line6-i+1; s++ ) {
				System.out.print("*");
			}
			// 3. �ٹٲ�
			System.out.println();
		}
		
		
		System.out.println("-----------------------------------------------");
		//������7 : �Է¹��� �ټ� ��ŭ���		
	
		System.out.println(" ����7) ������ : " ); 
		int line7 = scanner.nextInt();
		
		for(int i = 1; i <=line7; i++) {
			for (int b = 1;b <= line7-i;b++) {
				System.out.print(" ");
			}
			for (int s=1;s <=i*2-1; s++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*
		System.out.println("-----------------------------------------------");
		//������8 : �Է¹��� �ټ� ��ŭ���		
		
		System.out.println(" ����8) ������ : " ); 
		int line8 = scanner.nextInt();
		
		for(int i = 1; i <=line8; i++) {
			//System.out.print(i);
			for (int b = 1;b <= line8-i;b++) {
				System.out.print(" ");
			}
			for (int s=1;s <=i*2-1;s++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		*/
		System.out.println("-----------------------------------------------");
		//������9 : �Է¹��� �ټ� ��ŭ���		
		
		System.out.println(" ����9) ������ : " ); 
		int line9 = scanner.nextInt();
		
		for( int i =1 ; i<=line6 ; i++ ) {
			// 1. �������
			for( int b = 1 ; b<=i-1 ; b++ ) {
				System.out.print(" ");
			}
			// 2. ����� 
			for( int s = 1 ; s<=(line6-i+1)*2-1; s++ ) {
				System.out.print("*");
			}
			// 3. �ٹٲ�
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------");
		//������10: �Է¹��� �ټ� ��ŭ���	
		
		System.out.println(" ����10) ������ : " ); 
		int line10 = scanner.nextInt();		
		
		for(int i = 1; i <=line7; i++) {
			for (int b = 1;b <= line7-i;b++) {
				System.out.print(" ");
			}
			for (int s=1;s <=i*2-1; s++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for( int j =1 ; j<=line6 ; j++ ) {
			// 1. �������
			for( int b = 1 ; b<=j ; b++ ) {
				System.out.print(" ");
			}
			// 2. ����� 
			for( int s = 1 ; s<=(line6-j)*2-1; s++ ) {
				System.out.print("*");
			}
			// 3. �ٹٲ�
			System.out.println();
		}
	}//m e
}//c e

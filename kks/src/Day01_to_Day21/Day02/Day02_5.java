package Day01_to_Day21.Day02;

import java.util.Scanner;

public class Day02_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����� �ݾ� �Է�");
		int myMoney = scanner.nextInt();
		int m1 = (int)(myMoney/100000);
		int m2 = (myMoney%100000)/10000;
		int m3 = (myMoney%10000)/1000;
		int m4 = (myMoney%1000)/100;
		
		System.out.println("�ʸ���" + m1);
		System.out.println("����" + m2);
		System.out.println("õ��" + m3);
		System.out.println("���" + m4);
		
		//����3 : �ϳ��� ������ �Է� �޾� 7�� ������� ���
		
		

	}

}

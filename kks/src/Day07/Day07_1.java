package Day07;

import java.util.Scanner;

public class Day07_1 { // c s

	public static void main(String[] args) {
		
		//�޼ҵ� ȣ���ϴ� ���
			// 1.�޼ҵ尡 �����ϴ� Ŭ������ ��ü�� �ʿ�
			// 2. ��ü��.�޼ҵ��()
				// EX) scanner.nextInt();
					// .(��Ʈ) : ���ٿ����� ( �ʵ峪 �޼ҵ� ȣ��� )
		
		
			
		// 1.��ü ����
		Calculator myCalc = new Calculator();
		Scanner sc = new Scanner(System.in);
		//Ŭ������ ��ü��[�̸�] = �޸��Ҵ� ������();
		
		// 2.�޼ҵ� ȣ��
		myCalc.powerOn();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 3. �޼ҵ� ȣ�� [ �μ� 2�� ]
		int result1 = myCalc.plus(a, b);
			// * plus�޼ҵ忡 5�� 6�� �����Ŀ�
			// * 11�̶�� ������� �޾Ƽ� result1�� ����
		System.out.println("result1 : " + result1);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		// 4. �޼ҵ� ȣ��
		
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		// 5. �޼ҵ� ȣ��
		myCalc.powerOff();
	}// m e

}// c e

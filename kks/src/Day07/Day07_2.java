package Day07;

import java.util.Scanner;

public class Day07_2 {

	public static void main(String[] args) {
		// p.223 ~ 224 : ���ϰ��� ���� �޼ҵ�[ void ]
		
		// 1.��ü ����
		Scanner sc = new Scanner(System.in);
		Car myCar = new Car();
		int input = sc.nextInt();
		
		// 2. �޼ҵ� ����
		myCar.setGas(input);
		//	 myCar.gas = 5;
		
		// 3.�޼ҵ� ȣ�� [ �μ�x ��ȯ = �� �Ǵ� ���� ]
		if (myCar.isLeftGas()) {
			System.out.println("����մϴ�.");
			// 4. �޼ҵ� ȣ�� [ �μ� x ]
			myCar.run();
		}
		/*
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		*/
		// 3.�޼ҵ� ȣ�� [ �μ�x ��ȯ = �� �Ǵ� ���� ]
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}
		else {
			System.out.println("gas�� �����ϼ���");
		}
	}

}

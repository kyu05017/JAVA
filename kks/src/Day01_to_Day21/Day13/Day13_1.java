package Day01_to_Day21.Day13;

import java.util.Random;

public class Day13_1 {
	
	public static void main(String[] args) {
		
		// p.534 : Math Ŭ���� (java.lang��Ű��)  [ ���а��� �޼ҵ� ] ��ü���� ��밡�� static 
		
		System.out.println("���밪 : "+ Math.abs(-5));
		System.out.println("���밪 : "+ Math.abs(-3.14));
		

		System.out.println("�ø��� = " +  Math.ceil(5.3)); // �Ҽ��� ù°�ڸ����� �ø�
		System.out.println("�ø��� = " + Math.ceil(-5.3));

		System.out.println("������ = " + Math.floor(5.3)); // ������
		System.out.println("������ = " + Math.floor(-5.3));
		
		System.out.println("�ִ밪 = " + Math.max(5, 9));	// �ΰ� �ۿ� �ȉ�
		System.out.println("�ִ밪 = " + Math.max(5.3, 2.5));
		
		System.out.println("�ּҰ� = " + Math.min(5, 9)); 
		System.out.println("�ּҰ� = " + Math.min(5.3, 2.5));

		System.out.println("������ = " + Math.random()); // 0 ���� 1 ���̿� Double�� ���� �߻�
		// vs
		Random random = new Random();
		System.out.println("���� Ŭ���� ������ = " + random.nextInt());
		
		System.out.println("����� ������ �Ǽ��� = " + Math.rint(5.3)); // �ݿø� [ 5 �̻� �ø� ] �Ǽ���
		System.out.println("����� ������ �Ǽ��� = " + Math.rint(5.7));		
		
		System.out.println("����� ������ ������ = " + Math.round(5.3)); // �ݿø� [ 5 �̻� �ø� ] ������
		System.out.println("����� ������ ������ = " + Math.round(5.7));
		
		// 8. Ư�� �Ҽ������� �ݿø�
		double value = 12.3456;
		double temp1 = value*100;
		long temp2 = Math.round(temp1);
		double value2 = temp2/100.0; // 100�̶�� ���� Int ���̱� ������ �ȵȴ�. [ �Ϲ������� ���ڸ� �Է��ϸ� �⺻������ Int������ �ͽ��Ѵ� ] 
		System.out.println("����� �� " + value);
		System.out.println("100�� ���� �� "+ temp1);
		System.out.println("�ݿø� �� �� "+ temp2);
		System.out.println("�Ҽ� 3°�ڸ� �ݿø� = " +value2);
		
		// 10. p536 : �ֻ���
		System.out.println("0~1 ���� �Ǽ��� = " + Math.random() ); // 0~1
		int num = (int)(Math.random() * 6)+1; // 0~0.999999999999 * 6 > 0~6 +1 > 1~7
			// (�⺻�ڷ���) ��/���� = ��������ȯ ( ū���� > �������� : ������ �ս� )
			// double > int : ������ ��ȯ�� �Ҽ����� ©��
		System.out.println("�ֻ����� �� = " + num);
		System.out.println("�ֻ����� �� = " +((int)(Math.random() * 6)+1));
		
		int num2 = (random.nextInt(6) + 1); // 0~5 +1 > 1~6 
		// ����ȯ�� �ʿ� ����.
		System.out.println("�ֻ����� �� = " + num2);
		System.out.println("�ֻ����� �� = " + (random.nextInt(6) + 1));
		
		
	}	
	
}

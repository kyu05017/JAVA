package Day08;

public class Day08_1 {

	public static void main(String[] args) {

		//p.238
			// ��������
			// �������� ������ = ���α׷� ������ ���Ǵ� �޸�
		
		// 1. Ŭ������ �ʵ�,�޼ҵ� ���ٹ��
			// (����ƽ �ɹ��� �ƴҶ� )1. ��ü�� ���� -> ��ü.(��Ʈ) �ɹ��̸�
				// ��ü�� �������� new �����ڷ� ��ü �޸�(���) �޸� �Ҵ� 
		Calculator calculator = new Calculator();
		System.out.println("��ü�� �̿��� �ɹ� ���� : " + calculator.pi);
		
			//(����ƽ �ɹ��϶�) 1. Ŭ������ .�ɹ�
				// Ŭ���� �ε� �ǰ� �޼ҵ� ������ static ������ �޸� �Ҵ�
		System.out.println("��ü���� �ɹ����� : " + Calculator.pi);
		
		double result = 10*10*Calculator.pi;
									// Ŭ������.����������
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}

package Day14;

public class Day14_3 {
	
	public static void main(String[] args) {
		
		// �޼ҵ� = �Լ�
			
			// �޼ҵ� ȣ�� ��� [ 1. ��ü 2. static ] 
		
		// 1. ��ü
		controller controller = new controller();
		controller.carIn1("1234");
		// 2. static 
		controller.carIn2("1234");
			// �μ� : �޼ҵ� ������ ���� ������ [ �޼ҵ尡 ������ �ڷ������� ���� ]
			// ��ȯ : ���ҵ� ������ ������ ������ [ �޼ҵ� ȣ���� ��ȯ ���� ] 
		
		// 1. �μ� o ��ȯ o
		
		boolean result = controller.carIn2("1234");
			// �޼ҵ忡 1234���ڸ� �μ��� ������ ��ȯ���� boolean true �� ����
		
		// 2. �μ� o ��ȯ x
		controller.carOut("1234");
			// �޼ҵ忡 1234���ڸ� �μ��� ������ ��ȯ�� ����
		
		// 3. �μ� x ��ȯ o
		String result2 =  controller.saleList();
			// �޼ҵ忡 �μ��� ���� �޼ҵ����� ����
		
		// 4. �μ� x ��ȯ x 
		controller.carlist();
			// �޼ҵ忡 �μ� ���� ������ �޼ҵ��� ��ȯ���� ����.
		
		// *@Override
			// ������ �޼ҵ�� ������ �μ� �� �޼ҵ尡
			// ����Ŭ���� or �������̽��� ������ ��� ������
			// ��� : �޼ҵ带 �����޾Ҵµ� > �޼ҵ� �籸�� [ extends ]
			// �������̽� : �߻�޼ҵ忡 �����ϱ� -> ������ �޼ҵ忡 ���� [ implements ] 
		// *�߻�޼ҵ�
			// ����θ� ���� �����δ� ���� [ { } �߰�ȣ�� ���� ]
		// *static / final
	}
}

package Day06;

public class Day06_5 {

	public static void main(String[] args) {
		// p.207
		
		// 1. ������ ���� �ʵ忡 ���ֱ�
		Korean k1 = new Korean();
			k1.name = "���缮";// �ʵ忡 ���� ���� �����Ѵ�
			k1.ssn = "123123-1231237";
		System.out.println("(�������)k1�� ���� :" + k1.nation);
		System.out.println("(�������)k1�� �̸� :" + k1.name);
		System.out.println("(�������)k1�� ��Ϲ�ȣ :" + k1.ssn);
		// 2. �ʵ� 2���� ���� �����ڷ� ��ü ����
		Korean k2 = new Korean("���ڹ�","123123-1231237");
		System.out.println("k2�� ���� :" + k2.nation);
		System.out.println("k2�� �̸� :" + k2.name);
		System.out.println("k2�� ��Ϲ�ȣ :" + k2.ssn);
		
		
	}

}

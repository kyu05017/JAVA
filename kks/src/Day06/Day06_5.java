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
		/////////////////////////////////////////////////
			// 1. ������� ��ü
		Korean �ѱ���1 = new Korean();
			//�ѱ���1�� ������ ���ѹα��̰� �̸� �ֹι�ȣ�� ����.
		
			// 2. �ʵ� 1�� ������ ��ü ����
		Korean �ѱ���2 = new Korean("���缮");
			//�ѱ���2�� ������ ���ѹα��̰� �̸��� ���缮�̰� �ֹε�Ϲ�ȣ�� ����.
		
			// 3. �ʵ� 2�� ������ ��ü ����
		Korean �ѱ���3 = new Korean("��ȣ��", "123456-1234567");
			//�ѱ���3�� ������ ���ѹα��̰� �̸��� ��ȣ���̰� �ֹε�Ϲ�ȣ�� �ִ�.
		
			// 4. �ʵ� 3�� ������ ��ü ����
		Korean �ѱ���4 = new Korean("�Ϻ�", "�ŵ���", "123456-1234567");
			//�ѱ���4�� ������ �Ϻ����� �ٲ���� �̸��� �ŵ��� �ֹε�Ϲ�ȣ�� ����
		
		System.out.println("�ѱ���1 "+�ѱ���1.nation);
		System.out.println("�ѱ���2 "+�ѱ���2.nation+" "+�ѱ���2.name);
		System.out.println("�ѱ���3 "+�ѱ���3.nation+" "+�ѱ���3.name+" "+�ѱ���3.ssn);
		System.out.println("�ѱ���4 "+�ѱ���4.nation+" "+�ѱ���4.name+" "+�ѱ���4.ssn);
	}

}

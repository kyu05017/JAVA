package Day08_4;

import Day08_3.A;

public class C {
	//AŬ������ ��Ű�� �ٸ� Ŭ������ �ٸ�
		//public �� ��밡��
	
	//�ʵ�
	A a1 = new A(true);
	//A a2 = new A(1); 	 // �Ұ���
	//A a3 = new A("���ڿ�");// �Ұ���
	
	
	//������
	
	public C() {
		A a = new A(true);
		a.field1 = 1;
		//a.field2 = 1;
		//a.field3 = 1;
		
		a.method();
		//a.method2();
		//a.method3();
	}
	
	
	
}

package Day08_3;

public class B {
	//A�� ��Ű���� ������ Ŭ������ �ٸ�
		//public, default ��밡�� 
		//private ���Ұ�
	
	//�ʵ�
	A a1 = new A(true);		// o
	A a2 = new A(1);		// o
	//A a3 = new A("���ڿ�"); // x
	//������
	public B() {
		
		A a = new A(true);
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 =1;
		
		a.method();
		a.method2();
		//a.method3();
		
	}
	
	//�޼ҵ�
	
}

package Day08_3;

public class A { // ������ Ŭ������ ���������� ����ǹ�X
//������ Ŭ�������� A
	
	//�ʵ�
	A a1 = new A(true);  // ���� Ŭ�������� public  ȣ�Ⱑ��
	A a2 = new A(1); 	 // ���� Ŭ�������� default ȣ�Ⱑ��
	A a3 = new A("���ڿ�");// ���� Ŭ�������� private ȣ�Ⱑ��
	
	public int field1;
	int field2;
	private int field3;
	
	//������
	public A(boolean b) { //������
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method();
		method2();
		method3();
	} // ������
	A(int b){} 			   // defualt �� ��Ű��
	private A(String s) {} // �� Ŭ���� ��
	
	//�޼ҵ�
	public void method() {}
	void method2() {}
	private void method3() {}
	
}

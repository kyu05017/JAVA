package Day01_to_Day21.Day08;

public class Person {
	
	//static + final �Һ���� : ���α׷� ���������� ���Ǵ� ���
	static final double pi = 3.14;
	//static : ���α׷� ���������� ���Ǵ� ����
	static double pi2 = 3.14;
	//final : ��ü������ ���Ǵ� ���
	final double pi3 = 3.14;
	
	
	// 1.�ʵ�
	final String nation = "Korean"; //final �������� �����Ұ�
	final String ssn;//final �������� �����Ұ�
	String name;
	// 2. ������ [  ��ü�� �ʱⰪ ]
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	// 3. �޼ҵ�
}

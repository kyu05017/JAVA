package Day01_to_Day21.Day15;

public class Person extends Jobs{
	
	// �ʵ�
	String name;
	
	// ������
	public Person(String name) {
		this.name = name;
	}
	
	// �޼ҵ�
	public void callname() {
		System.out.println("�θ�Ŭ���� ���� ����");
		System.out.println(this.name);
	}
	
}

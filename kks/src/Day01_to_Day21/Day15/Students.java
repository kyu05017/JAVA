package Day01_to_Day21.Day15;
				// ���
public class Students extends Person{
			// �ڽ�Ŭ���� extends �θ�Ŭ����
	//�ʵ�
	String name;
	
	public Students(String name ) {
		super(name);
	}
	
	public void callname() {
		System.out.println("�ڽ�Ŭ�������� ����");
		System.out.println("�̸� " + this.name);
		System.out.println("�̸� " + super.name);
		// ����� ������ �� Ŭ������ ���� �ʵ带
		// �θ�Ŭ������ �����ϸ� ��밡�� 
	}
}

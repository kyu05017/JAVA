package Day01_to_Day21.Day10;

public class Parent {
	//�ʵ�
	public String nation;
	
	//������


	public Parent() { // ���� ������
		this("���ѹα�");
		System.out.println(" 2. Parant() call");
	}
	// �޼ҵ� 
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println(" 1. Parnat String nation call");
	}
	// �޼ҵ� 
}

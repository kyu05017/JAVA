package Day01_to_Day21.Day09;

public class Callphone { // Ŭ���� ����
	
	//�ʵ�
	String model;
	String color;
/////////////////////////////////////////////////////////////////////////////////////////////////////
	//������
	public Callphone() {
		
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////
	//�޼ҵ� [ void�� return ���� �����ϴ� ]
	//�޴� �μ��� ���� ��ȯ�ϴ� Ÿ�Ե� ����
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	
	// ��ȯ Ÿ���� ������ �μ��� ����
	void sendVoice(String message) {
		System.out.println("�� : " + message);
	}
	void receveVoice(String message) {
		System.out.println("���� : "+ message);
	}
	
	//�޴� �μ��� ���� ��ȯ�ϴ� Ÿ�Ե� ����
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
}

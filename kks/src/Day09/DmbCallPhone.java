package Day09;

public class DmbCallPhone extends Callphone {
	// ����Ŭ������ ����Ŭ���� ���� => extends ����Ŭ����
		// ����Ŭ������ ����Ŭ���� �ɹ� ��밡��
	
	//�ʵ�
	int channel;
	
	//������
	public DmbCallPhone(String model, String color, int channel) {
		super();
		this.model = model;		//this.�ʵ��
		this.color = color;		//this.�ʵ��
		// * ���� Ŭ������ ���� �ʵ� ������ ����Ŭ������ �ɹ� ȣ��
		
		this.channel = channel; //this.�ʵ��
	}
	//�޼ҵ�
	//��ȯ���� ���� �μ����� ���� �ʴ´�.
	void turnOnDmb(){
		System.out.println("ä�� "+channel + "�� DMB��� ������ �������ϴ�.");
	}
	// ��ȯ���� ���� �ν� channel�� �޴´�.
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� "+channel+"������ �����մϴ�.");
	}
	//��ȯ���� ���� �μ����� ���� �ʴ´�.
	void turnOffDmb() {
		System.out.println("DMB ��� ������ �����մϴ�.");
	}
}

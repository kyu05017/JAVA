package Day09;

public class Day09_2 {
	public static void main(String[] args) {
		
		// ��� 
			// �θ𿡰� �����޴°�
			// ���� : �θ� ---> �ڽ�
			// ���α׷� : �ڽ� ---> �θ�
			// extends : �����ϴ� [ �̼��ϴ� ] : ���踦 �����ϴ�
			// (����)����� ���� ���� : ���� ���� [ ������ �ִ� Ŭ������ �����ؼ� ���ο� Ŭ������ ���� ]
			
		// p. 290 ~ 292 ����
		
		
		//��ü����
		// 1. ����Ŭ�����ΰ�ü ����
		DmbCallPhone dmbCallPhone = new DmbCallPhone("�ڹ���", "����", 10);
		
		// 2. ����Ŭ������ ������� ��ü�� ����Ŭ������ �ɹ�(�ʵ�) ����
		System.out.println("�� "+dmbCallPhone.model);
		System.out.println("���� "+dmbCallPhone.color);
		
		// 3. ����Ŭ������ ������� ��ü�� ���� �ɹ�(�ʵ�) ����
		System.out.println("ä�� "+dmbCallPhone.channel);
		
		
		// 4. ����Ŭ������ ������� ��ü�� ����Ŭ������ �ɹ�(�޼ҵ�) ����
		dmbCallPhone.powerOn();
		dmbCallPhone.bell();
		dmbCallPhone.sendVoice("��������");
		dmbCallPhone.receveVoice("�ȳ��ϼ���, ȫ�浿�ε���.");
		dmbCallPhone.sendVoice("��~ �� �ݰ����ϴ�");
		dmbCallPhone.hangUp();
		
		// 5. ����Ŭ������ ������� ���� �ɹ�(�޼ҵ�) ����
		dmbCallPhone.turnOnDmb();
		dmbCallPhone.changeChannelDmb(12);
		dmbCallPhone.turnOffDmb();
		
	}
}

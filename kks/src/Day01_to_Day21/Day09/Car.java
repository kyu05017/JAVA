package Day01_to_Day21.Day09;

public class Car {
	
	//�ʵ�
	Tire frontLeftTire = new Tire("�տ���",6);
	Tire frontRightTire = new Tire("�տ�����",2);
	Tire backLeftTire = new Tire("������",3);
	Tire backRightTire = new Tire("�ڿ�����",4);
	//������
	public Car() {//�⺻������
		
	}
	//�޼ҵ�
	int run() { // �ڵ��� ȸ�� [ ��� Ÿ�̾ü�� 1ȸ�� ȸ�� ] �޼ҵ�
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false) { 
			// Ÿ�̾ ȸ���� �ϴµ� ������� false�� ��ũ
			stop(); 
			return 1;
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4; 
		}
		return 0; // ������ 0�̸� ��ũx
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
	
}

package Day07;

public class Car2 { // ����
	// 1. �ʵ�
	int speed;
	// 2. ������
	
	// 3. �޼ҵ�
		// 1. ���� �ʵ尪�� ��ȯ���ִ� Ŭ����
	int getSpeed() { //�μ�x ��ȯo
		return speed;
	}
		// 2. ��� �޼ҵ�
	void keyTurnon() {//�μ� x ��ȯ x
		System.out.println("Ű�� �����ϴ�.");
	}
		// 3. ���ǵ� ���� �޼ҵ� [ �ִ� 50 ]
	void run() { // �μ� x  ��ȯ x
		for(int i = 10; i <= 50; i+=10) {	
			// i �� 10 ���� 50 ���� 10�� ������ > 5ȸ
			speed = i; // i �� speed �� ����
			System.out.println("�޸��ϴ�. (�ü�: " + speed + "km/h )");
		}
	}
}

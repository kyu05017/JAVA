package Day10;

public class Day10_2 {
	
	public static void main(String[] args) {
		
		
		// �������̽�
			// ���� : ������ �����Ͽ� ������ ����� ����
				// ���� �ٸ� Ŭ�������� ��ü���� ������ �������� ����
			// �߻�޼ҵ� : ����[o], ����[x]
				//�������̽����� �����ϰ� �� Ŭ�������� �����Ѵ�. [ ������ ]
			// ��) �������̽� : ����Ű, A��ư, B��ư 
			//		ö�ǰ��� Ŭ����
					// A��ư : ����
					// B��ư : ���
			//		�౸���� Ŭ����
					// A��ư : ����	
					// B��ư : ���
		
		// 1.�������̽� ��ü ���� 
		RemoteControl rc;
		Searchable rc3;
		//�������̽��� ��ü��
			// 2. �������̽��� �ڷ����� Ŭ���� �޸� �Ҵ�
		rc = new Television();
		rc3 = new Television();
		// 3. �������̽� ����
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.setMute(false);
		rc3.search("naver");
		rc.turnOff();
		RemoteControl.changeBettery();
		System.out.println();
		
		// 4. �������̽��� Ŭ���� �޸� �Ҵ�
		rc = new Audio();
		// 5. �������̽� ����
		rc.turnOn();
		rc.setVolume(8);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		RemoteControl.changeBettery();
		
		System.out.println();
		rc = new Television();
		rc.turnOff();
		System.out.println();
		// �͸� ���� ��ü
		
		RemoteControl rc2 = new RemoteControl() {
		//�������̽��� ��ü�� = new �������̽��� 
			
			@Override
			public void turnOn() {
				System.out.println("�������� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("�������� ���ϴ�");
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("���� ����� ���� : "+volume);
			}
		};
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(156465135);
		
		// ����Ʈ �޼ҵ� ȣ��
		rc2.setMute(true); // �������̽����� �̹� ������ �Ǿ��ִ�. �Ϲ� �޼ҵ�� ���̰� ����
		RemoteControl.changeBettery(); //��ü���� ��� ����
		//�޸� �Ҵ� �޴� ���
			//ȸ�� Ŭ����/ ����Ŭ���� �� �ʵ�(������), �޼ҵ�(���尡��), ����  ����
		//1. new ������ 
		//2. static ������
		
	}

}

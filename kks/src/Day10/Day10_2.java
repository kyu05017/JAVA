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
		//�������̽��� ��ü��
			// 2. �������̽��� �ڷ����� Ŭ���� �޸� �Ҵ�
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.turnOff();
		RemoteControl.changeBettery();
	}
}

package Day01_to_Day21.Day14;

public class CalcThread extends Thread {
	
	public CalcThread(String name) {
		// �μ��� ���� �����ͷ� ������ �̸� ���ϱ�
		setName(name); 
	}

	// ��Ƽ������ ����
	@Override
	public void run() {
		for(int i = 0; i < 200000000; i++) {
			
		}
		System.out.println(getName());
	}

}

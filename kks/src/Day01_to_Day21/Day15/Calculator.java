package Day01_to_Day21.Day15;

public class Calculator {
	
	
	private int memory;
	
	//�޼ҵ�
	public int getMemory() {
		return memory;
	}
	// �޼ҵ� 
		// ������ : ������1�� 100 �ְ� ( ������2�� 50�� �־ [ �� ���� ]  )  50 ���
		// ���� �ذ� [ synchronized : ����ȭ ]
			// ������1�� 100 �ְ� ( ������ 2�� ����� ) 100 ���
			// ������2�� ������ 1�� �޼ҵ� ���� ���� ������
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println(Thread.currentThread().getName() + " :  " + this.memory);
	}
	
	
}

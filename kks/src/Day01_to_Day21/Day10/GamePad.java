package Day01_to_Day21.Day10;

public interface GamePad {

	
	//�� 1.)
	// 1. ����ʵ�
	// 2. �߻�޼ҵ�
	public void bottonA();
	public void bottonB();
	public void bottonC();
	// 3. ����Ʈ�޼ҵ�
	default void endGamePad(){
		System.out.println(" �����е� ����");
	}
	// 4. �����޼ҵ�
	static void charge() {
		System.out.println("������ �Դϴ�.");
	}
}

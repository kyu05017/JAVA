package Day08;

public class Car {

	// 1.�ʵ�
	private int speed;
	private boolean stop;
	
	
	// 2 ������
	
	// 3. �޼ҵ�
	public int getSpeed() { //private �ʵ� ȣ��� ����ϴ¸޼ҵ�
		return speed;
	}
	public void setSpeed(int speed) { // private �ʵ� ����� ���Ǵ� �޼ҵ�
		if(speed < 0) {//���࿡ speed�� 0���� ������ 
			this.speed = 0; // 0 �Ʒ��δ� ���� �Ұ���
			return;
		}
		else {//0 ���� ũ��
			this.speed = speed; // �μ��� ���� ���ǵ带 ����
		}
	}
	
	public boolean isStop() {// private �ʵ� ȣ��� ���Ǵ� �޼ҵ�
		return stop;
	}
	
	public void setStop(boolean stop) { // private �ʵ� ����� ���Ǵ� �޼ҵ�
		this.stop = stop;
		this.speed = 0;
	}
}

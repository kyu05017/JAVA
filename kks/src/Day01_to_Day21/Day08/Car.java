package Day01_to_Day21.Day08;

public class Car {

	// 1.필드
	private int speed;
	private boolean stop;
	
	
	// 2 생성자
	
	// 3. 메소드
	public int getSpeed() { //private 필드 호출시 사용하는메소드
		return speed;
	}
	public void setSpeed(int speed) { // private 필드 변경시 사용되는 메소드
		if(speed < 0) {//만약에 speed가 0보다 작으면 
			this.speed = 0; // 0 아래로는 저장 불가능
			return;
		}
		else {//0 보다 크면
			this.speed = speed; // 인수로 들어온 스피드를 저장
		}
	}
	
	public boolean isStop() {// private 필드 호출시 사용되는 메소드
		return stop;
	}
	
	public void setStop(boolean stop) { // private 필드 변경시 사용되는 메소드
		this.stop = stop;
		this.speed = 0;
	}
}

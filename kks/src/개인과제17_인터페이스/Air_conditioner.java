package 개인과제17_인터페이스;

public class Air_conditioner implements Remote{
	
	@Override
	public boolean turnOn(boolean power) {
		System.out.println("에어컨)) 전원을 켭니다.");
		return true;
	}

	@Override
	public boolean turnOff(boolean power) {
		System.out.println("에어컨)) 전원을 끕니다.");
		return false;
	}

	@Override
	public void mainUp() {
		System.out.println("에어컨)) 온도를 올렸습니다.");
	}

	@Override
	public void mainDown() {
		System.out.println("에어컨)) 온도를 낮췄습니다.");
		
	}

	@Override
	public void subUp() {
		System.out.println("에어컨)) 풍량을 늘렸습니다.");
		
	}

	@Override
	public void subDown() {
		System.out.println("에어컨)) 풍량을 낮췄습니다.");
		
	}

	@Override
	public boolean optionOn(boolean power) {
		System.out.println("에어컨)) 무풍모드");
		return true;
	}

	@Override
	public boolean optionOff(boolean power) {
		System.out.println("에어컨)) 무풍모드 끔");
		return false;
	}
}

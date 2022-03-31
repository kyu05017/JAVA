package 개인과제._17_인터페이스응용;

public class Tv implements Remote{
	

	@Override
	public boolean turnOn(boolean power) {
		System.out.println("TV)) 전원을 켭니다.");
		return true;
	}

	@Override
	public boolean turnOff(boolean power) {
		System.out.println("TV)) 전원을 끕니다.");
		return false;
	}

	@Override
	public void mainUp() {
		System.out.println("TV)) 다음 채널로 이동합니다.");
	}

	@Override
	public void mainDown() {
		System.out.println("TV)) 이전 채널로 이동합니다.");
		
	}

	@Override
	public void subUp() {
		System.out.println("TV)) 소리를 키웠습니다.");
		
	}

	@Override
	public void subDown() {
		System.out.println("TV)) 소리를 낮췄습니다.");
		
	}

	@Override
	public boolean optionOn(boolean power) {
		System.out.println("TV)) 음소거");
		return true;
	}

	@Override
	public boolean optionOff(boolean power) {
		System.out.println("TV)) 음소거 끔");
		return false;
	}

	
}

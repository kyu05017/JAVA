package 개인과제._17_인터페이스응용;

public class Air_cleaner implements Remote{

	@Override
	public boolean turnOn(boolean power) {
		System.out.println("공기청정기)) 전원을 켭니다.");
		return true;
	}

	@Override
	public boolean turnOff(boolean power) {
		System.out.println("공기청정기)) 전원을 끕니다.");
		return false;
	}

	@Override
	public void mainUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mainDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean optionOn(boolean power) {
		System.out.println("공기청정기)) 자동모드");
		return true;
	}

	@Override
	public boolean optionOff(boolean power) {
		System.out.println("공기청정기)) 자동모드 끔");
		return false;
	}

}

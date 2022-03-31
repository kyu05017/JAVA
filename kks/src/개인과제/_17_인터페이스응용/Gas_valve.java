package 개인과제._17_인터페이스응용;

public class Gas_valve implements Remote{
	@Override
	public boolean turnOn(boolean power) {
		System.out.println("가스벨브)) 잠금을 해제 합니다.");
		return true;
	}

	@Override
	public boolean turnOff(boolean power) {
		System.out.println("가스벨브)) 가스벨브가 잠겼습니다.");
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
	public boolean optionOn(boolean option) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean optionOff(boolean option) {
		// TODO Auto-generated method stub
		return false;
	}

	
}

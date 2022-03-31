package 개인과제._17_인터페이스응용;

public class DoorLock implements Remote{

	@Override
	public boolean turnOn(boolean power) {
		System.out.println("도어락)) 잠금을 해제 합니다. (5초후 자동잠김)");
		return true;
	}

	@Override
	public boolean turnOff(boolean power) {
		System.out.println("도어락)) 도어락이 잠겼습니다.");
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

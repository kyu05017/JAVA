package ���ΰ���._17_�������̽�����;

public class DoorLock implements Remote{

	@Override
	public boolean turnOn(boolean power) {
		System.out.println("�����)) ����� ���� �մϴ�. (5���� �ڵ����)");
		return true;
	}

	@Override
	public boolean turnOff(boolean power) {
		System.out.println("�����)) ������� �����ϴ�.");
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

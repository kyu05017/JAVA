package ���ΰ���._17_�������̽�����;

public class Air_cleaner implements Remote{

	@Override
	public boolean turnOn(boolean power) {
		System.out.println("����û����)) ������ �մϴ�.");
		return true;
	}

	@Override
	public boolean turnOff(boolean power) {
		System.out.println("����û����)) ������ ���ϴ�.");
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
		System.out.println("����û����)) �ڵ����");
		return true;
	}

	@Override
	public boolean optionOff(boolean power) {
		System.out.println("����û����)) �ڵ���� ��");
		return false;
	}

}

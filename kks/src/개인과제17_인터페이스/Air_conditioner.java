package ���ΰ���17_�������̽�;

public class Air_conditioner implements Remote{
	
	@Override
	public boolean turnOn(boolean power) {
		System.out.println("������)) ������ �մϴ�.");
		return true;
	}

	@Override
	public boolean turnOff(boolean power) {
		System.out.println("������)) ������ ���ϴ�.");
		return false;
	}

	@Override
	public void mainUp() {
		System.out.println("������)) �µ��� �÷Ƚ��ϴ�.");
	}

	@Override
	public void mainDown() {
		System.out.println("������)) �µ��� ������ϴ�.");
		
	}

	@Override
	public void subUp() {
		System.out.println("������)) ǳ���� �÷Ƚ��ϴ�.");
		
	}

	@Override
	public void subDown() {
		System.out.println("������)) ǳ���� ������ϴ�.");
		
	}

	@Override
	public boolean optionOn(boolean power) {
		System.out.println("������)) ��ǳ���");
		return true;
	}

	@Override
	public boolean optionOff(boolean power) {
		System.out.println("������)) ��ǳ��� ��");
		return false;
	}
}

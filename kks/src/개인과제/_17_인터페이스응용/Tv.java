package ���ΰ���._17_�������̽�����;

public class Tv implements Remote{
	

	@Override
	public boolean turnOn(boolean power) {
		System.out.println("TV)) ������ �մϴ�.");
		return true;
	}

	@Override
	public boolean turnOff(boolean power) {
		System.out.println("TV)) ������ ���ϴ�.");
		return false;
	}

	@Override
	public void mainUp() {
		System.out.println("TV)) ���� ä�η� �̵��մϴ�.");
	}

	@Override
	public void mainDown() {
		System.out.println("TV)) ���� ä�η� �̵��մϴ�.");
		
	}

	@Override
	public void subUp() {
		System.out.println("TV)) �Ҹ��� Ű�����ϴ�.");
		
	}

	@Override
	public void subDown() {
		System.out.println("TV)) �Ҹ��� ������ϴ�.");
		
	}

	@Override
	public boolean optionOn(boolean power) {
		System.out.println("TV)) ���Ұ�");
		return true;
	}

	@Override
	public boolean optionOff(boolean power) {
		System.out.println("TV)) ���Ұ� ��");
		return false;
	}

	
}

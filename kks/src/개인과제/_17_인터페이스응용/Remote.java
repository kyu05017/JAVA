package ���ΰ���._17_�������̽�����;

public interface Remote {
	
	public int MAX = 10;
	public int MIN = 0;
	
	public boolean turnOn(boolean power);
	public boolean turnOff(boolean power);
	
	public void mainUp();
	public void mainDown();
	
	public void subUp();
	public void subDown();
	
	public boolean optionOn(boolean option);
	public boolean optionOff(boolean option);
	
	
}

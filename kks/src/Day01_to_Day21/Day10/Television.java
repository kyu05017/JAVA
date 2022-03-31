package Day01_to_Day21.Day10;

public class Television implements RemoteControl, Searchable{
			//Ŭ������ implements �������̽���
					// �����ϴ�.
	private int volume;
	
	//turnon
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	//turnoff
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	//setvolume
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			//�������� �ִ� �������� ũ�� ���´�.
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME){
			//�������� �ּ� �������� ������ ���´�.
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : "+this.volume);
	}
	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("TV ���� ó��");
		}
		else {
			System.out.println("TV ���� ����");
		}
	}
}

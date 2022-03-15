package Day10;

public class Audio implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			//리노컨의 최대 소음보다 크면 막는다.
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME){
			//리모컨의 최소 소음보다 작으면 막는다.
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨 : "+this.volume);
	}
}

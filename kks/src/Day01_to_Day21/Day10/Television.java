package Day01_to_Day21.Day10;

public class Television implements RemoteControl, Searchable{
			//클래스명 implements 인터페이스명
					// 구현하다.
	private int volume;
	
	//turnon
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	//turnoff
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	//setvolume
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
		System.out.println("현재 TV 볼륨 : "+this.volume);
	}
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("TV 무음 처리");
		}
		else {
			System.out.println("TV 무음 해제");
		}
	}
}

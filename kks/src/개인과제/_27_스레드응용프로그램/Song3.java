package 개인과제._27_스레드응용프로그램;

public class Song3 extends Thread{
	
	static boolean stop = false;
	
	String[] lyrics = { 
			"",
			"5",
			"4",
			"3",
			"2",
			"1",
			"그대여 그대여 그대여 그대여 그대여",
			"오늘은 우리 같이 걸어요 이 거리를",
			"밤에 들려오는 자장노래 어떤가요 (oh yeah)",
			"몰랐던 그대와 단 둘이 손 잡고",
			"알 수 없는 이 떨림과 둘이 걸어요",
			"봄바람 휘날리며",
			"흩날리는 벚꽃 잎이",
			"울려 퍼질 이 거리를",
			"둘이 걸어요",
			"봄바람 휘날리며",
			"흩날리는 벚꽃 잎이",
			"울려 퍼질 이 거리를",
			"둘이 걸어요 (Oh yeah)",
			"그대여 우리 이제 손 잡아요 이 거리에",
			"마침 들려오는 사랑 노래 어떤가요 (oh yeah)",
			"사랑하는 그대와 단둘이 손잡고",
			"알 수 없는 이 거리를 둘이 걸어요",
			"봄바람 휘날리며",
			"흩날리는 벚꽃 잎이",
			"울려 퍼질 이 거리를",
			"둘이 걸어요",
			"봄바람 휘날리며",
			"흩날리는 벚꽃 잎이",
			"울려 퍼질 이 거리를",
			"둘이 걸어요",
			"바람 불면 울렁이는 기분 탓에 나도 모르게",
			"바람 불면 저편에서 그대여 니 모습이 자꾸 겹쳐",
			"오 또 울렁이는 기분 탓에 나도 모르게",
			"바람 불면 저편에서 그대여 니 모습이 자꾸 겹쳐",
			"사랑하는 연인들이 많군요 알 수 없는 친구들이 많아요",
			"흩날리는 벚꽃 잎이 많군요 좋아요",
			"봄바람 휘날리며",
			"흩날리는 벚꽃 잎이",
			"울려 퍼질 이 거리를",
			"둘이 걸어요",
			"봄바람 휘날리며",
			"흩날리는 벚꽃 잎이",
			"울려 퍼질 이 거리를",
			"둘이 걸어요 (oh yeah)",
			"그대여 그대여 그대여 그대여 그대여"
	};
	
	public Song3() {
		
	}
	
	public void Song3_stop (boolean stop) {
		this.stop = stop;
		if(this.stop) {
			System.out.println("재생");
		}
		else {
			System.out.println("일시정지");
		}
	}
	
	
	@Override
	public void run() {
		int i = 0;
		while(this.stop) {
			try {
				System.out.println(lyrics[i]);
				Thread.sleep(1500);
			} 
			catch (InterruptedException e) {
				
			}
			i++;
		}
	}
}


package 개인과제._27_스레드응용프로그램;

public class Song1 extends Thread{
	
	static boolean stop = false;
	
	String[] lyrics = { "",
						"5",
						"4",
						"3",
						"2",
						"1",
						"'뭐해?'라는 두 글자에",
						"'네가 보고 싶어' 나의 속마음을 담아 우",
						"이모티콘 하나하나 속에",
						"달라지는 내 미묘한 심리를 알까 우",
						"아니 바쁘지 않아 nothing no no",
						"잠들어 있지 않아 insomnia-nia-nia",
						"지금 다른 사람과 함께이지 않아",
						"응, 나도 너를 생각 중",
						"우리의 네모 칸은 bloom",
						"엄지손가락으로 장미꽃을 피워",
						"향기에 취할 것 같아 우",
						"오직 둘만의 비밀의 정원",
						"I feel bloom, I feel bloom, I feel bloom",
						"너에게 한 송이를 더 보내",
						"밤샘 작업으로 업데이트",
						"흥미로운 이 작품의 지은이 that's me 우",
						"어쩜 이 관계의 클라이맥스",
						"2막으로 넘어가기엔 지금이 good timing 우",
						"같은 맘인 걸 알아 realize-la-lize",
						"말을 고르지 말아 just reply-la-la-ly",
						"조금 장난스러운 나의 은유에",
						"네 해석이 궁금해",
						"우리의 색은 gray and blue",
						"엄지손가락으로 말풍선을 띄워",
						"금세 터질 것 같아 우",
						"호흡이 가빠져 어지러워",
						"I feel blue, I feel blue, I feel blue",
						"너에게 가득히 채워",
						"띄어쓰기없이 보낼게 사랑인 것 같애",
						"백만송이 장미꽃을, 나랑 피워볼래?",
						"꽃잎의 색은 우리 마음 가는 대로 칠해",
						"시들 때도 예쁘게",
						"우리의 네모 칸은 bloom",
						"엄지손가락으로 장미꽃을 피워",
						"향기에 취할 것 같아 우",
						"오직 둘만의 비밀의 정원",
						"I feel bloom, I feel bloom, I feel bloom",
						"너에게 한 송이를 더 보내"
	};
	
	public Song1() {
		
	}
	
	public void Song1_stop (boolean stop) {
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
